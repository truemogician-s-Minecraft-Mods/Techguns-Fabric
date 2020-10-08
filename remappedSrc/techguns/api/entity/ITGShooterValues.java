package techguns.api.entity;

public interface ITGShooterValues {

	public AttackTime getAttackTime(boolean offHand);
	public boolean isRecoiling(boolean offHand);
	public boolean isReloading(boolean offHand);
}
