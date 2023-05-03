package techguns.client.models.guns;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import techguns.client.models.ModelPart;
import net.minecraft.entity.Entity;
import techguns.client.models.ModelMultipart;

public class ModelMibGun extends ModelMultipart{
	   public ModelPart bottom;
	    public ModelPart trigger;
	    public ModelPart guard1;
	    public ModelPart guard2;
	    public ModelPart grip;
	    public ModelPart bottomtilt;
	    public ModelPart side5;
	    public ModelPart tilt;
	    public ModelPart side4;
	    public ModelPart side6;
	    public ModelPart side2;
	    public ModelPart side3;
	    public ModelPart roundel10;
	    public ModelPart side1;
	    public ModelPart barrel12;
	    public ModelPart roundel4;
	    public ModelPart roundel1;
	    public ModelPart roundel7;
	    public ModelPart barrel8;
	    public ModelPart barrel9;
	    public ModelPart barrel2;
	    public ModelPart roundel8;
	    public ModelPart roundel9;
	    public ModelPart barrel3;
	    public ModelPart barrel11;
	    public ModelPart core;
	    public ModelPart barrel7;
	    public ModelPart barrel1;
	    public ModelPart barrel4;
	    public ModelPart barrel10;
	    public ModelPart barrel6;
	    public ModelPart barrel5;
	    public ModelPart roundel5;
	    public ModelPart roundel3;
	    public ModelPart roundel11;
	    public ModelPart roundel12;
	    public ModelPart tip2;
	    public ModelPart tip1;
	    public ModelPart tip4;
	    public ModelPart tip3;
	    public ModelPart roundel6;
	    public ModelPart roundel2;
	    public ModelPart core2;
	    public ModelPart holder1;
	    public ModelPart barrellaserthing;
	    public ModelPart holder2;
	    public ModelPart holder3;
	    public ModelPart light;
	    public ModelPart top;
	    public ModelPart Button;

