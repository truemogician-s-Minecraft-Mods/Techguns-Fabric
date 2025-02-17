package techguns;

import java.util.*;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import org.jetbrains.annotations.Nullable;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import techguns.api.ICamoChangeable;

public class TGCamos implements ITGInitializer {

	protected static HashMap<Item, CamoList> weapon_camos = new HashMap<>();
	
	public static final Identifier DEFAULT = new TGIdentifier("default");

	public static final ItemGroup CAMO_ITEM_GROUP = FabricItemGroup.builder(new TGIdentifier("camo_items"))
			.icon(() -> new ItemStack(TGBlocks.CAMO_BENCH)).build();

	@Override
	public void init() {
		registerCamo(TGuns.M4, DEFAULT, new TGIdentifier("textures/guns/m4texture.png"));
		registerCamo(TGuns.M4, new TGIdentifier("woodland"), new TGIdentifier("textures/guns/m4texture_1.png"));
		registerCamo(TGuns.M4, new TGIdentifier("desert"), new TGIdentifier("textures/guns/m4texture_2.png"));
		registerCamo(TGuns.M4, new TGIdentifier("arctic"), new TGIdentifier("textures/guns/m4texture_3.png"));
		
		registerCamo(TGuns.ROCKET_LAUNCHER, DEFAULT, new TGIdentifier("textures/guns/rocketlauncher.png"));
		registerCamo(TGuns.ROCKET_LAUNCHER, new TGIdentifier("wasteland"), new TGIdentifier("textures/guns/rocketlauncher_1.png"));
				
		registerCamo(TGuns.AK47, DEFAULT, new TGIdentifier("textures/guns/ak47texture.png"));
		registerCamo(TGuns.AK47, new TGIdentifier("blue"), new TGIdentifier("textures/guns/ak47texture_1.png"));
			
		registerCamo(TGuns.AUG, DEFAULT, new TGIdentifier("textures/guns/augtexture.png"));
		registerCamo(TGuns.AUG, new TGIdentifier("black"), new TGIdentifier("textures/guns/augtexture_1.png"));
		registerCamo(TGuns.AUG, new TGIdentifier("woodland"), new TGIdentifier("textures/guns/augtexture_2.png"));
		registerCamo(TGuns.AUG, new TGIdentifier("desert"), new TGIdentifier("textures/guns/augtexture_3.png"));
		registerCamo(TGuns.AUG, new TGIdentifier("nether"), new TGIdentifier("textures/guns/augtexture_4.png"));
				
		registerCamo(TGuns.BOLTACTION, DEFAULT, new TGIdentifier("textures/guns/boltactionrifle.png"));
		registerCamo(TGuns.BOLTACTION, new TGIdentifier("woodland"), new TGIdentifier("textures/guns/boltactionrifle_1.png"));
		registerCamo(TGuns.BOLTACTION, new TGIdentifier("night"), new TGIdentifier("textures/guns/boltactionrifle_2.png"));
		
		registerCamo(TGuns.VECTOR, DEFAULT, new TGIdentifier("textures/guns/vector_texture.png"));
		registerCamo(TGuns.VECTOR, new TGIdentifier("black"), new TGIdentifier("textures/guns/vector_texture_1.png"));
		
		registerCamo(TGuns.SCAR, DEFAULT, new TGIdentifier("textures/guns/scar_texture.png"));
		registerCamo(TGuns.SCAR, new TGIdentifier("black"), new TGIdentifier("textures/guns/scar_texture_1.png"));

		registerCamo(TGuns.PULSERIFLE, DEFAULT, new TGIdentifier("textures/guns/pulserifle.png"));
		registerCamo(TGuns.PULSERIFLE, new TGIdentifier("silver"), new TGIdentifier("textures/guns/pulserifle_1.png"));
		registerCamo(TGuns.PULSERIFLE, new TGIdentifier("green"), new TGIdentifier("textures/guns/pulserifle_2.png"));

		registerCamo(TGuns.PDW, DEFAULT, new TGIdentifier("textures/guns/pdw.png"));
		registerCamo(TGuns.PDW, new TGIdentifier("silver"), new TGIdentifier("textures/guns/pdw_1.png"));
		registerCamo(TGuns.PDW, new TGIdentifier("green"), new TGIdentifier("textures/guns/pdw_2.png"));

		registerCamo(TGuns.MAGIC_RIFLE, DEFAULT, new TGIdentifier("textures/guns/magic_rifle.png"));
		registerCamo(TGuns.MAGIC_RIFLE, new TGIdentifier("basic"), new TGIdentifier("textures/guns/magic_rifle_basic.png"));
		registerCamo(TGuns.MAGIC_RIFLE, new TGIdentifier("rusty"), new TGIdentifier("textures/guns/magic_rifle_rusty.png"));
		registerCamo(TGuns.MAGIC_RIFLE, new TGIdentifier("black"), new TGIdentifier("textures/guns/magic_rifle_black.png"));
		registerCamo(TGuns.MAGIC_RIFLE, new TGIdentifier("silver"), new TGIdentifier("textures/guns/magic_rifle_silver.png"));
		registerCamo(TGuns.MAGIC_RIFLE, new TGIdentifier("ivory"), new TGIdentifier("textures/guns/magic_rifle_ivory.png"));

		//Armors
		Identifier powerArmorTexure = new TGIdentifier("textures/armors/powerarmor.png");
		Identifier powerArmorTexure_dark = new TGIdentifier("textures/armors/powerarmor_dark.png");
		Identifier powerArmorTexure_dark2 = new TGIdentifier("textures/armors/powerarmor_dark2.png");

		Identifier powerArmorCamo_dark = new TGIdentifier("outcast");
		Identifier powerArmorCamo_dark2 = new TGIdentifier("outcast_worn");

		registerCamo(TGArmors.T3_POWER_HELMET, DEFAULT, powerArmorTexure);
		registerCamo(TGArmors.T3_POWER_HELMET, powerArmorCamo_dark, powerArmorTexure_dark);
		registerCamo(TGArmors.T3_POWER_HELMET, powerArmorCamo_dark2, powerArmorTexure_dark2);

		registerCamo(TGArmors.T3_POWER_CHESTPLATE, DEFAULT, powerArmorTexure);
		registerCamo(TGArmors.T3_POWER_CHESTPLATE, powerArmorCamo_dark, powerArmorTexure_dark);
		registerCamo(TGArmors.T3_POWER_CHESTPLATE, powerArmorCamo_dark2, powerArmorTexure_dark2);

		registerCamo(TGArmors.T3_POWER_LEGGINGS, DEFAULT, powerArmorTexure);
		registerCamo(TGArmors.T3_POWER_LEGGINGS, powerArmorCamo_dark, powerArmorTexure_dark);
		registerCamo(TGArmors.T3_POWER_LEGGINGS, powerArmorCamo_dark2, powerArmorTexure_dark2);

		registerCamo(TGArmors.T3_POWER_BOOTS, DEFAULT, powerArmorTexure);
		registerCamo(TGArmors.T3_POWER_BOOTS, powerArmorCamo_dark, powerArmorTexure_dark);
		registerCamo(TGArmors.T3_POWER_BOOTS, powerArmorCamo_dark2, powerArmorTexure_dark2);


		Identifier steamArmorTexure = new TGIdentifier("textures/armors/steam_armor.png");
		Identifier steamArmorTexure_iron = new TGIdentifier("textures/armors/steam_armor_iron.png");
		Identifier steamArmorTexure_rusty = new TGIdentifier("textures/armors/steam_armor_rusty.png");
		Identifier steamArmorTexure_hazard = new TGIdentifier("textures/armors/steam_armor_hazard.png");

		Identifier steamArmorCamo_iron = new TGIdentifier("iron");
		Identifier steamArmorCamo_rusty = new TGIdentifier("rusty");
		Identifier steamArmorCamo_hazard = new TGIdentifier("hazard");

		registerCamo(TGArmors.T1_STEAM_HELMET, DEFAULT, steamArmorTexure);
		registerCamo(TGArmors.T1_STEAM_HELMET, steamArmorCamo_iron, steamArmorTexure_iron);
		registerCamo(TGArmors.T1_STEAM_HELMET, steamArmorCamo_rusty, steamArmorTexure_rusty);
		registerCamo(TGArmors.T1_STEAM_HELMET, steamArmorCamo_hazard, steamArmorTexure_hazard);

		registerCamo(TGArmors.T1_STEAM_CHESTPLATE, DEFAULT, steamArmorTexure);
		registerCamo(TGArmors.T1_STEAM_CHESTPLATE, steamArmorCamo_iron, steamArmorTexure_iron);
		registerCamo(TGArmors.T1_STEAM_CHESTPLATE, steamArmorCamo_rusty, steamArmorTexure_rusty);
		registerCamo(TGArmors.T1_STEAM_CHESTPLATE, steamArmorCamo_hazard, steamArmorTexure_hazard);

		registerCamo(TGArmors.T1_STEAM_LEGGINGS, DEFAULT, steamArmorTexure);
		registerCamo(TGArmors.T1_STEAM_LEGGINGS, steamArmorCamo_iron, steamArmorTexure_iron);
		registerCamo(TGArmors.T1_STEAM_LEGGINGS, steamArmorCamo_rusty, steamArmorTexure_rusty);
		registerCamo(TGArmors.T1_STEAM_LEGGINGS, steamArmorCamo_hazard, steamArmorTexure_hazard);

		registerCamo(TGArmors.T1_STEAM_BOOTS, DEFAULT, steamArmorTexure);
		registerCamo(TGArmors.T1_STEAM_BOOTS, steamArmorCamo_iron, steamArmorTexure_iron);
		registerCamo(TGArmors.T1_STEAM_BOOTS, steamArmorCamo_rusty, steamArmorTexure_rusty);
		registerCamo(TGArmors.T1_STEAM_BOOTS, steamArmorCamo_hazard, steamArmorTexure_hazard);


		Identifier powerArmorMk2Texure = new TGIdentifier("textures/armors/powerarmor_mk2.png");
		Identifier powerArmorMk2Texure_black = new TGIdentifier("textures/armors/powerarmor_mk2_black.png");
		Identifier powerArmorMk2Texure_darkgrey = new TGIdentifier("textures/armors/powerarmor_mk2_darkgrey.png");
		Identifier powerArmorMk2Texure_white = new TGIdentifier("textures/armors/powerarmor_mk2_white.png");

		Identifier powerArmorMk2Camo_black = new TGIdentifier("black");
		Identifier powerArmorMk2Camo_darkgrey = new TGIdentifier("darkgrey");
		Identifier powerArmorMk2Camo_white = new TGIdentifier("white");

		registerCamo(TGArmors.T4_POWER_HELMET, DEFAULT, powerArmorMk2Texure);
		registerCamo(TGArmors.T4_POWER_HELMET, powerArmorMk2Camo_black, powerArmorMk2Texure_black);
		registerCamo(TGArmors.T4_POWER_HELMET, powerArmorMk2Camo_darkgrey, powerArmorMk2Texure_darkgrey);
		registerCamo(TGArmors.T4_POWER_HELMET, powerArmorMk2Camo_white, powerArmorMk2Texure_white);

		registerCamo(TGArmors.T4_POWER_CHESTPLATE, DEFAULT, powerArmorMk2Texure);
		registerCamo(TGArmors.T4_POWER_CHESTPLATE, powerArmorMk2Camo_black, powerArmorMk2Texure_black);
		registerCamo(TGArmors.T4_POWER_CHESTPLATE, powerArmorMk2Camo_darkgrey, powerArmorMk2Texure_darkgrey);
		registerCamo(TGArmors.T4_POWER_CHESTPLATE, powerArmorMk2Camo_white, powerArmorMk2Texure_white);

		registerCamo(TGArmors.T4_POWER_LEGGINGS, DEFAULT, powerArmorMk2Texure);
		registerCamo(TGArmors.T4_POWER_LEGGINGS, powerArmorMk2Camo_black, powerArmorMk2Texure_black);
		registerCamo(TGArmors.T4_POWER_LEGGINGS, powerArmorMk2Camo_darkgrey, powerArmorMk2Texure_darkgrey);
		registerCamo(TGArmors.T4_POWER_LEGGINGS, powerArmorMk2Camo_white, powerArmorMk2Texure_white);

		registerCamo(TGArmors.T4_POWER_BOOTS, DEFAULT, powerArmorMk2Texure);
		registerCamo(TGArmors.T4_POWER_BOOTS, powerArmorMk2Camo_black, powerArmorMk2Texure_black);
		registerCamo(TGArmors.T4_POWER_BOOTS, powerArmorMk2Camo_darkgrey, powerArmorMk2Texure_darkgrey);
		registerCamo(TGArmors.T4_POWER_BOOTS, powerArmorMk2Camo_white, powerArmorMk2Texure_white);


		Identifier riotarmor_texture = new TGIdentifier("textures/armors/t2_riot_layer_1.png");
		registerCamo(TGArmors.T2_RIOT_HELMET, DEFAULT, riotarmor_texture);
		registerCamo(TGArmors.T2_RIOT_CHESTPLATE, DEFAULT, riotarmor_texture);
		registerCamo(TGArmors.T2_RIOT_LEGGINGS, DEFAULT, new TGIdentifier("textures/armors/t2_riot_layer_2.png"));
		registerCamo(TGArmors.T2_RIOT_BOOTS, DEFAULT, riotarmor_texture);


		Identifier t1minerTexture = new TGIdentifier("textures/armors/t1_miner_layer_1.png");
		Identifier t1minerTexture_red = new TGIdentifier("textures/armors/t1_miner_red_layer_1.png");
		Identifier t1minerTexture_green = new TGIdentifier("textures/armors/t1_miner_green_layer_1.png");
		Identifier t1minerTexture_black = new TGIdentifier("textures/armors/t1_miner_black_layer_1.png");

		Identifier t1minerCamo_red = new TGIdentifier("red");
		Identifier t1minerCamo_green = new TGIdentifier("green");
		Identifier t1minerCamo_black = new TGIdentifier("black");

		registerCamo(TGArmors.T1_MINER_HELMET, DEFAULT, 0xFFFF00, t1minerTexture);
		registerCamo(TGArmors.T1_MINER_HELMET, new TGIdentifier("lime"), 0x66FF33, t1minerTexture_red);
		registerCamo(TGArmors.T1_MINER_HELMET, new TGIdentifier("cyan"), 0x00FFFF, t1minerTexture_green);
		registerCamo(TGArmors.T1_MINER_HELMET, new TGIdentifier("orange"), 0xFF9900, t1minerTexture_black);

		registerCamo(TGArmors.T1_MINER_CHESTPLATE, DEFAULT,0x4c6cbf, t1minerTexture);
		registerCamo(TGArmors.T1_MINER_CHESTPLATE, t1minerCamo_red, 0xe83030, t1minerTexture_red);
		registerCamo(TGArmors.T1_MINER_CHESTPLATE, t1minerCamo_green, 0x2f8c3a, t1minerTexture_green);
		registerCamo(TGArmors.T1_MINER_CHESTPLATE, t1minerCamo_black, 0x464646, t1minerTexture_black);

		registerCamo(TGArmors.T1_MINER_LEGGINGS, DEFAULT, 0x4c6cbf, new TGIdentifier("textures/armors/t1_miner_layer_2.png"));
		registerCamo(TGArmors.T1_MINER_LEGGINGS, t1minerCamo_red, 0xe83030, new TGIdentifier("textures/armors/t1_miner_red_layer_2.png"));
		registerCamo(TGArmors.T1_MINER_LEGGINGS, t1minerCamo_green, 0x2f8c3a, new TGIdentifier("textures/armors/t1_miner_green_layer_2.png"));
		registerCamo(TGArmors.T1_MINER_LEGGINGS, t1minerCamo_black, 0x464646, new TGIdentifier("textures/armors/t1_miner_black_layer_2.png"));

		registerCamo(TGArmors.T1_MINER_BOOTS, DEFAULT, t1minerTexture);
		//Boots look the same on all textures
		/*registerCamo(TGArmors.T1_MINER_BOOTS, t1minerCamo_red, t1minerTexture_red);
		registerCamo(TGArmors.T1_MINER_BOOTS, t1minerCamo_green, t1minerTexture_green);
		registerCamo(TGArmors.T1_MINER_BOOTS, t1minerCamo_black, t1minerTexture_black);*/


		Identifier t1scoutTexture = new TGIdentifier("textures/armors/t1_scout_layer_1.png");
		Identifier t1scoutTexture_forest = new TGIdentifier("textures/armors/t1_scout_forest_layer_1.png");
		Identifier t1scoutTexture_snow = new TGIdentifier("textures/armors/t1_scout_snow_layer_1.png");
		Identifier t1scoutTexture_black = new TGIdentifier("textures/armors/t1_scout_black_layer_1.png");

		Identifier t1scoutCamo_forest = new TGIdentifier("forest");
		Identifier t1scoutCamo_snow = new TGIdentifier("snow");
		Identifier t1scoutCamo_black = new TGIdentifier("black");

		int[] color_default = {0xd5c5a0, 0xb68647};
		int[] color_forest = {0x007825, 0x007825};
		int[] color_snow = {0xFFFFFF, 0xFFFFFF};
		int[] color_black = {0x4f4f4f, 0x4f4f4f};
		registerCamo(TGArmors.T1_SCOUT_HELMET, DEFAULT, new int[]{0xdfc993, 0xd6c9a9}, t1scoutTexture);
		registerCamo(TGArmors.T1_SCOUT_HELMET, t1scoutCamo_forest, color_forest, t1scoutTexture_forest);
		registerCamo(TGArmors.T1_SCOUT_HELMET, t1scoutCamo_snow, color_snow, t1scoutTexture_snow);
		registerCamo(TGArmors.T1_SCOUT_HELMET, t1scoutCamo_black, color_black, t1scoutTexture_black);

		registerCamo(TGArmors.T1_SCOUT_CHESTPLATE, DEFAULT, color_default, t1scoutTexture);
		registerCamo(TGArmors.T1_SCOUT_CHESTPLATE, t1scoutCamo_forest, color_forest, t1scoutTexture_forest);
		registerCamo(TGArmors.T1_SCOUT_CHESTPLATE, t1scoutCamo_snow, color_snow, t1scoutTexture_snow);
		registerCamo(TGArmors.T1_SCOUT_CHESTPLATE, t1scoutCamo_black, color_black, t1scoutTexture_black);

		registerCamo(TGArmors.T1_SCOUT_LEGGINGS, DEFAULT, color_default, new TGIdentifier("textures/armors/t1_scout_layer_2.png"));
		registerCamo(TGArmors.T1_SCOUT_LEGGINGS, t1scoutCamo_forest, color_forest, new TGIdentifier("textures/armors/t1_scout_forest_layer_2.png"));
		registerCamo(TGArmors.T1_SCOUT_LEGGINGS, t1scoutCamo_snow, color_snow, new TGIdentifier("textures/armors/t1_scout_snow_layer_2.png"));
		registerCamo(TGArmors.T1_SCOUT_LEGGINGS, t1scoutCamo_black, color_black, new TGIdentifier("textures/armors/t1_scout_black_layer_2.png"));

		registerCamo(TGArmors.T1_SCOUT_BOOTS, DEFAULT, 0xd6c9a9, t1scoutTexture);
		registerCamo(TGArmors.T1_SCOUT_BOOTS, t1scoutCamo_forest, color_forest, t1scoutTexture_forest);
		registerCamo(TGArmors.T1_SCOUT_BOOTS, t1scoutCamo_snow, color_snow, t1scoutTexture_snow);
		registerCamo(TGArmors.T1_SCOUT_BOOTS, t1scoutCamo_black, color_black, t1scoutTexture_black);


		Identifier t2combatTexture = new TGIdentifier("textures/armors/t2_combat_layer_1.png");
		Identifier t2combatTexture_desert = new TGIdentifier("textures/armors/t2_combat_desert_layer_1.png");
		Identifier t2combatTexture_woodland = new TGIdentifier("textures/armors/t2_combat_wood_layer_1.png");
		Identifier t2combatTexture_arctic = new TGIdentifier("textures/armors/t2_combat_arctic_layer_1.png");
		Identifier t2combatTexture_swat = new TGIdentifier("textures/armors/t2_combat_swat_layer_1.png");
		Identifier t2combatTexture_security = new TGIdentifier("textures/armors/t2_combat_security_layer_1.png");

		Identifier t2combatCamo_desert = new TGIdentifier("desert");
		Identifier t2combatCamo_woodland = new TGIdentifier("woodland");
		Identifier t2combatCamo_arctic = new TGIdentifier("arctic");
		Identifier t2combatCamo_swat = new TGIdentifier("swat");
		Identifier t2combatCamo_security = new TGIdentifier("security");

		int[] color_t2combat_default = {0x82a780, 0x82a780, 0x82a780};
		int[] color_t2combat_desert = {0xfffcc7, 0xc29971, 0xd8c06c};
		int[] color_t2combat_woodland = {0x669756, 0xfffcc7, 0x669756};
		int[] color_t2combat_arctic = {0xFFFFFF, 0x797979, 0x797979};
		int[] color_t2combat_swat = {0x404040, 0x404040, 0x707070};
		int[] color_t2combat_security = {0x3c39c7, 0x3c39c7, 0x707070};

		registerCamo(TGArmors.T2_COMBAT_HELMET, DEFAULT, new int[]{color_t2combat_default[0], color_t2combat_default[1]}, t2combatTexture);
		registerCamo(TGArmors.T2_COMBAT_HELMET, t2combatCamo_desert, new int[]{color_t2combat_desert[0], color_t2combat_desert[1]}, t2combatTexture_desert);
		registerCamo(TGArmors.T2_COMBAT_HELMET, t2combatCamo_woodland, new int[]{color_t2combat_woodland[0], color_t2combat_woodland[1]}, t2combatTexture_woodland);
		registerCamo(TGArmors.T2_COMBAT_HELMET, t2combatCamo_arctic, new int[]{color_t2combat_arctic[0], color_t2combat_arctic[1]}, t2combatTexture_arctic);
		registerCamo(TGArmors.T2_COMBAT_HELMET, t2combatCamo_swat, new int[]{color_t2combat_swat[0], color_t2combat_swat[1]}, t2combatTexture_swat);
		registerCamo(TGArmors.T2_COMBAT_HELMET, t2combatCamo_security, new int[]{0x54545d, 0x54545d}, t2combatTexture_security);

		registerCamo(TGArmors.T2_COMBAT_CHESTPLATE, DEFAULT, color_t2combat_default, t2combatTexture);
		registerCamo(TGArmors.T2_COMBAT_CHESTPLATE, t2combatCamo_desert, color_t2combat_desert, t2combatTexture_desert);
		registerCamo(TGArmors.T2_COMBAT_CHESTPLATE, t2combatCamo_woodland, color_t2combat_woodland, t2combatTexture_woodland);
		registerCamo(TGArmors.T2_COMBAT_CHESTPLATE, t2combatCamo_arctic, color_t2combat_arctic, t2combatTexture_arctic);
		registerCamo(TGArmors.T2_COMBAT_CHESTPLATE, t2combatCamo_swat, color_t2combat_swat, t2combatTexture_swat);
		registerCamo(TGArmors.T2_COMBAT_CHESTPLATE, t2combatCamo_security, color_t2combat_security, t2combatTexture_security);

		registerCamo(TGArmors.T2_COMBAT_LEGGINGS, DEFAULT, color_t2combat_default, new TGIdentifier("textures/armors/t2_combat_layer_2.png"));
		registerCamo(TGArmors.T2_COMBAT_LEGGINGS, t2combatCamo_desert, color_t2combat_desert,new TGIdentifier("textures/armors/t2_combat_desert_layer_2.png"));
		registerCamo(TGArmors.T2_COMBAT_LEGGINGS, t2combatCamo_woodland, color_t2combat_woodland, new TGIdentifier("textures/armors/t2_combat_wood_layer_2.png"));
		registerCamo(TGArmors.T2_COMBAT_LEGGINGS, t2combatCamo_arctic, color_t2combat_arctic, new TGIdentifier("textures/armors/t2_combat_arctic_layer_2.png"));
		registerCamo(TGArmors.T2_COMBAT_LEGGINGS, t2combatCamo_swat, color_t2combat_swat, new TGIdentifier("textures/armors/t2_combat_swat_layer_2.png"));
		registerCamo(TGArmors.T2_COMBAT_LEGGINGS, t2combatCamo_security, color_t2combat_security, new TGIdentifier("textures/armors/t2_combat_security_layer_2.png"));

		registerCamo(TGArmors.T2_COMBAT_BOOTS, DEFAULT, 0x959595, t2combatTexture);
		registerCamo(TGArmors.T2_COMBAT_BOOTS, t2combatCamo_desert, 0x9e9982, t2combatTexture_desert);
		registerCamo(TGArmors.T2_COMBAT_BOOTS, t2combatCamo_woodland, 0x759874, t2combatTexture_woodland);
		registerCamo(TGArmors.T2_COMBAT_BOOTS, t2combatCamo_arctic, 0xd7d7d7, t2combatTexture_arctic);
		registerCamo(TGArmors.T2_COMBAT_BOOTS, t2combatCamo_swat, 0x606060, t2combatTexture_swat);
		registerCamo(TGArmors.T2_COMBAT_BOOTS, t2combatCamo_security, 0x54545d, t2combatTexture_security);


		Identifier t3combatTexture = new TGIdentifier("textures/armors/t3_combat_layer_1.png");
		Identifier t3combatTexture_green = new TGIdentifier("textures/armors/t3_combat_green_layer_1.png");
		Identifier t3combatTexture_silver = new TGIdentifier("textures/armors/t3_combat_silver_layer_1.png");


		Identifier t3combatCamo_green = new TGIdentifier("green");
		Identifier t3combatCamo_silver = new TGIdentifier("silver");
		registerCamo(TGArmors.T3_COMBAT_HELMET, DEFAULT, new int[]{0x384a57, 0xe9feff, 0x5146e3}, t3combatTexture);
		registerCamo(TGArmors.T3_COMBAT_HELMET, t3combatCamo_green, new int[]{0x015409, 0x20231b, 0x585858}, t3combatTexture_green);
		registerCamo(TGArmors.T3_COMBAT_HELMET, t3combatCamo_silver, new int[]{0x4a4a4a, 0xcfdbd9, 0xd1d15d}, t3combatTexture_silver);

		registerCamo(TGArmors.T3_COMBAT_CHESTPLATE, DEFAULT, new int[]{0x384a57, 0xe9feff, 0xFF0000}, t3combatTexture);
		registerCamo(TGArmors.T3_COMBAT_CHESTPLATE, t3combatCamo_green, new int[]{0x015409, 0x20231b, 0xFFFFFF}, t3combatTexture_green);
		registerCamo(TGArmors.T3_COMBAT_CHESTPLATE, t3combatCamo_silver, new int[]{0x4a4a4a, 0xcfdbd9, 0xcfdbd9}, t3combatTexture_silver);

		registerCamo(TGArmors.T3_COMBAT_LEGGINGS, DEFAULT, new int[]{0x384a57, 0xe9feff}, new TGIdentifier("textures/armors/t3_combat_layer_2.png"));
		registerCamo(TGArmors.T3_COMBAT_LEGGINGS, t3combatCamo_green, new int[]{0x015409, 0x20231b}, new TGIdentifier("textures/armors/t3_combat_green_layer_2.png"));
		registerCamo(TGArmors.T3_COMBAT_LEGGINGS, t3combatCamo_silver, new int[]{0x4a4a4a, 0xcfdbd9}, new TGIdentifier("textures/armors/t3_combat_silver_layer_2.png"));

		registerCamo(TGArmors.T3_COMBAT_BOOTS, DEFAULT, new int[]{0x384a57, 0xe9feff}, t3combatTexture);
		registerCamo(TGArmors.T3_COMBAT_BOOTS, t3combatCamo_green, new int[]{0x015409, 0x20231b}, t3combatTexture_green);
		registerCamo(TGArmors.T3_COMBAT_BOOTS, t3combatCamo_silver, new int[]{0x4a4a4a, 0xcfdbd9}, t3combatTexture_silver);


		Identifier t3exoTexture = new TGIdentifier("textures/armors/t3_exo_layer_1.png");
		Identifier t3exoTexture_green = new TGIdentifier("textures/armors/t3_exo_green_layer_1.png");
		Identifier t3exoTexture_silver = new TGIdentifier("textures/armors/t3_exo_silver_layer_1.png");

		registerCamo(TGArmors.T3_EXO_HELMET, DEFAULT, new int[]{0x384a57, 0xe9feff, 0x5146e3, 0xB0B0B0}, t3exoTexture);
		registerCamo(TGArmors.T3_EXO_HELMET, t3combatCamo_green, new int[]{0x015409, 0x20231b, 0x585858, 0x303030}, t3exoTexture_green);
		registerCamo(TGArmors.T3_EXO_HELMET, t3combatCamo_silver, new int[]{0x4a4a4a, 0xcfdbd9, 0xd1d15d, 0xB0B0B0}, t3exoTexture_silver);

		registerCamo(TGArmors.T3_EXO_CHESTPLATE, DEFAULT, new int[]{0x384a57, 0xe9feff, 0xFF0000, 0xB0B0B0}, t3exoTexture);
		registerCamo(TGArmors.T3_EXO_CHESTPLATE, t3combatCamo_green, new int[]{0x015409, 0x20231b, 0xFFFFFF, 0x303030}, t3exoTexture_green);
		registerCamo(TGArmors.T3_EXO_CHESTPLATE, t3combatCamo_silver, new int[]{0x4a4a4a, 0xcfdbd9, 0xcfdbd9, 0xB0B0B0}, t3exoTexture_silver);

		registerCamo(TGArmors.T3_EXO_LEGGINGS, DEFAULT, new int[]{0x384a57, 0xe9feff, 0xA5A5A5}, new TGIdentifier("textures/armors/t3_exo_layer_2.png"));
		registerCamo(TGArmors.T3_EXO_LEGGINGS, t3combatCamo_green, new int[]{0x015409, 0x20231b, 0x303030}, new TGIdentifier("textures/armors/t3_exo_green_layer_2.png"));
		registerCamo(TGArmors.T3_EXO_LEGGINGS, t3combatCamo_silver, new int[]{0x4a4a4a, 0xcfdbd9, 0xA5A5A5}, new TGIdentifier("textures/armors/t3_exo_silver_layer_2.png"));

		registerCamo(TGArmors.T3_EXO_BOOTS, DEFAULT, new int[]{0x384a57, 0xe9feff, 0xB0B0B0}, t3exoTexture);
		registerCamo(TGArmors.T3_EXO_BOOTS, t3combatCamo_green, new int[]{0x015409, 0x20231b, 0x303030}, t3exoTexture_green);
		registerCamo(TGArmors.T3_EXO_BOOTS, t3combatCamo_silver, new int[]{0x4a4a4a, 0xcfdbd9, 0xB0B0B0}, t3exoTexture_silver);


		Identifier t2hazmatTexture =        new TGIdentifier("textures/armors/hazmatsuit_layer_1.png");
		Identifier t2hazmatTexture_orange = new TGIdentifier("textures/armors/hazmatsuit_orange_layer_1.png");
		Identifier t2hazmatTexture_grey =   new TGIdentifier("textures/armors/hazmatsuit_grey_layer_1.png");
		Identifier t2hazmatTexture_blue =   new TGIdentifier("textures/armors/hazmatsuit_blue_layer_1.png");

		int[] color_hazmat_yellow = {0xEEFF00};
		int[] color_hazmat_orange = {0xFF8800};
		int[] color_hazmat_grey = {0xA6A6A6};
		int[] color_hazmat_blue = {0x4DCFFF};

		Identifier t2hazmatCamo_orange = new TGIdentifier("orange");
		Identifier t2hazmatCamo_grey = new TGIdentifier("grey");
		Identifier t2hazmatCamo_blue = new TGIdentifier("blue");

		registerCamo(TGArmors.T2_HAZMAT_HELMET, DEFAULT, color_hazmat_yellow, t2hazmatTexture);
		registerCamo(TGArmors.T2_HAZMAT_HELMET, t2hazmatCamo_orange, color_hazmat_orange, t2hazmatTexture_orange);
		registerCamo(TGArmors.T2_HAZMAT_HELMET, t2hazmatCamo_grey, color_hazmat_grey, t2hazmatTexture_grey);
		registerCamo(TGArmors.T2_HAZMAT_HELMET, t2hazmatCamo_blue, color_hazmat_blue, t2hazmatTexture_blue);

		registerCamo(TGArmors.T2_HAZMAT_CHESTPLATE, DEFAULT, color_hazmat_yellow, t2hazmatTexture);
		registerCamo(TGArmors.T2_HAZMAT_CHESTPLATE, t2hazmatCamo_orange, color_hazmat_orange, t2hazmatTexture_orange);
		registerCamo(TGArmors.T2_HAZMAT_CHESTPLATE, t2hazmatCamo_grey, color_hazmat_grey, t2hazmatTexture_grey);
		registerCamo(TGArmors.T2_HAZMAT_CHESTPLATE, t2hazmatCamo_blue, color_hazmat_blue, t2hazmatTexture_blue);

		registerCamo(TGArmors.T2_HAZMAT_LEGGINGS, DEFAULT, color_hazmat_yellow,             new TGIdentifier("textures/armors/hazmatsuit_layer_2.png"));
		registerCamo(TGArmors.T2_HAZMAT_LEGGINGS, t2hazmatCamo_orange, color_hazmat_orange, new TGIdentifier("textures/armors/hazmatsuit_orange_layer_2.png"));
		registerCamo(TGArmors.T2_HAZMAT_LEGGINGS, t2hazmatCamo_grey, color_hazmat_grey,     new TGIdentifier("textures/armors/hazmatsuit_grey_layer_2.png"));
		registerCamo(TGArmors.T2_HAZMAT_LEGGINGS, t2hazmatCamo_blue, color_hazmat_blue,     new TGIdentifier("textures/armors/hazmatsuit_blue_layer_2.png"));

		registerCamo(TGArmors.T2_HAZMAT_BOOTS, DEFAULT, t2hazmatTexture);
		//registerCamo(TGArmors.T2_HAZMAT_BOOTS, t1scoutCamo_forest, color_hazmat_orange, t2hazmatTexture_orange);
		//registerCamo(TGArmors.T2_HAZMAT_BOOTS, t1scoutCamo_snow, color_hazmat_grey, t2hazmatTexture_grey);
		//registerCamo(TGArmors.T2_HAZMAT_BOOTS, t1scoutCamo_black, color_hazmat_blue, t2hazmatTexture_blue);

		Identifier t2commandoTexture = new TGIdentifier("textures/armors/t2_commando_layer_1.png");
		registerCamo(TGArmors.T2_COMMANDO_HELMET, DEFAULT, t2commandoTexture);
		registerCamo(TGArmors.T2_COMMANDO_CHESTPLATE, DEFAULT, t2commandoTexture);
		registerCamo(TGArmors.T2_COMMANDO_LEGGINGS, DEFAULT, new TGIdentifier("textures/armors/t2_commando_layer_2.png"));
		registerCamo(TGArmors.T2_COMMANDO_BOOTS, DEFAULT, t2commandoTexture);

		Identifier t1combatTexture = new TGIdentifier("textures/armors/t1_combat_layer_1.png");
		registerCamo(TGArmors.T1_COMBAT_HELMET, DEFAULT, t1combatTexture);
		registerCamo(TGArmors.T1_COMBAT_CHESTPLATE, DEFAULT, t1combatTexture);
		registerCamo(TGArmors.T1_COMBAT_LEGGINGS, DEFAULT, new TGIdentifier("textures/armors/t1_combat_layer_2.png"));
		registerCamo(TGArmors.T1_COMBAT_BOOTS, DEFAULT, t1combatTexture);

		Identifier t4praetorTexture = new TGIdentifier("textures/armors/t4_praetor_layer_1.png");
		registerCamo(TGArmors.T4_PRAETOR_HELMET, DEFAULT, t4praetorTexture);
		registerCamo(TGArmors.T4_PRAETOR_CHESTPLATE, DEFAULT, t4praetorTexture);
		registerCamo(TGArmors.T4_PRAETOR_LEGGINGS, DEFAULT, new TGIdentifier("textures/armors/t4_praetor_layer_2.png"));
		registerCamo(TGArmors.T4_PRAETOR_BOOTS, DEFAULT, t4praetorTexture);

		int t3miner_color_default = 0xffae00;
		int t3miner_color_black = 0x424242;
		int t3miner_color_silver = 0xeeeeee;

		Identifier t3minerTexture = new TGIdentifier("textures/armors/hevsuit_layer_1.png");
		Identifier t3minerTexture_black = new TGIdentifier("textures/armors/hevsuit_black_layer_1.png");
		Identifier t3minerTexture_silver = new TGIdentifier("textures/armors/hevsuit_silver_layer_1.png");

		Identifier t3minerCamo_black = new TGIdentifier("black");
		Identifier t3minerCamo_silver = new TGIdentifier("silver");

		registerCamo(TGArmors.T3_MINER_HELMET, DEFAULT, new int[]{t3miner_color_default, -1, 0x8bc2ff}, t3minerTexture);
		registerCamo(TGArmors.T3_MINER_HELMET, t3minerCamo_black, new int[]{t3miner_color_black, -1, 0xff3c00}, t3minerTexture_black);
		registerCamo(TGArmors.T3_MINER_HELMET, t3minerCamo_silver, new int[]{t3miner_color_silver, -1, 0x8bc2ff}, t3minerTexture_silver);

		registerCamo(TGArmors.T3_MINER_CHESTPLATE, DEFAULT, t3miner_color_default, t3minerTexture);
		registerCamo(TGArmors.T3_MINER_CHESTPLATE, t3minerCamo_black, t3miner_color_black, t3minerTexture_black);
		registerCamo(TGArmors.T3_MINER_CHESTPLATE, t3minerCamo_silver, t3miner_color_silver, t3minerTexture_silver);

		registerCamo(TGArmors.T3_MINER_LEGGINGS, DEFAULT, t3miner_color_default, new TGIdentifier("textures/armors/hevsuit_layer_2.png"));
		registerCamo(TGArmors.T3_MINER_LEGGINGS, t3minerCamo_black, t3miner_color_black, new TGIdentifier("textures/armors/hevsuit_black_layer_2.png"));
		registerCamo(TGArmors.T3_MINER_LEGGINGS, t3minerCamo_silver, t3miner_color_silver, new TGIdentifier("textures/armors/hevsuit_silver_layer_2.png"));

		registerCamo(TGArmors.T3_MINER_BOOTS, DEFAULT, t3miner_color_default, t3minerTexture);
		registerCamo(TGArmors.T3_MINER_BOOTS, t3minerCamo_black, t3miner_color_black, t3minerTexture_black);
		registerCamo(TGArmors.T3_MINER_BOOTS, t3minerCamo_silver, t3miner_color_silver, t3minerTexture_silver);

		registerCamo(TGArmors.T2_BERET_HELMET, DEFAULT, 0xb30000, new TGIdentifier("textures/armors/beret_texture.png"));
		registerCamo(TGArmors.T2_BERET_HELMET, new TGIdentifier("green"), 0x009000, new TGIdentifier("textures/armors/beret_texture_green.png"));
		registerCamo(TGArmors.T2_BERET_HELMET, new TGIdentifier("black"), 0x444444, new TGIdentifier("textures/armors/beret_texture_black.png"));

		ItemGroupEvents.modifyEntriesEvent(CAMO_ITEM_GROUP).register(content -> {
			addAllCamoItems(content); });
	}
	
	
	protected void addAllCamoItems(FabricItemGroupEntries group) {
		for (Item it : weapon_camos.keySet()) {
			
			ItemStack gun = new ItemStack(it);
			gun.getItem().onCraft(gun, null, null);
			
			CamoList l = weapon_camos.get(it);
			for (Identifier entry : l.camos.keySet()) {
				ItemStack gun_to_add = gun.copy();
				gun_to_add.getNbt().putString("camo", entry.toString());
				
				group.add(gun_to_add);
			}
		}
	}
	
