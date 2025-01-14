package techguns.client.render;

import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.render.*;
import net.minecraft.util.Util;
import org.lwjgl.opengl.GL11;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.LightType;
import techguns.client.render.fx.IScreenEffect.RenderType;
import techguns.mixin.LightmapTextureManagerAccessor;

import java.util.function.Function;

/**
 * The inheritance is dummy, to get access to all the protected static fields
 */
@Environment(EnvType.CLIENT)
public class TGRenderHelper extends RenderPhase {
	//Never instantiated, pure static
	private TGRenderHelper() {
		super(null, null, null);
	}
	
	public static final int BRIGHT_LIGHT = 15728880;

	public static net.minecraft.client.gl.ShaderProgram particleShader = null;
	public static net.minecraft.client.gl.ShaderProgram getParticleShader(){
		return particleShader;
	};
	public static final RenderPhase.ShaderProgram TG_PARTICLE_SHADER = new net.minecraft.client.render.RenderPhase.ShaderProgram(TGRenderHelper::getParticleShader);

	protected static float lastBrightnessX=0;
	protected static float lastBrightnessY=0;
	
	protected static int lastBlendFuncSrc=0;
	protected static int lastBlendFuncDest=0;

	/*protected static final RenderPhase.Transparency LIGHTNING_TRANSPARENCY = new RenderPhase.Transparency("techguns_lightning_transparency", () -> {
	      RenderSystem.enableBlend();
	      RenderSystem.blendFunc(GlStateManager.SrcFactor.SRC_ALPHA, GlStateManager.DstFactor.ONE);
	   }, () -> {
	      RenderSystem.disableBlend();
	      RenderSystem.defaultBlendFunc();
	   });
	
   protected static final RenderPhase.Transparency TRANSLUCENT_TRANSPARENCY = new RenderPhase.Transparency("techguns_translucent_transparency", () -> {
	      RenderSystem.enableBlend();
	      RenderSystem.blendFuncSeparate(GlStateManager.SrcFactor.SRC_ALPHA, GlStateManager.DstFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SrcFactor.ONE, GlStateManager.DstFactor.ONE_MINUS_SRC_ALPHA);
	   }, () -> {
	      RenderSystem.disableBlend();
	      RenderSystem.defaultBlendFunc();
	   });*/

	/*protected static final RenderPhase.Target PARTICLES_TARGET = new RenderPhase.Target("tg_particles_target", () -> {
        if (MinecraftClient.isFabulousGraphicsOrBetter()) {
           MinecraftClient mc = MinecraftClient.getInstance();
           mc.worldRenderer.getParticlesFramebuffer().beginWrite(false);
        }

     }, () -> {
        if (MinecraftClient.isFabulousGraphicsOrBetter()) {
           MinecraftClient.getInstance().getFramebuffer().beginWrite(false);
        }

     });*/
	/*protected static final RenderPhase.WriteMaskState ALL_MASK = new RenderPhase.WriteMaskState(true, true);
	protected static final RenderPhase.WriteMaskState COLOR_MASK = new RenderPhase.WriteMaskState(true, false);
	protected static final RenderPhase.ShadeModel SMOOTH_SHADE_MODEL = new RenderPhase.ShadeModel(true);
	
	protected static final RenderPhase.Cull DISABLE_CULLING = new RenderPhase.Cull(false);*/
	
	public static RenderLayer get_fx_renderlayer(Identifier texture) {
		//return RenderLayer.of("techguns_fx", VertexFormats.POSITION_TEXTURE_COLOR_LIGHT, VertexFormat.DrawMode.QUADS, 256, false, true, RenderLayer.MultiPhaseParameters.builder().texture(new RenderPhase.Texture(texture, false, false)).writeMaskState(COLOR_MASK).transparency(LIGHTNING_TRANSPARENCY).target(PARTICLES_TARGET).shader(RenderPhase.POSITION_COLOR_TEXTURE_LIGHTMAP_SHADER).cull(DISABLE_CULLING).build(false));
		return TG_RENDERLAYER_FX_ADDITIVE.apply(texture);
	}
	
