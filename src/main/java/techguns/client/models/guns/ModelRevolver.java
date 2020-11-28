package techguns.client.models.guns;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.model.json.ModelTransformation.Mode;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;

public class ModelRevolver extends ModelMultipart {
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
	ModelPart Shape12;
	ModelPart Shape14;
	ModelPart Shape15;
	ModelPart Shape16;
	ModelPart Shape17;
	ModelPart Shape18;
	ModelPart Shape19;
	ModelPart Shape20;
	ModelPart Shape21;
	ModelPart Shape22;

	public ModelRevolver() {
        super(RenderLayer::getEntitySolid);
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new ModelPart(this, 0, 4);
		Shape1.addCuboid(0F, -0.5F, -0.5F, 8, 1, 1);
		Shape1.setPivot(9F, 1F, 1F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0.7853982F, 0F, 0F);
		Shape2 = new ModelPart(this, 32, 0);
		Shape2.addCuboid(1F, 0F, 0.5F, 2, 1, 1);
		Shape2.setPivot(19.5F, -2.8F, 0F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelPart(this, 32, 5);
		Shape3.addCuboid(0F, 0F, 0F, 1, 1, 1);
		Shape3.setPivot(-3.5F, -1F, 0.5F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelPart(this, 0, 0);
		Shape4.addCuboid(0F, -1F, -1F, 14, 2, 2);
		Shape4.setPivot(9F, -1F, 1F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0.7853982F, 0F, 0F);
		Shape5 = new ModelPart(this, 32, 2);
		Shape5.addCuboid(0F, 0F, 0F, 2, 2, 1);
		Shape5.setPivot(-2.5F, -1F, 0.5F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelPart(this, 0, 18);
		Shape6.addCuboid(0F, 0F, 0F, 5, 1, 4);
		Shape6.setPivot(1.5F, 1F, -1F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelPart(this, 50, 15);
		Shape7.addCuboid(0F, 0F, 0F, 3, 0, 2);
		Shape7.setPivot(3F, 5.5F, 0F);
		Shape7.setTextureSize(64, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelPart(this, 42, 0);
		Shape8.addCuboid(0F, 0F, 0F, 9, 1, 2);
		Shape8.setPivot(0F, -2.5F, 0F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelPart(this, 42, 12);
		Shape9.addCuboid(0F, 0F, 0F, 6, 1, 2);
		Shape9.setPivot(2F, 2.5F, 0F);
		Shape9.setTextureSize(64, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelPart(this, 42, 8);
		Shape10.addCuboid(0F, 0F, 0F, 9, 2, 2);
		Shape10.setPivot(0F, 0.5F, 0F);
		Shape10.setTextureSize(64, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape12 = new ModelPart(this, 58, 12);
		Shape12.addCuboid(0F, 0F, 0F, 1, 2, 2);
		Shape12.setPivot(6F, 3.5F, 0F);
		Shape12.setTextureSize(64, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape14 = new ModelPart(this, 24, 4);
		Shape14.addCuboid(0F, 0F, 0F, 2, 2, 2);
		Shape14.setPivot(-3F, 0.5F, 0F);
		Shape14.setTextureSize(64, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelPart(this, 58, 12);
		Shape15.addCuboid(0F, 0F, 0F, 1, 2, 2);
		Shape15.setPivot(2F, 3.5F, 0F);
		Shape15.setTextureSize(64, 32);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelPart(this, 26, 8);
		Shape16.addCuboid(0F, 0F, 0F, 6, 2, 2);
		Shape16.setPivot(-4F, 2.5F, 0F);
		Shape16.setTextureSize(64, 32);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelPart(this, 25, 12);
		Shape17.addCuboid(0F, 0F, 0F, 4, 2, 2);
		Shape17.setPivot(-4F, 4.5F, 0F);
		Shape17.setTextureSize(64, 32);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelPart(this, 25, 16);
		Shape18.addCuboid(-3F, 0F, 0F, 4, 5, 2);
		Shape18.setPivot(-2F, 6.5F, 0F);
		Shape18.setTextureSize(64, 32);
		Shape18.mirror = true;
		setRotation(Shape18, 0F, 0F, 0F);
		Shape19 = new ModelPart(this, 37, 15);
		Shape19.addCuboid(0F, 0F, 0F, 1, 4, 2);
		Shape19.setPivot(-1F, -1.5F, 0F);
		Shape19.setTextureSize(64, 32);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);
		Shape20 = new ModelPart(this, 40, 3);
		Shape20.addCuboid(0F, 0F, 0F, 9, 2, 3);
		Shape20.setPivot(0F, -1.5F, -0.5F);
		Shape20.setTextureSize(64, 32);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 0F, 0F);
		Shape21 = new ModelPart(this, 0, 11);
		Shape21.addCuboid(0F, 0F, 0F, 5, 2, 5);
		Shape21.setPivot(1.5F, -1F, -1.5F);
		Shape21.setTextureSize(64, 32);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Shape22 = new ModelPart(this, 0, 6);
		Shape22.addCuboid(0F, 0F, 0F, 5, 1, 4);
		Shape22.setPivot(1.5F, -2F, -1F);
		Shape22.setTextureSize(64, 32);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, 0F);
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
		Shape12.render(matrices, vertices, light, overlay);
		Shape14.render(matrices, vertices, light, overlay);
		Shape15.render(matrices, vertices, light, overlay);
		Shape16.render(matrices, vertices, light, overlay);
		Shape17.render(matrices, vertices, light, overlay);
		Shape18.render(matrices, vertices, light, overlay);
		Shape19.render(matrices, vertices, light, overlay);
		Shape20.render(matrices, vertices, light, overlay);
		Shape21.render(matrices, vertices, light, overlay);
		Shape22.render(matrices, vertices, light, overlay);
	}

}