	public static int getCamoCount(Item it) {
		if (it instanceof ICamoChangeable) {
			CamoList list = weapon_camos.getOrDefault(it, null);
			if (list!=null) {
				return list.camo_names.size();
			}
		}
		return 0;
	}

	public static List<Identifier> getCamosFor(ICamoChangeable c)
	{
		CamoList list = weapon_camos.getOrDefault(c, null);
		if (list!=null){
			return list.camo_names;
		}
		//return empty list if no camos found
		return new ArrayList<Identifier>();
	}

	public static Identifier getRandomCamoFor(ICamoChangeable c, net.minecraft.util.math.random.Random rand)
	{
		CamoList list = weapon_camos.getOrDefault(c, null);
		if (list!=null && !list.camo_names.isEmpty()){
			return list.camo_names.get(rand.nextInt(list.camo_names.size()));
		}
		return DEFAULT;
	}
	

	public static boolean hasCamos(Item it) {
		return weapon_camos.containsKey(it);
	}
	
	/**
	 * Get camo name by index for an item, or null if invalid
	 * @param it
	 * @param index
	 * @return
	 */
	@Nullable
	public static Identifier getCamoByIndex(Item it, int index) {
		CamoList list = weapon_camos.getOrDefault(it, null);
		if (list !=null) {
			return list.getCamoWithIndex(index);
		}
		return null;
	}
	
