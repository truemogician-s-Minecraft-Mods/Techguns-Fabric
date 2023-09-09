package techguns.mixin;

import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Camera.class)
public interface CameraAccessor {
	@Accessor
	public float getCameraY();
	
	@Accessor
	public float getLastCameraY();

}
