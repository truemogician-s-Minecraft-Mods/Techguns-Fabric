package techguns.client.models.guns;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.model.json.ModelTransformation.Mode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;
import techguns.client.models.ModelPart;
import techguns.client.render.math.TGMatrixOps;

public class ModelMinigun extends ModelMultipart {
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
	ModelPart Shape42;
	ModelPart Shape43;
	ModelPart Shape44;
	ModelPart Shape45;
	ModelPart Shape46;
	ModelPart r1;
	ModelPart r2;
	ModelPart r3;
	ModelPart r4;
	ModelPart r5;
	ModelPart r6;
	ModelPart r7;
	ModelPart r8;
	ModelPart r9;
	ModelPart r10;
	ModelPart r11;
	ModelPart r12;
	ModelPart r13;
	ModelPart r14;
	ModelPart r15;
	ModelPart r16;
	ModelPart r17;
	ModelPart r18;
	ModelPart r19;
	ModelPart r20;
	ModelPart r21;
	ModelPart r22;
	ModelPart r23;
	ModelPart r24;
	ModelPart r25;
	ModelPart r26;
	ModelPart r27;

	public ModelMinigun() {
        super(RenderLayer::getEntitySolid);
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelPart(this, 8, 41);
		Shape1.addCuboid(0F, 0F, 0F, 2, 5, 2);
		Shape1.setPivot(-24F, -4F, -1F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelPart(this, 48, 114);
		Shape2.addCuboid(0F, 0F, 0F, 14, 6, 8);
		Shape2.setPivot(-11F, 2F, -12F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelPart(this, 49, 43);
		Shape3.addCuboid(0F, 0F, 0F, 16, 1, 6);
		Shape3.setPivot(-13F, 4F, -3F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelPart(this, 48, 107);
		Shape4.addCuboid(0F, 0F, 0F, 14, 1, 6);
		Shape4.setPivot(-11F, 8F, -11F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelPart(this, 8, 37);
		Shape5.addCuboid(0F, -2F, 0F, 10, 2, 2);
		Shape5.setPivot(-24F, 1F, -1F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0.2617994F);
		Shape6 = new ModelPart(this, 0, 33);
		Shape6.addCuboid(0F, 0F, 0F, 2, 11, 2);
		Shape6.setPivot(-15F, -7F, -1F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelPart(this, 16, 44);
		Shape7.addCuboid(-2F, 0F, 0F, 2, 1, 8);
		Shape7.setPivot(-2F, -7F, -1F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 2.181662F, 0F);
		Shape8 = new ModelPart(this, 8, 33);
		Shape8.addCuboid(0F, 0F, 0F, 10, 2, 2);
		Shape8.setPivot(-24F, -4F, -1F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, -0.2617994F);
		Shape9 = new ModelPart(this, 16, 41);
		Shape9.addCuboid(0F, 0F, 0F, 13, 1, 2);
		Shape9.setPivot(-13F, -7F, -1F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelPart(this, 5, 69);
		Shape10.addCuboid(0F, 0F, 0F, 2, 6, 1);
		Shape10.setPivot(4.5F, -3.5F, -6.5F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelPart(this, 16, 44);
		Shape11.addCuboid(0F, 0F, 0F, 2, 1, 8);
		Shape11.setPivot(-2F, -7F, 1F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0.9599311F, 0F);
		Shape12 = new ModelPart(this, 35, 64);
		Shape12.addCuboid(0F, 0F, 0F, 2, 1, 2);
		Shape12.setPivot(-2F, -6F, -1F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelPart(this, 0, 53);
		Shape13.addCuboid(0F, 0F, 0F, 3, 2, 14);
		Shape13.setPivot(4F, -7.5F, -7F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelPart(this, 22, 55);
		Shape14.addCuboid(0F, 0F, 0F, 2, 3, 1);
		Shape14.setPivot(4.5F, -10.5F, 3.5F);
		Shape14.setTextureSize(128, 128);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelPart(this, 0, 26);
		Shape15.addCuboid(0F, -1F, -3.5F, 3, 2, 2);
		Shape15.setPivot(-1.5F, -4.5F, -6F);
		Shape15.setTextureSize(128, 128);
		Shape15.mirror = true;
		setRotation(Shape15, 2.356194F, 0F, 0F);
		Shape16 = new ModelPart(this, 19, 70);
		Shape16.addCuboid(0F, 0F, 0F, 2, 4, 1);
		Shape16.setPivot(4.5F, 2.5F, -6.5F);
		Shape16.setTextureSize(128, 128);
		Shape16.mirror = true;
		setRotation(Shape16, 0.7853982F, 0F, 0F);
		Shape17 = new ModelPart(this, 5, 69);
		Shape17.addCuboid(0F, 0F, 0F, 2, 1, 8);
		Shape17.setPivot(4.5F, 4.5F, -4F);
		Shape17.setTextureSize(128, 128);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
		Shape18 = new ModelPart(this, 19, 70);
		Shape18.addCuboid(0F, 0F, -1F, 2, 4, 1);
		Shape18.setPivot(4.5F, 2.5F, 6.5F);
		Shape18.setTextureSize(128, 128);
		Shape18.mirror = true;
		setRotation(Shape18, -0.7853982F, 0F, 0F);
		Shape19 = new ModelPart(this, 5, 69);
		Shape19.addCuboid(0F, 0F, 0F, 2, 6, 1);
		Shape19.setPivot(4.5F, -3.5F, 5.5F);
		Shape19.setTextureSize(128, 128);
		Shape19.mirror = true;
		setRotation(Shape19, 0F, 0F, 0F);
		Shape20 = new ModelPart(this, 49, 43);
		Shape20.addCuboid(0F, 0F, 0F, 16, 1, 6);
		Shape20.setPivot(-13F, -5F, -3F);
		Shape20.setTextureSize(128, 128);
		Shape20.mirror = true;
		setRotation(Shape20, 0F, 0F, 0F);
		Shape21 = new ModelPart(this, 48, 107);
		Shape21.addCuboid(0F, 0F, 0F, 14, 1, 6);
		Shape21.setPivot(-11F, 1F, -11F);
		Shape21.setTextureSize(128, 128);
		Shape21.mirror = true;
		setRotation(Shape21, 0F, 0F, 0F);
		Shape22 = new ModelPart(this, 0, 53);
		Shape22.addCuboid(0F, 0F, 0F, 3, 2, 2);
		Shape22.setPivot(4F, -5.5F, -7F);
		Shape22.setTextureSize(128, 128);
		Shape22.mirror = true;
		setRotation(Shape22, 0F, 0F, 0F);
		Shape23 = new ModelPart(this, 22, 55);
		Shape23.addCuboid(0F, 0F, 0F, 2, 1, 7);
		Shape23.setPivot(4.5F, -11F, -3.5F);
		Shape23.setTextureSize(128, 128);
		Shape23.mirror = true;
		setRotation(Shape23, 0F, 0F, 0F);
		Shape24 = new ModelPart(this, 22, 55);
		Shape24.addCuboid(0F, 0F, 0F, 2, 3, 1);
		Shape24.setPivot(4.5F, -10.5F, -4.5F);
		Shape24.setTextureSize(128, 128);
		Shape24.mirror = true;
		setRotation(Shape24, 0F, 0F, 0F);
		Shape25 = new ModelPart(this, 42, 17);
		Shape25.addCuboid(0F, 0F, 0F, 16, 6, 10);
		Shape25.setPivot(-13F, -3F, -5F);
		Shape25.setTextureSize(128, 128);
		Shape25.mirror = true;
		setRotation(Shape25, 0F, 0F, 0F);
		Shape26 = new ModelPart(this, 46, 33);
		Shape26.addCuboid(0F, 0F, 0F, 16, 1, 8);
		Shape26.setPivot(-13F, -4F, -4F);
		Shape26.setTextureSize(128, 128);
		Shape26.mirror = true;
		setRotation(Shape26, 0F, 0F, 0F);
		Shape27 = new ModelPart(this, 46, 33);
		Shape27.addCuboid(0F, 0F, 0F, 16, 1, 8);
		Shape27.setPivot(-13F, 3F, -4F);
		Shape27.setTextureSize(128, 128);
		Shape27.mirror = true;
		setRotation(Shape27, 0F, 0F, 0F);
		Shape28 = new ModelPart(this, 0, 123);
		Shape28.addCuboid(0F, 0F, 0F, 12, 1, 4);
		Shape28.setPivot(-10F, 9.5F, -10F);
		Shape28.setTextureSize(128, 128);
		Shape28.mirror = true;
		setRotation(Shape28, 0F, 0F, 0F);
		Shape29 = new ModelPart(this, 0, 94);
		Shape29.addCuboid(0F, 0F, 0F, 12, 4, 1);
		Shape29.setPivot(-10F, 3F, -3.5F);
		Shape29.setTextureSize(128, 128);
		Shape29.mirror = true;
		setRotation(Shape29, 0F, 0F, 0F);
		Shape30 = new ModelPart(this, 0, 115);
		Shape30.addCuboid(0F, 0F, 0F, 12, 1, 7);
		Shape30.setPivot(-10F, 8.5F, -11.5F);
		Shape30.setTextureSize(128, 128);
		Shape30.mirror = true;
		setRotation(Shape30, 0F, 0F, 0F);
		Shape31 = new ModelPart(this, 0, 115);
		Shape31.addCuboid(0F, 0F, 0F, 12, 1, 7);
		Shape31.setPivot(-10F, 0.5F, -11.5F);
		Shape31.setTextureSize(128, 128);
		Shape31.mirror = true;
		setRotation(Shape31, 0F, 0F, 0F);
		Shape32 = new ModelPart(this, 0, 123);
		Shape32.addCuboid(0F, 0F, 0F, 12, 1, 4);
		Shape32.setPivot(-10F, -0.5F, -10F);
		Shape32.setTextureSize(128, 128);
		Shape32.mirror = true;
		setRotation(Shape32, 0F, 0F, 0F);
		Shape33 = new ModelPart(this, 0, 99);
		Shape33.addCuboid(0F, 0F, 0F, 12, 7, 9);
		Shape33.setPivot(-10F, 1.5F, -12.5F);
		Shape33.setTextureSize(128, 128);
		Shape33.mirror = true;
		setRotation(Shape33, 0F, 0F, 0F);
		Shape34 = new ModelPart(this, 0, 94);
		Shape34.addCuboid(0F, 0F, 0F, 12, 4, 1);
		Shape34.setPivot(-10F, 3F, -13.5F);
		Shape34.setTextureSize(128, 128);
		Shape34.mirror = true;
		setRotation(Shape34, 0F, 0F, 0F);
		Shape35 = new ModelPart(this, 0, 53);
		Shape35.addCuboid(0F, 0F, 0F, 3, 3, 2);
		Shape35.setPivot(4F, -5.5F, 5F);
		Shape35.setTextureSize(128, 128);
		Shape35.mirror = true;
		setRotation(Shape35, 0F, 0F, 0F);
		Shape36 = new ModelPart(this, 95, 18);
		Shape36.addCuboid(0F, -1F, -1F, 1, 2, 2);
		Shape36.setPivot(-3F, -4.5F, -6F);
		Shape36.setTextureSize(128, 128);
		Shape36.mirror = true;
		setRotation(Shape36, 0.7853982F, 0F, 0F);
		Shape37 = new ModelPart(this, 0, 17);
		Shape37.addCuboid(0F, -1.5F, -1.5F, 4, 3, 3);
		Shape37.setPivot(-2F, -4.5F, -6F);
		Shape37.setTextureSize(128, 128);
		Shape37.mirror = true;
		setRotation(Shape37, 0.7853982F, 0F, 0F);
		Shape38 = new ModelPart(this, 95, 18);
		Shape38.addCuboid(0F, -1F, -1F, 2, 2, 2);
		Shape38.setPivot(2F, -4.5F, -6F);
		Shape38.setTextureSize(128, 128);
		Shape38.mirror = true;
		setRotation(Shape38, 0.7853982F, 0F, 0F);
		Shape39 = new ModelPart(this, 95, 18);
		Shape39.addCuboid(0F, -1F, -1F, 1, 2, 2);
		Shape39.setPivot(-3F, -4.5F, 6F);
		Shape39.setTextureSize(128, 128);
		Shape39.mirror = true;
		setRotation(Shape39, 0.7853982F, 0F, 0F);
		Shape40 = new ModelPart(this, 62, 51);
		Shape40.addCuboid(0F, -1.5F, -1.5F, 12, 3, 3);
		Shape40.setPivot(-11F, 1.5F, 6F);
		Shape40.setTextureSize(128, 128);
		Shape40.mirror = true;
		setRotation(Shape40, 0.7853982F, 0F, 0F);
		Shape41 = new ModelPart(this, 96, 34);
		Shape41.addCuboid(0F, -2.5F, -2.5F, 1, 5, 5);
		Shape41.setPivot(-2.5F, 1.5F, 6F);
		Shape41.setTextureSize(128, 128);
		Shape41.mirror = true;
		setRotation(Shape41, 0.7853982F, 0F, 0F);
		Shape42 = new ModelPart(this, 0, 26);
		Shape42.addCuboid(0F, -1F, -3.5F, 3, 2, 2);
		Shape42.setPivot(-1.5F, -4.5F, 6F);
		Shape42.setTextureSize(128, 128);
		Shape42.mirror = true;
		setRotation(Shape42, 0.7853982F, 0F, 0F);
		Shape43 = new ModelPart(this, 0, 17);
		Shape43.addCuboid(0F, -1.5F, -1.5F, 4, 3, 3);
		Shape43.setPivot(-2F, -4.5F, 6F);
		Shape43.setTextureSize(128, 128);
		Shape43.mirror = true;
		setRotation(Shape43, 0.7853982F, 0F, 0F);
		Shape44 = new ModelPart(this, 95, 18);
		Shape44.addCuboid(0F, -1F, -1F, 2, 2, 2);
		Shape44.setPivot(2F, -4.5F, 6F);
		Shape44.setTextureSize(128, 128);
		Shape44.mirror = true;
		setRotation(Shape44, 0.7853982F, 0F, 0F);
		Shape45 = new ModelPart(this, 0, 0);
		Shape45.addCuboid(0F, -2F, -2F, 10, 4, 4);
		Shape45.setPivot(-10F, 1.5F, 6F);
		Shape45.setTextureSize(128, 128);
		Shape45.mirror = true;
		setRotation(Shape45, 0.7853982F, 0F, 0F);
		Shape46 = new ModelPart(this, 96, 34);
		Shape46.addCuboid(0F, -2.5F, -2.5F, 1, 5, 5);
		Shape46.setPivot(-8.5F, 1.5F, 6F);
		Shape46.setTextureSize(128, 128);
		Shape46.mirror = true;
		setRotation(Shape46, 0.7853982F, 0F, 0F);
		r1 = new ModelPart(this, 120, 13);
		r1.addCuboid(0F, -3.5F, -1.5F, 1, 7, 3);
		r1.setPivot(35F, 0F, 0F);
		r1.setTextureSize(128, 128);
		r1.mirror = true;
		setRotation(r1, 0F, 0F, 0F);
		r2 = new ModelPart(this, 116, 20);
		r2.addCuboid(0F, -1.5F, 2.5F, 1, 3, 1);
		r2.setPivot(35F, 0F, 0F);
		r2.setTextureSize(128, 128);
		r2.mirror = true;
		setRotation(r2, 0F, 0F, 0F);
		r3 = new ModelPart(this, 116, 13);
		r3.addCuboid(0F, -3F, -3F, 1, 6, 2);
		r3.setPivot(35F, 0F, 0F);
		r3.setTextureSize(128, 128);
		r3.mirror = true;
		setRotation(r3, 0F, 0F, 0F);
		r4 = new ModelPart(this, 116, 20);
		r4.addCuboid(0F, -1.5F, -3.5F, 1, 3, 1);
		r4.setPivot(35F, 0F, 0F);
		r4.setTextureSize(128, 128);
		r4.mirror = true;
		setRotation(r4, 0F, 0F, 0F);
		r5 = new ModelPart(this, 48, 0);
		r5.addCuboid(0F, -3F, -0.5F, 12, 1, 1);
		r5.setPivot(26F, 0F, 0F);
		r5.setTextureSize(128, 128);
		r5.mirror = true;
		setRotation(r5, -2.094395F, 0F, 0F);
		r6 = new ModelPart(this, 48, 2);
		r6.addCuboid(0F, -3.5F, -1F, 21, 2, 2);
		r6.setPivot(5F, 0F, 0F);
		r6.setTextureSize(128, 128);
		r6.mirror = true;
		setRotation(r6, -2.094395F, 0F, 0F);
		r7 = new ModelPart(this, 48, 0);
		r7.addCuboid(0F, -3F, -0.5F, 12, 1, 1);
		r7.setPivot(26F, 0F, 0F);
		r7.setTextureSize(128, 128);
		r7.mirror = true;
		setRotation(r7, 1.047198F, 0F, 0F);
		r8 = new ModelPart(this, 48, 0);
		r8.addCuboid(0F, -3F, -0.5F, 12, 1, 1);
		r8.setPivot(26F, 0F, 0F);
		r8.setTextureSize(128, 128);
		r8.mirror = true;
		setRotation(r8, 2.094395F, 0F, 0F);
		r9 = new ModelPart(this, 48, 0);
		r9.addCuboid(0F, -3F, -0.5F, 12, 1, 1);
		r9.setPivot(26F, 0F, 0F);
		r9.setTextureSize(128, 128);
		r9.mirror = true;
		setRotation(r9, 3.141593F, 0F, 0F);
		r10 = new ModelPart(this, 48, 0);
		r10.addCuboid(0F, -3F, -0.5F, 12, 1, 1);
		r10.setPivot(26F, 0F, 0F);
		r10.setTextureSize(128, 128);
		r10.mirror = true;
		setRotation(r10, -1.047198F, 0F, 0F);
		r11 = new ModelPart(this, 114, 7);
		r11.addCuboid(0F, -2F, -4F, 1, 4, 1);
		r11.setPivot(17F, 0F, 0F);
		r11.setTextureSize(128, 128);
		r11.mirror = true;
		setRotation(r11, 0F, 0F, 0F);
		r12 = new ModelPart(this, 114, 0);
		r12.addCuboid(0F, -3F, -3F, 1, 6, 1);
		r12.setPivot(17F, 0F, 0F);
		r12.setTextureSize(128, 128);
		r12.mirror = true;
		setRotation(r12, 0F, 0F, 0F);
		r13 = new ModelPart(this, 98, 0);
		r13.addCuboid(0F, -4F, -2F, 1, 8, 4);
		r13.setPivot(17F, 0F, 0F);
		r13.setTextureSize(128, 128);
		r13.mirror = true;
		setRotation(r13, 0F, 0F, 0F);
		r14 = new ModelPart(this, 94, 0);
		r14.addCuboid(0F, -3F, 2F, 1, 6, 1);
		r14.setPivot(17F, 0F, 0F);
		r14.setTextureSize(128, 128);
		r14.mirror = true;
		setRotation(r14, 0F, 0F, 0F);
		r15 = new ModelPart(this, 94, 7);
		r15.addCuboid(0F, -2F, 3F, 1, 4, 1);
		r15.setPivot(17F, 0F, 0F);
		r15.setTextureSize(128, 128);
		r15.mirror = true;
		setRotation(r15, 0F, 0F, 0F);
		r16 = new ModelPart(this, 48, 0);
		r16.addCuboid(0F, -3F, -0.5F, 12, 1, 1);
		r16.setPivot(26F, 0F, 0F);
		r16.setTextureSize(128, 128);
		r16.mirror = true;
		setRotation(r16, 0F, 0F, 0F);
		r17 = new ModelPart(this, 48, 2);
		r17.addCuboid(0F, -3.5F, -1F, 21, 2, 2);
		r17.setPivot(5F, 0F, 0F);
		r17.setTextureSize(128, 128);
		r17.mirror = true;
		setRotation(r17, 0F, 0F, 0F);
		r18 = new ModelPart(this, 48, 2);
		r18.addCuboid(0F, -3.5F, -1F, 21, 2, 2);
		r18.setPivot(5F, 0F, 0F);
		r18.setTextureSize(128, 128);
		r18.mirror = true;
		setRotation(r18, 1.047198F, 0F, 0F);
		r19 = new ModelPart(this, 48, 2);
		r19.addCuboid(0F, -3.5F, -1F, 21, 2, 2);
		r19.setPivot(5F, 0F, 0F);
		r19.setTextureSize(128, 128);
		r19.mirror = true;
		setRotation(r19, 2.094395F, 0F, 0F);
		r20 = new ModelPart(this, 48, 2);
		r20.addCuboid(0F, -3.5F, -1F, 21, 2, 2);
		r20.setPivot(5F, 0F, 0F);
		r20.setTextureSize(128, 128);
		r20.mirror = true;
		setRotation(r20, 3.141593F, 0F, 0F);
		r21 = new ModelPart(this, 48, 2);
		r21.addCuboid(0F, -3.5F, -1F, 21, 2, 2);
		r21.setPivot(5F, 0F, 0F);
		r21.setTextureSize(128, 128);
		r21.mirror = true;
		setRotation(r21, -1.047198F, 0F, 0F);
		r22 = new ModelPart(this, 109, 0);
		r22.addCuboid(0F, -3F, 2F, 2, 6, 1);
		r22.setPivot(3F, 0F, 0F);
		r22.setTextureSize(128, 128);
		r22.mirror = true;
		setRotation(r22, 0F, 0F, 0F);
		r23 = new ModelPart(this, 113, 0);
		r23.addCuboid(0F, -4F, -2F, 2, 8, 4);
		r23.setPivot(3F, 0F, 0F);
		r23.setTextureSize(128, 128);
		r23.mirror = true;
		setRotation(r23, 0F, 0F, 0F);
		r24 = new ModelPart(this, 109, 7);
		r24.addCuboid(0F, -2F, 3F, 2, 4, 1);
		r24.setPivot(3F, 0F, 0F);
		r24.setTextureSize(128, 128);
		r24.mirror = true;
		setRotation(r24, 0F, 0F, 0F);
		r25 = new ModelPart(this, 109, 0);
		r25.addCuboid(0F, -3F, -3F, 2, 6, 1);
		r25.setPivot(3F, 0F, 0F);
		r25.setTextureSize(128, 128);
		r25.mirror = true;
		setRotation(r25, 0F, 0F, 0F);
		r26 = new ModelPart(this, 109, 7);
		r26.addCuboid(0F, -2F, -4F, 2, 4, 1);
		r26.setPivot(3F, 0F, 0F);
		r26.setTextureSize(128, 128);
		r26.mirror = true;
		setRotation(r26, 0F, 0F, 0F);
		r27 = new ModelPart(this, 116, 13);
		r27.addCuboid(0F, -3F, 1F, 1, 6, 2);
		r27.setPivot(35F, 0F, 0F);
		r27.setTextureSize(128, 128);
		r27.mirror = true;
		setRotation(r27, 0F, 0F, 0F);
	}

	
	
	@Override
	public void render(Entity entityIn, MatrixStack matrices, VertexConsumer vertices, int ammoLeft,
		float reloadProgress, Mode transformType, int part, float fireProgress, float chargeProgress, int light,
	int overlay) {
		
		if(part==0){
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
			Shape42.render(matrices, vertices, light, overlay);
			Shape43.render(matrices, vertices, light, overlay);
			Shape44.render(matrices, vertices, light, overlay);
			Shape45.render(matrices, vertices, light, overlay);
			Shape46.render(matrices, vertices, light, overlay);
		}else {
			matrices.push();
			
			TGMatrixOps.rotate(matrices, 360.0f*fireProgress, 1f, 0f, 0f);
			r1.render(matrices, vertices, light, overlay);
			r2.render(matrices, vertices, light, overlay);
			r3.render(matrices, vertices, light, overlay);
			r4.render(matrices, vertices, light, overlay);
			r5.render(matrices, vertices, light, overlay);
			r6.render(matrices, vertices, light, overlay);
			r7.render(matrices, vertices, light, overlay);
			r8.render(matrices, vertices, light, overlay);
			r9.render(matrices, vertices, light, overlay);
			r10.render(matrices, vertices, light, overlay);
			r11.render(matrices, vertices, light, overlay);
			r12.render(matrices, vertices, light, overlay);
			r13.render(matrices, vertices, light, overlay);
			r14.render(matrices, vertices, light, overlay);
			r15.render(matrices, vertices, light, overlay);
			r16.render(matrices, vertices, light, overlay);
			r17.render(matrices, vertices, light, overlay);
			r18.render(matrices, vertices, light, overlay);
			r19.render(matrices, vertices, light, overlay);
			r20.render(matrices, vertices, light, overlay);
			r21.render(matrices, vertices, light, overlay);
			r22.render(matrices, vertices, light, overlay);
			r23.render(matrices, vertices, light, overlay);
			r24.render(matrices, vertices, light, overlay);
			r25.render(matrices, vertices, light, overlay);
			r26.render(matrices, vertices, light, overlay);
			r27.render(matrices, vertices, light, overlay);
			matrices.pop();
		}
	}
}