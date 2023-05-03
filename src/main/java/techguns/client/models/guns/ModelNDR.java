package techguns.client.models.guns;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import techguns.client.models.ModelPart;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import techguns.api.guns.IGenericGun;
import techguns.client.models.ModelMultipart;
import techguns.util.MathUtil;

public class ModelNDR extends ModelMultipart {
	public ModelPart shape14;
	public ModelPart shape15;
	public ModelPart shape14_1;
	public ModelPart shape14_2;
	public ModelPart GLOW;
	public ModelPart shape14_3;
	public ModelPart shape1;
	public ModelPart shape1_1;
	public ModelPart sixside;
	public ModelPart shape14_4;
	public ModelPart shape14_5;
	public ModelPart shape14_6;
	public ModelPart shape14_7;
	public ModelPart shape14_8;
	public ModelPart shape14_9;
	public ModelPart shape14_10;
	public ModelPart shape84;
	public ModelPart shape84_1;
	public ModelPart shape84_2;
	public ModelPart shape84_3;
	public ModelPart shape84_4;
	public ModelPart shape84_5;
	public ModelPart shape84_6;
	public ModelPart shape84_7;
	public ModelPart shape99;
	public ModelPart shape99_1;
	public ModelPart shape99_2;
	public ModelPart shape1_;
	public ModelPart shape1__1;
	public ModelPart shape1__2;
	public ModelPart shape1__3;
	public ModelPart shape1__4;
	public ModelPart shape1_2;
	public ModelPart shape1_3;
	public ModelPart shape1_4;
	public ModelPart shape1_5;
	public ModelPart shape1_6;
	public ModelPart shape1_7;
	public ModelPart shape1_8;
	public ModelPart shape1_9;
	public ModelPart shape1_10;
	public ModelPart shape1_11;
	public ModelPart sixside_1;
	public ModelPart shape14_11;
	public ModelPart shape14_12;
	public ModelPart shape1__5;
	public ModelPart shape1__6;
	public ModelPart shape1__7;
	public ModelPart shape1__8;
	public ModelPart shape1__9;
	public ModelPart shape45_;
	public ModelPart shape45;
	public ModelPart shape45_1;
	public ModelPart shape48;
	public ModelPart shape48_1;
	public ModelPart shape48_2;
	public ModelPart shape58;
	public ModelPart shape58_1;
	public ModelPart shape58_2;
	public ModelPart shape59;
	public ModelPart shape60;
	public ModelPart shape59_1;
	public ModelPart shape60_1;
	public ModelPart shape82;
	public ModelPart shape83;
	public ModelPart shape59_2;
	public ModelPart shape60_2;
	public ModelPart glowA1;

	@Override
	public RenderLayer getLayerForPart(IGenericGun gun, ItemStack stack, Identifier texture, int part) {
		if (part==0) {
			return this.getLayer(texture);
		} else {
			return RenderLayer.getEntityTranslucent(texture);
		}
	}
	
