package techguns.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import techguns.TGEntityAttributes;
import techguns.TGPacketsC2S;
import techguns.api.client.entity.ITGExtendedPlayerClient;
import techguns.api.entity.ITGExtendedPlayer;
import techguns.api.guns.IGenericGun;
import techguns.client.ClientProxy;
import techguns.items.guns.GenericGun;
import techguns.items.guns.GenericGunCharge;
import techguns.items.guns.GenericGunMeleeCharge;
import techguns.packets.c2s.PacketShootGun;
import techguns.packets.c2s.PacketShootGunTarget;
import techguns.util.BlockUtil;

import java.util.List;

@Mixin(PlayerEntity.class)
public abstract class TGPlayerEntityMixinClient extends LivingEntity implements ITGExtendedPlayerClient {

	@Unique
	protected int techguns_swingSoundDelay=0;

	@Unique
	protected ItemStack techguns_lastMainhandStack=ItemStack.EMPTY;

	protected TGPlayerEntityMixinClient(EntityType<? extends LivingEntity> entityType, World world) {
		super(entityType, world);
	}

	@Inject(at = @At(value = "RETURN"), method="tick", cancellable = false)
	public void tick(CallbackInfo info) {
		if(this.world.isClient) {
			this.clientPlayerTick();
		}
	}


	public void clientPlayerTick() {
		ClientProxy cp = ClientProxy.get();
		
		var ply = (PlayerEntity & ITGExtendedPlayer)(Object)this;
		ITGExtendedPlayer props = (ITGExtendedPlayer)this;
		
		// ONLY DO FOR OWN PLAYER!
		if (ply == cp.getPlayerClient()) {
			//TGExtendedPlayer props = TGExtendedPlayer.get(cp.getPlayerClient());
			
			if (MinecraftClient.getInstance().isWindowFocused() && !ply.isSpectator()) {
				ItemStack stack = ply.getMainHandStack();
				ItemStack stackOff = ply.getOffHandStack();
				
				if (!stack.isEmpty() && stack.getItem() instanceof IGenericGun && ((IGenericGun) stack.getItem()).isShootWithLeftClick()) {
					if (cp.keyFirePressedMainhand) {
						// event.player.swingItem();
						
						IGenericGun gun = (IGenericGun) stack.getItem();
						if (props.getFireDelay(Hand.MAIN_HAND) <= 0) {
							
							if (gun instanceof GenericGunCharge && ((GenericGunCharge)gun).getLockOnTicks() > 0 && props.getLockOnEntity() != null && props.getLockOnTicks() > ((GenericGunCharge)gun).getLockOnTicks()) {
								TGPacketsC2S.sendToServer(new PacketShootGunTarget(gun.isZooming(), Hand.MAIN_HAND, props.getLockOnEntity()));
								gun.shootGunPrimary(stack, ply.world, ply, gun.isZooming(), Hand.MAIN_HAND, props.getLockOnEntity());
							}else {
								TGPacketsC2S.sendToServer(new PacketShootGun(gun.isZooming(),Hand.MAIN_HAND));
								gun.shootGunPrimary(stack, ply.world, ply, gun.isZooming(), Hand.MAIN_HAND, null);
							}
							
						}
						if (gun.isSemiAuto()) {
							cp.keyFirePressedMainhand = false;
						}
					}
	
				} else {
					cp.keyFirePressedMainhand = false;
				}
				
				if (!stackOff.isEmpty() && stackOff.getItem() instanceof IGenericGun && ((IGenericGun) stackOff.getItem()).isShootWithLeftClick()) {
					if (cp.keyFirePressedOffhand) {
						// event.player.swingItem();
						IGenericGun gun = (IGenericGun) stackOff.getItem();
						if (props.getFireDelay(Hand.OFF_HAND) <= 0) {

							TGPacketsC2S.sendToServer(new PacketShootGun(gun.isZooming(),Hand.OFF_HAND));
							gun.shootGunPrimary(stackOff, ply.world,ply, gun.isZooming(), Hand.OFF_HAND, null);
						}
						if (gun.isSemiAuto()) {
							cp.keyFirePressedOffhand = false;
						}
					}

				} else {
					cp.keyFirePressedOffhand = false;
				}
				
				//Reset lock if out of ammo
				if (!stack.isEmpty() && stack.getItem() instanceof GenericGunCharge && ((GenericGunCharge) stack.getItem()).getLockOnTicks() > 0) {
					//System.out.println("RMB: "+cp.keyFirePressedOffhand);
					if (((GenericGunCharge)stack.getItem()).getAmmoLeft(stack) <= 0 && props.getLockOnEntity() != null) {
						props.setLockOnEntity(null);
						props.setLockOnTicks(-1);
						//System.out.println("reset lock.");
					}
				}

				//Reset zoom if weapon switched

				ClientProxy.get().zoomTick();
				if (!techguns_lastMainhandStack.isItemEqual(ply.getMainHandStack())){
					ClientProxy.get().resetZoom();
				}
				techguns_lastMainhandStack = ply.getMainHandStack();

				
			} else {
				cp.keyFirePressedMainhand = false;
				cp.keyFirePressedOffhand = false;
			}

			//adjust step_height
			if (ply.hasEnabledStepAssist() && ply.getAttributeValue(TGEntityAttributes.ARMOR_STEPASSIST) >= 1D){
				ply.stepHeight = 1.0F;
			} else {
				ply.stepHeight = 0.6F;
			}
		}
		
		if (this.techguns_swingSoundDelay > 0) {
			this.techguns_swingSoundDelay--;
		}
	}

	@Override
	public int getSwingSoundDelay() {
		return this.techguns_swingSoundDelay;
	}

	@Override
	public void setSwingSoundDelay(int delay) {
		this.techguns_swingSoundDelay = delay;
	}
	
}
