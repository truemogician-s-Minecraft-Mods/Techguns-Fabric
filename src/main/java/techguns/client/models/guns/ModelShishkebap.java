package techguns.client.models.guns;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import techguns.client.models.ModelPart;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;

public class ModelShishkebap extends ModelMultipart {
    public ModelPart igniter;
    public ModelPart valve;
    public ModelPart Grip1;
    public ModelPart Grip2;
    public ModelPart Grip3;
    public ModelPart Handle;
    public ModelPart guard;
    public ModelPart blade0;
    public ModelPart blade2;
    public ModelPart blade1;
    public ModelPart bladetop0;
    public ModelPart bladetop2;
    public ModelPart bladetop1;
    public ModelPart bladetop3;
    public ModelPart tank0;
    public ModelPart tank1;
    public ModelPart tube0;
    public ModelPart tube1;
    public ModelPart tube2;
    public ModelPart tube3;
    public ModelPart tube4;
    public ModelPart tube;

    public ModelShishkebap() {
        super(RenderLayer::getEntitySolid);
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Grip3 = new ModelPart(this, 18, 34);
        this.Grip3.setPivot(0.0F, -3.0F, 0.0F);
        this.Grip3.addCuboid(-1.5F, 0.0F, -3.0F, 3, 2, 5, 0.0F);
        this.igniter = new ModelPart(this, 15, 7);
        this.igniter.setPivot(0.0F, -5.3F, -2.0F);
        this.igniter.addCuboid(-0.5F, -5.3F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotation(igniter, 0.17453292519943295F, 0.7853981633974483F, 0.12217304763960307F);
        this.Grip2 = new ModelPart(this, 0, 14);
        this.Grip2.setPivot(0.0F, 9.0F, 0.0F);
        this.Grip2.addCuboid(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotation(Grip2, 0.0F, 0.7853981633974483F, 0.0F);
        this.bladetop1 = new ModelPart(this, 52, 15);
        this.bladetop1.setPivot(0.0F, -45.5F, 0.6F);
        this.bladetop1.addCuboid(-0.5F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.setRotation(bladetop1, -0.3141592653589793F, 0.0F, 0.0F);
        this.valve = new ModelPart(this, 2, 27);
        this.valve.setPivot(4.0F, -9.0F, 4.0F);
        this.valve.addCuboid(-1.5F, -1.5F, -1.5F, 1, 3, 3, 0.0F);
        this.setRotation(valve, 0.7853981633974483F, 0.0F, 0.0F);
        this.bladetop2 = new ModelPart(this, 39, 22);
        this.bladetop2.setPivot(0.0F, -39.7F, -1.4F);
        this.bladetop2.addCuboid(-0.5F, -7.0F, -0.5F, 1, 7, 1, 0.0F);
        this.setRotation(bladetop2, -0.6632251157578453F, 0.7853981633974483F, -0.5061454830783556F);
        this.tank1 = new ModelPart(this, 39, 15);
        this.tank1.setPivot(0.0F, -13.0F, 4.0F);
        this.tank1.addCuboid(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotation(tank1, 0.0F, 0.7853981633974483F, 0.0F);
        this.guard = new ModelPart(this, 0, 35);
        this.guard.setPivot(0.0F, -4.0F, 1.0F);
        this.guard.addCuboid(-2.5F, 0.0F, -5.0F, 5, 1, 7, 0.0F);
        this.tank0 = new ModelPart(this, 39, 0);
        this.tank0.setPivot(0.0F, -10.0F, 4.0F);
        this.tank0.addCuboid(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotation(tank0, 0.0F, 0.7853981633974483F, 0.0F);
        this.tube = new ModelPart(this, 20, 0);
        this.tube.setPivot(0.0F, -39.7F, 4.0F);
        this.tube.addCuboid(-0.5F, 0.0F, -0.5F, 1, 27, 1, 0.0F);
        this.setRotation(tube, 0.0F, 0.7853981633974483F, 0.0F);
        this.tube1 = new ModelPart(this, 11, 27);
        this.tube1.setPivot(0.0F, -21.0F, -0.3F);
        this.tube1.addCuboid(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(tube1, 0.0F, 0.0F, 0.7853981633974483F);
        this.bladetop0 = new ModelPart(this, 44, 22);
        this.bladetop0.setPivot(0.0F, -46.0F, 0.6F);
        this.bladetop0.addCuboid(-0.5F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.bladetop3 = new ModelPart(this, 49, 23);
        this.bladetop3.setPivot(0.0F, -42.5F, -0.4F);
        this.bladetop3.addCuboid(-0.5F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        this.tube0 = new ModelPart(this, 11, 27);
        this.tube0.setPivot(0.0F, -15.0F, -0.3F);
        this.tube0.addCuboid(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(tube0, 0.0F, 0.0F, 0.7853981633974483F);
        this.Grip1 = new ModelPart(this, 0, 0);
        this.Grip1.setPivot(0.0F, -1.0F, 0.0F);
        this.Grip1.addCuboid(-1.5F, 0.0F, -1.5F, 3, 10, 3, 0.0F);
        this.setRotation(Grip1, 0.0F, 0.7853981633974483F, 0.0F);
        this.tube3 = new ModelPart(this, 11, 27);
        this.tube3.setPivot(0.0F, -33.0F, -0.3F);
        this.tube3.addCuboid(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(tube3, 0.0F, 0.0F, 0.7853981633974483F);
        this.blade2 = new ModelPart(this, 34, 0);
        this.blade2.setPivot(0.0F, -40.0F, -1.4F);
        this.blade2.addCuboid(-0.5F, 0.0F, -0.5F, 1, 30, 1, 0.0F);
        this.setRotation(blade2, 0.0F, 0.7853981633974483F, 0.0F);
        this.Handle = new ModelPart(this, 0, 21);
        this.Handle.setPivot(0.0F, -1.5F, -3.0F);
        this.Handle.addCuboid(-0.5F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
        this.setRotation(Handle, -0.2181661564992912F, 0.0F, 0.0F);
        this.blade1 = new ModelPart(this, 25, 0);
        this.blade1.setPivot(0.0F, -40.0F, -1.4F);
        this.blade1.addCuboid(-0.5F, 0.0F, 0.0F, 1, 30, 3, 0.0F);
        this.blade0 = new ModelPart(this, 7, 16);
        this.blade0.setPivot(0.0F, -10.0F, 0.0F);
        this.blade0.addCuboid(-1.0F, 0.0F, -2.0F, 2, 6, 4, 0.0F);
        this.tube2 = new ModelPart(this, 11, 27);
        this.tube2.setPivot(0.0F, -27.0F, -0.3F);
        this.tube2.addCuboid(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(tube2, 0.0F, 0.0F, 0.7853981633974483F);
        this.tube4 = new ModelPart(this, 11, 27);
        this.tube4.setPivot(0.0F, -39.0F, -0.3F);
        this.tube4.addCuboid(-1.0F, -1.0F, 0.0F, 2, 2, 4, 0.0F);
        this.setRotation(tube4, 0.0F, 0.0F, 0.7853981633974483F);
    }

	@Override
	public void render(Entity entityIn, MatrixStack matrices, VertexConsumer vertices, int ammoLeft,
                       float reloadProgress, ModelTransformationMode transformType, int part, float fireProgress, float chargeProgress, int light,
                       int overlay) {
		
        this.Grip3.render(matrices, vertices, light, overlay);
        this.igniter.render(matrices, vertices, light, overlay);
        this.Grip2.render(matrices, vertices, light, overlay);
        matrices.push();
        matrices.translate(this.bladetop1.pivotX * scale, this.bladetop1.pivotY * scale, this.bladetop1.pivotZ * scale);
        matrices.translate(this.bladetop1.pitch * scale, this.bladetop1.yaw * scale, this.bladetop1.roll * scale);
        matrices.scale(0.9f, 1.0f, 1.0f);
        matrices.translate(-this.bladetop1.pivotX * scale, -this.bladetop1.pivotY * scale, -this.bladetop1.pivotZ * scale);
        matrices.translate(-this.bladetop1.pitch * scale, -this.bladetop1.yaw * scale, -this.bladetop1.roll * scale);
        this.bladetop1.render(matrices, vertices, light, overlay);
        matrices.pop();
        this.valve.render(matrices, vertices, light, overlay);
        matrices.push();
        matrices.translate(this.bladetop2.pivotX * scale, this.bladetop2.pivotY * scale, this.bladetop2.pivotZ * scale);
        matrices.translate(this.bladetop2.pitch * scale, this.bladetop2.yaw * scale, this.bladetop2.roll * scale);
        matrices.scale(0.7f, 1.0f, 0.7f);
        matrices.translate(-this.bladetop2.pivotX * scale, -this.bladetop2.pivotY * scale, -this.bladetop2.pivotZ * scale);
        matrices.translate(-this.bladetop2.pitch * scale, -this.bladetop2.yaw * scale, -this.bladetop2.roll * scale);
        this.bladetop2.render(matrices, vertices, light, overlay);
        matrices.pop();
        this.tank1.render(matrices, vertices, light, overlay);
        this.guard.render(matrices, vertices, light, overlay);
        this.tank0.render(matrices, vertices, light, overlay);
        this.tube.render(matrices, vertices, light, overlay);
        this.tube1.render(matrices, vertices, light, overlay);
        this.bladetop0.render(matrices, vertices, light, overlay);
        matrices.push();
        matrices.translate(this.bladetop3.pivotX * scale, this.bladetop3.pivotY * scale, this.bladetop3.pivotZ * scale);
        matrices.translate(this.bladetop3.pitch * scale, this.bladetop3.yaw * scale, this.bladetop3.roll * scale);
        matrices.scale(0.95f, 1.0f, 1.0f);
        matrices.translate(-this.bladetop3.pivotX * scale, -this.bladetop3.pivotY * scale, -this.bladetop3.pivotZ * scale);
        matrices.translate(-this.bladetop3.pitch * scale, -this.bladetop3.yaw * scale, -this.bladetop3.roll * scale);
        this.bladetop3.render(matrices, vertices, light, overlay);
        matrices.pop();
        this.tube0.render(matrices, vertices, light, overlay);
        this.Grip1.render(matrices, vertices, light, overlay);
        this.tube3.render(matrices, vertices, light, overlay);
        matrices.push();
        matrices.translate(this.blade2.pivotX * scale, this.blade2.pivotY * scale, this.blade2.pivotZ * scale);
        matrices.translate(this.blade2.pitch * scale, this.blade2.yaw * scale, this.blade2.roll * scale);
        matrices.scale(0.7f, 1.0f, 0.7f);
        matrices.translate(-this.blade2.pivotX * scale, -this.blade2.pivotY * scale, -this.blade2.pivotZ * scale);
        matrices.translate(-this.blade2.pitch * scale, -this.blade2.yaw * scale, -this.blade2.roll * scale);
        this.blade2.render(matrices, vertices, light, overlay);
        matrices.pop();
        this.Handle.render(matrices, vertices, light, overlay);
        this.blade1.render(matrices, vertices, light, overlay);
        this.blade0.render(matrices, vertices, light, overlay);
        this.tube2.render(matrices, vertices, light, overlay);
        this.tube4.render(matrices, vertices, light, overlay);
	}
}
