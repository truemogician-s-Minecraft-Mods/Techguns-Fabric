package techguns.client.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.options.GameOptions;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import techguns.TGIdentifier;
import techguns.api.entity.ITGExtendedPlayer;
import techguns.api.guns.GunManager;
import techguns.items.guns.GenericGun;
import techguns.mixin.InGameHudMixin;

@Environment(EnvType.CLIENT)
public class TGGuiRender {

	public static final Identifier TECHGUNS_PLAYER_INVENTORY_TEXTURE = new TGIdentifier("textures/gui/tgplayerinventory.png");
	public static final Identifier TECHGUNS_CROSSHAIRS_TEXTURE = new TGIdentifier("textures/gui/crosshairs.png");
	
	@Environment(EnvType.CLIENT)
	public static void renderTechgunsHUD(DrawableHelper gui, MatrixStack matrices, MinecraftClient mc, int scaledWidth, int scaledHeight) {
		
		PlayerEntity ply = mc.player;
		
		GameOptions gameOptions = mc.options;

	   if (gameOptions.hudHidden || ply == null) return;
		
		
		ITGExtendedPlayer props = (ITGExtendedPlayer)ply;
		ItemStack item = ply.getMainHandStack();
		ItemStack item_off =ply.getOffHandStack();
				
		int offsetY = scaledHeight-32;
		
		boolean showSafemode=false;
		
		if(!item.isEmpty() && item.getItem() instanceof GenericGun){
			GenericGun gun = ((GenericGun) item.getItem());
						
			drawGunAmmoCount(matrices, mc, scaledWidth, scaledHeight, gun, item, ply, props, 0);
			showSafemode=true;
		}

		if(!item_off.isEmpty() && item_off.getItem() instanceof GenericGun){
			if (GunManager.canUseOffhand(item,item_off,ply)) {
				GenericGun gun = ((GenericGun) item_off.getItem());
				drawGunAmmoCount(matrices, mc, scaledWidth, scaledHeight, gun, item_off, ply, props, -12);
				showSafemode=true;
			}
		}
		
		if(props!=null && props.showTGHudElements() && showSafemode){

	//		mc.getTextureManager().bindTexture(TGPlayerInventoryGui.texture);
	//		this.drawTexturedModalRect(scaledWidth-10, offsetY, 242+7*(props.hasEnabledSafemode()?1:0), 14, 7,7);
			mc.getTextureManager().bindTexture(TECHGUNS_PLAYER_INVENTORY_TEXTURE);
			gui.drawTexture(matrices, scaledWidth-10, offsetY, 242+7*(props.hasEnabledSafemode()?1:0), 14, 7,7);

		}
		
		/*if(props!=null && props.showTGHudElements()){
			offsetY -=10;
		
			mc.getTextureManager().bindTexture(TGPlayerInventoryGui.texture);
		
			//draw power icon
			ItemStack chest =ply.inventory.armorInventory.get(2);
			if(chest!=null && chest.getItem() instanceof PoweredArmor){
				this.drawTexturedModalRect(sr.getScaledWidth()-10, offsetY, 249, 35, 7,7);
				
				PoweredArmor pwrchest = (PoweredArmor) chest.getItem();
				double percent = (pwrchest.getPower(chest)*1.0D) / (pwrchest.maxpower*1.0D);
				
				ItemStack ammoitem  = pwrchest.getBattery();
				int count = InventoryUtil.countItemInInv(ply.inventory.mainInventory, ammoitem, 0, ply.inventory.mainInventory.size());
				count += InventoryUtil.countItemInInv(props.tg_inventory.inventory, ammoitem, TGPlayerInventory.SLOTS_AMMO_START, TGPlayerInventory.SLOTS_AMMO_END+1);
				
				String text = ChatFormatting.YELLOW+""+count+"x"+ChatFormatting.WHITE+(int)(percent*100)+"%";
				mc.fontRenderer.drawString(text, sr.getScaledWidth()-2-text.length()*6-8+24, offsetY, 0xFFFFFFFF);
				//mc.fontRenderer.drawString(text2, sr.getScaledWidth()-2-(text.length()+text2.length())*6-8, offsetY, 0xFFFFFFFF);
				offsetY-=10;
				
			}
			
			ItemStack backslot = props.tg_inventory.inventory.get(props.tg_inventory.SLOT_BACK);
			if (backslot !=null){
				
				//TODO: unhardcode this
				if (backslot.getItem() == TGItems.JETPACK || backslot.getItem() == TGItems.JUMPPACK || backslot.getItem() == TGItems.ANTI_GRAV_PACK){

					int x = 242;
					if (props.enableJetpack){
						x+=7;
					}
					//bind again because string drawing fucks it up
					mc.getTextureManager().bindTexture(TGPlayerInventoryGui.texture);
					this.drawTexturedModalRect(sr.getScaledWidth()-10, offsetY, x, 42, 7,7);
			
					double percent = 1.0D-(backslot.getItemDamage()*1.0f) / (backslot.getMaxDamage()*1.0f);
					
					ItemStack ammoitem  = ((ItemTGSpecialSlotAmmo)backslot.getItem()).getAmmo();
					int count = InventoryUtil.countItemInInv(ply.inventory.mainInventory, ammoitem, 0, ply.inventory.mainInventory.size());
					count += InventoryUtil.countItemInInv(props.tg_inventory.inventory, ammoitem, TGPlayerInventory.SLOTS_AMMO_START, TGPlayerInventory.SLOTS_AMMO_END+1);
					
					String text = ChatFormatting.YELLOW+""+count+"x"+ChatFormatting.WHITE+(int)(percent*100)+"%";
				
					//String text= ""+(int)(percent*100)+"%";
					mc.fontRenderer.drawString(text, sr.getScaledWidth()-2-text.length()*6-8+24, offsetY, 0xFFFFFFFF);
					
					offsetY-=10;
					
				}
				
			}
			
			//needs rebind after string drawing
			mc.getTextureManager().bindTexture(TGPlayerInventoryGui.texture);
			if(Techguns.proxy.getHasNightvision()){
				this.drawTexturedModalRect(sr.getScaledWidth()-10, offsetY, 242+7*(props.enableNightVision?1:0), 7, 7,7);
				offsetY-=10;
			}
			if(Techguns.proxy.getHasStepassist()){
				this.drawTexturedModalRect(sr.getScaledWidth()-10, offsetY, 242+7*(props.enableStepAssist?1:0), 21, 7,7);
				offsetY-=10;
			}
			
			//Check armor durability
			byte mode=0;
			for(int i=0;i<4;i++){
				ItemStack armor=ply.inventory.armorInventory.get(i);
				if(!armor.isEmpty()){
					double dur = ((armor.getMaxDamage()-armor.getItemDamage())*1.0D)/(armor.getMaxDamage()*1.0D);
					if (dur<0.35D && mode<1){
						mode=1;
					} else if(armor.getItemDamage()>=(armor.getMaxDamage()-1)){
						mode=2;
						break;
					}
				}
				
			}
			if(mode==2){
				this.drawTexturedModalRect(sr.getScaledWidth()-10, offsetY, 242+7, 28, 7,7);
				offsetY-=10;
			} else if (mode==1){
				this.drawTexturedModalRect(sr.getScaledWidth()-10, offsetY, 242, 28, 7,7);
				offsetY-=10;
			}
			
			if(props.radlevel>0) {
				
				
				String prefix = ChatFormatting.WHITE.toString();
				if(props.radlevel>=1000) {
					prefix = ChatFormatting.RED.toString();
				} else if ( props.radlevel >= 750) {
					prefix = ChatFormatting.GOLD.toString();
				} else if (props.radlevel >= 500 ) {
					prefix = ChatFormatting.YELLOW.toString();
				}
				String radtext = props.radlevel+ " RAD";
				mc.fontRenderer.drawString(prefix+radtext, sr.getScaledWidth()-radtext.length()*6, offsetY, 0xFFFFFFFF);
				
				offsetY-=10;
				
				String currentRadText="";
				PotionEffect currentRad = ply.getActivePotionEffect(TGRadiationSystem.radiation_effect);
				if(currentRad!=null) {
					int res = (int) ply.getEntityAttribute(TGRadiation.RADIATION_RESISTANCE).getAttributeValue();
					
					int amount = techguns.util.MathUtil.clamp(currentRad.getAmplifier()+1-res, 0, 1000);
					
					currentRadText= "+["+amount+" RAD/s]";
					mc.fontRenderer.drawString(currentRadText, sr.getScaledWidth()-currentRadText.length()*6 + 4, offsetY, 0xFFFFFFFF);
					
					offsetY-=10;
				}
			}
			
		}*/
		
		//Bind back the correct texture for default crosshair rendering
		mc.getTextureManager().bindTexture(DrawableHelper.GUI_ICONS_TEXTURE);
	}
	
