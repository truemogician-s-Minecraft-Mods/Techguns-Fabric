package techguns.client.render.fx;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Matrix4f;
import techguns.TGIdentifier;
import techguns.client.render.TGRenderHelper;
import techguns.client.render.math.TGMatrixOps;

@Environment(EnvType.CLIENT)
public class ScreenEffect implements IScreenEffect {
	
	protected Identifier fxTexture;
	protected int cols;
	protected int rows;
	protected int numSprites;
	protected RenderType type;
	
	protected float colorR = 1.0f;
	protected float colorG = 1.0f;
	protected float colorB = 1.0f;
	protected float alpha = 1.0f;
	protected FadeType fadeType = FadeType.NONE;
	
	protected boolean flipY=false;
	protected boolean flipX=false;
	
	public ScreenEffect() {};
	
	public ScreenEffect(String fxTexture, int cols,
			int rows, int numSprites, RenderType type) {
		super();
		this.fxTexture = new TGIdentifier(fxTexture);
		this.cols = cols;
		this.rows = rows;
		this.numSprites = numSprites;
		this.type = type;
	}
	
	public IScreenEffect setColor(float R, float G, float B, float A) {
		this.colorR = R;
		this.colorG = G;
		this.colorB = B;
		this.alpha = A;
		return this;
	}
	
	public ScreenEffect setFade(FadeType type) {
		this.fadeType = type;
		return this;
	}
	
	public IScreenEffect setFlipAxis(boolean x, boolean y) {
		this.flipX=x;
		this.flipY=y;
		return this;
	}
	
//	public ScreenEffect setJitter(float jX, float jY, float jAngle, float jScale) {
//		this.jitterX = jX;
//		this.jitterY = jY;
//		this.jitterAngle = jAngle;
//		this.jitterScale = jScale;
//		return this;
//	}
	
//	/* (non-Javadoc)
//	 * @see techguns.client.render.fx.IScreenEffect#doRender(float, float, float, float, float, boolean)
//	 */
//	@Override
//	public void doRender(float progress, float offsetX, float offsetY, float offsetZ, float scale, boolean is3p) {
//		doRender(progress, offsetX, offsetY,offsetZ,scale,0,0,0,is3p);
//	}
	