   /**
    * Return the camo entry for this key, or null
    * @param it
    * @param key
    * @return
    */
	@Nullable
	public static TGCamos.CamoEntry getCamoEntry(Item it, Identifier key) {
		if (weapon_camos.containsKey(it)) {
			CamoList camos = weapon_camos.get(it);
			return camos.camos.getOrDefault(key, null);
		}
		return null;
	}


	public static void registerCamo(Item item, Identifier key, Identifier... textures) {
		registerCamo(item, key, -1, textures);
	}

	public static void registerCamo(Item item, Identifier key, int color, Identifier... textures) {
		registerCamo(item, key, new int[]{color}, textures);
	}

	public static void registerCamo(Item item, Identifier key, int[] colors, Identifier... textures) {
		if (!weapon_camos.containsKey(item)) {
			weapon_camos.put(item, new CamoList());
		}
		CamoList camos = weapon_camos.get(item);
		camos.add(key, colors, textures);
	}

	
	public static class CamoList {
		public HashMap<Identifier, CamoEntry> camos;
		public ArrayList<Identifier> camo_names;
		
		public CamoList() {
			this.camos = new HashMap<>();
			this.camo_names = new ArrayList<>();
		}
		
		public void add(Identifier name, int[] colors, Identifier... textures) {
			this.camo_names.add(name);
			this.camos.put(name, new CamoEntry(this.camo_names.size()-1, colors, textures));
		}
		