	public ModelNDR() {
		super(RenderLayer::getEntityCutout);
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.shape14_1 = new ModelPart(this, 54, 15);
		this.shape14_1.setPivot(3.0F, -3.0F, -2.0F);
		this.shape14_1.addCuboid(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
		this.shape1_8 = new ModelPart(this, 52, 10);
		this.shape1_8.setPivot(4.0F, -2.6F, -1.5F);
		this.shape1_8.addCuboid(0.0F, 0.0F, -3.0F, 3, 2, 3, 0.0F);
		this.setRotation(shape1_8, 1.0471975511965976F, 0.0F, 0.0F);
		this.shape45_1 = new ModelPart(this, 0, 55);
		this.shape45_1.setPivot(0.0F, 0.0F, 3.0F);
		this.shape45_1.addCuboid(0.0F, 0.0F, 0.0F, 8, 3, 6, 0.0F);
		this.setRotation(shape45_1, -1.0471975511965976F, 0.0F, 0.0F);
		this.shape1__9 = new ModelPart(this, 0, 0);
		this.shape1__9.setPivot(0.0F, 8.66F, 0.0F);
		this.shape1__9.addCuboid(0.0F, -3.0F, 0.0F, 3, 3, 5, 0.0F);
		this.GLOW = new ModelPart(this, 42, 45);
		this.GLOW.setPivot(-4.0F, -2.0F, -2.0F);
		this.GLOW.addCuboid(0.0F, 0.0F, 0.0F, 7, 4, 4, 0.0F);
		this.shape14_9 = new ModelPart(this, 42, 35);
		this.shape14_9.setPivot(-4.0F, -3.0F, -2.0F);
		this.shape14_9.addCuboid(0.0F, 0.0F, 0.0F, 7, 6, 4, 0.0F);
		this.shape1_2 = new ModelPart(this, 50, 0);
		this.shape1_2.setPivot(7.0F, 3.46F, -2.0F);
		this.shape1_2.addCuboid(0.0F, -1.0F, -4.0F, 3, 1, 4, 0.0F);
		this.setRotation(shape1_2, -1.0471975511965976F, 0.0F, 0.0F);
		this.sixside = new ModelPart(this, 0, 0);
		this.sixside.setPivot(-8.0F, -4.33F, -2.5F);
		this.sixside.addCuboid(0.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
		this.shape14_3 = new ModelPart(this, 46, 15);
		this.shape14_3.setPivot(3.0F, -2.0F, -3.0F);
		this.shape14_3.addCuboid(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
		this.shape99 = new ModelPart(this, 23, 41);
		this.shape99.setPivot(-5.5F, 5.0F, -2.5F);
		this.shape99.addCuboid(-1.0F, -1.0F, 0.0F, 1, 3, 1, 0.0F);
		this.setRotation(shape99, 0.0F, 0.0F, -0.40980330836826856F);
		this.shape14_6 = new ModelPart(this, 20, 12);
		this.shape14_6.setPivot(-15.0F, -7.0F, -1.5F);
		this.shape14_6.addCuboid(0.0F, 0.0F, 0.0F, 6, 1, 3, 0.0F);
		this.shape58 = new ModelPart(this, 24, 4);
		this.shape58.setPivot(-6.5F, 0.0F, 0.0F);
		this.shape58.addCuboid(0.0F, -5.33F, -1.0F, 2, 2, 2, 0.0F);
		this.shape14_5 = new ModelPart(this, 28, 4);
		this.shape14_5.setPivot(-13.8F, -8.6F, -2.0F);
		this.shape14_5.addCuboid(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F);
		this.setRotation(shape14_5, 0.0F, 0.0F, 0.7853981633974483F);
		this.shape1_7 = new ModelPart(this, 52, 10);
		this.shape1_7.setPivot(4.0F, -2.6F, 1.5F);
		this.shape1_7.addCuboid(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
		this.setRotation(shape1_7, -1.0471975511965976F, 0.0F, 0.0F);
		this.shape1__4 = new ModelPart(this, 0, 0);
		this.shape1__4.setPivot(0.0F, 8.66F, 0.0F);
		this.shape1__4.addCuboid(0.0F, -3.0F, 0.0F, 3, 3, 5, 0.0F);
		this.shape14_12 = new ModelPart(this, 38, 5);
		this.shape14_12.setPivot(-18.0F, -4.0F, -2.0F);
		this.shape14_12.addCuboid(0.0F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
		this.shape1__3 = new ModelPart(this, 0, 0);
		this.shape1__3.setPivot(0.0F, 8.66F, 5.0F);
		this.shape1__3.addCuboid(0.0F, -3.0F, 0.0F, 3, 3, 5, 0.0F);
		this.setRotation(shape1__3, 1.0471975511965976F, 0.0F, 0.0F);
		this.shape99_2 = new ModelPart(this, 15, 38);
		this.shape99_2.setPivot(-6.0F, 5.0F, -3.0F);
		this.shape99_2.addCuboid(-2.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
		this.shape45_ = new ModelPart(this, 0, 49);
		this.shape45_.setPivot(-17.0F, -3.5F, -1.5F);
		this.shape45_.addCuboid(0.0F, 0.0F, 0.0F, 8, 3, 3, 0.0F);
		this.shape1__5 = new ModelPart(this, 0, 0);
		this.shape1__5.setPivot(0.0F, 0.0F, 0.0F);
		this.shape1__5.addCuboid(0.0F, 0.0F, -5.0F, 3, 3, 5, 0.0F);
		this.setRotation(shape1__5, 1.0471975511965976F, 0.0F, 0.0F);
		this.shape1__6 = new ModelPart(this, 0, 0);
		this.shape1__6.setPivot(0.0F, 0.0F, 5.0F);
		this.shape1__6.addCuboid(0.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
		this.setRotation(shape1__6, -1.0471975511965976F, 0.0F, 0.0F);
		this.shape59_1 = new ModelPart(this, 20, 0);
		this.shape59_1.setPivot(1.5F, -4.83F, -0.5F);
		this.shape59_1.addCuboid(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
		this.shape1__1 = new ModelPart(this, 0, 0);
		this.shape1__1.setPivot(0.0F, 0.0F, 5.0F);
		this.shape1__1.addCuboid(0.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
		this.setRotation(shape1__1, -1.0471975511965976F, 0.0F, 0.0F);
		this.shape59_2 = new ModelPart(this, 20, 0);
		this.shape59_2.setPivot(1.5F, -4.83F, -0.5F);
		this.shape59_2.addCuboid(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
		this.shape14_10 = new ModelPart(this, 46, 15);
		this.shape14_10.setPivot(-5.0F, -2.0F, -3.0F);
		this.shape14_10.addCuboid(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F);
		this.shape59 = new ModelPart(this, 20, 0);
		this.shape59.setPivot(1.5F, -4.83F, -0.5F);
		this.shape59.addCuboid(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
		this.glowA1 = new ModelPart(this, 48, 58);
		this.glowA1.setPivot(0.0F, 0.0F, 0.0F);
		this.glowA1.addCuboid(-4.0F, -6.0F, -0.5F, 7, 5, 1, 0.0F);
		this.setRotation(glowA1, 0.4363323129985824F, 0.0F, 0.0F);
		this.shape58_1 = new ModelPart(this, 18, 8);
		this.shape58_1.setPivot(-6.5F, 0.0F, 0.0F);
		this.shape58_1.addCuboid(-1.0F, -5.33F, -1.0F, 3, 2, 2, 0.0F);
		this.setRotation(shape58_1, 2.0943951023931953F, 0.0F, 0.0F);
		this.shape84_6 = new ModelPart(this, 12, 25);
		this.shape84_6.setPivot(-32.0F, 0.0F, -0.5F);
		this.shape84_6.addCuboid(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
		this.shape84_7 = new ModelPart(this, 16, 25);
		this.shape84_7.setPivot(-32.0F, -2.0F, -0.5F);
		this.shape84_7.addCuboid(0.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F);
		this.shape60_1 = new ModelPart(this, 30, 2);
		this.shape60_1.setPivot(10.5F, -4.83F, -0.5F);
		this.shape60_1.addCuboid(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
		this.setRotation(shape60_1, 0.0F, 0.0F, 0.7853981633974483F);
		this.shape1_11 = new ModelPart(this, 52, 10);
		this.shape1_11.setPivot(4.0F, 2.6F, -1.5F);
		this.shape1_11.addCuboid(0.0F, -2.0F, 0.0F, 3, 2, 3, 0.0F);
		this.shape14_8 = new ModelPart(this, 54, 15);
		this.shape14_8.setPivot(-5.0F, -3.0F, -2.0F);
		this.shape14_8.addCuboid(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
		this.shape14_4 = new ModelPart(this, 16, 16);
		this.shape14_4.setPivot(-20.0F, -5.0F, -2.0F);
		this.shape14_4.addCuboid(0.0F, 0.0F, 0.0F, 14, 1, 4, 0.0F);
		this.shape84_2 = new ModelPart(this, 34, 25);
		this.shape84_2.setPivot(-25.0F, -1.0F, 0.5F);
		this.shape84_2.addCuboid(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
		this.shape60_2 = new ModelPart(this, 30, 2);
		this.shape60_2.setPivot(10.5F, -4.83F, -0.5F);
		this.shape60_2.addCuboid(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
		this.setRotation(shape60_2, 0.0F, 0.0F, 0.7853981633974483F);
		this.shape1_1 = new ModelPart(this, 50, 0);
		this.shape1_1.setPivot(7.0F, -3.46F, -2.0F);
		this.shape1_1.addCuboid(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
		this.shape1_ = new ModelPart(this, 0, 0);
		this.shape1_.setPivot(0.0F, 0.0F, 0.0F);
		this.shape1_.addCuboid(0.0F, 0.0F, -5.0F, 3, 3, 5, 0.0F);
		this.setRotation(shape1_, 1.0471975511965976F, 0.0F, 0.0F);
		this.shape99_1 = new ModelPart(this, 24, 36);
		this.shape99_1.setPivot(-8.5F, 3.0F, -3.0F);
		this.shape99_1.addCuboid(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
		this.shape15 = new ModelPart(this, 38, 25);
		this.shape15.setPivot(-4.0F, -2.0F, -3.0F);
		this.shape15.addCuboid(0.0F, 0.0F, 0.0F, 7, 4, 6, 0.0F);
		this.sixside_1 = new ModelPart(this, 0, 0);
		this.sixside_1.setPivot(-21.0F, -4.33F, -2.5F);
		this.sixside_1.addCuboid(0.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
		this.shape84_5 = new ModelPart(this, 40, 1);
		this.shape84_5.setPivot(-31.0F, 0.0F, 0.0F);
		this.shape84_5.addCuboid(0.0F, 0.0F, 0.0F, 5, 4, 0, 0.0F);
		this.shape14_11 = new ModelPart(this, 38, 5);
		this.shape14_11.setPivot(-9.0F, -4.0F, -2.0F);
		this.shape14_11.addCuboid(0.0F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
		this.shape1__7 = new ModelPart(this, 0, 0);
		this.shape1__7.setPivot(0.0F, 8.66F, 0.0F);
		this.shape1__7.addCuboid(0.0F, -3.0F, -5.0F, 3, 3, 5, 0.0F);
		this.setRotation(shape1__7, -1.0471975511965976F, 0.0F, 0.0F);
		this.shape60 = new ModelPart(this, 30, 2);
		this.shape60.setPivot(10.5F, -4.83F, -0.5F);
		this.shape60.addCuboid(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
		this.setRotation(shape60, 0.0F, 0.0F, 0.7853981633974483F);
		this.shape84_3 = new ModelPart(this, 38, 28);
		this.shape84_3.setPivot(-31.0F, 0.0F, -0.5F);
		this.shape84_3.addCuboid(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.shape1 = new ModelPart(this, 48, 5);
		this.shape1.setPivot(7.0F, -3.46F, 2.0F);
		this.shape1.addCuboid(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
		this.setRotation(shape1, -1.0471975511965976F, 0.0F, 0.0F);
		this.shape1_9 = new ModelPart(this, 52, 10);
		this.shape1_9.setPivot(4.0F, -2.6F, -1.5F);
		this.shape1_9.addCuboid(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F);
		this.shape45 = new ModelPart(this, 0, 55);
		this.shape45.setPivot(0.0F, 0.0F, 0.0F);
		this.shape45.addCuboid(0.0F, 0.0F, -6.0F, 8, 3, 6, 0.0F);
		this.setRotation(shape45, 1.0471975511965976F, 0.0F, 0.0F);
		this.shape14_2 = new ModelPart(this, 54, 15);
		this.shape14_2.setPivot(3.0F, 2.0F, -2.0F);
		this.shape14_2.addCuboid(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
		this.shape84 = new ModelPart(this, 34, 25);
		this.shape84.setPivot(-25.0F, -1.0F, -1.5F);
		this.shape84.addCuboid(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
		this.shape1_4 = new ModelPart(this, 48, 5);
		this.shape1_4.setPivot(7.0F, -3.46F, -2.0F);
		this.shape1_4.addCuboid(0.0F, 0.0F, -4.0F, 4, 1, 4, 0.0F);
		this.setRotation(shape1_4, 1.0471975511965976F, 0.0F, 0.0F);
		this.shape1_10 = new ModelPart(this, 52, 10);
		this.shape1_10.setPivot(4.0F, 2.6F, 1.5F);
		this.shape1_10.addCuboid(0.0F, -2.0F, 0.0F, 3, 2, 3, 0.0F);
		this.setRotation(shape1_10, 1.0471975511965976F, 0.0F, 0.0F);
		this.shape48_1 = new ModelPart(this, 0, 49);
		this.shape48_1.setPivot(0.0F, 7.79F, 4.5F);
		this.shape48_1.addCuboid(0.0F, -3.0F, 0.0F, 8, 3, 3, 0.0F);
		this.setRotation(shape48_1, 1.0471975511965976F, 0.0F, 0.0F);
		this.shape84_1 = new ModelPart(this, 26, 25);
		this.shape84_1.setPivot(-23.0F, -3.0F, -2.0F);
		this.shape84_1.addCuboid(0.0F, 0.0F, 0.0F, 2, 6, 4, 0.0F);
		this.shape84_4 = new ModelPart(this, 34, 35);
		this.shape84_4.setPivot(-26.0F, -2.0F, -0.5F);
		this.shape84_4.addCuboid(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
		this.shape14 = new ModelPart(this, 54, 15);
		this.shape14.setPivot(-5.0F, 2.0F, -2.0F);
		this.shape14.addCuboid(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
		this.shape1__2 = new ModelPart(this, 0, 0);
		this.shape1__2.setPivot(0.0F, 8.66F, 0.0F);
		this.shape1__2.addCuboid(0.0F, -3.0F, -5.0F, 3, 3, 5, 0.0F);
		this.setRotation(shape1__2, -1.0471975511965976F, 0.0F, 0.0F);
		this.shape1_6 = new ModelPart(this, 50, 0);
		this.shape1_6.setPivot(7.0F, 3.46F, 2.0F);
		this.shape1_6.addCuboid(0.0F, -1.0F, 0.0F, 3, 1, 4, 0.0F);
		this.setRotation(shape1_6, 1.0471975511965976F, 0.0F, 0.0F);
		this.shape83 = new ModelPart(this, 17, 29);
		this.shape83.setPivot(0.0F, -12.0F, 0.0F);
		this.shape83.addCuboid(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.setRotation(shape83, 0.0F, 0.7853981633974483F, 0.0F);
		this.shape1_3 = new ModelPart(this, 48, 5);
		this.shape1_3.setPivot(7.0F, 3.46F, -2.0F);
		this.shape1_3.addCuboid(0.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F);
		this.shape1__8 = new ModelPart(this, 0, 0);
		this.shape1__8.setPivot(0.0F, 8.66F, 5.0F);
		this.shape1__8.addCuboid(0.0F, -3.0F, 0.0F, 3, 3, 5, 0.0F);
		this.setRotation(shape1__8, 1.0471975511965976F, 0.0F, 0.0F);
		this.shape58_2 = new ModelPart(this, 18, 8);
		this.shape58_2.setPivot(-6.5F, 0.0F, 0.0F);
		this.shape58_2.addCuboid(-1.0F, -5.33F, -1.0F, 3, 2, 2, 0.0F);
		this.setRotation(shape58_2, -2.0943951023931953F, 0.0F, 0.0F);
		this.shape82 = new ModelPart(this, 18, 12);
		this.shape82.setPivot(-0.5F, -6.0F, -0.5F);
		this.shape82.addCuboid(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.shape14_7 = new ModelPart(this, 20, 21);
		this.shape14_7.setPivot(-16.0F, -6.0F, -1.5F);
		this.shape14_7.addCuboid(0.0F, 0.0F, 0.0F, 10, 1, 3, 0.0F);
		this.shape1_5 = new ModelPart(this, 52, 10);
		this.shape1_5.setPivot(4.0F, 2.6F, -1.5F);
		this.shape1_5.addCuboid(0.0F, -2.0F, -3.0F, 3, 2, 3, 0.0F);
		this.setRotation(shape1_5, -1.0471975511965976F, 0.0F, 0.0F);
		this.shape48 = new ModelPart(this, 0, 49);
		this.shape48.setPivot(0.0F, 7.79F, -1.5F);
		this.shape48.addCuboid(0.0F, -3.0F, -3.0F, 8, 3, 3, 0.0F);
		this.setRotation(shape48, -1.0471975511965976F, 0.0F, 0.0F);
		this.shape48_2 = new ModelPart(this, 0, 55);
		this.shape48_2.setPivot(0.0F, 7.79F, -1.5F);
		this.shape48_2.addCuboid(0.0F, -3.0F, 0.0F, 8, 3, 6, 0.0F);
		this.shape45_.addChild(this.shape45_1);
		this.sixside_1.addChild(this.shape1__9);
		this.sixside.addChild(this.shape1__4);
		this.sixside.addChild(this.shape1__3);
		this.sixside_1.addChild(this.shape1__5);
		this.sixside_1.addChild(this.shape1__6);
		this.shape58_1.addChild(this.shape59_1);
		this.sixside.addChild(this.shape1__1);
		this.shape58_2.addChild(this.shape59_2);
		this.shape58.addChild(this.shape59);
		this.shape58_1.addChild(this.shape60_1);
		this.shape58_2.addChild(this.shape60_2);
		this.sixside.addChild(this.shape1_);
		this.sixside_1.addChild(this.shape1__7);
		this.shape58.addChild(this.shape60);
		this.shape45_.addChild(this.shape45);
		this.shape45_.addChild(this.shape48_1);
		this.sixside.addChild(this.shape1__2);
		this.shape58_2.addChild(this.shape83);
		this.sixside_1.addChild(this.shape1__8);
		this.shape58_2.addChild(this.shape82);
		this.shape45_.addChild(this.shape48);
		this.shape45_.addChild(this.shape48_2);
	}

	@Override
	public void render(Entity entityIn, MatrixStack matrices, VertexConsumer vertices, int ammoLeft,
					   float reloadProgress, ModelTransformationMode transformType, int part, float fireProgress, float chargeProgress, int light,
					   int overlay) {

		
		if (part == 0) {
			this.shape14_1.render(matrices, vertices, light, overlay);
			this.shape1_8.render(matrices, vertices, light, overlay);
			this.shape14_9.render(matrices, vertices, light, overlay);
			this.shape1_2.render(matrices, vertices, light, overlay);
			this.sixside.render(matrices, vertices, light, overlay);
			this.shape14_3.render(matrices, vertices, light, overlay);
			this.shape99.render(matrices, vertices, light, overlay);
			this.shape14_6.render(matrices, vertices, light, overlay);
			this.shape58.render(matrices, vertices, light, overlay);
			this.shape14_5.render(matrices, vertices, light, overlay);
			this.shape1_7.render(matrices, vertices, light, overlay);
			this.shape14_12.render(matrices, vertices, light, overlay);
			this.shape99_2.render(matrices, vertices, light, overlay);
			this.shape45_.render(matrices, vertices, light, overlay);
			this.shape14_10.render(matrices, vertices, light, overlay);
			this.shape58_1.render(matrices, vertices, light, overlay);
			this.shape84_6.render(matrices, vertices, light, overlay);
			this.shape84_7.render(matrices, vertices, light, overlay);
			this.shape1_11.render(matrices, vertices, light, overlay);
			this.shape14_8.render(matrices, vertices, light, overlay);
			this.shape14_4.render(matrices, vertices, light, overlay);
			this.shape84_2.render(matrices, vertices, light, overlay);
			this.shape1_1.render(matrices, vertices, light, overlay);
			this.shape99_1.render(matrices, vertices, light, overlay);
			this.shape15.render(matrices, vertices, light, overlay);
			this.sixside_1.render(matrices, vertices, light, overlay);
			this.shape84_5.render(matrices, vertices, light, overlay);
			this.shape14_11.render(matrices, vertices, light, overlay);
			this.shape84_3.render(matrices, vertices, light, overlay);
			this.shape1.render(matrices, vertices, light, overlay);
			this.shape1_9.render(matrices, vertices, light, overlay);
			this.shape14_2.render(matrices, vertices, light, overlay);
			this.shape84.render(matrices, vertices, light, overlay);
			this.shape1_4.render(matrices, vertices, light, overlay);
			this.shape1_10.render(matrices, vertices, light, overlay);
			this.shape84_1.render(matrices, vertices, light, overlay);
			this.shape84_4.render(matrices, vertices, light, overlay);
			this.shape14.render(matrices, vertices, light, overlay);
			this.shape1_6.render(matrices, vertices, light, overlay);
			this.shape1_3.render(matrices, vertices, light, overlay);
			this.shape58_2.render(matrices, vertices, light, overlay);
			this.shape14_7.render(matrices, vertices, light, overlay);
			this.shape1_5.render(matrices, vertices, light, overlay);

			this.GLOW.render(matrices, vertices, bright_light, overlay);
		}
		if (part == 1 && fireProgress > 0) {

			matrices.push();
			float s = (float) (0.90 + Math.sin(fireProgress * 2.0 * Math.PI) * 0.1);

			matrices.scale(s, s, s);

			this.glowA1.render(matrices, vertices, bright_light, overlay);
			this.glowA1.pitch = 63.0f * ((float) MathUtil.D2R);
			this.glowA1.render(matrices, vertices, bright_light, overlay);
			this.glowA1.pitch = 117.0f * ((float) MathUtil.D2R);
			this.glowA1.render(matrices, vertices, bright_light, overlay);
			this.glowA1.pitch = 155.0f * ((float) MathUtil.D2R);
			this.glowA1.render(matrices, vertices, bright_light, overlay);
			this.glowA1.pitch = -155.0f * ((float) MathUtil.D2R);
			this.glowA1.render(matrices, vertices, bright_light, overlay);
			this.glowA1.pitch = -117.0f * ((float) MathUtil.D2R);
			this.glowA1.render(matrices, vertices, bright_light, overlay);
			this.glowA1.pitch = -63.0f * ((float) MathUtil.D2R);
			this.glowA1.render(matrices, vertices, bright_light, overlay);
			this.glowA1.pitch = -25.0f * ((float) MathUtil.D2R);
			this.glowA1.render(matrices, vertices, bright_light, overlay);
			this.glowA1.pitch = 25.0f * ((float) MathUtil.D2R);

			matrices.pop();
		}

	}
}
