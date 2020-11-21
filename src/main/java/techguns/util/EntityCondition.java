package techguns.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import techguns.api.entity.ITGExtendedPlayer;

/**
 * Used for Sounds and ParticleSystems, which will stop when the condition is not met.
 */
public enum EntityCondition {
	NONE(0),
	CHARGING_WEAPON(1),
	ENTITY_ALIVE(2);
	
	public byte id = 0;
	private EntityCondition(int id) {
		this.id = (byte)id;
	}
	
	public static EntityCondition fromByte(byte id) {
		for (EntityCondition e : EntityCondition.values()) {
			if (e.id == id) return e;
		}
		return NONE;
	}
	
	public boolean evaluate(Entity entity) {
		switch (this) {
		case CHARGING_WEAPON:
			if (entity instanceof PlayerEntity) {
				ITGExtendedPlayer tg_player = (ITGExtendedPlayer)entity;
				return tg_player.isChargingWeapon();
			}
			return false;
		case ENTITY_ALIVE:
			return entity.isAlive();
		case NONE:
		default: //If no condition is set, never stop a sound/particle.
			return true;
		}
	}
}
