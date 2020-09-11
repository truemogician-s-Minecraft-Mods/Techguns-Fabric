package techguns.items.guns;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import techguns.entities.projectiles.EnumBulletFirePos;
import techguns.entities.projectiles.GenericProjectile;

public interface IChargedProjectileFactory<T extends GenericProjectile> extends IProjectileFactory<T> {

	 public T createChargedProjectile(World world, LivingEntity p, float damage, float speed, int TTL, float spread,
				float dmgDropStart, float dmgDropEnd, float dmgMin, float penetration, boolean blockdamage, EnumBulletFirePos firePos, float radius, double gravity, float charge, int ammoConsumed);

	
}
