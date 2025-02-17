package techguns.api.entity;

import net.minecraft.entity.Entity;
import net.minecraft.util.Hand;
import techguns.entities.projectiles.GrapplingHookProjectile;

/**
 * Should only be used on EntityPlayer
 * 
 */
public interface ITGExtendedPlayer extends ITGShooterValues {

	//public PlayerEntity getEntity();
	
	public int getFireDelay(Hand hand);
	public void setFireDelay(Hand hand, int delay);
	/*public IInventory getTGInventory();
	
	public void saveToNBT(final NBTTagCompound tags);
	public void loadFromNBT(final NBTTagCompound tags);*/
	
	public boolean hasEnabledSafemode();
	public void setSafeMode(boolean value);

	public boolean hasEnabledStepAssist();
	public void setStepAssist(boolean value);
	
	public int getLoopSoundDelay(Hand hand);
	public void setLoopSoundDelay(Hand hand, int value);
	public void swapAttackTimes();
	
	public boolean isChargingWeapon();
	public void setChargingWeapon(boolean charging);
	
	public int getLockOnTicks();
	public void setLockOnTicks(int value);
	
	public Entity getLockOnEntity();
	public void setLockOnEntity(Entity ent);
	
	public boolean showTGHudElements();
	public void setShowTGHudElements(boolean value);

	//Grappling Hook
	public void setGrapplingStatus(GrapplingHookProjectile.GrapplingStatus status);
	public GrapplingHookProjectile.GrapplingStatus getGrapplingStatus();
}
