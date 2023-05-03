package techguns.client.models.guns;

import net.minecraft.client.render.model.json.ModelTransformationMode;
import techguns.client.models.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;

public class ModelScar extends ModelMultipart {

	public ModelPart Grip1;
	public ModelPart Trigger01;
	public ModelPart Trigger02;
	public ModelPart BarrelRails01;
	public ModelPart BarrelRails02;
	public ModelPart Barrel;
	public ModelPart Receiver03;
	public ModelPart Magazine01;
	public ModelPart TopRails;
	public ModelPart Grip01;
	public ModelPart BarrelRails04;
	public ModelPart MagSocket;
	public ModelPart Receiver01;
	public ModelPart Receiver04;
	public ModelPart Receiver05;
	public ModelPart Stock01;
	public ModelPart Stock02;
	public ModelPart StockMount;
	public ModelPart Stock03;
	public ModelPart Stock04;
	public ModelPart Stock05;
	public ModelPart BarrelMount01;
	public ModelPart BarrelMiniPart;
	public ModelPart BarrelMount02;
	public ModelPart Muzzle;
	public ModelPart FrontSights;
	public ModelPart FrontSightsMount;
	public ModelPart BackSightsMount;
	public ModelPart BackSightsMount2;
	public ModelPart BackSights;
	public ModelPart Grip02;
	public ModelPart Grip03;
	public ModelPart Grip04;
	public ModelPart Grip05;
	public ModelPart Grip06;
	public ModelPart Bolt;
	public ModelPart ScopeMount;
	public ModelPart ScopePlate;
	public ModelPart Scope01;
	public ModelPart Scope02;
	public ModelPart Scope03;
	public ModelPart Scope04;
	public ModelPart Scope05;
	public ModelPart Stock06;
	public ModelPart StockMount02;