		public Identifier getCamoWithIndex(int index) {
			if (!this.camo_names.isEmpty()) {
				while (index > this.camo_names.size()-1) {
					index -= this.camo_names.size();
				}
				while (index < 0) {
					index += this.camo_names.size();
				}
				return this.camo_names.get(index);								
			}
			return null;
		}
	}
	
	public static class CamoEntry {
		public List<Identifier> textures;
		public int camoindex;
		public List<Integer> colors;

		public CamoEntry(int camoindex, Identifier... textures) {
			super();
			this.textures = new ArrayList<Identifier>(textures.length);
			this.textures.addAll(Arrays.asList(textures));
			this.camoindex = camoindex;
			this.colors = null;
		}

		public CamoEntry(int camoindex, int[] colors, Identifier... textures) {
			this(camoindex, textures);
			this.colors = new ArrayList<Integer>();
			for(int c: colors){
				this.colors.add(c);
			}
		}

		public CamoEntry(int camoindex, int color, Identifier... textures) {
			this(camoindex, textures);
			this.colors = new ArrayList<Integer>();
			this.colors.add(color);
		}

		public int getColor(int tintindex){
			if (this.colors != null && tintindex < this.colors.size()){
				return this.colors.get(tintindex);
			}
			return -1;
		}
	}
}
