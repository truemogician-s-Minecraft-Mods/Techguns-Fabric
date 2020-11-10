package techguns.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import techguns.TGPacketsS2C;
import techguns.api.entity.AttackTime;
import techguns.api.entity.ITGExtendedPlayer;
import techguns.items.guns.GenericGun;
import techguns.items.guns.GenericGunCharge;
import techguns.packets.PacketSwapWeapon;

@Mixin(PlayerEntity.class)
public abstract class TGPlayerEntityMixin extends LivingEntity implements ITGExtendedPlayer {

	@Unique
	public AttackTime techguns_attackTimes_mh = new AttackTime();
	@Unique
	public AttackTime techguns_attackTimes_oh = new AttackTime();

	@Unique
	public int techguns_fireDelayMainhand=0;
	@Unique
	public int techguns_fireDelayOffhand=0;
	@Unique
	public int techguns_loopSoundDelayMainhand=0;
	@Unique
	public int techguns_loopSoundDelayOffhand=0;
	@Unique
	public int techguns_swingSoundDelay=0;
	@Unique
	public ItemStack techguns_gunMainHand=ItemStack.EMPTY;
	@Unique
	public ItemStack techguns_gunOffHand=ItemStack.EMPTY;
	
	@Unique
	private static TrackedData<Boolean> TECHGUNS_DATA_CHARGING_WEAPON = DataTracker.registerData(PlayerEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	
	@Unique
	public Entity techguns_lockOnEntity; //Guided Missile tracking target
	@Unique
	public int techguns_lockOnTicks; //number of ticks the tracked target has been locked on.
	
	public TGPlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
		super(entityType, world);
	}
	
	@Inject(at = @At(value = "RETURN"), method="tick", cancellable = false)
	public void tick(CallbackInfo info) {
		this.playerTickEvent(!this.world.isClient);
	}	
	
	@Inject(at = @At(value = "RETURN"), method="initDataTracker", cancellable = false)
	protected void initDataTracker(CallbackInfo info) {
	    this.dataTracker.startTracking(TECHGUNS_DATA_CHARGING_WEAPON, false);
	}
	
	@Override
	public AttackTime getAttackTime(boolean offHand) {
		if(offHand) {
			return this.techguns_attackTimes_oh;
		}
		return this.techguns_attackTimes_mh;
	}

	@Override
	public boolean isRecoiling(boolean offHand) {
		return this.getAttackTime(offHand).isRecoiling();
	}

	@Override
	public boolean isReloading(boolean offHand) {
		return this.getAttackTime(offHand).isReloading();
	}


	@Override
	public int getFireDelay(Hand hand) {
		switch(hand) {
		case OFF_HAND:
			return this.techguns_fireDelayOffhand;
		default:
			return this.techguns_fireDelayMainhand;
		}
	}

	@Override
	public void setFireDelay(Hand hand, int delay) {
		switch(hand) {
		case OFF_HAND:
			this.techguns_fireDelayOffhand = delay;
		default:
			this.techguns_fireDelayMainhand = delay;
		}
	}
	
	@Override
	public void swapAttackTimes() {
		AttackTime a = this.techguns_attackTimes_mh;
		this.techguns_attackTimes_mh=this.techguns_attackTimes_oh;
		this.techguns_attackTimes_oh=a;
		
		int i = techguns_fireDelayMainhand;
		this.techguns_fireDelayMainhand=this.techguns_fireDelayOffhand;
		this.techguns_fireDelayOffhand=i;
	}
	
	@Override
	public boolean hasEnabledSafemode() {
		// TODO implement Safemode
		return false;
	}
	
	@Override
	public int getLockOnTicks() {
		return this.techguns_lockOnTicks;
	}

	@Override
	public void setLockOnTicks(int value) {
		this.techguns_lockOnTicks=value;
	}
	
	public int getLoopSoundDelay(Hand hand) {
		switch(hand){
			case MAIN_HAND:
				return techguns_loopSoundDelayMainhand;
			case OFF_HAND:
				return techguns_loopSoundDelayOffhand;
		}
		return 0;
	}

	public void setLoopSoundDelay(Hand hand, int delay) {
		switch(hand){
		case MAIN_HAND:
			this.techguns_loopSoundDelayMainhand=delay;
			break;
		case OFF_HAND:
			this.techguns_loopSoundDelayOffhand=delay;
			break;
		}
	}
		
	public boolean isChargingWeapon() {
		return this.dataTracker.get(TECHGUNS_DATA_CHARGING_WEAPON);
	}
	
	public void setChargingWeapon(boolean charging) {
		this.dataTracker.set(TECHGUNS_DATA_CHARGING_WEAPON, charging);
	}
	
	@Override
	public Entity getLockOnEntity() {
		return this.techguns_lockOnEntity;
	}

	@Override
	public void setLockOnEntity(Entity ent) {
		this.techguns_lockOnEntity=ent;
	}

	public void playerTickEvent(boolean server) {
		// reduce fire delays on both sides
		if (this.techguns_fireDelayMainhand > 0) {
			this.techguns_fireDelayMainhand--;
		}
		if (this.techguns_loopSoundDelayMainhand > 0) {
			this.techguns_loopSoundDelayMainhand--;
		}
		if (this.techguns_fireDelayOffhand > 0) {
			this.techguns_fireDelayOffhand--;
		}
		if (this.techguns_loopSoundDelayOffhand > 0) {
			this.techguns_loopSoundDelayOffhand--;
		}

		// SERVER ONLY CODE
		if (server) {
			if (this.techguns_swingSoundDelay > 0) {
				this.techguns_swingSoundDelay--;
			}
		}

		/**
		 * detect weapon swaps
		 */
		if (server) { // does only work server side
			ItemStack gunMH = ItemStack.EMPTY;
			ItemStack gunOH = ItemStack.EMPTY;
			if (!this.getMainHandStack().isEmpty() && this.getMainHandStack().getItem() instanceof GenericGun) {
				gunMH = this.getMainHandStack();
			}
			if (!this.getOffHandStack().isEmpty() && this.getOffHandStack().getItem() instanceof GenericGun) {
				gunOH = this.getOffHandStack();
			}

			if (!gunOH.isEmpty() && this.techguns_gunMainHand == gunOH
					|| !gunMH.isEmpty() && this.techguns_gunOffHand == gunMH) {
				TGPacketsS2C.sendToAllTracking(new PacketSwapWeapon((PlayerEntity) (Object) this),
						(PlayerEntity) (Object) this);

				int i = this.techguns_fireDelayMainhand;
				this.techguns_fireDelayMainhand = this.techguns_fireDelayOffhand;
				this.techguns_fireDelayOffhand = i;
			}

			this.techguns_gunMainHand = gunMH;
			this.techguns_gunOffHand = gunOH;
		}

		/*
		 * Charging weapon
		 */
		if (server) {
			if (this.isChargingWeapon()) {
				if (this.getItemUseTime() <= 0 || !(this.getMainHandStack().getItem() instanceof GenericGunCharge)){
					this.setChargingWeapon(false);
				}
			}
		}
	}	

}