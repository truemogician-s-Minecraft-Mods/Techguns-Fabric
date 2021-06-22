package techguns.client.models.guns;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import techguns.client.models.ModelPart;
import net.minecraft.client.render.model.json.ModelTransformation.Mode;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;

public class ModelPDW extends ModelMultipart {
	// fields
	ModelPart Shape1;
	ModelPart Shape2;
	ModelPart Shape3;
	ModelPart Shape4;
	ModelPart Shape5;
	ModelPart Shape6;
	ModelPart Shape7;
	ModelPart Shape8;
	ModelPart Shape9;
	ModelPart Shape10;
	ModelPart Shape11;
	ModelPart Shape12;
	ModelPart Shape13;
	ModelPart Shape14;
	ModelPart Shape15;
	ModelPart Shape16;
	ModelPart Shape17;
	ModelPart Shape18;
	ModelPart Shape19;
	ModelPart Shape20;
	ModelPart Shape21;
	ModelPart Shape22;
	ModelPart Shape23;
	ModelPart Shape24;
	ModelPart Shape25;
	ModelPart Shape26;
	ModelPart Shape27;
	ModelPart Shape28;
	ModelPart Shape29;
	ModelPart Shape30;
	ModelPart Shape31;
	ModelPart Shape32;
	ModelPart Shape33;
	ModelPart Shape34;
	ModelPart Shape35;
	ModelPart Shape36;
	ModelPart Shape37;
	ModelPart Shape38;
	ModelPart Shape39;
	ModelPart Shape40;
	ModelPart Shape41;