	private static void drawGunAmmoCount(MatrixStack matrices, MinecraftClient mc,int scaledWidth, int scaledHeight, GenericGun gun, ItemStack item, PlayerEntity ply, ITGExtendedPlayer props, int offsetY) {
		ItemStack[] ammoitem  = gun.getReloadItem(item);
		int minCount = 0;
		for(ItemStack stack: ammoitem) {
			int c = 0; //getAmmoCountOfStack(stack, gun, ply, props); //TODO TG inventory
			if (c>minCount) {
				minCount = c;
			}
		}
		
		String text= gun.getAmmoLeftCountTooltip(item)+"/"+gun.getClipsizeTooltip() +Formatting.YELLOW+"x" +minCount;
		mc.textRenderer.draw(matrices, text, scaledWidth+1-text.length()*6,scaledHeight-mc.textRenderer.fontHeight-2+offsetY , 0xFFFFFFFF);
	}

	@Environment(EnvType.CLIENT)
	public static boolean renderCrosshair(DrawableHelper gui, MatrixStack matrices, MinecraftClient mc,
			int scaledWidth, int scaledHeight) {

		boolean showCustomCrosshair = false;
		
		PlayerEntity player = mc.player;
		
		
		//GuidedMissileLauncher Lock on Effects
		if (player.getMainHandStack().getItem() instanceof GenericGun) {
			
			/*
			 * Render Lock on GUI effect
			 */
			ITGExtendedPlayer epc = (ITGExtendedPlayer)player;
			
			int x = scaledWidth / 2;
			int y = scaledHeight / 2;
			
			//GenericGun gun = (GenericGun)player.getActiveItemStack().getItem();
			GenericGun gun = (GenericGun)player.getMainHandStack().getItem();
			if (gun.getLockOnTicks() > 0 && epc.getLockOnEntity() != null && epc.getLockOnTicks() > 0) {
				float maxTicks = (float)gun.getLockOnTicks(); //TODO: Store in capabilities
				float progress = (float)epc.getLockOnTicks()/maxTicks;
				
				mc.getTextureManager().bindTexture(TECHGUNS_CROSSHAIRS_TEXTURE);
				
				//GlStateManager.disableBlend();
				

				
				int offset = (int)(Math.max(0.0f, (1.0f-progress)*16.0f))+5;
				//Outer parts
				
				gui.drawTexture(matrices, x-offset-3, y-offset-3, 0, 0, 7,7);
				gui.drawTexture(matrices, x+offset-3, y-offset-3, 7, 0, 7,7);
				gui.drawTexture(matrices, x-offset-3, y+offset-3, 14, 0, 7,7);
				gui.drawTexture(matrices, x+offset-3, y+offset-3, 21, 0, 7,7);
				
				if (progress < 1.0f) {
					String text = "Locking... : "+ epc.getLockOnEntity().getName().getString();
					mc.textRenderer.draw(matrices, text, (int)(scaledWidth*0.5)+2, (int)(scaledHeight*0.5)+10, 0xFFFFFFFF);
				}else {

					gui.drawTexture(matrices, x-6, y-6, 28, 0, 13,13);
					//if (Minecraft.getMinecraft().getSystemTime() / 250 % 2 == 0) {
					if (System.currentTimeMillis() / 250 % 2 == 0) {
						gui.drawTexture(matrices, x-9, y-9, 41, 0, 19,19);
					}
					
						
					String text = "Locked On: "+epc.getLockOnEntity().getName().getString();
					mc.textRenderer.draw(matrices, text, (int)(scaledWidth*0.5)+2, (int)(scaledHeight*0.5)+10, 0xFFFF0000);
				}
				
				//Restore settings
				//GlStateManager.enableBlend();

				showCustomCrosshair = true;
			}
			//TODO Regular TG crosshairs
		
		}
		return showCustomCrosshair;
	}
	
	//TODO techguns inventory
	/*private int getAmmoCountOfStack(ItemStack ammoitem, GenericGun gun, EntityPlayer ply, TGExtendedPlayer props) {
		int count = InventoryUtil.countItemInInv(ply.inventory.mainInventory, ammoitem, 0, ply.inventory.mainInventory.size());
		count += InventoryUtil.countItemInInv(props.tg_inventory.inventory, ammoitem, TGPlayerInventory.SLOTS_AMMO_START, TGPlayerInventory.SLOTS_AMMO_END+1);
		
		if (gun.getAmmoCount()>1){
			count = count / gun.getAmmoCount();
		} 
		return count;
	}*/
}