	    public ModelMibGun() {
        super(RenderLayer::getEntitySolid);
	        this.textureWidth = 64;
	        this.textureHeight = 64;
	        this.barrel9 = new ModelPart(this, 48, 22);
	        this.barrel9.setPivot(0.5F, 7.300000190734863F, -4.0F);
	        this.barrel9.addCuboid(0.0F, -1.0F, -4.0F, 1, 1, 6, 0.0F);
	        this.setRotation(barrel9, 0.0F, -0.0F, -0.4188790321350098F);
	        this.tip4 = new ModelPart(this, 36, 9);
	        this.tip4.setPivot(0.0F, 7.099999904632568F, -9.0F);
	        this.tip4.addCuboid(-0.5F, -1.0F, -2.0F, 1, 1, 2, 0.0F);
	        this.setRotation(tip4, -0.40142571926116943F, -0.0F, 0.0F);
	        this.bottomtilt = new ModelPart(this, 34, 5);
	        this.bottomtilt.setPivot(0.0F, 7.0F, 3.0F);
	        this.bottomtilt.addCuboid(-1.0F, 0.800000011920929F, 1.2999999523162842F, 2, 1, 2, 0.0F);
	        this.setRotation(bottomtilt, 0.471238911151886F, -0.0F, 0.0F);
	        this.side6 = new ModelPart(this, 43, 0);
	        this.side6.setPivot(-1.5F, 6.0F, 3.0F);
	        this.side6.addCuboid(0.0F, 0.0F, -5.0F, 1, 1, 9, 0.0F);
	        this.setRotation(side6, 0.0F, -0.0F, -0.4886921942234039F);
	        this.barrel10 = new ModelPart(this, 48, 22);
	        this.barrel10.setPivot(0.0F, 5.0F, -2.0F);
	        this.barrel10.addCuboid(-0.5F, 1.2999999523162842F, -6.0F, 1, 1, 6, 0.0F);
	        this.barrel8 = new ModelPart(this, 48, 22);
	        this.barrel8.setPivot(1.7999999523162842F, 6.0F, -4.0F);
	        this.barrel8.addCuboid(-1.0F, 0.0F, -4.0F, 1, 1, 6, 0.0F);
	        this.setRotation(barrel8, 0.0F, -0.0F, 0.4188790321350098F);
	        this.barrel11 = new ModelPart(this, 48, 22);
	        this.barrel11.setPivot(-0.5F, 7.300000190734863F, -4.0F);
	        this.barrel11.addCuboid(0.0F, -1.0F, -4.0F, 1, 1, 6, 0.0F);
	        this.setRotation(barrel11, 0.0F, -0.0F, -1.1693706512451172F);
	        this.roundel11 = new ModelPart(this, 0, 12);
	        this.roundel11.setPivot(-0.5F, 7.099999904632568F, -8.0F);
	        this.roundel11.addCuboid(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
	        this.setRotation(roundel11, 0.0F, -0.0F, -1.1693706512451172F);
	        this.roundel9 = new ModelPart(this, 0, 12);
	        this.roundel9.setPivot(0.5F, 7.099999904632568F, -8.0F);
	        this.roundel9.addCuboid(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
	        this.setRotation(roundel9, 0.0F, -0.0F, -0.4188790321350098F);
	        this.roundel8 = new ModelPart(this, 0, 12);
	        this.roundel8.setPivot(1.600000023841858F, 6.0F, -8.0F);
	        this.roundel8.addCuboid(-1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
	        this.setRotation(roundel8, 0.0F, -0.0F, 0.4188790321350098F);
	        this.core2 = new ModelPart(this, 5, 12);
	        this.core2.setPivot(0.0F, 5.0F, -2.0F);
	        this.core2.addCuboid(-1.0F, -0.5F, -7.0F, 2, 2, 1, 0.0F);
	        this.bottom = new ModelPart(this, 0, 17);
	        this.bottom.setPivot(0.0F, 7.0F, 3.0F);
	        this.bottom.addCuboid(-1.0F, -1.0F, -5.0F, 2, 1, 9, 0.0F);
	        this.core = new ModelPart(this, 31, 22);
	        this.core.setPivot(0.0F, 5.0F, -2.0F);
	        this.core.addCuboid(-1.0F, -0.5F, -6.0F, 2, 2, 6, 0.0F);
	        this.side5 = new ModelPart(this, 43, 0);
	        this.side5.setPivot(-1.5F, 5.0F, 3.0F);
	        this.side5.addCuboid(0.0F, -1.0F, -5.0F, 1, 1, 9, 0.0F);
	        this.setRotation(side5, 0.0F, -0.0F, 0.4886921942234039F);
	        this.barrellaserthing = new ModelPart(this, 16, 24);
	        this.barrellaserthing.setPivot(0.0F, 2.0F, 5.0F);
	        this.barrellaserthing.addCuboid(0.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F);
	        this.setRotation(barrellaserthing, 0.0F, -0.0F, 0.7853981852531433F);
	        this.holder3 = new ModelPart(this, 0, 0);
	        this.holder3.setPivot(0.0F, 3.0F, 5.0F);
	        this.holder3.addCuboid(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
	        this.setRotation(holder3, 0.5410520434379578F, -0.0F, 0.0F);
	        this.roundel7 = new ModelPart(this, 0, 12);
	        this.roundel7.setPivot(0.0F, 5.0F, -2.0F);
	        this.roundel7.addCuboid(0.6000000238418579F, 0.0F, -7.0F, 1, 1, 1, 0.0F);
	        this.barrel3 = new ModelPart(this, 48, 22);
	        this.barrel3.setPivot(-0.5F, 3.700000047683716F, -4.0F);
	        this.barrel3.addCuboid(-1.0F, 0.0F, -4.0F, 1, 1, 6, 0.0F);
	        this.setRotation(barrel3, 0.0F, -0.0F, -0.4188790321350098F);
	        this.barrel1 = new ModelPart(this, 48, 22);
	        this.barrel1.setPivot(0.0F, 5.0F, -2.0F);
	        this.barrel1.addCuboid(-1.7999999523162842F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
	        this.side3 = new ModelPart(this, 43, 0);
	        this.side3.setPivot(1.5F, 6.0F, 3.0F);
	        this.side3.addCuboid(-1.0F, 0.0F, -5.0F, 1, 1, 9, 0.0F);
	        this.setRotation(side3, 0.0F, -0.0F, 0.4886921942234039F);
	        this.side1 = new ModelPart(this, 43, 11);
	        this.side1.setPivot(0.0F, 7.0F, 3.0F);
	        this.side1.addCuboid(0.5F, -2.0F, -5.0F, 1, 1, 9, 0.0F);
	        this.barrel4 = new ModelPart(this, 48, 22);
	        this.barrel4.setPivot(0.0F, 5.0F, -2.0F);
	        this.barrel4.addCuboid(-0.5F, -1.2999999523162842F, -6.0F, 1, 1, 6, 0.0F);
	        this.barrel6 = new ModelPart(this, 48, 22);
	        this.barrel6.setPivot(1.7999999523162842F, 5.0F, -4.0F);
	        this.barrel6.addCuboid(-1.0F, -1.0F, -4.0F, 1, 1, 6, 0.0F);
	        this.setRotation(barrel6, 0.0F, -0.0F, -0.4188790321350098F);
	        this.barrel12 = new ModelPart(this, 48, 22);
	        this.barrel12.setPivot(-1.7999999523162842F, 6.0F, -4.0F);
	        this.barrel12.addCuboid(0.0F, 0.0F, -4.0F, 1, 1, 6, 0.0F);
	        this.setRotation(barrel12, 0.0F, -0.0F, -0.4188790321350098F);
	        this.Button = new ModelPart(this, 0, 0);
	        this.Button.setPivot(-1.0F, 5.5F, 1.0F);
	        this.Button.addCuboid(-1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
	        this.setRotation(Button, 0.7853981852531433F, -0.0F, 0.0F);
	        this.roundel6 = new ModelPart(this, 0, 12);
	        this.roundel6.setPivot(1.600000023841858F, 5.0F, -8.0F);
	        this.roundel6.addCuboid(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
	        this.setRotation(roundel6, 0.0F, -0.0F, -0.4188790321350098F);
	        this.roundel5 = new ModelPart(this, 0, 12);
	        this.roundel5.setPivot(0.5F, 3.9000000953674316F, -8.0F);
	        this.roundel5.addCuboid(-1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
	        this.setRotation(roundel5, 0.0F, -0.0F, -1.1693706512451172F);
	        this.grip = new ModelPart(this, 3, 28);
	        this.grip.setPivot(0.0F, 7.0F, 3.0F);
	        this.grip.addCuboid(-1.0F, -0.20000000298023224F, -1.0F, 2, 7, 3, 0.0F);
	        this.setRotation(grip, 0.2094395160675048F, -0.0F, 0.0F);
	        this.side2 = new ModelPart(this, 43, 0);
	        this.side2.setPivot(1.5F, 5.0F, 3.0F);
	        this.side2.addCuboid(-1.0F, -1.0F, -5.0F, 1, 1, 9, 0.0F);
	        this.setRotation(side2, 0.0F, -0.0F, -0.4886921942234039F);
	        this.barrel2 = new ModelPart(this, 48, 22);
	        this.barrel2.setPivot(-1.7999999523162842F, 5.0F, -4.0F);
	        this.barrel2.addCuboid(0.0F, -1.0F, -4.0F, 1, 1, 6, 0.0F);
	        this.setRotation(barrel2, 0.0F, -0.0F, 0.4188790321350098F);
	        this.tip3 = new ModelPart(this, 36, 9);
	        this.tip3.setPivot(-1.600000023841858F, 6.0F, -9.0F);
	        this.tip3.addCuboid(0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F);
	        this.setRotation(tip3, 0.0F, -0.40142571926116943F, 0.0F);
	        this.guard2 = new ModelPart(this, 20, 0);
	        this.guard2.setPivot(0.0F, 7.0F, 3.0F);
	        this.guard2.addCuboid(-0.5F, 0.0F, -4.0F, 1, 3, 1, 0.0F);
	        this.guard1 = new ModelPart(this, 20, 5);
	        this.guard1.setPivot(0.0F, 7.0F, 3.0F);
	        this.guard1.addCuboid(-0.5F, 2.0F, -3.0F, 1, 1, 3, 0.0F);
	        this.holder2 = new ModelPart(this, 30, 14);
	        this.holder2.setPivot(0.0F, 2.0F, 5.0F);
	        this.holder2.addCuboid(0.30000001192092896F, 1.0F, -6.0F, 0, 1, 6, 0.0F);
	        this.roundel1 = new ModelPart(this, 0, 12);
	        this.roundel1.setPivot(0.0F, 5.0F, -2.0F);
	        this.roundel1.addCuboid(-1.600000023841858F, 0.0F, -7.0F, 1, 1, 1, 0.0F);
	        this.tip2 = new ModelPart(this, 36, 9);
	        this.tip2.setPivot(1.600000023841858F, 6.0F, -9.0F);
	        this.tip2.addCuboid(-1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F);
	        this.setRotation(tip2, 0.0F, 0.40142571926116943F, 0.0F);
	        this.top = new ModelPart(this, 0, 39);
	        this.top.setPivot(0.0F, 7.0F, 3.0F);
	        this.top.addCuboid(-1.0F, -3.0F, -5.0F, 2, 2, 9, 0.0F);
	        this.roundel12 = new ModelPart(this, 0, 12);
	        this.roundel12.setPivot(-1.600000023841858F, 6.0F, -8.0F);
	        this.roundel12.addCuboid(0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
	        this.setRotation(roundel12, 0.0F, -0.0F, -0.4188790321350098F);
	        this.roundel2 = new ModelPart(this, 0, 12);
	        this.roundel2.setPivot(-1.600000023841858F, 5.0F, -8.0F);
	        this.roundel2.addCuboid(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
	        this.setRotation(roundel2, 0.0F, -0.0F, 0.4188790321350098F);
	        this.barrel7 = new ModelPart(this, 48, 22);
	        this.barrel7.setPivot(0.0F, 5.0F, -2.0F);
	        this.barrel7.addCuboid(0.800000011920929F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
	        this.roundel10 = new ModelPart(this, 0, 12);
	        this.roundel10.setPivot(0.0F, 5.0F, -2.0F);
	        this.roundel10.addCuboid(-0.5F, 1.100000023841858F, -7.0F, 1, 1, 1, 0.0F);
	        this.barrel5 = new ModelPart(this, 48, 22);
	        this.barrel5.setPivot(0.5F, 3.700000047683716F, -4.0F);
	        this.barrel5.addCuboid(-1.0F, 0.0F, -4.0F, 1, 1, 6, 0.0F);
	        this.setRotation(barrel5, 0.0F, -0.0F, -1.1693706512451172F);
	        this.tip1 = new ModelPart(this, 36, 9);
	        this.tip1.setPivot(0.0F, 3.9000000953674316F, -9.0F);
	        this.tip1.addCuboid(-0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
	        this.setRotation(tip1, 0.40142571926116943F, -0.0F, 0.0F);
	        this.light = new ModelPart(this, 12, 12);
	        this.light.setPivot(0.0F, 5.0F, -2.0F);
	        this.light.addCuboid(-1.0F, -0.5F, -8.0F, 2, 2, 1, 0.0F);
	        this.roundel3 = new ModelPart(this, 0, 12);
	        this.roundel3.setPivot(-0.5F, 3.9000000953674316F, -8.0F);
	        this.roundel3.addCuboid(-1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F);
	        this.setRotation(roundel3, 0.0F, -0.0F, -0.4188790321350098F);
	        this.roundel4 = new ModelPart(this, 0, 12);
	        this.roundel4.setPivot(0.0F, 5.0F, -2.0F);
	        this.roundel4.addCuboid(-0.5F, -1.100000023841858F, -7.0F, 1, 1, 1, 0.0F);
	        this.tilt = new ModelPart(this, 36, 0);
	        this.tilt.setPivot(0.0F, 4.0F, 6.0F);
	        this.tilt.addCuboid(-1.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
	        this.setRotation(tilt, 0.17453292012214658F, -0.0F, 0.0F);
	        this.trigger = new ModelPart(this, 25, 0);
	        this.trigger.setPivot(0.0F, 7.0F, 3.0F);
	        this.trigger.addCuboid(-0.5F, 0.20000000298023224F, -1.2999999523162842F, 1, 2, 1, 0.0F);
	        this.setRotation(trigger, -0.5410520434379578F, -0.0F, 0.0F);
	        this.side4 = new ModelPart(this, 43, 11);
	        this.side4.setPivot(0.0F, 7.0F, 3.0F);
	        this.side4.addCuboid(-1.5F, -2.0F, -5.0F, 1, 1, 9, 0.0F);
	        this.holder1 = new ModelPart(this, 30, 14);
	        this.holder1.setPivot(0.0F, 2.0F, 5.0F);
	        this.holder1.addCuboid(-0.30000001192092896F, 1.0F, -6.0F, 0, 1, 6, 0.0F);
	    }

		@Override
		public void render(Entity entityIn, MatrixStack matrices, VertexConsumer vertices, int ammoLeft,
						   float reloadProgress, ModelTransformationMode transformType, int part, float fireProgress, float chargeProgress, int light,
						   int overlay) {
		   this.barrel9.render(matrices, vertices, light, overlay);
	        this.tip4.render(matrices, vertices, light, overlay);
	        this.bottomtilt.render(matrices, vertices, light, overlay);
	        this.side6.render(matrices, vertices, light, overlay);
	        this.barrel10.render(matrices, vertices, light, overlay);
	        this.barrel8.render(matrices, vertices, light, overlay);
	        this.barrel11.render(matrices, vertices, light, overlay);
	        this.roundel11.render(matrices, vertices, light, overlay);
	        this.roundel9.render(matrices, vertices, light, overlay);
	        this.roundel8.render(matrices, vertices, light, overlay);
	        this.core2.render(matrices, vertices, light, overlay);
	        this.bottom.render(matrices, vertices, light, overlay);
	        this.core.render(matrices, vertices, light, overlay);
	        this.side5.render(matrices, vertices, light, overlay);
	        this.barrellaserthing.render(matrices, vertices, light, overlay);
	        this.holder3.render(matrices, vertices, light, overlay);
	        this.roundel7.render(matrices, vertices, light, overlay);
	        this.barrel3.render(matrices, vertices, light, overlay);
	        this.barrel1.render(matrices, vertices, light, overlay);
	        this.side3.render(matrices, vertices, light, overlay);
	        this.side1.render(matrices, vertices, light, overlay);
	        this.barrel4.render(matrices, vertices, light, overlay);
	        this.barrel6.render(matrices, vertices, light, overlay);
	        this.barrel12.render(matrices, vertices, light, overlay);
	        this.Button.render(matrices, vertices, light, overlay);
	        this.roundel6.render(matrices, vertices, light, overlay);
	        this.roundel5.render(matrices, vertices, light, overlay);
	        this.grip.render(matrices, vertices, light, overlay);
	        this.side2.render(matrices, vertices, light, overlay);
	        this.barrel2.render(matrices, vertices, light, overlay);
	        this.tip3.render(matrices, vertices, light, overlay);
	        this.guard2.render(matrices, vertices, light, overlay);
	        this.guard1.render(matrices, vertices, light, overlay);
	        this.holder2.render(matrices, vertices, light, overlay);
	        this.roundel1.render(matrices, vertices, light, overlay);
	        this.tip2.render(matrices, vertices, light, overlay);
	        this.top.render(matrices, vertices, light, overlay);
	        this.roundel12.render(matrices, vertices, light, overlay);
	        this.roundel2.render(matrices, vertices, light, overlay);
	        this.barrel7.render(matrices, vertices, light, overlay);
	        this.roundel10.render(matrices, vertices, light, overlay);
	        this.barrel5.render(matrices, vertices, light, overlay);
	        this.tip1.render(matrices, vertices, light, overlay);
	        this.light.render(matrices, vertices, light, overlay);
	        this.roundel3.render(matrices, vertices, light, overlay);
	        this.roundel4.render(matrices, vertices, light, overlay);
	        this.tilt.render(matrices, vertices, light, overlay);
	        this.trigger.render(matrices, vertices, light, overlay);
	        this.side4.render(matrices, vertices, light, overlay);
	        this.holder1.render(matrices, vertices, light, overlay);
	    }

}
