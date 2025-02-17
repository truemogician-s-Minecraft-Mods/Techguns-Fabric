package techguns.api.guns;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.model.BipedEntityModel.ArmPose;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import techguns.entities.ai.RangedAttackGoal;
import techguns.entities.npcs.GenericNPC;


public interface IGenericGun {

	public boolean isShootWithLeftClick();

	public boolean isSemiAuto();

	@Environment(EnvType.CLIENT)
	public boolean isZooming();

	public void shootGunPrimary(ItemStack stack, World world, PlayerEntity player, boolean zooming, Hand hand, Entity target);

	public int getAmmoLeft(ItemStack stack);
	
	public GunHandType getGunHandType();

	public boolean isHoldZoom();

	public float getZoomMult();

	public default boolean canCharge() {return false;};

	public boolean isAimed(LivingEntity ply, ItemStack stack);

	@Environment(EnvType.CLIENT)
	public ArmPose getArmPose(boolean akimbo);

	public String getCurrentAmmoVariantKey(ItemStack stack);

	public <T extends HostileEntity & RangedAttackMob> RangedAttackGoal getAIAttack(T shooter);
}
