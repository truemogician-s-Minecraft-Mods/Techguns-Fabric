package techguns.client.models.guns;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import techguns.client.models.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;


public class ModelMagicRifle extends ModelMultipart {
    public ModelPart b1;
    public ModelPart b2;
    public ModelPart b3;
    public ModelPart b4;
    public ModelPart b5;
    public ModelPart m1;
    public ModelPart m2;
    public ModelPart b6;
    public ModelPart b7;
    public ModelPart m3;
    public ModelPart m4;
    public ModelPart m5;
    public ModelPart g1;
    public ModelPart g2;
    public ModelPart m6;
    public ModelPart g3;
    public ModelPart g4;
    public ModelPart b8;
    public ModelPart m7;
    public ModelPart b9;
    public ModelPart m8;
    public ModelPart m9;
    public ModelPart s1;
    public ModelPart s2;
    public ModelPart g5;
    public ModelPart s3;
    public ModelPart s4;
    public ModelPart m10;
    public ModelPart s5;
    public ModelPart s6;
    public ModelPart b10;
    public ModelPart b11;
    public ModelPart s7;
    public ModelPart g6;
    public ModelPart g8;
    public ModelPart g9;

    public ModelMagicRifle() {
        super(RenderLayer::getEntitySolid);
        this.textureWidth = 128;
        this.textureHeight = 32;
        this.b11 = new ModelPart(this, 63, 24);
        this.b11.setPivot(-8.0F, -2.0F, 0.0F);
        this.b11.setTextureOffset(44, 0).addCuboid(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.g2 = new ModelPart(this, 0, 24);
        this.g2.setPivot(-8.0F, 4.5F, -0.5F);
        this.g2.addCuboid(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        setRotation(g2, 0.0F, 0.0F, -0.7853981633974483F);
        this.b6 = new ModelPart(this, 58, 19);
        this.b6.setPivot(-9.0F, 0.0F, 0.0F);
        this.b6.setTextureOffset(55, 0).addCuboid(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        setRotation(b6, 0.7853981633974483F, 0.0F, 0.0F);
        this.g5 = new ModelPart(this, 1, 25);
        this.g5.setPivot(-8.5F, 3.0F, -0.5F);
        this.g5.addCuboid(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.m8 = new ModelPart(this, 67, 25);
        this.m8.setPivot(-18.0F, 0.0F, -1.0F);
        this.m8.setTextureOffset(47, 0).addCuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.m1 = new ModelPart(this, 55, 7);
        this.m1.setPivot(-10.0F, 0.0F, -1.5F);
        this.m1.addCuboid(0.0F, 0.0F, 0.0F, 9.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.m10 = new ModelPart(this, 0, 13);
        this.m10.setPivot(-22.0F, 1.0F, -1.0F);
        this.m10.addCuboid(0.0F, 0.0F, 0.0F, 6.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.g6 = new ModelPart(this, 0, 29);
        this.g6.setPivot(-17.0F, 6.0F, -0.5F);
        this.g6.addCuboid(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        setRotation(g6, 0.0F, 0.0F, 0.7853981633974483F);
        this.m2 = new ModelPart(this, 64, 7);
        this.m2.setPivot(-13.0F, 1.5F, -1.0F);
        this.m2.setTextureOffset(15, 0).addCuboid(0.0F, 0.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        setRotation(m2, 0.0F, 0.0F, -0.10471975511965977F);
        this.b7 = new ModelPart(this, 64, 19);
        this.b7.setPivot(0.0F, 0.0F, 0.0F);
        this.b7.setTextureOffset(49, 0).addCuboid(0.0F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        setRotation(b7, 0.7853981633974483F, 0.0F, 0.0F);
        this.b1 = new ModelPart(this, 0, 19);
        this.b1.setPivot(-12.0F, 0.0F, 0.0F);
        this.b1.addCuboid(0.0F, -1.0F, -1.0F, 49.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        setRotation(b1, 0.7853981633974483F, 0.0F, 0.0F);
        this.m4 = new ModelPart(this, 0, 9);
        this.m4.setPivot(-17.0F, 5.0F, -1.0F);
        this.m4.addCuboid(0.0F, -2.0F, 0.0F, 5.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        setRotation(m4, 0.0F, 0.0F, -0.3141592653589793F);
        this.m5 = new ModelPart(this, 16, 9);
        this.m5.setPivot(-16.0F, 1.0F, -1.5F);
        this.m5.addCuboid(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.s2 = new ModelPart(this, 51, 12);
        this.s2.setPivot(-29.0F, 4.5F, -1.0F);
        this.s2.addCuboid(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.g3 = new ModelPart(this, 0, 27);
        this.g3.setPivot(-9.0F, 4.5F, -0.5F);
        this.g3.addCuboid(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        setRotation(g3, 0.0F, 0.0F, 0.7853981633974483F);
        this.m9 = new ModelPart(this, 64, 11);
        this.m9.setPivot(-20.0F, 2.0F, -1.5F);
        this.m9.setTextureOffset(12, 0).addCuboid(0.0F, 0.0F, 0.0F, 4.0F, 2.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.s3 = new ModelPart(this, 64, 10);
        this.s3.setPivot(-29.0F, 6.5F, -1.0F);
        this.s3.setTextureOffset(53, 0).addCuboid(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.s4 = new ModelPart(this, 64, 12);
        this.s4.setPivot(-29.0F, 1.5F, -1.0F);
        this.s4.setTextureOffset(3, 0).addCuboid(0.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.s7 = new ModelPart(this, 64, 11);
        this.s7.setPivot(-23.0F, 4.5F, -1.0F);
        this.s7.setTextureOffset(23, 0).addCuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.m6 = new ModelPart(this, 25, 9);
        this.m6.setPivot(-8.0F, 2.0F, -1.0F);
        this.m6.addCuboid(0.0F, 0.0F, 0.0F, 7.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.b4 = new ModelPart(this, 58, 4);
        this.b4.setPivot(-1.0F, 0.3F, 0.3F);
        this.b4.addCuboid(0.0F, 0.0F, 0.0F, 28.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        setRotation(b4, -0.3490658503988659F, 0.0F, 0.0F);
        this.b10 = new ModelPart(this, 64, 24);
        this.b10.setPivot(32.0F, -2.0F, 0.0F);
        this.b10.setTextureOffset(38, 0).addCuboid(0.0F, 0.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.g1 = new ModelPart(this, 0, 25);
        this.g1.setPivot(-9.0F, 4.5F, -0.5F);
        this.g1.addCuboid(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.g4 = new ModelPart(this, 64, 7);
        this.g4.setPivot(-20.0F, 4.0F, -1.0F);
        this.g4.setTextureOffset(38, 0).addCuboid(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.g9 = new ModelPart(this, 0, 28);
        this.g9.setPivot(-14.0F, 6.0F, -0.5F);
        this.g9.addCuboid(0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        setRotation(g9, 0.0F, 0.0F, -0.6981317007977318F);
        this.s6 = new ModelPart(this, 41, 13);
        this.s6.setPivot(-22.0F, 2.0F, -1.0F);
        this.s6.addCuboid(0.0F, 0.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.b2 = new ModelPart(this, 0, 4);
        this.b2.setPivot(-1.0F, 0.3F, -0.3F);
        this.b2.addCuboid(0.0F, 0.0F, -1.0F, 28.0F, 2.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        setRotation(b2, 0.3490658503988659F, 0.0F, 0.0F);
        this.b3 = new ModelPart(this, -16, 24);
        this.b3.setPivot(26.5F, 1.8F, 0.0F);
        this.b3.setTextureOffset(36, 0).addCuboid(0.0F, -0.5F, -0.5F, 10.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        setRotation(b3, 0.7853981633974483F, 0.0F, 0.0F);
        this.m3 = new ModelPart(this, 64, 7);
        this.m3.setPivot(-13.0F, 0.0F, -1.5F);
        this.m3.setTextureOffset(29, 0).addCuboid(0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
        this.b5 = new ModelPart(this, 0, 7);
        this.b5.setPivot(-1.0F, 1.5F, 0.0F);
        this.b5.addCuboid(0.0F, 0.0F, -0.5F, 28.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.b8 = new ModelPart(this, 64, 20);
        this.b8.setPivot(-13.0F, 0.0F, 0.0F);
        this.b8.setTextureOffset(57, 0).addCuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, -0.2F, -0.2F);
        setRotation(b8, 0.7853981633974483F, 0.0F, 0.0F);
        this.b9 = new ModelPart(this, 66, 20);
        this.b9.setPivot(-14.0F, 0.0F, 0.0F);
        this.b9.setTextureOffset(41, 0).addCuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        setRotation(b9, 0.7853981633974483F, 0.0F, 0.0F);
        this.s5 = new ModelPart(this, 64, 13);
        this.s5.setPivot(-29.0F, 0.5F, -1.0F);
        this.s5.setTextureOffset(45, 0).addCuboid(0.0F, 0.0F, 0.0F, 7.0F, 1.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.g8 = new ModelPart(this, 0, 29);
        this.g8.setPivot(-17.0F, 6.0F, -0.5F);
        this.g8.addCuboid(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F);
        this.m7 = new ModelPart(this, 93, 24);
        this.m7.setPivot(-17.0F, -1.0F, -1.0F);
        this.m7.addCuboid(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.0F);
        this.s1 = new ModelPart(this, 25, 12);
        this.s1.setPivot(-27.0F, 1.5F, -1.5F);
        this.s1.addCuboid(0.0F, 0.0F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entityIn, MatrixStack matrices, VertexConsumer vertices, int ammoLeft,
                       float reloadProgress, ModelTransformationMode transformType, int part, float fireProgress, float chargeProgress, int light,
                       int overlay) {
            ImmutableList.of(this.b11, this.g2, this.b6, this.g5, this.m8, this.m1, this.m10, this.g6, this.m2, this.b7, this.b1, this.m4, this.m5, this.s2, this.g3, this.m9, this.s3, this.s4, this.s7, this.m6, this.b4, this.b10, this.g1, this.g4, this.g9, this.s6, this.b2, this.b3, this.m3, this.b5, this.b8, this.b9, this.s5, this.g8, this.m7, this.s1).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay);
        });
    }
}