	/* (non-Javadoc)
	 * @see techguns.client.render.fx.IScreenEffect#doRender(float, float, float, float, float, float, float, float, boolean)
	 */
	@Override
	public void doRender(MatrixStack matrices, VertexConsumerProvider verticesProvider, float progress, float offsetX, float offsetY, float offsetZ, float scale, float rot_x, float rot_y, float rot_z, boolean is3p) {
		int currentFrame = (int)((float)numSprites*progress);
		if (currentFrame < numSprites) {
			int col = currentFrame % cols;
			int row = (currentFrame / cols);
			
			float u = 1.f/cols;
			float v = 1.f/rows;
			
			float U1 = col*u;
			float V1 = row*v;
			float U2 = (col+1)*u;
			float V2 = (row+1)*v;
			
			/*TGRenderHelper.enableBlendMode(type);
			
			MinecraftClient.getInstance().getTextureManager().bindTexture(fxTexture);*/

			TGMatrixOps.rotate(matrices, rot_x, 1.0f, 0, 0);
			TGMatrixOps.rotate(matrices, rot_y, 0, 1.0f, 0);
			TGMatrixOps.rotate(matrices, rot_z, 0, 0, 1.0f);

			
			if (this.flipX) {
				float tmp=U1;
				U1=U2;
				U2=tmp;
			}
			
			if (this.flipY) {
				float tmp=V1;
				V1=V2;
				V2=tmp;
			}
			
			
			//Tessellator tessellator = Tessellator.getInstance();
	        //BufferBuilder buffer = tessellator.getBuffer();
			
			float f = scale/2.0f;
			
//			if (!is3p) { //Local player in 1st person
//				ClientProxy cp = ClientProxy.get();
//				if (this.jitterScale > 0.0f) f = f + jitterScale*cp.muzzleFlashJitterScale;
//				if (this.jitterX > 0.0f) offsetX += jitterX*cp.muzzleFlashJitterX*f;
//				if (this.jitterY > 0.0f) offsetY += jitterY*cp.muzzleFlashJitterY*f;
//				//if (this.jitterAngle > 0.0f) angle += jitterAngle*cp.muzzleFlashJitterAngle*f;
//			}
//			
			float alpha = 0.0f;
			
			switch (fadeType) {
	
			case FAST:
				double d = (1.0-Math.cos(Math.sqrt(progress)*2.0*Math.PI))*0.5;
				alpha = (float) d*this.alpha;
				break;
			case SMOOTH:
				double d2 = Math.sin(Math.PI*progress);
				alpha = (float) (d2*d2)*this.alpha;
				break;
			case NONE:
			default:
				alpha = this.alpha;
				break;
	
			}

			/*if(is3p) {
				RenderSystem.depthMask(false);
				RenderSystem.disableCull();
			}*/
			
			//RenderLayer layer = TGRenderHelper.get_muzzleflash_renderlayer(fxTexture, alpha);
			//VertexConsumer vertices = verticesProvider.getBuffer(layer);

			//VertexConsumer vertices = verticesProvider.getBuffer(TGRenderHelper.get_fx_renderlayer(fxTexture));
			VertexConsumer vertices = verticesProvider.getBuffer(TGRenderHelper.get_fx_renderlayer(fxTexture));
			
			
			Matrix4f modelMat = matrices.peek().getModel();
			
			vertices.vertex(modelMat, offsetX-f, offsetY+f, offsetZ).texture(U1,V2).color(colorR, colorG, colorB, alpha).next();
	        vertices.vertex(modelMat, offsetX-f, offsetY-f, offsetZ).texture(U1,V1).color(colorR, colorG, colorB, alpha).next();
	        vertices.vertex(modelMat, offsetX+f, offsetY-f, offsetZ).texture(U2,V1).color(colorR, colorG, colorB, alpha).next();
	        vertices.vertex(modelMat, offsetX+f, offsetY+f, offsetZ).texture(U2,V2).color(colorR, colorG, colorB, alpha).next();
			
	        //layer.draw((BufferBuilder) vertices, 0, 0, 0);
	        
			//Jitter
			//ClientProxy cp = ClientProxy.
			//offsetX += jitterX;

	       /*buffer.begin(7, VertexFormats.POSITION_TEXTURE_COLOR);
	        
	        buffer.vertex(modelMat, offsetX-f, offsetY+f, offsetZ).texture(U1,V2).color(colorR, colorG, colorB, alpha).next();
	        buffer.vertex(modelMat, offsetX-f, offsetY-f, offsetZ).texture(U1,V1).color(colorR, colorG, colorB, alpha).next();
	        buffer.vertex(modelMat, offsetX+f, offsetY-f, offsetZ).texture(U2,V1).color(colorR, colorG, colorB, alpha).next();
	        buffer.vertex(modelMat, offsetX+f, offsetY+f, offsetZ).texture(U2,V2).color(colorR, colorG, colorB, alpha).next();
	        */
	        if (is3p) {
	        	
	        	vertices.vertex(modelMat, offsetX-f, offsetY, offsetZ+f).texture(U1,V2).color(colorR, colorG, colorB, alpha).next();
	        	vertices.vertex(modelMat, offsetX-f, offsetY, offsetZ-f).texture(U1,V1).color(colorR, colorG, colorB, alpha).next();
	        	vertices.vertex(modelMat, offsetX+f, offsetY, offsetZ-f).texture(U2,V1).color(colorR, colorG, colorB, alpha).next();
	        	vertices.vertex(modelMat, offsetX+f, offsetY, offsetZ+f).texture(U2,V2).color(colorR, colorG, colorB, alpha).next();
	 	        
	        	vertices.vertex(modelMat, offsetX, offsetY-f, offsetZ+f).texture(U1,V2).color(colorR, colorG, colorB, alpha).next();
	        	vertices.vertex(modelMat, offsetX, offsetY-f, offsetZ-f).texture(U1,V1).color(colorR, colorG, colorB, alpha).next();
	        	vertices.vertex(modelMat, offsetX, offsetY+f, offsetZ-f).texture(U2,V1).color(colorR, colorG, colorB, alpha).next();
	        	vertices.vertex(modelMat, offsetX, offsetY+f, offsetZ+f).texture(U2,V2).color(colorR, colorG, colorB, alpha).next();
	        }
	        
	        /*
	        tessellator.draw();

	        if(is3p) {
	        	RenderSystem.enableCull();
	        	RenderSystem.depthMask(true);
	        }
           TGRenderHelper.disableFXLighting();
	       TGRenderHelper.disableBlendMode(type);*/
	        
		}
	}
	

}