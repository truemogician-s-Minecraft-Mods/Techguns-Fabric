package techguns.client.models.guns;

import techguns.client.models.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.model.json.ModelTransformation.Mode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;
import techguns.client.render.math.TGMatrixOps;

public class ModelGrimReaper extends ModelMultipart
{
  //fields
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
    ModelPart Shape47;
    ModelPart Shape48;
    ModelPart Shape49;
    ModelPart Shape50;
    ModelPart Shape51;
    ModelPart Shape52;
    ModelPart Shape53;
    ModelPart Shape54;
    ModelPart Shape55;
    ModelPart Shape56;
    ModelPart Shape57;
    ModelPart Shape58;
    ModelPart Shape59;
  
  public ModelGrimReaper()
  {
        super(RenderLayer::getEntitySolid);
    textureWidth = 128;
    textureHeight = 64;
    
      Shape1 = new ModelPart(this, 20, 22);
      Shape1.addCuboid(0F, 0F, 0F, 17, 1, 9);
      Shape1.setPivot(-14F, 5F, -4F);
      Shape1.setTextureSize(128, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelPart(this, 32, 38);
      Shape2.addCuboid(0F, 0F, 0F, 4, 1, 3);
      Shape2.setPivot(2.5F, 14.5F, -1F);
      Shape2.setTextureSize(128, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelPart(this, 20, 22);
      Shape3.addCuboid(0F, 0F, 0F, 17, 1, 9);
      Shape3.setPivot(-14F, -5F, -4F);
      Shape3.setTextureSize(128, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelPart(this, 72, 15);
      Shape4.addCuboid(0F, 0F, 0F, 24, 11, 4);
      Shape4.setPivot(3F, -5F, 1F);
      Shape4.setTextureSize(128, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelPart(this, 0, 45);
      Shape5.addCuboid(0F, 0F, 0F, 6, 6, 1);
      Shape5.setPivot(-14F, -4.5F, 5.5F);
      Shape5.setTextureSize(128, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape5.mirror = false;
      Shape6 = new ModelPart(this, 36, 46);
      Shape6.addCuboid(0F, 0F, 0F, 16, 1, 2);
      Shape6.setPivot(0F, 4.5F, -5.5F);
      Shape6.setTextureSize(128, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelPart(this, 19, 34);
      Shape7.addCuboid(0F, 0F, 0F, 4, 1, 3);
      Shape7.setPivot(-18F, 4.5F, -1F);
      Shape7.setTextureSize(128, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelPart(this, 36, 52);
      Shape8.addCuboid(0F, 0F, 0F, 16, 1, 2);
      Shape8.setPivot(0F, 4.5F, 4.5F);
      Shape8.setTextureSize(128, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelPart(this, 35, 33);
      Shape9.addCuboid(0F, 0F, 0F, 4, 3, 1);
      Shape9.setPivot(-18F, -1F, -4.5F);
      Shape9.setTextureSize(128, 64);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelPart(this, 36, 49);
      Shape10.addCuboid(0F, 0F, 0F, 16, 1, 2);
      Shape10.setPivot(0F, -4.5F, 4.5F);
      Shape10.setTextureSize(128, 64);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
      Shape11 = new ModelPart(this, 19, 34);
      Shape11.addCuboid(0F, 0F, 0F, 4, 1, 3);
      Shape11.setPivot(-18F, -4.5F, -1F);
      Shape11.setTextureSize(128, 64);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
      Shape12 = new ModelPart(this, 36, 43);
      Shape12.addCuboid(0F, 0F, 0F, 16, 1, 2);
      Shape12.setPivot(0F, -4.5F, -5.5F);
      Shape12.setTextureSize(128, 64);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape13 = new ModelPart(this, 36, 55);
      Shape13.addCuboid(0F, 0F, 0F, 16, 8, 1);
      Shape13.setPivot(0F, -3.5F, 5.5F);
      Shape13.setTextureSize(128, 64);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelPart(this, 19, 34);
      Shape14.addCuboid(0F, 0F, 0F, 4, 1, 3);
      Shape14.setPivot(-18F, 0F, -3.5F);
      Shape14.setTextureSize(128, 64);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
      Shape15 = new ModelPart(this, 35, 33);
      Shape15.addCuboid(0F, 0F, 0F, 4, 3, 1);
      Shape15.setPivot(-18F, -1F, 4.5F);
      Shape15.setTextureSize(128, 64);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
      Shape16 = new ModelPart(this, 15, 25);
      Shape16.addCuboid(0F, 0F, 0F, 4, 3, 3);
      Shape16.setPivot(-18F, -1F, -1F);
      Shape16.setTextureSize(128, 64);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
      Shape17 = new ModelPart(this, 35, 33);
      Shape17.addCuboid(0F, 0F, 0F, 4, 3, 1);
      Shape17.setPivot(-18F, 1.54F, 0F);
      Shape17.setTextureSize(128, 64);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0F, 0F);
      Shape18 = new ModelPart(this, 35, 33);
      Shape18.addCuboid(0F, 0F, 0F, 4, 3, 1);
      Shape18.setPivot(-18F, -3.5F, 0F);
      Shape18.setTextureSize(128, 64);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
      Shape19 = new ModelPart(this, 19, 34);
      Shape19.addCuboid(0F, 0F, 0F, 4, 1, 3);
      Shape19.setPivot(-18F, 0F, 1.5F);
      Shape19.setTextureSize(128, 64);
      Shape19.mirror = true;
      setRotation(Shape19, 0F, 0F, 0F);
      Shape20 = new ModelPart(this, 0, 52);
      Shape20.addCuboid(0F, 0F, 0F, 6, 2, 10);
      Shape20.setPivot(-14F, -5.5F, -4.5F);
      Shape20.setTextureSize(128, 64);
      Shape20.mirror = true;
      setRotation(Shape20, 0F, 0F, 0F);
      Shape21 = new ModelPart(this, 58, 0);
      Shape21.addCuboid(0F, 0F, 0F, 4, 4, 1);
      Shape21.setPivot(1F, 1F, -6.5F);
      Shape21.setTextureSize(128, 64);
      Shape21.mirror = true;
      setRotation(Shape21, 0F, 0F, 0F);
      Shape22 = new ModelPart(this, 0, 45);
      Shape22.addCuboid(0F, 0F, 0F, 6, 6, 1);
      Shape22.setPivot(-14F, -4.5F, -5.5F);
      Shape22.setTextureSize(128, 64);
      Shape22.mirror = true;
      setRotation(Shape22, 0F, 0F, 0F);
      Shape23 = new ModelPart(this, 0, 0);
      Shape23.addCuboid(0F, 0F, 0F, 17, 9, 11);
      Shape23.setPivot(-14F, -4F, -5F);
      Shape23.setTextureSize(128, 64);
      Shape23.mirror = true;
      setRotation(Shape23, 0F, 0F, 0F);
      Shape24 = new ModelPart(this, 58, 0);
      Shape24.addCuboid(0F, 0F, 0F, 24, 4, 11);
      Shape24.setPivot(3F, 1F, -5F);
      Shape24.setTextureSize(128, 64);
      Shape24.mirror = true;
      setRotation(Shape24, 0F, 0F, 0F);
      Shape25 = new ModelPart(this, 72, 15);
      Shape25.addCuboid(0F, 0F, 0F, 24, 11, 4);
      Shape25.setPivot(3F, -5F, -4F);
      Shape25.setTextureSize(128, 64);
      Shape25.mirror = true;
      setRotation(Shape25, 0F, 0F, 0F);
      Shape26 = new ModelPart(this, 58, 0);
      Shape26.addCuboid(0F, 0F, 0F, 24, 4, 11);
      Shape26.setPivot(3F, -4F, -5F);
      Shape26.setTextureSize(128, 64);
      Shape26.mirror = true;
      setRotation(Shape26, 0F, 0F, 0F);
      Shape27 = new ModelPart(this, 0, 35);
      Shape27.addCuboid(0F, 0F, 0F, 4, 8, 1);
      Shape27.setPivot(-18F, -3.5F, -5.5F);
      Shape27.setTextureSize(128, 64);
      Shape27.mirror = true;
      setRotation(Shape27, 0F, 0F, 0F);
      Shape28 = new ModelPart(this, 118, 63);
      Shape28.addCuboid(0F, 0F, 0F, 4, 0, 1);
      Shape28.setPivot(-16F, -5.5F, 6F);
      Shape28.setTextureSize(128, 64);
      Shape28.mirror = true;
      setRotation(Shape28, 0F, 0F, 0F);
      Shape29 = new ModelPart(this, 0, 35);
      Shape29.addCuboid(0F, 0F, 0F, 4, 8, 1);
      Shape29.setPivot(-18F, -3.5F, 5.5F);
      Shape29.setTextureSize(128, 64);
      Shape29.mirror = true;
      setRotation(Shape29, 0F, 0F, 0F);
      Shape30 = new ModelPart(this, 0, 34);
      Shape30.addCuboid(0F, 0F, 0F, 4, 1, 10);
      Shape30.setPivot(-18F, 5.5F, -4.5F);
      Shape30.setTextureSize(128, 64);
      Shape30.mirror = true;
      setRotation(Shape30, 0F, 0F, 0F);
      Shape31 = new ModelPart(this, 19, 39);
      Shape31.addCuboid(0F, 0F, 0F, 4, 1, 2);
      Shape31.setPivot(-18F, -4.5F, 4.5F);
      Shape31.setTextureSize(128, 64);
      Shape31.mirror = true;
      setRotation(Shape31, 0F, 0F, 0F);
      Shape32 = new ModelPart(this, 19, 39);
      Shape32.addCuboid(0F, 0F, 0F, 4, 1, 2);
      Shape32.setPivot(-18F, -4.5F, -5.5F);
      Shape32.setTextureSize(128, 64);
      Shape32.mirror = true;
      setRotation(Shape32, 0F, 0F, 0F);
      Shape33 = new ModelPart(this, 19, 39);
      Shape33.addCuboid(0F, 0F, 0F, 4, 1, 2);
      Shape33.setPivot(-18F, 4.5F, 4.5F);
      Shape33.setTextureSize(128, 64);
      Shape33.mirror = true;
      setRotation(Shape33, 0F, 0F, 0F);
      Shape34 = new ModelPart(this, 19, 39);
      Shape34.addCuboid(0F, 0F, 0F, 4, 1, 2);
      Shape34.setPivot(-18F, 4.5F, -5.5F);
      Shape34.setTextureSize(128, 64);
      Shape34.mirror = true;
      setRotation(Shape34, 0F, 0F, 0F);
      Shape35 = new ModelPart(this, 0, 34);
      Shape35.addCuboid(0F, 0F, 0F, 4, 1, 10);
      Shape35.setPivot(-18F, -5.5F, -4.5F);
      Shape35.setTextureSize(128, 64);
      Shape35.mirror = true;
      setRotation(Shape35, 0F, 0F, 0F);
      Shape36 = new ModelPart(this, 98, 52);
      Shape36.addCuboid(0F, 0F, 0F, 4, 0, 11);
      Shape36.setPivot(-16F, -6.5F, -5F);
      Shape36.setTextureSize(128, 64);
      Shape36.mirror = true;
      setRotation(Shape36, 0F, 0F, 0F);
      Shape37 = new ModelPart(this, 98, 63);
      Shape37.addCuboid(0F, 0F, 0F, 4, 1, 0);
      Shape37.setPivot(-16F, -6.5F, 6F);
      Shape37.setTextureSize(128, 64);
      Shape37.mirror = true;
      setRotation(Shape37, 0F, 0F, 0F);
      Shape38 = new ModelPart(this, 90, 60);
      Shape38.addCuboid(0F, 0F, 0F, 4, 4, 0);
      Shape38.setPivot(-16F, -5.5F, 7F);
      Shape38.setTextureSize(128, 64);
      Shape38.mirror = true;
      setRotation(Shape38, 0F, 0F, 0F);
      Shape39 = new ModelPart(this, 73, 44);
      Shape39.addCuboid(0F, 0F, 0F, 2, 2, 1);
      Shape39.setPivot(-15F, -4F, 6.5F);
      Shape39.setTextureSize(128, 64);
      Shape39.mirror = true;
      setRotation(Shape39, 0F, 0F, 0F);
      Shape40 = new ModelPart(this, 118, 63);
      Shape40.addCuboid(0F, 0F, 0F, 4, 0, 1);
      Shape40.setPivot(-16F, -5.5F, -6F);
      Shape40.setTextureSize(128, 64);
      Shape40.mirror = true;
      setRotation(Shape40, 0F, 0F, 0F);
      Shape41 = new ModelPart(this, 98, 63);
      Shape41.addCuboid(0F, 0F, 0F, 4, 1, 0);
      Shape41.setPivot(-16F, -6.5F, -5F);
      Shape41.setTextureSize(128, 64);
      Shape41.mirror = true;
      setRotation(Shape41, 0F, 0F, 0F);
      Shape42 = new ModelPart(this, 90, 60);
      Shape42.addCuboid(0F, 0F, 0F, 4, 4, 0);
      Shape42.setPivot(-16F, -5.5F, -6F);
      Shape42.setTextureSize(128, 64);
      Shape42.mirror = true;
      setRotation(Shape42, 0F, 0F, 0F);
      Shape43 = new ModelPart(this, 73, 44);
      Shape43.addCuboid(0F, 0F, 0F, 2, 2, 1);
      Shape43.setPivot(-15F, -4F, -6.5F);
      Shape43.setTextureSize(128, 64);
      Shape43.mirror = true;
      setRotation(Shape43, 0F, 0F, 0F);
      Shape44 = new ModelPart(this, 36, 32);
      Shape44.addCuboid(0F, 0F, 0F, 16, 1, 10);
      Shape44.setPivot(0F, -5.5F, -4.5F);
      Shape44.setTextureSize(128, 64);
      Shape44.mirror = true;
      setRotation(Shape44, 0F, 0F, 0F);
      Shape45 = new ModelPart(this, 100, 30);
      Shape45.addCuboid(0F, 0F, 0F, 4, 12, 10);
      Shape45.setPivot(27F, -5.5F, -4.5F);
      Shape45.setTextureSize(128, 64);
      Shape45.mirror = true;
      setRotation(Shape45, 0F, 0F, 0F);
      Shape46 = new ModelPart(this, 90, 30);
      Shape46.addCuboid(0F, 0F, 0F, 4, 10, 1);
      Shape46.setPivot(27F, -4.5F, 5.5F);
      Shape46.setTextureSize(128, 64);
      Shape46.mirror = true;
      setRotation(Shape46, 0F, 0F, 0F);
      Shape47 = new ModelPart(this, 90, 30);
      Shape47.addCuboid(0F, 0F, 0F, 4, 10, 1);
      Shape47.setPivot(27F, -4.5F, -5.5F);
      Shape47.setTextureSize(128, 64);
      Shape47.mirror = true;
      setRotation(Shape47, 0F, 0F, 0F);
      Shape48 = new ModelPart(this, 52, 17);
      Shape48.addCuboid(0F, 0F, 0F, 4, 1, 4);
      Shape48.setPivot(-10F, 6F, -1.5F);
      Shape48.setTextureSize(128, 64);
      Shape48.mirror = true;
      setRotation(Shape48, 0F, 0F, 0F);
      Shape49 = new ModelPart(this, 36, 32);
      Shape49.addCuboid(0F, 0F, 0F, 16, 1, 10);
      Shape49.setPivot(0F, 5.5F, -4.5F);
      Shape49.setTextureSize(128, 64);
      Shape49.mirror = true;
      setRotation(Shape49, 0F, 0F, 0F);
      Shape50 = new ModelPart(this, 14, 46);
      Shape50.addCuboid(0F, 0F, 0F, 7, 1, 4);
      Shape50.setPivot(0F, 6.5F, -1.5F);
      Shape50.setTextureSize(128, 64);
      Shape50.mirror = true;
      setRotation(Shape50, 0F, 0F, 0F);
      Shape51 = new ModelPart(this, 119, 0);
      Shape51.addCuboid(-1F, 0F, -1F, 2, 7, 2);
      Shape51.setPivot(-8F, 7F, 0.5F);
      Shape51.setTextureSize(128, 64);
      Shape51.mirror = true;
      setRotation(Shape51, 0F, 0.7853982F, 0F);
      Shape52 = new ModelPart(this, 46, 0);
      Shape52.addCuboid(0F, 0F, 0F, 3, 7, 2);
      Shape52.setPivot(3F, 7.5F, -0.5F);
      Shape52.setTextureSize(128, 64);
      Shape52.mirror = true;
      setRotation(Shape52, 0F, 0F, 0F);
      Shape53 = new ModelPart(this, 36, 55);
      Shape53.addCuboid(0F, 0F, 0F, 16, 8, 1);
      Shape53.setPivot(0F, -3.5F, -5.5F);
      Shape53.setTextureSize(128, 64);
      Shape53.mirror = true;
      setRotation(Shape53, 0F, 0F, 0F);
      Shape54 = new ModelPart(this, 14, 20);
      Shape54.addCuboid(0F, -1F, -1F, 1, 2, 2);
      Shape54.setPivot(0F, 0.5F, -10F);
      Shape54.setTextureSize(128, 64);
      Shape54.mirror = true;
      setRotation(Shape54, 0.7853982F, 0F, 0F);
      Shape55 = new ModelPart(this, 100, 35);
      Shape55.addCuboid(0F, -3F, 0F, 3, 3, 2);
      Shape55.setPivot(1.5F, 4F, -8.5F);
      Shape55.setTextureSize(128, 64);
      Shape55.mirror = true;
      setRotation(Shape55, 0.6366837F, 0F, 0F);
      Shape56 = new ModelPart(this, 0, 20);
      Shape56.addCuboid(0F, -1.5F, -1.5F, 4, 3, 3);
      Shape56.setPivot(1F, 0.5F, -10F);
      Shape56.setTextureSize(128, 64);
      Shape56.mirror = true;
      setRotation(Shape56, 0.7853982F, 0F, 0F);
      Shape57 = new ModelPart(this, 0, 26);
      Shape57.addCuboid(0F, -1.5F, -1.5F, 2, 3, 3);
      Shape57.setPivot(-2F, 0.5F, -10F);
      Shape57.setTextureSize(128, 64);
      Shape57.mirror = true;
      setRotation(Shape57, 0.7853982F, 0F, 0F);
      Shape58 = new ModelPart(this, 58, 6);
      Shape58.addCuboid(0F, -1F, -1F, 2, 2, 2);
      Shape58.setPivot(5F, 0.5F, -10F);
      Shape58.setTextureSize(128, 64);
      Shape58.mirror = true;
      setRotation(Shape58, 0.7853982F, 0F, 0F);
      Shape59 = new ModelPart(this, 100, 31);
      Shape59.addCuboid(0F, 0F, 0F, 3, 2, 2);
      Shape59.setPivot(1.5F, 2F, -8.5F);
      Shape59.setTextureSize(128, 64);
      Shape59.mirror = true;
      setRotation(Shape59, 0F, 0F, 0F);
  }
  
	@Override
	public void render(Entity entityIn, MatrixStack matrices, VertexConsumer vertices, int ammoLeft,
			float reloadProgress, Mode transformType, int part, float fireProgress, float chargeProgress, int light,
			int overlay) {
		matrices.push();
		TGMatrixOps.rotate(matrices, 180.0f, 0, 1, 0);
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
		Shape47.render(matrices, vertices, light, overlay);
		Shape48.render(matrices, vertices, light, overlay);
		Shape49.render(matrices, vertices, light, overlay);
		Shape50.render(matrices, vertices, light, overlay);
		Shape51.render(matrices, vertices, light, overlay);
		Shape52.render(matrices, vertices, light, overlay);
		Shape53.render(matrices, vertices, light, overlay);
		Shape54.render(matrices, vertices, light, overlay);
		Shape55.render(matrices, vertices, light, overlay);
		Shape56.render(matrices, vertices, light, overlay);
		Shape57.render(matrices, vertices, light, overlay);
		Shape58.render(matrices, vertices, light, overlay);
		Shape59.render(matrices, vertices, light, overlay);
		matrices.pop();
	}

}