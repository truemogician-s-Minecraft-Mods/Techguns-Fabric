package techguns.mixin;

import net.minecraft.item.ShovelItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ShovelItem.class)
public interface ShovelItemAccessor {

    //TODO 1.17 remove?
    /*@Accessor(value = "EFFECTIVE_BLOCKS")
    public static Set<Block> getEFFECTIVE_BLOCKS(){
        throw new AssertionError();
    }*/
}