	//public static RenderLayer get_fx_renderlayer_additive(Identifier texture) {
	//	return RenderLayer.of("techguns_fx_additive", VertexFormats.POSITION_TEXTURE_COLOR_LIGHT, VertexFormat.DrawMode.QUADS, 256, false, true, RenderLayer.MultiPhaseParameters.builder().texture(new RenderPhase.Texture(texture, false, false)).writeMaskState(COLOR_MASK).transparency(LIGHTNING_TRANSPARENCY)/*.lightmap(ENABLE_LIGHTMAP)*/.target(WEATHER_TARGET).shader(RenderPhase.POSITION_COLOR_TEXTURE_LIGHTMAP_SHADER).cull(DISABLE_CULLING).build(false));
	//}
	
	public static RenderLayer get_fx_renderlayer_alpha(Identifier texture) {
	//	return RenderLayer.of("techguns_fx_alpha", VertexFormats.POSITION_TEXTURE_COLOR_LIGHT, VertexFormat.DrawMode.QUADS, 256, false, true, RenderLayer.MultiPhaseParameters.builder().texture(new RenderPhase.Texture(texture, false, false)).writeMaskState(COLOR_MASK).transparency(TRANSLUCENT_TRANSPARENCY)/*.lightmap(ENABLE_LIGHTMAP)*/.target(WEATHER_TARGET).shader(RenderPhase.POSITION_COLOR_TEXTURE_LIGHTMAP_SHADER).cull(DISABLE_CULLING).build(false));
		return TG_RENDERLAYER_FX_ALPHA.apply(texture);
	}

	//public static RenderLayer get_scope_renderlayer(Identifier texture) {
	//	return RenderLayer.of("techguns_scope", VertexFormats.POSITION_TEXTURE_COLOR_LIGHT, VertexFormat.DrawMode.QUADS, 256, false, true, RenderLayer.MultiPhaseParameters.builder().texture(new RenderPhase.Texture(texture, false, false)).transparency(TRANSLUCENT_TRANSPARENCY).target(MAIN_TARGET).build(false));
	//}
	
	public static RenderLayer get_fx_particlelayer(Identifier texture) {
		//return RenderLayer.of("techguns_particle", VertexFormats.POSITION_COLOR_TEXTURE_LIGHT, VertexFormat.DrawMode.QUADS, 256, false, true, RenderLayer.MultiPhaseParameters.builder().texture(new RenderPhase.Texture(texture, false, false)).writeMaskState(COLOR_MASK).transparency(LIGHTNING_TRANSPARENCY).target(PARTICLES_TARGET).shader(RenderPhase.POSITION_COLOR_TEXTURE_LIGHTMAP_SHADER).cull(DISABLE_CULLING).build(false));
		return TG_RENDERLAYER_PARTICLE.apply(texture);
	}
	
    public static RenderLayer getProjectileCutout(Identifier texture) {
	      RenderLayer.MultiPhaseParameters multiPhaseParameters = RenderLayer.MultiPhaseParameters.builder().texture(new RenderPhase.Texture(texture, false, false))/*todo 1.17: .alpha(HALF_ALPHA).diffuseLighting(ENABLE_DIFFUSE_LIGHTING) */.lightmap(ENABLE_LIGHTMAP).program(RenderPhase.POSITION_COLOR_TEXTURE_LIGHTMAP_PROGRAM).build(true);
	      return RenderLayer.of("techguns_projectile_cutout", VertexFormats.POSITION_COLOR_TEXTURE_LIGHT, VertexFormat.DrawMode.QUADS, 256, true, false, multiPhaseParameters);
	}

	public static RenderLayer getProjectileAdditive(Identifier texture) {
		return TG_RENDERLAYER_PROJECTILE_ADDITIVE.apply(texture);
	}

