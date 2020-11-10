package techguns.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import techguns.api.render.IItemRenderer;
import techguns.client.render.ITGItemRenderer;
import techguns.client.render.TGRenderRegistries;
import techguns.items.guns.GenericGun;

@Mixin(ItemRenderer.class)
public class ItemRendererMixin {

	@Shadow
	public float zOffset;

	@Inject(at = @At("INVOKE"), method = "(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformation$Mode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;IILnet/minecraft/client/render/model/BakedModel;)V", cancellable = true)
	public void renderItem(ItemStack stack, ModelTransformation.Mode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel model, CallbackInfo info) {
		if (!stack.isEmpty()) {
			Item it = stack.getItem();
			if (it instanceof ITGItemRenderer) {
				if(((ITGItemRenderer) it).shouldUseRenderHack(stack)) {
					info.cancel();
					IItemRenderer r = TGRenderRegistries.getRendererForItem(it);
					if (r != null) {
						r.renderItem((LivingEntity)null, renderMode, matrices, stack, leftHanded, vertexConsumers, light, overlay, model);
					}
				}
			}
		}
	}

	@Inject(at = @At("INVOKE"), method = "(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformation$Mode;ZLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;Lnet/minecraft/world/World;II)V", cancellable = true)
	public void renderItem(LivingEntity entity, ItemStack stack, ModelTransformation.Mode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, World world, int light, int overlay, CallbackInfo info) {
		if (!stack.isEmpty()) {
			Item it = stack.getItem();
			if (it instanceof ITGItemRenderer) {
				if(((ITGItemRenderer) it).shouldUseRenderHack(stack)) {
					info.cancel();
					IItemRenderer r = TGRenderRegistries.getRendererForItem(it);
					if (r != null) {
						r.renderItem(entity, renderMode, matrices, stack, leftHanded, vertexConsumers, light, overlay, null);
					}
				}
			}
		}
	}
	
	@Inject(at = @At("INVOKE"), method = "(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V", cancellable = true)
	public void renderGuiItemOverlay(TextRenderer renderer, ItemStack stack, int x, int y, String countLabel, CallbackInfo info) {
		if (!stack.isEmpty() && stack.getItem() instanceof GenericGun) {
			info.cancel();
			
			GenericGun gun = (GenericGun) stack.getItem();
			
			//Draw Ammo Left
			MatrixStack matrixStack = new MatrixStack();
			matrixStack.translate(x, y, 0);
			matrixStack.scale(0.5f, 0.5f, 1.0f);
			matrixStack.translate(-x, -y, 0);
			
	        String string = ""+gun.getAmmoLeft(stack);
	        matrixStack.translate(0.0D, 0.0D, (double)(this.zOffset + 200.0F));
	        VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate(Tessellator.getInstance().getBuffer());
	        renderer.draw((String)string, (float)(x + 19 +9 - 2 - renderer.getWidth(string)/2), (float)(y ), 16777215, true, matrixStack.peek().getModel(), immediate, false, 0, 15728880);
	        immediate.draw();
		}
	}
	
}