package techguns.mixin;

import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ItemStack.class)
public class ItemStackMixin {

    /*@Inject(method = "getEnchantments",at = @At("RETURN"), cancellable = true)
    public void getEnchantments(CallbackInfoReturnable<NbtList> cir) {
        ItemStack stack = (ItemStack) (Object) this;
        if(stack.getItem() instanceof GenericGunMeleeCharge){
            MinecraftServer server = ServerProxy.SERVER_INSTANCE;
            if(server!=null){
                for(PlayerEntity player : server.getPlayerManager().getPlayerList()){
                    if (stack == player.getMainHandStack()){
                        System.out.println("Found player!");
                        if(player.isSneaking()){
                            System.out.println("Sneaking!");
                            NbtList enchantments = cir.getReturnValue().copy();

                            Identifier identifier = new Identifier("silk_touch");

                            boolean has_silk_touch=false;
                            for(int i = 0; i < enchantments.size() && !has_silk_touch; ++i) {
                                NbtCompound NbtCompound = enchantments.getCompound(i);
                                Identifier identifier2 = Identifier.tryParse(NbtCompound.getString("id"));
                                if (identifier2 != null && identifier2.equals(identifier)) {
                                    has_silk_touch=true;
                                }
                            }
                            if (!has_silk_touch){
                                NbtCompound silktouch = new NbtCompound();
                                silktouch.putString("id", identifier.toString());
                                silktouch.putShort("lvl",(short) 1);
                                enchantments.add(silktouch);
                            }
                            cir.setReturnValue(enchantments);
                            cir.cancel();
                        }
                    }
                }
            }
        }

    }*/

}