	public static final Transparency TGFX_ADDITIVE_TRANSPARENCY = new Transparency("tgfx_additive_transparency", () -> {
		RenderSystem.enableBlend();
		//RenderSystem.blendFuncSeparate(GlStateManager.SrcFactor.SRC_ALPHA, GlStateManager.DstFactor.ONE, GlStateManager.SrcFactor.SRC_ALPHA, GlStateManager.DstFactor.ONE_MINUS_SRC_ALPHA);
		RenderSystem.blendFunc(GlStateManager.SrcFactor.SRC_ALPHA, GlStateManager.DstFactor.ONE);
	}, () -> {
		RenderSystem.disableBlend();
		RenderSystem.defaultBlendFunc();
	});

	public static Function<Identifier, RenderLayer> TG_RENDERLAYER_SCOPE = Util.memoize((texture) -> {
		RenderLayer.MultiPhaseParameters multiPhaseParameters = RenderLayer.MultiPhaseParameters.builder().program(RenderPhase.POSITION_COLOR_TEXTURE_LIGHTMAP_PROGRAM).texture(new RenderPhase.Texture(texture, false, false)).transparency(TRANSLUCENT_TRANSPARENCY).target(MAIN_TARGET).lightmap(ENABLE_LIGHTMAP).writeMaskState(RenderPhase.COLOR_MASK).depthTest(ALWAYS_DEPTH_TEST).build(false);
		return RenderLayer.of("techguns_scope", VertexFormats.POSITION_COLOR_TEXTURE_LIGHT, VertexFormat.DrawMode.QUADS, 256, false, true, multiPhaseParameters);
	});

	public static Function<Identifier, RenderLayer> TG_RENDERLAYER_PROJECTILE_ADDITIVE = Util.memoize((texture) -> {
		RenderLayer.MultiPhaseParameters multiPhaseParameters = RenderLayer.MultiPhaseParameters.builder().program(RenderPhase.POSITION_COLOR_TEXTURE_LIGHTMAP_PROGRAM).texture(new RenderPhase.Texture(texture, false, false)).transparency(ADDITIVE_TRANSPARENCY).target(PARTICLES_TARGET).lightmap(ENABLE_LIGHTMAP).writeMaskState(RenderPhase.ALL_MASK).cull(DISABLE_CULLING).build(true);
		return RenderLayer.of("techguns_projectile_additive", VertexFormats.POSITION_COLOR_TEXTURE_LIGHT, VertexFormat.DrawMode.QUADS, 256, false, true, multiPhaseParameters);
	});

	public static Function<Identifier, RenderLayer> TG_RENDERLAYER_FX_ALPHA = Util.memoize((texture) -> {
		RenderLayer.MultiPhaseParameters multiPhaseParameters = RenderLayer.MultiPhaseParameters.builder().program(RenderPhase.POSITION_COLOR_TEXTURE_LIGHTMAP_PROGRAM).texture(new RenderPhase.Texture(texture, true, true)).transparency(TRANSLUCENT_TRANSPARENCY).target(WEATHER_TARGET).lightmap(ENABLE_LIGHTMAP).writeMaskState(RenderPhase.COLOR_MASK).cull(DISABLE_CULLING).build(false);
		return RenderLayer.of("techguns_fx_alpha", VertexFormats.POSITION_COLOR_TEXTURE_LIGHT, VertexFormat.DrawMode.QUADS, 256, false, true, multiPhaseParameters);
	});

	public static Function<Identifier, RenderLayer> TG_RENDERLAYER_FX_ADDITIVE = Util.memoize((texture) -> {
		RenderLayer.MultiPhaseParameters multiPhaseParameters = RenderLayer.MultiPhaseParameters.builder().program(TG_PARTICLE_SHADER).texture(new RenderPhase.Texture(texture, true, true)).transparency(TGFX_ADDITIVE_TRANSPARENCY).target(PARTICLES_TARGET).lightmap(ENABLE_LIGHTMAP).writeMaskState(RenderPhase.COLOR_MASK).cull(DISABLE_CULLING).build(false);
		return RenderLayer.of("techguns_fx_additive", VertexFormats.POSITION_COLOR_TEXTURE_LIGHT, VertexFormat.DrawMode.QUADS, 256, false, true, multiPhaseParameters);
	});

