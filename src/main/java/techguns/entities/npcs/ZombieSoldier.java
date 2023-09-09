package techguns.entities.npcs;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.World;
import techguns.TGArmors;
import techguns.TGEntities;
import techguns.TGuns;

public class ZombieSoldier extends GenericZombieEntity {
    public ZombieSoldier(EntityType<ZombieSoldier> entityType, World world) {
        super(entityType, world);
    }

    public ZombieSoldier(World world){
        this(TGEntities.ZOMBIE_SOLDIER, world);
    }

    @Override
    protected void initEquipment(LocalDifficulty localDifficulty) {
        super.initEquipment(localDifficulty);
        Item weapon;
        switch (random.nextInt(4)){
            case 0:
                weapon = TGuns.THOMPSON;
                break;
            case 1:
                weapon = TGuns.REVOLVER;
                break;
            case 2:
                weapon = TGuns.HANDCANNON;
                break;
            default:
                weapon = Items.IRON_SWORD;
        }
        this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(weapon));

        this.equipStack(EquipmentSlot.CHEST, new ItemStack(TGArmors.T1_COMBAT_CHESTPLATE));
        this.equipStack(EquipmentSlot.HEAD, new ItemStack(TGArmors.T1_COMBAT_HELMET));
        this.equipStack(EquipmentSlot.LEGS, new ItemStack(TGArmors.T1_COMBAT_LEGGINGS));
        this.equipStack(EquipmentSlot.FEET, new ItemStack(TGArmors.T1_COMBAT_BOOTS));
    }
}