	public ModelScar() {
		super(RenderLayer::getEntitySolid);
		
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.StockMount = new ModelPart(this, 0, 0);
		this.StockMount.setPivot(-2.5F, -6.5F, 11.5F);
		this.StockMount.addCuboid(0.0F, 0.0F, 0.0F, 4, 7, 2, 0.0F);
		this.Grip03 = new ModelPart(this, 111, 9);
		this.Grip03.setPivot(-1.5F, -0.5F, -16.5F);
		this.Grip03.addCuboid(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
		this.setRotation(Grip03, -0.6981317007977318F, 0.0F, 0.0F);
		this.Grip04 = new ModelPart(this, 98, 7);
		this.Grip04.setPivot(-1.5F, -0.1F, -10.5F);
		this.Grip04.addCuboid(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
		this.setRotation(Grip04, -1.9198621771937625F, 0.0F, 0.0F);
		this.Receiver03 = new ModelPart(this, 46, 36);
		this.Receiver03.setPivot(-2.0F, -1.0F, -6.0F);
		this.Receiver03.addCuboid(0.0F, 0.0F, 0.0F, 3, 3, 16, 0.0F);
		this.Grip1 = new ModelPart(this, 68, 0);
		this.Grip1.setPivot(-0.5F, 2.0F, 6.0F);
		this.Grip1.addCuboid(-1.5F, 0.0F, 0.0F, 3, 9, 4, 0.0F);
		this.setRotation(Grip1, 0.4461061568097506F, -0.0F, 0.0F);
		this.Stock01 = new ModelPart(this, 34, 0);
		this.Stock01.setPivot(-2.0F, -2.5F, 13.0F);
		this.Stock01.addCuboid(0.0F, 0.0F, 0.0F, 3, 3, 10, 0.0F);
		this.BackSightsMount2 = new ModelPart(this, 22, 5);
		this.BackSightsMount2.setPivot(-0.5F, -7.0F, 9.0F);
		this.BackSightsMount2.addCuboid(-2.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F);
		this.setRotation(BackSightsMount2, -0.7853981633974483F, 0.0F, 0.0F);
		this.Grip05 = new ModelPart(this, 53, 0);
		this.Grip05.setPivot(-1.5F, 0.3F, -21.3F);
		this.Grip05.addCuboid(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		this.Muzzle = new ModelPart(this, 70, 36);
		this.Muzzle.setPivot(-0.5F, -4.2F, -44.0F);
		this.Muzzle.addCuboid(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
		this.setRotation(Muzzle, 0.0F, -0.0F, 0.7853981633974483F);
		this.BarrelMount02 = new ModelPart(this, 46, 36);
		this.BarrelMount02.setPivot(-0.5F, -5.8F, -30.0F);
		this.BarrelMount02.addCuboid(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
		this.setRotation(BarrelMount02, 0.0F, -0.0F, 0.7853981633974483F);
		this.Stock03 = new ModelPart(this, 23, 16);
		this.Stock03.setPivot(-0.5F, -3.5F, 21.0F);
		this.Stock03.addCuboid(-1.5F, 0.0F, 0.0F, 3, 10, 3, 0.0F);
		this.setRotation(Stock03, 0.2617993877991494F, -0.0F, 0.0F);
		this.FrontSightsMount = new ModelPart(this, 0, 48);
		this.FrontSightsMount.setPivot(-1.5F, -6.8F, -26.5F);
		this.FrontSightsMount.addCuboid(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
		this.BackSightsMount = new ModelPart(this, 22, 0);
		this.BackSightsMount.setPivot(-0.5F, -7.5F, 6.5F);
		this.BackSightsMount.addCuboid(-1.5F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
		this.ScopeMount = new ModelPart(this, 113, 50);
		this.ScopeMount.setPivot(-0.5F, -7.5F, 0.5F);
		this.ScopeMount.addCuboid(-1.5F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
		this.Receiver04 = new ModelPart(this, 83, 6);
		this.Receiver04.setPivot(-2.0F, -1.5F, 10.0F);
		this.Receiver04.addCuboid(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
		this.Grip02 = new ModelPart(this, 92, 0);
		this.Grip02.setPivot(-2.0F, -0.5F, -15.5F);
		this.Grip02.addCuboid(0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F);
		this.Magazine01 = new ModelPart(this, 109, 18);
		this.Magazine01.setPivot(-1.5F, 5.0F, -5.5F);
		this.Magazine01.addCuboid(0.0F, 0.0F, 0.0F, 2, 6, 7, 0.0F);
		this.Scope03 = new ModelPart(this, 115, 33);
		this.Scope03.setPivot(-0.5F, -10.2F, 8.0F);
		this.Scope03.addCuboid(-1.5F, -1.5F, 0.0F, 3, 3, 3, 0.0F);
		this.setRotation(Scope03, 0.0F, 0.0F, 0.7853981633974483F);
		this.Grip01 = new ModelPart(this, 109, 0);
		this.Grip01.setPivot(-2.0F, -1.5F, -21.5F);
		this.Grip01.addCuboid(0.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F);
		this.Receiver05 = new ModelPart(this, 76, 20);
		this.Receiver05.setPivot(-2.0F, -1.5F, -8.0F);
		this.Receiver05.addCuboid(0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
		this.BarrelRails04 = new ModelPart(this, 46, 17);
		this.BarrelRails04.setPivot(-1.5F, -1.0F, -25.0F);
		this.BarrelRails04.addCuboid(0.0F, 0.0F, 0.0F, 2, 1, 17, 0.0F);
		this.Receiver01 = new ModelPart(this, 0, 22);
		this.Receiver01.setPivot(-2.5F, -6.0F, -25.0F);
		this.Receiver01.addCuboid(0.0F, 0.0F, 0.0F, 4, 5, 37, 0.0F);
		this.Grip06 = new ModelPart(this, 53, 0);
		this.Grip06.setPivot(-1.3F, 1.1F, -15.3F);
		this.Grip06.addCuboid(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
		this.setRotation(Grip06, -0.6981317007977318F, 0.0F, 0.0F);
		this.Scope01 = new ModelPart(this, 99, 36);
		this.Scope01.setPivot(-0.5F, -10.2F, -3.0F);
		this.Scope01.addCuboid(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
		this.setRotation(Scope01, 0.0F, 0.0F, 0.7853981633974483F);
		this.FrontSights = new ModelPart(this, 0, 53);
		this.FrontSights.setPivot(-1.5F, -7.0F, -30.5F);
		this.FrontSights.addCuboid(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
		this.Stock06 = new ModelPart(this, 37, 18);
		this.Stock06.setPivot(0.8F, -1.0F, 23.8F);
		this.Stock06.addCuboid(-0.5F, -0.5F, -0.5F, 1, 1, 2, 0.0F);
		this.setRotation(Stock06, 0.0F, 0.0F, 0.7853981633974483F);
		this.MagSocket = new ModelPart(this, 14, 47);
		this.MagSocket.setPivot(-2.0F, 2.0F, -6.0F);
		this.MagSocket.addCuboid(0.0F, 0.0F, 0.0F, 3, 3, 8, 0.0F);
		this.BarrelRails01 = new ModelPart(this, 9, 31);
		this.BarrelRails01.setPivot(1.5F, -4.25F, -24.5F);
		this.BarrelRails01.addCuboid(0.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F);
		this.StockMount02 = new ModelPart(this, 0, 17);
		this.StockMount02.setPivot(-2.5F, -6.0F, 12.5F);
		this.StockMount02.addCuboid(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
		this.setRotation(StockMount02, 0.0F, 0.7853981633974483F, 0.0F);
		this.Scope04 = new ModelPart(this, 93, 36);
		this.Scope04.setPivot(1.2F, -10.2F, 5.0F);
		this.Scope04.addCuboid(-2.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotation(Scope04, -0.7853981633974483F, 0.0F, 0.0F);
		this.Trigger02 = new ModelPart(this, 87, 1);
		this.Trigger02.setPivot(-1.0F, 1.5F, 5.0F);
		this.Trigger02.addCuboid(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
		this.setRotation(Trigger02, -0.2617993950843811F, -0.0F, 0.0F);
		this.Bolt = new ModelPart(this, 36, 0);
		this.Bolt.setPivot(2.0F, -4.8F, -10.5F);
		this.Bolt.addCuboid(-0.5F, -0.5F, -0.5F, 2, 1, 1, 0.0F);
		this.setRotation(Bolt, 0.7853981633974483F, 0.0F, 0.0F);
		this.ScopePlate = new ModelPart(this, 111, 40);
		this.ScopePlate.setPivot(0.0F, -10.0F, 0.0F);
		this.ScopePlate.addCuboid(-1.5F, 0.0F, 0.0F, 2, 3, 6, 0.0F);
		this.BarrelMiniPart = new ModelPart(this, 0, 36);
		this.BarrelMiniPart.setPivot(-0.5F, -3.8F, -26.0F);
		this.BarrelMiniPart.addCuboid(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
		this.setRotation(BarrelMiniPart, 0.0F, -0.0F, 0.7853981633974483F);
		this.Stock02 = new ModelPart(this, 2, 0);
		this.Stock02.setPivot(-0.5F, -6.5F, 13.0F);
		this.Stock02.addCuboid(-2.0F, 0.0F, 0.0F, 4, 4, 11, 0.0F);
		this.setRotation(Stock02, -0.17453292519943295F, -0.0F, 0.0F);
		this.Stock04 = new ModelPart(this, 10, 16);
		this.Stock04.setPivot(-2.0F, -4.5F, 23.8F);
		this.Stock04.addCuboid(0.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F);
		this.BackSights = new ModelPart(this, 35, 3);
		this.BackSights.setPivot(-0.5F, -7.7F, 9.5F);
		this.BackSights.addCuboid(-0.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
		this.BarrelRails02 = new ModelPart(this, 9, 31);
		this.BarrelRails02.setPivot(-3.5F, -4.25F, -24.5F);
		this.BarrelRails02.addCuboid(0.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F);
		this.Scope05 = new ModelPart(this, 101, 31);
		this.Scope05.setPivot(-0.5F, -11.3F, 5.0F);
		this.Scope05.addCuboid(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotation(Scope05, 0.0F, 0.7853981633974483F, 0.0F);
		this.Stock05 = new ModelPart(this, 47, 14);
		this.Stock05.setPivot(-2.5F, -5.0F, 25.8F);
		this.Stock05.addCuboid(0.0F, 0.0F, 0.0F, 4, 12, 2, 0.0F);
		this.Trigger01 = new ModelPart(this, 78, 12);
		this.Trigger01.setPivot(-1.5F, 4.0F, 2.0F);
		this.Trigger01.addCuboid(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
		this.Barrel = new ModelPart(this, 0, 32);
		this.Barrel.setPivot(-0.5F, -3.8F, -38.0F);
		this.Barrel.addCuboid(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
		this.setRotation(Barrel, 0.0F, 0.0F, 0.7853981633974483F);
		this.TopRails = new ModelPart(this, 51, 21);
		this.TopRails.setPivot(-1.5F, -7.0F, -24.5F);
		this.TopRails.addCuboid(0.0F, 0.0F, 0.0F, 2, 1, 36, 0.0F);
		this.Scope02 = new ModelPart(this, 95, 46);
		this.Scope02.setPivot(-0.5F, -9.4F, 2.0F);
		this.Scope02.addCuboid(-1.5F, -1.5F, 0.0F, 2, 2, 6, 0.0F);
		this.setRotation(Scope02, 0.0F, 0.0F, 0.7853981633974483F);
		this.BarrelMount01 = new ModelPart(this, 24, 36);
		this.BarrelMount01.setPivot(-0.5F, -4.2F, -30.0F);
		this.BarrelMount01.addCuboid(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
		this.setRotation(BarrelMount01, 0.0F, -0.0F, 0.7853981633974483F);
	}

	@Override
	public void render(Entity entityIn, MatrixStack matrices, VertexConsumer vertices, int ammoLeft,
					   float reloadProgress, ModelTransformationMode transformType, int part, float fireProgress, float chargeProgress, int light,
					   int overlay) {
		float scale = 0.0625f;
		if (part == 0) {

			this.StockMount.render(matrices, vertices, light, overlay);
			this.Grip03.render(matrices, vertices, light, overlay);
			this.Grip04.render(matrices, vertices, light, overlay);
			this.Receiver03.render(matrices, vertices, light, overlay);
			
			matrices.push();
			matrices.translate(this.Grip1.pivotX * scale, this.Grip1.pivotY * scale, this.Grip1.pivotZ * scale);
			matrices.translate(this.Grip1.pitch * scale, this.Grip1.yaw * scale, this.Grip1.roll * scale);
			matrices.scale(0.99f, 1.0f, 1.0f);
			matrices.translate(-this.Grip1.pivotX * scale, -this.Grip1.pivotY * scale, -this.Grip1.pivotZ * scale);
			matrices.translate(-this.Grip1.pitch * scale, -this.Grip1.yaw * scale, -this.Grip1.roll * scale);
			this.Grip1.render(matrices, vertices, light, overlay);
			matrices.pop();
			this.Stock01.render(matrices, vertices, light, overlay);
			matrices.push();
			matrices.translate(this.BackSightsMount2.pivotX * scale, this.BackSightsMount2.pivotY * scale, this.BackSightsMount2.pivotZ * scale);
			matrices.translate(this.BackSightsMount2.pitch * scale, this.BackSightsMount2.yaw * scale, this.BackSightsMount2.roll * scale);
			matrices.scale(0.8f, 0.7f, 0.7f);
			matrices.translate(-this.BackSightsMount2.pivotX * scale, -this.BackSightsMount2.pivotY * scale, -this.BackSightsMount2.pivotZ * scale);
			matrices.translate(-this.BackSightsMount2.pitch * scale, -this.BackSightsMount2.yaw * scale, -this.BackSightsMount2.roll * scale);
			this.BackSightsMount2.render(matrices, vertices, light, overlay);
			matrices.pop();
			this.Grip05.render(matrices, vertices, light, overlay);
			this.Muzzle.render(matrices, vertices, light, overlay);
			matrices.push();
			matrices.translate(this.BarrelMount02.pivotX * scale, this.BarrelMount02.pivotY * scale, this.BarrelMount02.pivotZ * scale);
			matrices.translate(this.BarrelMount02.pitch * scale, this.BarrelMount02.yaw * scale, this.BarrelMount02.roll * scale);
			matrices.scale(0.8f, 0.8f, 1.0f);
			matrices.translate(-this.BarrelMount02.pivotX * scale, -this.BarrelMount02.pivotY * scale, -this.BarrelMount02.pivotZ * scale);
			matrices.translate(-this.BarrelMount02.pitch * scale, -this.BarrelMount02.yaw * scale, -this.BarrelMount02.roll * scale);
			this.BarrelMount02.render(matrices, vertices, light, overlay);
			matrices.pop();
			matrices.push();
			matrices.translate(this.Stock03.pivotX * scale, this.Stock03.pivotY * scale, this.Stock03.pivotZ * scale);
			matrices.translate(this.Stock03.pitch * scale, this.Stock03.yaw * scale, this.Stock03.roll * scale);
			matrices.scale(0.99f, 1.0f, 1.0f);
			matrices.translate(-this.Stock03.pivotX * scale, -this.Stock03.pivotY * scale, -this.Stock03.pivotZ * scale);
			matrices.translate(-this.Stock03.pitch * scale, -this.Stock03.yaw * scale, -this.Stock03.roll * scale);
			this.Stock03.render(matrices, vertices, light, overlay);
			matrices.pop();
			matrices.push();
			matrices.translate(this.FrontSightsMount.pivotX * scale, this.FrontSightsMount.pivotY * scale, this.FrontSightsMount.pivotZ * scale);
			matrices.translate(this.FrontSightsMount.pitch * scale, this.FrontSightsMount.yaw * scale, this.FrontSightsMount.roll * scale);
			matrices.scale(0.8f, 1.0f, 1.0f);
			matrices.translate(-this.FrontSightsMount.pivotX * scale, -this.FrontSightsMount.pivotY * scale, -this.FrontSightsMount.pivotZ * scale);
			matrices.translate(-this.FrontSightsMount.pitch * scale, -this.FrontSightsMount.yaw * scale, -this.FrontSightsMount.roll * scale);
			this.FrontSightsMount.render(matrices, vertices, light, overlay);
			matrices.pop();
			matrices.push();
			matrices.translate(this.BackSightsMount.pivotX * scale, this.BackSightsMount.pivotY * scale, this.BackSightsMount.pivotZ * scale);
			matrices.translate(this.BackSightsMount.pitch * scale, this.BackSightsMount.yaw * scale, this.BackSightsMount.roll * scale);
			matrices.scale(0.9f, 1.0f, 1.0f);
			matrices.translate(-this.BackSightsMount.pivotX * scale, -this.BackSightsMount.pivotY * scale, -this.BackSightsMount.pivotZ * scale);
			matrices.translate(-this.BackSightsMount.pitch * scale, -this.BackSightsMount.yaw * scale, -this.BackSightsMount.roll * scale);
			this.BackSightsMount.render(matrices, vertices, light, overlay);
			matrices.pop();
			matrices.push();
			matrices.translate(this.ScopeMount.pivotX * scale, this.ScopeMount.pivotY * scale, this.ScopeMount.pivotZ * scale);
			matrices.translate(this.ScopeMount.pitch * scale, this.ScopeMount.yaw * scale, this.ScopeMount.roll * scale);
			matrices.scale(0.9f, 1.0f, 1.0f);
			matrices.translate(-this.ScopeMount.pivotX * scale, -this.ScopeMount.pivotY * scale, -this.ScopeMount.pivotZ * scale);
			matrices.translate(-this.ScopeMount.pitch * scale, -this.ScopeMount.yaw * scale, -this.ScopeMount.roll * scale);
			this.ScopeMount.render(matrices, vertices, light, overlay);
			matrices.pop();
			this.Receiver04.render(matrices, vertices, light, overlay);
			this.Grip02.render(matrices, vertices, light, overlay);
			this.Magazine01.render(matrices, vertices, light, overlay);
			matrices.push();
			matrices.translate(this.Scope03.pivotX * scale, this.Scope03.pivotY * scale, this.Scope03.pivotZ * scale);
			matrices.translate(this.Scope03.pitch * scale, this.Scope03.yaw * scale, this.Scope03.roll * scale);
			matrices.scale(0.9f, 1.0f, 1.0f);
			matrices.translate(-this.Scope03.pivotX * scale, -this.Scope03.pivotY * scale, -this.Scope03.pivotZ * scale);
			matrices.translate(-this.Scope03.pitch * scale, -this.Scope03.yaw * scale, -this.Scope03.roll * scale);
			this.Scope03.render(matrices, vertices, light, overlay);
			matrices.pop();
			this.Grip01.render(matrices, vertices, light, overlay);
			this.Receiver05.render(matrices, vertices, light, overlay);
			this.BarrelRails04.render(matrices, vertices, light, overlay);
			this.Receiver01.render(matrices, vertices, light, overlay);
			matrices.push();
			matrices.translate(this.Grip06.pivotX * scale, this.Grip06.pivotY * scale, this.Grip06.pivotZ * scale);
			matrices.translate(this.Grip06.pitch * scale, this.Grip06.yaw * scale, this.Grip06.roll * scale);
			matrices.scale(0.8f, 1.0f, 1.0f);
			matrices.translate(-this.Grip06.pivotX * scale, -this.Grip06.pivotY * scale, -this.Grip06.pivotZ * scale);
			matrices.translate(-this.Grip06.pitch * scale, -this.Grip06.yaw * scale, -this.Grip06.roll * scale);
			this.Grip06.render(matrices, vertices, light, overlay);
			matrices.pop();
			matrices.push();
			matrices.translate(this.Scope01.pivotX * scale, this.Scope01.pivotY * scale, this.Scope01.pivotZ * scale);
			matrices.translate(this.Scope01.pitch * scale, this.Scope01.yaw * scale, this.Scope01.roll * scale);
			matrices.scale(0.9f, 1.0f, 1.0f);
			matrices.translate(-this.Scope01.pivotX * scale, -this.Scope01.pivotY * scale, -this.Scope01.pivotZ * scale);
			matrices.translate(-this.Scope01.pitch * scale, -this.Scope01.yaw * scale, -this.Scope01.roll * scale);
			this.Scope01.render(matrices, vertices, light, overlay);
			matrices.pop();
			this.FrontSights.render(matrices, vertices, light, overlay);
			this.Stock06.render(matrices, vertices, light, overlay);
			this.MagSocket.render(matrices, vertices, light, overlay);
			this.BarrelRails01.render(matrices, vertices, light, overlay);
			matrices.push();
			matrices.translate(this.StockMount02.pivotX * scale, this.StockMount02.pivotY * scale, this.StockMount02.pivotZ * scale);
			matrices.translate(this.StockMount02.pitch * scale, this.StockMount02.yaw * scale, this.StockMount02.roll * scale);
			matrices.scale(0.6f, 1.0f, 0.6f);
			matrices.translate(-this.StockMount02.pivotX * scale, -this.StockMount02.pivotY * scale, -this.StockMount02.pivotZ * scale);
			matrices.translate(-this.StockMount02.pitch * scale, -this.StockMount02.yaw * scale, -this.StockMount02.roll * scale);
			this.StockMount02.render(matrices, vertices, light, overlay);
			matrices.pop();
			matrices.push();
			matrices.translate(this.Scope04.pivotX * scale, this.Scope04.pivotY * scale, this.Scope04.pivotZ * scale);
			matrices.translate(this.Scope04.pitch * scale, this.Scope04.yaw * scale, this.Scope04.roll * scale);
			matrices.scale(0.8f, 0.7f, 0.7f);
			matrices.translate(-this.Scope04.pivotX * scale, -this.Scope04.pivotY * scale, -this.Scope04.pivotZ * scale);
			matrices.translate(-this.Scope04.pitch * scale, -this.Scope04.yaw * scale, -this.Scope04.roll * scale);
			this.Scope04.render(matrices, vertices, light, overlay);
			matrices.pop();
			this.Trigger02.render(matrices, vertices, light, overlay);

			matrices.push();
			matrices.translate(this.ScopePlate.pivotX * scale, this.ScopePlate.pivotY * scale, this.ScopePlate.pivotZ * scale);
			matrices.translate(this.ScopePlate.pitch * scale, this.ScopePlate.yaw * scale, this.ScopePlate.roll * scale);
			matrices.scale(0.9f, 1.0f, 1.0f);
			matrices.translate(-this.ScopePlate.pivotX * scale, -this.ScopePlate.pivotY * scale, -this.ScopePlate.pivotZ * scale);
			matrices.translate(-this.ScopePlate.pitch * scale, -this.ScopePlate.yaw * scale, -this.ScopePlate.roll * scale);
			this.ScopePlate.render(matrices, vertices, light, overlay);
			matrices.pop();
			matrices.push();
			matrices.translate(this.BarrelMiniPart.pivotX * scale, this.BarrelMiniPart.pivotY * scale, this.BarrelMiniPart.pivotZ * scale);
			matrices.translate(this.BarrelMiniPart.pitch * scale, this.BarrelMiniPart.yaw * scale, this.BarrelMiniPart.roll * scale);
			matrices.scale(0.7f, 0.7f, 1.0f);
			matrices.translate(-this.BarrelMiniPart.pivotX * scale, -this.BarrelMiniPart.pivotY * scale, -this.BarrelMiniPart.pivotZ * scale);
			matrices.translate(-this.BarrelMiniPart.pitch * scale, -this.BarrelMiniPart.yaw * scale, -this.BarrelMiniPart.roll * scale);
			this.BarrelMiniPart.render(matrices, vertices, light, overlay);
			matrices.pop();
			matrices.push();
			matrices.translate(this.Stock02.pivotX * scale, this.Stock02.pivotY * scale, this.Stock02.pivotZ * scale);
			matrices.translate(this.Stock02.pitch * scale, this.Stock02.yaw * scale, this.Stock02.roll * scale);
			matrices.scale(0.99f, 1.0f, 1.0f);
			matrices.translate(-this.Stock02.pivotX * scale, -this.Stock02.pivotY * scale, -this.Stock02.pivotZ * scale);
			matrices.translate(-this.Stock02.pitch * scale, -this.Stock02.yaw * scale, -this.Stock02.roll * scale);
			this.Stock02.render(matrices, vertices, light, overlay);
			matrices.pop();
			this.Stock04.render(matrices, vertices, light, overlay);
			this.BackSights.render(matrices, vertices, light, overlay);
			this.BarrelRails02.render(matrices, vertices, light, overlay);
			matrices.push();
			matrices.translate(this.Scope05.pivotX * scale, this.Scope05.pivotY * scale, this.Scope05.pivotZ * scale);
			matrices.translate(this.Scope05.pitch * scale, this.Scope05.yaw * scale, this.Scope05.roll * scale);
			matrices.scale(0.7f, 0.7f, 0.7f);
			matrices.translate(-this.Scope05.pivotX * scale, -this.Scope05.pivotY * scale, -this.Scope05.pivotZ * scale);
			matrices.translate(-this.Scope05.pitch * scale, -this.Scope05.yaw * scale, -this.Scope05.roll * scale);
			this.Scope05.render(matrices, vertices, light, overlay);
			matrices.pop();
			this.Stock05.render(matrices, vertices, light, overlay);
			this.Trigger01.render(matrices, vertices, light, overlay);
			matrices.push();
			matrices.translate(this.Barrel.pivotX * scale, this.Barrel.pivotY * scale, this.Barrel.pivotZ * scale);
			matrices.translate(this.Barrel.pitch * scale, this.Barrel.yaw * scale, this.Barrel.roll * scale);
			matrices.scale(0.7f, 0.7f, 1.0f);
			matrices.translate(-this.Barrel.pivotX * scale, -this.Barrel.pivotY * scale, -this.Barrel.pivotZ * scale);
			matrices.translate(-this.Barrel.pitch * scale, -this.Barrel.yaw * scale, -this.Barrel.roll * scale);
			this.Barrel.render(matrices, vertices, light, overlay);
			matrices.pop();
			this.TopRails.render(matrices, vertices, light, overlay);
			matrices.push();
			matrices.translate(this.Scope02.pivotX * scale, this.Scope02.pivotY * scale, this.Scope02.pivotZ * scale);
			matrices.translate(this.Scope02.pitch * scale, this.Scope02.yaw * scale, this.Scope02.roll * scale);
			matrices.scale(0.9f, 1.0f, 1.0f);
			matrices.translate(-this.Scope02.pivotX * scale, -this.Scope02.pivotY * scale, -this.Scope02.pivotZ * scale);
			matrices.translate(-this.Scope02.pitch * scale, -this.Scope02.yaw * scale, -this.Scope02.roll * scale);
			this.Scope02.render(matrices, vertices, light, overlay);
			matrices.pop();
			this.BarrelMount01.render(matrices, vertices, light, overlay);
		} else {
			matrices.push();
			
			if (fireProgress>0) {
				float movebolt=0f;
				if (fireProgress >0.4f) {
					movebolt = 1.0f-(fireProgress-0.4f)/0.6f;
				} else {
					movebolt = fireProgress/0.4f;
				}
				matrices.translate(0, 0, movebolt*0.6f);
			}
			
			matrices.translate(this.Bolt.pivotX * scale, this.Bolt.pivotY * scale, this.Bolt.pivotZ * scale);
			matrices.translate(this.Bolt.pitch * scale, this.Bolt.yaw * scale, this.Bolt.roll * scale);
			matrices.scale(1.0f, 0.7f, 0.7f);
			matrices.translate(-this.Bolt.pivotX * scale, -this.Bolt.pivotY * scale, -this.Bolt.pivotZ * scale);
			matrices.translate(-this.Bolt.pitch * scale, -this.Bolt.yaw * scale, -this.Bolt.roll * scale);
			this.Bolt.render(matrices, vertices, light, overlay);
			matrices.pop();
		}
	}

}