	public static Function<Identifier, RenderLayer> TG_RENDERLAYER_PARTICLE = Util.memoize((texture) -> {
		RenderLayer.MultiPhaseParameters multiPhaseParameters = RenderLayer.MultiPhaseParameters.builder().program(RenderPhase.POSITION_COLOR_TEXTURE_LIGHTMAP_PROGRAM).texture(new RenderPhase.Texture(texture, false, false)).transparency(LIGHTNING_TRANSPARENCY).target(PARTICLES_TARGET).lightmap(ENABLE_LIGHTMAP).writeMaskState(RenderPhase.COLOR_MASK).cull(DISABLE_CULLING).build(false);
		return RenderLayer.of("techguns_particle", VertexFormats.POSITION_COLOR_TEXTURE_LIGHT, VertexFormat.DrawMode.QUADS, 256, false, true, multiPhaseParameters);
	});


	public static RenderLayer get_fx_layerForType(Identifier texture, RenderType type) {
		switch (type) {
		case SCOPE:
			return TG_RENDERLAYER_SCOPE.apply(texture);
		case ALPHA:
		case ALPHA_SHADED:
			return TG_RENDERLAYER_FX_ALPHA.apply(texture);
		case ADDITIVE:
			return TG_RENDERLAYER_FX_ADDITIVE.apply(texture);
		case NO_Z_TEST:
		case SOLID:	
		default:
			return TG_RENDERLAYER_FX_ALPHA.apply(texture);
		}
	};
	
	//TODO OpenGLHelper
	public static void enableFXLighting()
    {
    	//lastBrightnessX= OpenGlHelper.lastBrightnessX;
		//lastBrightnessY= OpenGlHelper.lastBrightnessY;

		//FIXME 1.17 GlStateManager.disableLighting();
		//OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
    }
	
    public static void disableFXLighting()
    {
    	// FIXME 1.17 GlStateManager.enableLighting();
    	//OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lastBrightnessX, lastBrightnessY);
    }
    
    /*public static void enableFluidGlow(int luminosity) {
    	lastBrightnessX= OpenGlHelper.lastBrightnessX;
		lastBrightnessY= OpenGlHelper.lastBrightnessY;
		
		float newLightX = Math.min((luminosity/15.0f)*240.0f + lastBrightnessX, 240.0f);
		float newLightY = Math.min((luminosity/15.0f)*240.0f + lastBrightnessY, 240.0f);
		
    	OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, newLightX, newLightY);
    }
    
    public static void disableFluidGlow() {
    	OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lastBrightnessX, lastBrightnessY);
    }*/
	
    /**
     * This includes FXLighting!
     */
    public static void enableBlendMode(RenderType type) {
    	if (type != RenderType.SOLID) {
    		RenderSystem.enableBlend();
    	}
        if (type == RenderType.ALPHA) {
        	lastBlendFuncSrc = GlStateManager._getInteger(GL11.GL_BLEND_SRC);
			lastBlendFuncDest = GlStateManager._getInteger(GL11.GL_BLEND_DST);
			RenderSystem.blendFunc(GlStateManager.SrcFactor.SRC_ALPHA, GlStateManager.DstFactor.ONE_MINUS_SRC_ALPHA);
        	
        } else if (type == RenderType.ADDITIVE || type==RenderType.NO_Z_TEST) {
        	lastBlendFuncSrc = GlStateManager._getInteger(GL11.GL_BLEND_SRC);
			lastBlendFuncDest = GlStateManager._getInteger(GL11.GL_BLEND_DST);
			RenderSystem.blendFunc(GlStateManager.SrcFactor.SRC_ALPHA, GlStateManager.DstFactor.ONE);
        }      
        if (type==RenderType.NO_Z_TEST){
        	RenderSystem.depthMask(false);
        	RenderSystem.disableDepthTest();
        }
        
        if (type != RenderType.ALPHA_SHADED) TGRenderHelper.enableFXLighting();
	}
	