	public ModelPDW() {
		super(RenderLayer::getEntitySolid);
		textureWidth = 64;
		textureHeight = 64;

		Shape1 = new ModelPart(this, 0, 32);
		Shape1.addCuboid(0F, 0F, 0F, 13, 1, 2);
		Shape1.setPivot(-3.5F, -4F, -1F);
		Shape1.setTextureSize(64, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelPart(this, 50, 20);
		Shape2.addCuboid(0F, 0F, 0F, 1, 2, 1);
		Shape2.setPivot(12F, 0.5F, 1F);
		Shape2.setTextureSize(64, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelPart(this, 0, 8);
		Shape3.addCuboid(0F, 0F, 0F, 25, 1, 3);
		Shape3.setPivot(-13F, -1F, -1.5F);
		Shape3.setTextureSize(64, 64);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelPart(this, 0, 35);
		Shape4.addCuboid(0F, 0F, 0F, 3, 2, 3);
		Shape4.setPivot(-4F, -3F, -1.5F);
		Shape4.setTextureSize(64, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelPart(this, 44, 54);
		Shape5.addCuboid(0F, 0F, 0F, 2, 3, 2);
		Shape5.setPivot(-15F, 6.5F, -1F);
		Shape5.setTextureSize(64, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, -0.4833219F);
		Shape6 = new ModelPart(this, 8, 26);
		Shape6.addCuboid(0F, 0F, 0F, 2, 2, 1);
		Shape6.setPivot(-3.9F, -4.5F, 0.4F);
		Shape6.setTextureSize(64, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelPart(this, 0, 23);
		Shape7.addCuboid(0F, 0F, 0F, 8, 1, 2);
		Shape7.setPivot(-1F, -2F, -1F);
		Shape7.setTextureSize(64, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelPart(this, 0, 26);
		Shape8.addCuboid(0F, 0F, 0F, 2, 1, 2);
		Shape8.setPivot(9F, -2F, -1F);
		Shape8.setTextureSize(64, 64);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelPart(this, 2, 29);
		Shape9.addCuboid(0F, 0F, 0F, 1, 1, 0);
		Shape9.setPivot(9.5F, -4.5F, 0F);
		Shape9.setTextureSize(64, 64);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelPart(this, 0, 19);
		Shape10.addCuboid(0F, 0F, 0F, 1, 2, 2);
		Shape10.setPivot(9.5F, -4F, -1F);
		Shape10.setTextureSize(64, 64);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelPart(this, 0, 30);
		Shape11.addCuboid(0F, 0F, 0F, 1, 1, 0);
		Shape11.setPivot(9.5F, -5F, -0.5F);
		Shape11.setTextureSize(64, 64);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelPart(this, 0, 29);
		Shape12.addCuboid(0F, 0F, 0F, 1, 1, 0);
		Shape12.setPivot(9.5F, -5F, 0.5F);
		Shape12.setTextureSize(64, 64);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelPart(this, 8, 26);
		Shape13.addCuboid(0F, 0F, 0F, 2, 2, 1);
		Shape13.setPivot(-3.9F, -4.5F, -1.4F);
		Shape13.setTextureSize(64, 64);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelPart(this, 31, 26);
		Shape14.addCuboid(0F, -0.5F, -0.5F, 1, 1, 1);
		Shape14.setPivot(13F, 1.5F, 0F);
		Shape14.setTextureSize(64, 64);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelPart(this, 23, 20);
		Shape15.addCuboid(0F, -1F, -1F, 3, 2, 2);
		Shape15.setPivot(14F, 1.5F, 0F);
		Shape15.setTextureSize(64, 64);
		Shape15.mirror = true;
		setRotation(Shape15, 0.7853982F, 0F, 0F);
		Shape16 = new ModelPart(this, 6, 55);
		Shape16.addCuboid(0F, 0F, 0F, 6, 1, 2);
		Shape16.setPivot(4.5F, 5F, -1F);
		Shape16.setTextureSize(64, 64);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelPart(this, 46, 20);
		Shape17.addCuboid(0F, 0F, 0F, 1, 2, 1);
		Shape17.setPivot(12F, 0.5F, -2F);
		Shape17.setTextureSize(64, 64);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelPart(this, 35, 20);
		Shape18.addCuboid(0F, -1F, -1F, 1, 2, 2);
		Shape18.setPivot(12F, 1.5F, 0F);
		Shape18.setTextureSize(64, 64);
		Shape18.mirror = true;
		setRotation(Shape18, 0.7853982F, 0F, 0F);
		Shape19 = new ModelPart(this, 16, 59);
		Shape19.addCuboid(0F, -0.5F, -0.5F, 1, 1, 1);
		Shape19.setPivot(11.5F, 4F, 0F);
		Shape19.setTextureSize(64, 64);
		Shape19.mirror = true;
		setRotation(Shape19, 0.7853982F, 0F, 0F);
		Shape20 = new ModelPart(this, 0, 12);
		Shape20.addCuboid(0F, 0F, 0F, 25, 3, 4);
		Shape20.setPivot(-13F, 0F, -2F);
		Shape20.setTextureSize(64, 64);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 0F, 0F);
		Shape21 = new ModelPart(this, 0, 55);
		Shape21.addCuboid(0F, 0F, 0F, 1, 1, 2);
		Shape21.setPivot(10.5F, 6F, -1F);
		Shape21.setTextureSize(64, 64);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Shape22 = new ModelPart(this, 22, 55);
		Shape22.addCuboid(0F, 0F, 0F, 1, 8, 1);
		Shape22.setPivot(3.5F, 5F, -0.5F);
		Shape22.setTextureSize(64, 64);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, 0.4363323F);
		Shape23 = new ModelPart(this, 0, 59);
		Shape23.addCuboid(0F, 0F, 0F, 6, 2, 3);
		Shape23.setPivot(4.5F, 3F, -1.5F);
		Shape23.setTextureSize(64, 64);
		Shape23.mirror = true;
		setRotation(Shape23, 0F, 0F, 0F);
		Shape24 = new ModelPart(this, 20, 46);
		Shape24.addCuboid(0F, 0F, 0F, 2, 2, 3);
		Shape24.setPivot(-1.5F, 3F, -1.5F);
		Shape24.setTextureSize(64, 64);
		Shape24.mirror = true;
		setRotation(Shape24, 0F, 0F, 0F);
		Shape25 = new ModelPart(this, 31, 26);
		Shape25.addCuboid(0F, -0.5F, -0.5F, 1, 1, 1);
		Shape25.setPivot(13F, 1.5F, 0F);
		Shape25.setTextureSize(64, 64);
		Shape25.mirror = true;
		setRotation(Shape25, 0.7853982F, 0F, 0F);
		Shape26 = new ModelPart(this, 26, 51);
		Shape26.addCuboid(0F, 0F, 0F, 2, 0, 2);
		Shape26.setPivot(-2.5F, 6F, -1F);
		Shape26.setTextureSize(64, 64);
		Shape26.mirror = true;
		setRotation(Shape26, 0F, 0F, -0.7853982F);
		Shape27 = new ModelPart(this, 14, 48);
		Shape27.addCuboid(0F, 0F, 0F, 1, 3, 3);
		Shape27.setPivot(10.5F, 3F, -1.5F);
		Shape27.setTextureSize(64, 64);
		Shape27.mirror = true;
		setRotation(Shape27, 0F, 0F, 0F);
		Shape28 = new ModelPart(this, -1, 48);
		Shape28.addCuboid(0F, 0F, 0F, 4, 3, 3);
		Shape28.setPivot(0.5F, 3F, -1.5F);
		Shape28.setTextureSize(64, 64);
		Shape28.mirror = true;
		setRotation(Shape28, 0F, 0F, 0F);
		Shape29 = new ModelPart(this, 38, 41);
		Shape29.addCuboid(-9.5F, 8F, 0F, 11, 1, 2);
		Shape29.setPivot(3.5F, 5F, -1F);
		Shape29.setTextureSize(64, 64);
		Shape29.mirror = true;
		setRotation(Shape29, 0F, 0F, 0.4363323F);
		Shape30 = new ModelPart(this, 26, 54);
		Shape30.addCuboid(-4F, 0F, 0F, 4, 8, 2);
		Shape30.setPivot(3.5F, 5F, -1F);
		Shape30.setTextureSize(64, 64);
		Shape30.mirror = true;
		setRotation(Shape30, 0F, 0F, 0.4363323F);
		Shape31 = new ModelPart(this, 53, 53);
		Shape31.addCuboid(-2F, 0F, 0F, 3, 6, 2);
		Shape31.setPivot(-5F, 3.5F, -1F);
		Shape31.setTextureSize(64, 64);
		Shape31.mirror = true;
		setRotation(Shape31, 0F, 0F, 0.4363323F);
		Shape32 = new ModelPart(this, 26, 51);
		Shape32.addCuboid(0F, 0F, 0F, 3, 0, 2);
		Shape32.setPivot(-5.5F, 6F, -1F);
		Shape32.setTextureSize(64, 64);
		Shape32.mirror = true;
		setRotation(Shape32, 0F, 0F, 0F);
		Shape33 = new ModelPart(this, 55, 48);
		Shape33.addCuboid(0F, 0F, 0F, 2, 1, 2);
		Shape33.setPivot(-8F, 3F, -1F);
		Shape33.setTextureSize(64, 64);
		Shape33.mirror = true;
		setRotation(Shape33, 0F, 0F, 0.8726646F);
		Shape34 = new ModelPart(this, 0, 44);
		Shape34.addCuboid(0F, 0F, 0F, 5, 1, 3);
		Shape34.setPivot(-6.5F, 3F, -1.5F);
		Shape34.setTextureSize(64, 64);
		Shape34.mirror = true;
		setRotation(Shape34, 0F, 0F, 0F);
		Shape35 = new ModelPart(this, 45, 44);
		Shape35.addCuboid(0F, 0F, 0F, 7, 1, 2);
		Shape35.setPivot(-13F, 3F, -1F);
		Shape35.setTextureSize(64, 64);
		Shape35.mirror = true;
		setRotation(Shape35, 0F, 0F, 0F);
		Shape36 = new ModelPart(this, 38, 48);
		Shape36.addCuboid(-2F, 0F, 0F, 6, 2, 2);
		Shape36.setPivot(-11.5F, 6.5F, -1F);
		Shape36.setTextureSize(64, 64);
		Shape36.mirror = true;
		setRotation(Shape36, 0F, 0F, 0.2602503F);
		Shape37 = new ModelPart(this, 39, 4);
		Shape37.addCuboid(0F, 0F, 0F, 9, 1, 3);
		Shape37.setPivot(-13F, -2F, -1.5F);
		Shape37.setTextureSize(64, 64);
		Shape37.mirror = true;
		setRotation(Shape37, 0F, 0F, 0F);
		Shape38 = new ModelPart(this, 54, 22);
		Shape38.addCuboid(0F, 0F, 0F, 2, 1, 3);
		Shape38.setPivot(-15F, -2.5F, -1.5F);
		Shape38.setTextureSize(64, 64);
		Shape38.mirror = true;
		setRotation(Shape38, 0F, 0F, 0F);
		Shape39 = new ModelPart(this, 52, 26);
		Shape39.addCuboid(0F, 0F, 0F, 2, 4, 4);
		Shape39.setPivot(-15F, -1.5F, -2F);
		Shape39.setTextureSize(64, 64);
		Shape39.mirror = true;
		setRotation(Shape39, 0F, 0F, 0F);
		Shape40 = new ModelPart(this, 54, 34);
		Shape40.addCuboid(0F, 0F, 0F, 2, 2, 3);
		Shape40.setPivot(-15F, 2.5F, -1.5F);
		Shape40.setTextureSize(64, 64);
		Shape40.mirror = true;
		setRotation(Shape40, 0F, 0F, 0F);
		Shape41 = new ModelPart(this, 44, 59);
		Shape41.addCuboid(0F, 0F, 0F, 2, 2, 2);
		Shape41.setPivot(-15F, 4.5F, -1F);
		Shape41.setTextureSize(64, 64);
		Shape41.mirror = true;
		setRotation(Shape41, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entityIn, MatrixStack matrices, VertexConsumer vertices, int ammoLeft,
			float reloadProgress, Mode transformType, int part, float fireProgress, float chargeProgress, int light,
			int overlay) {

		Shape1.render(matrices, vertices, light, overlay);
		Shape2.render(matrices, vertices, light, overlay);
		Shape3.render(matrices, vertices, light, overlay);
		Shape4.render(matrices, vertices, light, overlay);
		Shape5.render(matrices, vertices, light, overlay);
		Shape6.render(matrices, vertices, light, overlay);
		Shape7.render(matrices, vertices, light, overlay);
		Shape8.render(matrices, vertices, light, overlay);
		Shape9.render(matrices, vertices, light, overlay);
		Shape10.render(matrices, vertices, light, overlay);
		Shape11.render(matrices, vertices, light, overlay);
		Shape12.render(matrices, vertices, light, overlay);
		Shape13.render(matrices, vertices, light, overlay);
		Shape14.render(matrices, vertices, light, overlay);
		Shape15.render(matrices, vertices, light, overlay);
		Shape16.render(matrices, vertices, light, overlay);
		Shape17.render(matrices, vertices, light, overlay);
		Shape18.render(matrices, vertices, light, overlay);
		Shape19.render(matrices, vertices, light, overlay);
		Shape20.render(matrices, vertices, light, overlay);
		Shape21.render(matrices, vertices, light, overlay);
		Shape22.render(matrices, vertices, light, overlay);
		Shape23.render(matrices, vertices, light, overlay);
		Shape24.render(matrices, vertices, light, overlay);
		Shape25.render(matrices, vertices, light, overlay);
		Shape26.render(matrices, vertices, light, overlay);
		Shape27.render(matrices, vertices, light, overlay);
		Shape28.render(matrices, vertices, light, overlay);
		Shape29.render(matrices, vertices, light, overlay);
		Shape30.render(matrices, vertices, light, overlay);
		Shape31.render(matrices, vertices, light, overlay);
		Shape32.render(matrices, vertices, light, overlay);
		Shape33.render(matrices, vertices, light, overlay);
		Shape34.render(matrices, vertices, light, overlay);
		Shape35.render(matrices, vertices, light, overlay);
		Shape36.render(matrices, vertices, light, overlay);
		Shape37.render(matrices, vertices, light, overlay);
		Shape38.render(matrices, vertices, light, overlay);
		Shape39.render(matrices, vertices, light, overlay);
		Shape40.render(matrices, vertices, light, overlay);
		Shape41.render(matrices, vertices, light, overlay);
	}

}