    /**
     * This includes FXLighting!
     */
	public static void disableBlendMode(RenderType type) {
		if (type != RenderType.ALPHA_SHADED) TGRenderHelper.disableFXLighting();
		if (type != RenderType.SOLID) {
			RenderSystem.disableBlend();
    	}
		if (type == RenderType.ALPHA || type == RenderType.ADDITIVE || type==RenderType.NO_Z_TEST) {
			//GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.blendFunc(lastBlendFuncSrc, lastBlendFuncDest);
        }
        if (type==RenderType.NO_Z_TEST){
        	RenderSystem.depthMask(true);
        	RenderSystem.enableDepthTest();
        }

	}
	
	@Deprecated
	public static int getLightAtPosForBrightness(Vec3d pos, float brightness) {
		BlockPos blockPos = new BlockPos(pos);
	      
		int lightLevel = MinecraftClient.getInstance().world.getLightLevel(LightType.SKY, blockPos);
		int blockLight = MinecraftClient.getInstance().world.getLightLevel(LightType.BLOCK, blockPos);
		
		lightLevel = Math.round(((brightness * 240.0f) + (1f-brightness) * (float)lightLevel));
		blockLight = Math.round(((brightness * 255.0f) + (1f-brightness) * (float)blockLight));
		
		return LightmapTextureManager.pack(blockLight, lightLevel);
	}
	
	public static int getLightAtPos(Vec3d pos) {
		BlockPos blockPos = new BlockPos(pos);

		int blockLight = MinecraftClient.getInstance().world.getLightLevel(LightType.BLOCK, blockPos);
		int lightLevel = MinecraftClient.getInstance().world.getLightLevel(LightType.SKY, blockPos);

		return LightmapTextureManager.pack(blockLight, lightLevel);
	}
	
	
	public static float getBrightnessAtPos(Vec3d pos) {
		BlockPos blockPos = new BlockPos(pos);

		int blockLight = MinecraftClient.getInstance().world.getLightLevel(LightType.BLOCK, blockPos);
		int skyLight = MinecraftClient.getInstance().world.getLightLevel(LightType.SKY, blockPos);

		
		LightmapTextureManagerAccessor lm = (LightmapTextureManagerAccessor)(MinecraftClient.getInstance().gameRenderer.getLightmapTextureManager());
		int col = lm.getImage().getColor(blockLight, skyLight);
		int r = NativeImage.getRed(col);

		return Math.max(Math.min(((float)r)/255.0f, 1.0f), 0.0f);
		
		//return Math.max(Math.min((((float)skyLight)/15.0f + ((float)blockLight)/16.0f) * 0.5f, 1.0f), 0.0f);
	}
	
	public static Vec3d getLightColorAtPos(Vec3d pos) {
		BlockPos blockPos = new BlockPos(pos);

		int blockLight = MinecraftClient.getInstance().world.getLightLevel(LightType.BLOCK, blockPos);
		int skyLight = MinecraftClient.getInstance().world.getLightLevel(LightType.SKY, blockPos);
		
		LightmapTextureManagerAccessor lm = (LightmapTextureManagerAccessor)(MinecraftClient.getInstance().gameRenderer.getLightmapTextureManager());
		int col = lm.getImage().getColor(blockLight, skyLight);

		double r = Math.max(Math.min(((double)NativeImage.getRed(col))/255.0, 1.0), 0.0);
		double g = Math.max(Math.min(((double)NativeImage.getGreen(col))/255.0, 1.0), 0.0);
		double b = Math.max(Math.min(((double)NativeImage.getBlue(col))/255.0, 1.0), 0.0);
		
		return new Vec3d(r, g, b);
	}
	
}
