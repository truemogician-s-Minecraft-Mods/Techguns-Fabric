package techguns.recipes;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.*;

import net.minecraft.util.Pair;
import org.apache.commons.lang3.ArrayUtils;
import techguns.TGArmors;
import techguns.TGIdentifier;
import techguns.TGItems;
import techguns.items.guns.GenericGun;
import techguns.items.guns.GenericGunMeleeCharge;
import techguns.items.guns.ammo.AmmoType;
import techguns.items.guns.ammo.AmmoTypes;
import techguns.items.guns.ammo.AmmoVariant;

import static techguns.TGItems.*;
import static techguns.TGuns.*;

public class Recipewriter {
    public static final String itemStackHasNBTInt = "itemstackHasNBTInt";

    //TODO set this to false for releases
    public static final boolean WRITE_RECIPES = false;


    private static final Identifier TAG_CARBON_PLATES = new Identifier("c:carbon_plates");
    private static final Identifier TAG_CARBON_FIBERS = new Identifier("c:carbon_fibers");

    private static final Identifier TAG_COPPER_NUGGETS = new Identifier("c:copper_nuggets");
    private static final Identifier TAG_COPPER_INGOTS = new Identifier("c:copper_ingots");
    private static final Identifier TAG_COPPER_WIRES = new Identifier("c:copper_wires");

    //private static final Identifier TAG_LEAD_NUGGETS = new Identifier("c:lead_nuggets");
    private static final Identifier TAG_LEAD_INGOTS = new Identifier("c:lead_ingots");
    //private static final Identifier TAG_LEAD_PLATES = new Identifier("c:lead_plates");

    private static final Identifier TAG_IRON_NUGGETS = new Identifier("c:iron_nuggets");
    private static final Identifier TAG_IRON_INGOTS = new Identifier("c:iron_ingots");
    //private static final Identifier TAG_IRON_PLATES = new Identifier("c:iron_plates");

    private static final Identifier TAG_STEEL_NUGGETS = new Identifier("c:steel_nuggets");
    private static final Identifier TAG_STEEL_INGOTS = new Identifier("c:steel_ingots");
    //private static final Identifier TAG_STEEL_PLATES = new Identifier("c:steel_plates");
    private static final Identifier TAG_NETHERITE_INGOTS = new Identifier("c:netherite_ingots");

    private static final Identifier TAG_OBSIDIAN_INGOTS = new Identifier("c:obsidian_ingots");
    //private static final Identifier TAG_OBSIDIAN_PLATES = new Identifier("c:obsidian_plates");

    private static final Identifier TAG_GLASS_BLOCKS = new Identifier("c:glass_blocks");
    private static final Identifier TAG_GLASS_PANES = new Identifier("c:glass_panes");

    private static final Identifier TAG_SLIME_BALLS = new Identifier("c:slime_balls");

    private static final Identifier TAG_PLASTIC_SHEETS = new Identifier("c:plastic_sheets");

    private static final Identifier TAG_GOLD_INGOTS = new Identifier("c:gold_ingots");
    private static final Identifier TAG_GOLD_NUGGETS = new Identifier("c:gold_nuggets");
    private static final Identifier TAG_GOLD_WIRES = new Identifier("c:gold_wires");

    private static final Identifier TAG_BASIC_CIRCUITS = new Identifier("c:basic_circuits");
    private static final Identifier TAG_ADVANCED_CIRCUITS = new Identifier("c:advanced_circuits");
    private static final Identifier TAG_ELITE_CIRCUITS = new Identifier("c:elite_circuits");

    private static final Identifier TAG_URANIUM_ENRICHED = new Identifier("c:enriched_uranium");

    private static final Identifier TAG_TITANIUM_INGOTS = new Identifier("c:titanium_ingots");

    private static final Identifier TAG_TIN_INGOTS = new Identifier("c:tin_ingots");

    private static final Identifier TAG_BRONZE_INGOTS = new Identifier("c:bronze_ingots");

    //private static final Identifier TAG_CONCRETE_POWDER = new Identifier("c:concrete_powder");

    private static final Identifier TAG_CONCRETE = new Identifier("c:concrete");

    private static final Identifier TAG_DYE = new Identifier("c:dyes");

    private static final Identifier TAG_RUBBER = new Identifier("c:dyes");


    /**
     * Vanilla tag
     */
    private static final Identifier TAG_LOGS = new Identifier("logs");

    private static final Identifier TAG_WOOL = new Identifier("wool");

    public static final Map<Identifier, List<Item>> TAG_LIST = new TreeMap<Identifier, List<Item>>();
    static {
        TAG_LIST.put(TAG_CARBON_PLATES, Arrays.asList(PLATE_CARBON));
        TAG_LIST.put(TAG_CARBON_FIBERS, Arrays.asList(CARBON_FIBERS));

        TAG_LIST.put(TAG_COPPER_NUGGETS, Arrays.asList(COPPER_NUGGET));
        TAG_LIST.put(TAG_COPPER_INGOTS, Arrays.asList(Items.COPPER_INGOT));
        TAG_LIST.put(TAG_COPPER_WIRES, Arrays.asList(WIRE_COPPER));

        TAG_LIST.put(TAG_LEAD_INGOTS, Arrays.asList(LEAD_INGOT));
        //TAG_LIST.put(TAG_LEAD_NUGGETS, Arrays.asList(NUGGET_LEAD));
        //TAG_LIST.put(TAG_LEAD_PLATES, Arrays.asList(PLATE_LEAD));

        TAG_LIST.put(TAG_STEEL_INGOTS, Arrays.asList(STEEL_INGOT));
        TAG_LIST.put(TAG_STEEL_NUGGETS, Arrays.asList(STEEL_NUGGET));
        //TAG_LIST.put(TAG_STEEL_PLATES, Arrays.asList(PLATE_STEEL));

        TAG_LIST.put(TAG_IRON_INGOTS, Arrays.asList(Items.IRON_INGOT));
        TAG_LIST.put(TAG_IRON_NUGGETS, Arrays.asList(Items.IRON_NUGGET));
        //TAG_LIST.put(TAG_IRON_PLATES, Arrays.asList(PLATE_IRON));

        TAG_LIST.put(TAG_OBSIDIAN_INGOTS, Arrays.asList(OBSIDIAN_STEEL_INGOT));
        //TAG_LIST.put(TAG_OBSIDIAN_PLATES, Arrays.asList(PLATE_OBSIDIAN_STEEL));

        TAG_LIST.put(TAG_NETHERITE_INGOTS, Arrays.asList(Items.NETHERITE_INGOT));

        TAG_LIST.put(TAG_GLASS_BLOCKS, Arrays.asList(Items.GLASS,
                                                    Items.WHITE_STAINED_GLASS,
                                                    Items.ORANGE_STAINED_GLASS,
                                                    Items.MAGENTA_STAINED_GLASS,
                                                    Items.LIGHT_BLUE_STAINED_GLASS,
                                                    Items.YELLOW_STAINED_GLASS,
                                                    Items.LIME_STAINED_GLASS,
                                                    Items.PINK_STAINED_GLASS,
                                                    Items.GRAY_STAINED_GLASS,
                                                    Items.LIGHT_GRAY_STAINED_GLASS,
                                                    Items.CYAN_STAINED_GLASS,
                                                    Items.PURPLE_STAINED_GLASS,
                                                    Items.BLUE_STAINED_GLASS,
                                                    Items.BROWN_STAINED_GLASS,
                                                    Items.GREEN_STAINED_GLASS,
                                                    Items.RED_STAINED_GLASS,
                                                    Items.BLACK_STAINED_GLASS));

        TAG_LIST.put(TAG_GLASS_PANES, Arrays.asList(Items.GLASS_PANE,
                Items.WHITE_STAINED_GLASS_PANE,
                Items.ORANGE_STAINED_GLASS_PANE,
                Items.MAGENTA_STAINED_GLASS_PANE,
                Items.LIGHT_BLUE_STAINED_GLASS_PANE,
                Items.YELLOW_STAINED_GLASS_PANE,
                Items.LIME_STAINED_GLASS_PANE,
                Items.PINK_STAINED_GLASS_PANE,
                Items.GRAY_STAINED_GLASS_PANE,
                Items.LIGHT_GRAY_STAINED_GLASS_PANE,
                Items.CYAN_STAINED_GLASS_PANE,
                Items.PURPLE_STAINED_GLASS_PANE,
                Items.BLUE_STAINED_GLASS_PANE,
                Items.BROWN_STAINED_GLASS_PANE,
                Items.GREEN_STAINED_GLASS_PANE,
                Items.RED_STAINED_GLASS_PANE,
                Items.BLACK_STAINED_GLASS_PANE));

        TAG_LIST.put(TAG_SLIME_BALLS, Arrays.asList(Items.SLIME_BALL));

        TAG_LIST.put(TAG_PLASTIC_SHEETS, Arrays.asList(PLASTIC_SHEET));

        TAG_LIST.put(TAG_GOLD_INGOTS, Arrays.asList(Items.GOLD_INGOT));
        TAG_LIST.put(TAG_GOLD_NUGGETS, Arrays.asList(Items.GOLD_NUGGET));

        TAG_LIST.put(TAG_GOLD_WIRES, Arrays.asList(WIRE_GOLD));

        TAG_LIST.put(TAG_BASIC_CIRCUITS, Arrays.asList(CIRCUIT_BOARD_BASIC));
        TAG_LIST.put(TAG_ADVANCED_CIRCUITS, Arrays.asList(CIRCUIT_BOARD_ADVANCED));
        TAG_LIST.put(TAG_ELITE_CIRCUITS, Arrays.asList(CIRCUIT_BOARD_ELITE));

        TAG_LIST.put(TAG_URANIUM_ENRICHED, Arrays.asList(ENRICHED_URANIUM));

        TAG_LIST.put(TAG_TITANIUM_INGOTS, Arrays.asList(TITANIUM_INGOT));

        TAG_LIST.put(TAG_TIN_INGOTS, Arrays.asList(TIN_INGOT));

        TAG_LIST.put(TAG_BRONZE_INGOTS, Arrays.asList(BRONZE_INGOT));

        /*TAG_LIST.put(TAG_CONCRETE_POWDER, Arrays.asList(
                Items.WHITE_CONCRETE_POWDER,
                Items.ORANGE_CONCRETE_POWDER,
                Items.MAGENTA_CONCRETE_POWDER,
                Items.LIGHT_BLUE_CONCRETE_POWDER,
                Items.YELLOW_CONCRETE_POWDER,
                Items.LIME_CONCRETE_POWDER,
                Items.PINK_CONCRETE_POWDER,
                Items.GRAY_CONCRETE_POWDER,
                Items.LIGHT_GRAY_CONCRETE_POWDER,
                Items.CYAN_CONCRETE_POWDER,
                Items.PURPLE_CONCRETE_POWDER,
                Items.BLUE_CONCRETE_POWDER,
                Items.BROWN_CONCRETE_POWDER,
                Items.GREEN_CONCRETE_POWDER,
                Items.RED_CONCRETE_POWDER,
                Items.BLACK_CONCRETE_POWDER));*/

        TAG_LIST.put(TAG_CONCRETE, Arrays.asList(
                Items.WHITE_CONCRETE,
                Items.ORANGE_CONCRETE,
                Items.MAGENTA_CONCRETE,
                Items.LIGHT_BLUE_CONCRETE,
                Items.YELLOW_CONCRETE,
                Items.LIME_CONCRETE,
                Items.PINK_CONCRETE,
                Items.GRAY_CONCRETE,
                Items.LIGHT_GRAY_CONCRETE,
                Items.CYAN_CONCRETE,
                Items.PURPLE_CONCRETE,
                Items.BLUE_CONCRETE,
                Items.BROWN_CONCRETE,
                Items.GREEN_CONCRETE,
                Items.RED_CONCRETE,
                Items.BLACK_CONCRETE));

        TAG_LIST.put(TAG_DYE, Arrays.asList(
                Items.WHITE_DYE,
                Items.ORANGE_DYE,
                Items.MAGENTA_DYE,
                Items.LIGHT_BLUE_DYE,
                Items.YELLOW_DYE,
                Items.LIME_DYE,
                Items.PINK_DYE,
                Items.GRAY_DYE,
                Items.LIGHT_GRAY_DYE,
                Items.CYAN_DYE,
                Items.PURPLE_DYE,
                Items.BLUE_DYE,
                Items.BROWN_DYE,
                Items.GREEN_DYE,
                Items.RED_DYE,
                Items.BLACK_DYE
        ));

        TAG_LIST.put(TAG_RUBBER, Arrays.asList(RUBBER_BAR));

        /**
         * AMMO Tags
         */
        TAG_LIST.put(TAG_AMMO_FULL_ID, Arrays.asList(
                STONE_BULLETS,
                PISTOL_ROUNDS,
                SHOTGUN_ROUNDS,
                RIFLE_ROUNDS,
                SNIPER_ROUNDS,
                GRENADE_40MM,
                ADVANCED_ROUNDS,
                ROCKET,
                RIFLE_ROUNDS_STACK,
                SMG_MAGAZINE,
                PISTOL_MAGAZINE,
                ASSAULTRIFLE_MAGAZINE,
                LMG_MAGAZINE,
                MINIGUN_DRUM,
                AS50_MAGAZINE,
                ADVANCED_MAGAZINE,
                COMPRESSED_AIR_TANK,
                BIO_TANK,
                FUEL_TANK,
                ENERGY_CELL,
                NUCLEAR_POWERCELL,
                REDSTONE_BATTERY,
                GAUSSRIFLE_SLUGS,
                NETHER_CHARGE,
                SHOTGUN_ROUNDS_INCENDIARY,
                AS50_MAGAZINE_INCENDIARY,
                SNIPER_ROUNDS_INCENDIARY,
                PISTOL_ROUNDS_INCENDIARY,
                RIFLE_ROUNDS_INCENDIARY,
                RIFLE_ROUNDS_STACK_INCENDIARY,
                SMG_MAGAZINE_INCENDIARY,
                PISTOL_MAGAZINE_INCENDIARY,
                MINIGUN_DRUM_INCENDIARY,
                ASSAULTRIFLE_MAGAZINE_INCENDIARY,
                LMG_MAGAZINE_INCENDIARY,
                ROCKET_NUKE,
                TACTICAL_NUKE_WARHEAD,
                AS50_MAGAZINE_EXPLOSIVE,
                SNIPER_ROUNDS_EXPLOSIVE,
                ROCKET_HIGH_VELOCITY
        ));

        TAG_LIST.put(TAG_AMMO_EMPTY_ID, Arrays.asList(
                SMG_MAGAZINE_EMPTY,
                PISTOL_MAGAZINE_EMPTY,
                ASSAULTRIFLE_MAGAZINE_EMPTY,
                LMG_MAGAZINE_EMPTY,
                MINIGUN_DRUM_EMPTY,
                AS50_MAGAZINE_EMPTY,
                ADVANCED_MAGAZINE_EMPTY,
                COMPRESSED_AIR_TANK_EMPTY,
                BIO_TANK_EMPTY,
                FUEL_TANK_EMPTY,
                ENERGY_CELL_EMPTY,
                NUCLEAR_POWERCELL_EMPTY,
                REDSTONE_BATTERY_EMPTY
        ));
    }

    public static void generateItemRecipes(){
        RecipeJsonConverter.addShapedRecipe(new ItemStack(BARREL_STONE,1), "sss","   ","sss", 's', Blocks.STONE);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(STOCK_WOOD,1), "ww", " w", 'w', new Identifier("logs"));

        RecipeJsonConverter.addShapedRecipe(new ItemStack(BARREL_IRON,1), "iii","   ","iii", 'i', Items.IRON_INGOT);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(MECHANICAL_PARTS_IRON,2)," i ", "ifi", " i ", 'f', Items.FLINT, 'i', Items.IRON_INGOT);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(STOCK_PLASTIC,1),"ppp","  p", 'p', PLASTIC_SHEET);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(BARREL_OBSIDIAN_STEEL, 1), "ooo","   ","ooo", 'o', OBSIDIAN_STEEL_INGOT);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(PUMP_MECHANISM, 1), "nnn", "gpg", "nnn", 'n', Items.IRON_INGOT, 'g', TAG_GLASS_BLOCKS, 'p', Blocks.PISTON);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(BARREL_LASER,1), "fff","ggl","fff", 'f', Items.GOLD_INGOT, 'g', TAG_GLASS_BLOCKS, 'l', LASER_FOCUS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(HEAVY_CLOTH,3), " w ","wlw"," w ", 'w', new Identifier("wool"), 'l', Items.LEATHER);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(STONE_BULLETS,16), Items.COBBLESTONE, Items.COBBLESTONE, Items.COBBLESTONE, Items.GUNPOWDER);

        //RecipeJsonConverter.addShapedRecipe(new ItemStack(PISTOL_ROUNDS,8), "clc","cgc","ccc", 'c', TAG_COPPER_NUGGETS, 'l', TAG_LEAD_INGOTS, 'g', Items.GUNPOWDER);

        //RecipeJsonConverter.addShapedRecipe(new ItemStack(SHOTGUN_ROUNDS,5), "lll","cgc","ccc", 'c', TAG_COPPER_NUGGETS, 'l', TAG_LEAD_NUGGETS, 'g', Items.GUNPOWDER);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(PISTOL_MAGAZINE_EMPTY,4), "i i","imi","igi", 'i', TAG_IRON_NUGGETS,'g', TAG_IRON_INGOTS, 'm', MECHANICAL_PARTS_IRON);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(PISTOL_MAGAZINE, 1), PISTOL_MAGAZINE_EMPTY, PISTOL_ROUNDS,PISTOL_ROUNDS,PISTOL_ROUNDS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(SMG_MAGAZINE_EMPTY,4), "i i","i i","imi", 'i', TAG_IRON_NUGGETS, 'm', MECHANICAL_PARTS_IRON);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(SMG_MAGAZINE, 1), SMG_MAGAZINE_EMPTY, PISTOL_ROUNDS, PISTOL_ROUNDS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(ASSAULTRIFLE_MAGAZINE_EMPTY,4),"s s","s s","sms", 's', TAG_STEEL_NUGGETS,'m', MECHANICAL_PARTS_IRON);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(ASSAULTRIFLE_MAGAZINE, 1), ASSAULTRIFLE_MAGAZINE_EMPTY, RIFLE_ROUNDS, RIFLE_ROUNDS, RIFLE_ROUNDS);


        RecipeJsonConverter.addShapedRecipe(new ItemStack(BIO_TANK_EMPTY,1),"sss","sgs","sgs", 's', TAG_STEEL_NUGGETS, 'g', TAG_GLASS_BLOCKS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(BIOMASS,4)," g ","gbg"," g ", 'g', Items.GREEN_DYE, 'b', TAG_SLIME_BALLS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(ROCKET,4), " s ","sts","sgs", 's', TAG_IRON_NUGGETS, 't', Blocks.TNT, 'g', Items.GUNPOWDER);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(LMG_MAGAZINE_EMPTY,4), " ii", "imi","iii", 'i', TAG_STEEL_INGOTS, 'm', MECHANICAL_PARTS_IRON);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(LMG_MAGAZINE,1), "bbb", "bmb","bbb", 'b', RIFLE_ROUNDS, 'm', LMG_MAGAZINE_EMPTY);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(LMG_MAGAZINE,1), LMG_MAGAZINE_EMPTY, RIFLE_ROUNDS_STACK, RIFLE_ROUNDS_STACK);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(AS50_MAGAZINE_EMPTY,4),"s s","s s","sms", 's', TAG_STEEL_INGOTS, 'm', MECHANICAL_PARTS_IRON);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(AS50_MAGAZINE,1),AS50_MAGAZINE_EMPTY, SNIPER_ROUNDS, SNIPER_ROUNDS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(RECEIVER_IRON,1), "iii"," mn","  n", 'i', TAG_IRON_INGOTS, 'n', TAG_IRON_NUGGETS,'m', MECHANICAL_PARTS_IRON);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(RECEIVER_STEEL,1), "iii"," mn","  n", 'i', TAG_STEEL_INGOTS, 'n', TAG_STEEL_NUGGETS,'m', MECHANICAL_PARTS_OBSIDIAN_STEEL);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(RECEIVER_OBSIDIAN_STEEL,1), "iii"," mi","  i", 'i', TAG_OBSIDIAN_INGOTS, 'm', MECHANICAL_PARTS_CARBON);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(RECEIVER_CARBON,1), "ppp"," mi","  i", 'i', TAG_OBSIDIAN_INGOTS, 'p', TAG_CARBON_PLATES,'m', MECHANICAL_PARTS_CARBON);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(ADVANCED_MAGAZINE_EMPTY,4),"i i","i i","imi",'i', TAG_OBSIDIAN_INGOTS, 'm',MECHANICAL_PARTS_OBSIDIAN_STEEL);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(ADVANCED_MAGAZINE,1), ADVANCED_MAGAZINE_EMPTY, ADVANCED_ROUNDS, ADVANCED_ROUNDS, ADVANCED_ROUNDS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(WIRE_COPPER,1)," cc"," c ","cc ",'c', TAG_COPPER_NUGGETS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(ELECTRIC_ENGINE,1), "wrw","imi","wrw", 'w', TAG_COPPER_WIRES, 'i', TAG_IRON_INGOTS, 'r', Items.REDSTONE, 'm', MECHANICAL_PARTS_IRON);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.CIRCUIT_BOARD_BASIC,4),"cgc","rir","cgc", 'i', TAG_IRON_INGOTS, 'c', TAG_COPPER_WIRES, 'g', Items.GREEN_DYE, 'r', Items.REDSTONE);


        RecipeJsonConverter.addShapedRecipe(new ItemStack(BARREL_CARBON,1), "iii","   ","iii", 'i', TAG_CARBON_PLATES);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(STOCK_CARBON,1), "iii"," pp", 'i', TAG_CARBON_PLATES, 'p', TAG_PLASTIC_SHEETS);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(CIRCUIT_BOARD_ADVANCED,1), TAG_BASIC_CIRCUITS, TAG_GOLD_WIRES, Items.LAPIS_LAZULI);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(CIRCUIT_BOARD_ELITE,2),"cqc","ril","cgc", 'i', TAG_CARBON_PLATES, 'c', TAG_GOLD_WIRES, 'g', Items.GHAST_TEAR, 'r', Items.REDSTONE, 'l', Items.LAPIS_LAZULI, 'q', Items.QUARTZ);


        RecipeJsonConverter.addShapedRecipe(new ItemStack(FUEL_TANK_EMPTY,4), "p","g","p", 'g', TAG_GLASS_BLOCKS, 'p', TAG_PLASTIC_SHEETS);


        RecipeJsonConverter.addShapelessRecipe(new ItemStack(RIFLE_ROUNDS_STACK,1), RIFLE_ROUNDS,RIFLE_ROUNDS,RIFLE_ROUNDS,RIFLE_ROUNDS);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(RIFLE_ROUNDS,4), RIFLE_ROUNDS_STACK);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(MINIGUN_DRUM_EMPTY,4), "sss","pmp","sss",'s', TAG_STEEL_INGOTS, 'p', TAG_PLASTIC_SHEETS, 'm', MECHANICAL_PARTS_OBSIDIAN_STEEL);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(MINIGUN_DRUM,1),MINIGUN_DRUM_EMPTY, RIFLE_ROUNDS_STACK,RIFLE_ROUNDS_STACK,RIFLE_ROUNDS_STACK,RIFLE_ROUNDS_STACK);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(COIL,1), " wi","wiw","iw ", 'i', TAG_IRON_INGOTS, 'w', TAG_COPPER_WIRES);

        //RecipeJsonConverter.addShapedRecipe(new ItemStack(MACHINE_UPGRADE_STACK,1), "pgp","ncn","pnp", 'p', TAG_IRON_INGOTS, 'n', TAG_GOLD_INGOTS,'g', Items.GREEN_DYE, 'c', new ItemStack(Blocks.CHEST,1));

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TURRET_ARMOR_IRON,1),"ppp"," p "," p ", 'p', TAG_IRON_INGOTS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TURRET_ARMOR_STEEL,1),"ppp"," p "," p ", 'p', TAG_STEEL_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TURRET_ARMOR_OBSIDIAN_STEEL,1),"ppp"," p "," p ", 'p', TAG_OBSIDIAN_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TURRET_ARMOR_CARBON,1),"ppp"," p "," p ", 'p', TAG_CARBON_PLATES);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(GLIDER_BACKBACK,1), "hhh","shs","hhh", 'h', TGItems.HEAVY_CLOTH, 's', TAG_IRON_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(GLIDER_WING,1), "sss","hhh","hhh", 'h', TGItems.HEAVY_CLOTH, 's', TAG_IRON_INGOTS);

        /*RecipeJsonConverter.addShapelessRecipe(new ItemStack(GLIDER,1), TGItems.GLIDER_BACKBACK, TGItems.GLIDER_WING, TGItems.GLIDER_WING);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.GAS_MASK_FILTER,1), "iii","ici","iii", 'i', "nuggetIron", 'c', Items.COAL);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.GAS_MASK,1), "grg","rrr","rfr", 'r',TAG_RUBBER, 'f', TGItems.GAS_MASK_FILTER, 'g', "paneGlass");
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGItems.GAS_MASK,1,0), new ItemStack(TGItems.GAS_MASK,1,OreDictionary.WILDCARD_VALUE), TGItems.GAS_MASK_FILTER);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(NIGHTVISION_GOGGLES,1), "rhr","cec","gsg", 'r',TAG_RUBBER, 'h', TGItems.HEAVY_CLOTH, 'c',"circuitBasic",'e', TGItems.REDSTONE_BATTERY, 'g', "blockGlass", 's', "ingotIron");
        RecipeJsonConverter.addShapedRecipe(new ItemStack(NIGHTVISION_GOGGLES,1,NIGHTVISION_GOGGLES.getMaxDamage()), "rhr","cec","gsg", 'r',TAG_RUBBER, 'h', TGItems.HEAVY_CLOTH, 'c',"circuitBasic",'e', TGItems.REDSTONE_BATTERY_EMPTY, 'g', "blockGlass", 's', "ingotIron");

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.JETPACK,1,0), "f f","pgp","rmr",'f', TGItems.FUEL_TANK, 'p', "plateObsidianSteel", 'g', TGItems.GLIDER, 'r', TGItems.ROCKET, 'm', MECHANICAL_PARTS_OBSIDIAN_STEEL);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.JETPACK,1,0), "f f","pgp","rmr",'f', TGItems.FUEL_TANK, 'p', "plateObsidianSteel", 'g', new ItemStack(TGItems.JUMPPACK,1,OreDictionary.WILDCARD_VALUE), 'r', TGItems.ROCKET, 'm', MECHANICAL_PARTS_OBSIDIAN_STEEL);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.ANTI_GRAV_PACK,1,0), "tet","cac","mbm",'t', "plateTitanium", 'e', TGItems.NUCLEAR_POWERCELL, 'b', TGItems.GLIDER_BACKBACK, 'c', TAG_ELITE_CIRCUITS, 'm', MECHANICAL_PARTS_CARBON, 'a', TGItems.ANTI_GRAV_CORE);


        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.SCUBA_TANKS,1,0), "p p","aia","p p", 'p', "sheetPlastic", 'a', TGItems.COMPRESSED_AIR_TANK, 'i', "plateIron");

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.JUMPPACK,1,0), "n n","pbp","c c", 'p', "plateIron", 'c', TGItems.COMPRESSED_AIR_TANK, 'n', "nuggetIron", 'b', TGItems.new ItemStack(TGItems.GLIDER_BACKBACK, 1));

        RecipeJsonConverter.addShapedRecipe(new ItemStack(OXYGEN_MASK,1), " p ","rpr", 'p', "sheetPlastic", 'r',TAG_RUBBER);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.TACTICAL_MASK,1,0),"ngo","cpc","pep", 'p', "sheetPlastic", 'n', new ItemStack(TGItems.NIGHTVISION_GOGGLES,1,OreDictionary.WILDCARD_VALUE), 'c', "circuitBasic", 'g', new ItemStack(TGItems.GAS_MASK,1,OreDictionary.WILDCARD_VALUE), 'o', TGItems.OXYGEN_MASK, 'e', TGItems.ENERGY_CELL);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.TACTICAL_MASK,1,0),"ogn","cpc","pep", 'p', "sheetPlastic", 'n', new ItemStack(TGItems.NIGHTVISION_GOGGLES,1,OreDictionary.WILDCARD_VALUE), 'c', "circuitBasic", 'g', new ItemStack(TGItems.GAS_MASK,1,OreDictionary.WILDCARD_VALUE), 'o', TGItems.OXYGEN_MASK, 'e', TGItems.ENERGY_CELL);

*/
 //       RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.COMBAT_KNIFE,1), " s","p ", 's', "plateSteel", 'p', "sheetPlastic");

   //     RecipeJsonConverter.addShapedRecipe(TGItems.new ItemStack(TGItems.RC_HEAT_RAY,1), "cwc","plp","plp", 'c', TAG_ELITE_CIRCUITS, 'w', "wireGold", 'p', "plateSteel", 'l', Blocks.REDSTONE_LAMP);

        //ingots/nugget
        RecipeJsonConverter.addShapelessRecipe(Items.COPPER_INGOT, TAG_COPPER_NUGGETS, TAG_COPPER_NUGGETS, TAG_COPPER_NUGGETS, TAG_COPPER_NUGGETS, TAG_COPPER_NUGGETS, TAG_COPPER_NUGGETS, TAG_COPPER_NUGGETS, TAG_COPPER_NUGGETS, TAG_COPPER_NUGGETS);
        //RecipeJsonConverter.addShapelessRecipe(TGItems.LEAD_INGOT, TAG_LEAD_NUGGETS, TAG_LEAD_NUGGETS, TAG_LEAD_NUGGETS, TAG_LEAD_NUGGETS, TAG_LEAD_NUGGETS, TAG_LEAD_NUGGETS, TAG_LEAD_NUGGETS, TAG_LEAD_NUGGETS, TAG_LEAD_NUGGETS);
        RecipeJsonConverter.addShapelessRecipe(TGItems.STEEL_INGOT, TAG_STEEL_NUGGETS, TAG_STEEL_NUGGETS, TAG_STEEL_NUGGETS, TAG_STEEL_NUGGETS, TAG_STEEL_NUGGETS, TAG_STEEL_NUGGETS, TAG_STEEL_NUGGETS, TAG_STEEL_NUGGETS, TAG_STEEL_NUGGETS);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGItems.COPPER_NUGGET, 9), TAG_COPPER_INGOTS);
        //RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGItems.NUGGET_LEAD, 9), TAG_LEAD_INGOTS);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGItems.STEEL_NUGGET, 9), TAG_STEEL_INGOTS);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(RAW_STEEL_INGOT, 2), TAG_IRON_INGOTS, TAG_IRON_INGOTS, Items.COAL);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(RAW_STEEL_INGOT, 2), TAG_IRON_INGOTS, TAG_IRON_INGOTS, Items.CHARCOAL);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(RAW_OBSIDIAN_STEEL_INGOT, 1), TAG_STEEL_INGOTS, Blocks.OBSIDIAN);

       /* ItemStack rc = new ItemStack(TGBlocks.MULTIBLOCK_MACHINE,1, EnumMultiBlockMachineType.REACTIONCHAMBER_HOUSING.getIndex());
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.MULTIBLOCK_MACHINE,9,EnumMultiBlockMachineType.REACTIONCHAMBER_HOUSING.getIndex()), "sms","pcp","ses", 's', "plateSteel", 'm', MECHANICAL_PARTS_CARBON, 'p', TGItems.CYBERNETIC_PARTS, 'e', TAG_ELITE_CIRCUITS,'c', new ItemStack(TGBlocks.BASIC_MACHINE,1, EnumMachineType.CHEM_LAB.getIndex()));
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.MULTIBLOCK_MACHINE,1,EnumMultiBlockMachineType.REACTIONCHAMBER_CONTROLLER.getIndex()), " g ","crc"," g ", 'g', hardenedGlassOrGlass, 'c', TAG_ELITE_CIRCUITS,  'r', rc);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.MULTIBLOCK_MACHINE,6,EnumMultiBlockMachineType.REACTIONCHAMBER_GLASS.getIndex()), "rgr","rgr","rgr", 'r', rc, 'g', hardenedGlassOrGlass);

        ItemStack fab = new ItemStack(TGBlocks.MULTIBLOCK_MACHINE,1, EnumMultiBlockMachineType.FABRICATOR_HOUSING.getIndex());
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.MULTIBLOCK_MACHINE,4,EnumMultiBlockMachineType.FABRICATOR_HOUSING.getIndex()), "sms","pep","scs", 's', "plateSteel", 'm', MECHANICAL_PARTS_CARBON, 'p', TGItems.CYBERNETIC_PARTS, 'e', TGItems.ELECTRIC_ENGINE, 'c', TAG_ELITE_CIRCUITS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.MULTIBLOCK_MACHINE,1,EnumMultiBlockMachineType.FABRICATOR_CONTROLLER.getIndex()), " g ","cfc"," g ", 'g', hardenedGlassOrGlass, 'c', TAG_ELITE_CIRCUITS,  'f', fab);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.MULTIBLOCK_MACHINE,4,EnumMultiBlockMachineType.FABRICATOR_GLASS.getIndex()), "fgf","g g","fgf", 'f', fab, 'g', hardenedGlassOrGlass);


        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.CROWBAR,1), " np", " p ", "p  ", 'p', "plateSteel", 'n', "nuggetSteel");

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.BASIC_MACHINE,1,EnumMachineType.AMMO_PRESS.getIndex()), "ili","cec","iri", 'i', "ingotIron", 'c', "ingotCopper", 'l', "ingotLead",'e', TGItems.ELECTRIC_ENGINE, 'r', "dustRedstone");
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.BASIC_MACHINE,1,EnumMachineType.METAL_PRESS.getIndex()), "ibi","iei","iri", 'i', "ingotIron", 'b', "blockIron",'e', TGItems.ELECTRIC_ENGINE, 'r', "dustRedstone");
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.BASIC_MACHINE,1,EnumMachineType.METAL_PRESS.getIndex()), "ibi","iei","iri", 'i', "ingotIron", 'b', "plateIron",'e', TGItems.ELECTRIC_ENGINE, 'r', "dustRedstone");

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.BASIC_MACHINE,1,EnumMachineType.TURRET.getIndex()), "pip","cec","prp", 'p', "plateIron", 'c', new ItemStack(Blocks.CONCRETE, 1, OreDictionary.WILDCARD_VALUE), 'e', TGItems.ELECTRIC_ENGINE, 'r', "dustRedstone", 'i', "circuitBasic");


        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.BASIC_MACHINE,1,EnumMachineType.CHEM_LAB.getIndex()), "igi","geg","iri", 'i', "ingotIron", 'g', new ItemStack(Items.GLASS_BOTTLE), 'e', TGItems.ELECTRIC_ENGINE, 'r', "dustRedstone");

        int repair_bench_meta = TGBlocks.SIMPLE_MACHINE.getMetaFromState(TGBlocks.SIMPLE_MACHINE.getDefaultState().withProperty(TGBlocks.SIMPLE_MACHINE.MACHINE_TYPE, EnumSimpleMachineType.REPAIR_BENCH));
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.SIMPLE_MACHINE,1,repair_bench_meta), "pmp","ici","iii", 'm', MECHANICAL_PARTS_IRON, 'c', "workbench", 'i', "nuggetIron", 'p', "plateIron");

        int charging_station_meta = TGBlocks.SIMPLE_MACHINE.getMetaFromState(TGBlocks.SIMPLE_MACHINE.getDefaultState().withProperty(TGBlocks.SIMPLE_MACHINE.MACHINE_TYPE, EnumSimpleMachineType.CHARGING_STATION));
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.SIMPLE_MACHINE,1,charging_station_meta), "sgs","cbc","sgs", 's', "plateSteel", 'g', "wireGold", 'b', "circuitBasic", 'c', TGItems.COIL);

        int camo_bench_meta = TGBlocks.SIMPLE_MACHINE.getMetaFromState(TGBlocks.SIMPLE_MACHINE.getDefaultState().withProperty(TGBlocks.SIMPLE_MACHINE.MACHINE_TYPE, EnumSimpleMachineType.CAMO_BENCH));
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.SIMPLE_MACHINE,1,camo_bench_meta), "ddd","ici","iii", 'd', "dye", 'c', "workbench", 'i', "nuggetIron");

        int blast_furnace_meta = TGBlocks.SIMPLE_MACHINE.getMetaFromState(TGBlocks.SIMPLE_MACHINE.getDefaultState().withProperty(TGBlocks.SIMPLE_MACHINE.MACHINE_TYPE, EnumSimpleMachineType.BLAST_FURNACE));
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.SIMPLE_MACHINE,1,blast_furnace_meta), "iri","ifi","sbs", 'f', Blocks.FURNACE, 'i', "plateIron", 'b', "blockIron", 's', Blocks.STONEBRICK, 'r', "dustRedstone");

        int grinder_meta = TGBlocks.SIMPLE_MACHINE2.getMetaFromState(TGBlocks.SIMPLE_MACHINE2.getDefaultState().withProperty(TGBlocks.SIMPLE_MACHINE2.MACHINE_TYPE, EnumSimpleMachineType2.GRINDER));
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.SIMPLE_MACHINE2,1,grinder_meta), "imi","mem","iri", 'i', "plateIron", 'm', TGItems.MECHANICAL_PARTS_IRON, 'e', TGItems.ELECTRIC_ENGINE, 'r', "dustRedstone");

        int armor_bench_meta = TGBlocks.SIMPLE_MACHINE2.getMetaFromState(TGBlocks.SIMPLE_MACHINE2.getDefaultState().withProperty(TGBlocks.SIMPLE_MACHINE2.MACHINE_TYPE, EnumSimpleMachineType2.ARMOR_BENCH));
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.SIMPLE_MACHINE2,1,armor_bench_meta), " c ","oeo","sos", 'e', "gemEmerald", 'o', "plateObsidianSteel", 's', "obsidian", 'c', "workbench");


        RecipeJsonConverter.addShapedRecipe(TGItems.new ItemStack(TGItems.QUARTZ_ROD,1), "q  ", " q ", "  q", 'q', "gemQuartz");
        RecipeJsonConverter.addShapedRecipe(TGItems.new ItemStack(TGItems.QUARTZ_ROD,1), "  q", " q ", "q  ", 'q', "gemQuartz");

*/
  /*      RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.LAMP_0,16,0),"iii","grg","ggg",'i',"nuggetIron",'r', "dustRedstone",'g', "paneGlass");
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGBlocks.LAMP_0,1,0), new ItemStack(TGBlocks.LAMP_0,1,6));
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGBlocks.LAMP_0,1,6), new ItemStack(TGBlocks.LAMP_0,1,0));

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.LAMP_0,16,12),"iii","grg","iii",'i',"nuggetIron",'r', "dustRedstone",'g', "paneGlass");
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGBlocks.LAMP_0,1,13), new ItemStack(TGBlocks.LAMP_0,1,12));
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGBlocks.LAMP_0,1,12), new ItemStack(TGBlocks.LAMP_0,1,13));

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGBlocks.SANDBAGS,8),TAG_RUBBER, "sand", "sand", "sand", "sand", "sand", "sand", "sand", "sand");

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.CAMONET,8), "sds", "sds", 's', "stickWood", 'd', "dirt");
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGBlocks.CAMONET_TOP,16), "wdw","dsd", "wdw", 's', "string", 'd', "dirt", 'w', "stickWood");

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.BUNKER_DOOR,2), "pp","pp","pp", 'p', "plateIron");
*/
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGItems.TACTICAL_NUKE_WARHEAD, 2), "pcp","tut","pcp", 'p', TAG_LEAD_INGOTS, 't', TGItems.TGX, 'c', TAG_BASIC_CIRCUITS, 'u', TAG_URANIUM_ENRICHED);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGItems.ROCKET_NUKE, 1), new ItemStack(TGItems.ROCKET, 1), new ItemStack(TGItems.TACTICAL_NUKE_WARHEAD, 1));

        //incendiary ammo
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(RIFLE_ROUNDS_STACK_INCENDIARY,1), RIFLE_ROUNDS_INCENDIARY,RIFLE_ROUNDS_INCENDIARY,RIFLE_ROUNDS_INCENDIARY,RIFLE_ROUNDS_INCENDIARY);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(RIFLE_ROUNDS_INCENDIARY,4), RIFLE_ROUNDS_STACK_INCENDIARY);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(MINIGUN_DRUM_INCENDIARY,1),MINIGUN_DRUM_EMPTY, RIFLE_ROUNDS_STACK_INCENDIARY,RIFLE_ROUNDS_STACK_INCENDIARY,RIFLE_ROUNDS_STACK_INCENDIARY,RIFLE_ROUNDS_STACK_INCENDIARY);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(LMG_MAGAZINE_INCENDIARY,1), LMG_MAGAZINE_EMPTY, RIFLE_ROUNDS_STACK_INCENDIARY, RIFLE_ROUNDS_STACK_INCENDIARY);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(LMG_MAGAZINE_INCENDIARY,1), LMG_MAGAZINE_EMPTY, RIFLE_ROUNDS_INCENDIARY, RIFLE_ROUNDS_INCENDIARY, RIFLE_ROUNDS_INCENDIARY, RIFLE_ROUNDS_INCENDIARY, RIFLE_ROUNDS_INCENDIARY, RIFLE_ROUNDS_INCENDIARY, RIFLE_ROUNDS_INCENDIARY, RIFLE_ROUNDS_INCENDIARY);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(AS50_MAGAZINE_INCENDIARY,1),AS50_MAGAZINE_EMPTY, SNIPER_ROUNDS_INCENDIARY, SNIPER_ROUNDS_INCENDIARY);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(PISTOL_MAGAZINE_INCENDIARY, 1), PISTOL_MAGAZINE_EMPTY, PISTOL_ROUNDS_INCENDIARY,PISTOL_ROUNDS_INCENDIARY,PISTOL_ROUNDS_INCENDIARY);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(SMG_MAGAZINE_INCENDIARY, 1), SMG_MAGAZINE_EMPTY, PISTOL_ROUNDS_INCENDIARY, PISTOL_ROUNDS_INCENDIARY);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(ASSAULTRIFLE_MAGAZINE_INCENDIARY, 1), ASSAULTRIFLE_MAGAZINE_EMPTY, RIFLE_ROUNDS_INCENDIARY, RIFLE_ROUNDS_INCENDIARY, RIFLE_ROUNDS_INCENDIARY);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(AS50_MAGAZINE_EXPLOSIVE,1),AS50_MAGAZINE_EMPTY, SNIPER_ROUNDS_EXPLOSIVE, SNIPER_ROUNDS_EXPLOSIVE);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(REDSTONE_BATTERY,2), "nwn","nrn","nrn", 'n', TAG_COPPER_NUGGETS, 'r',Items.REDSTONE, 'w', TAG_COPPER_WIRES);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(REDSTONE_BATTERY, 1), TGItems.REDSTONE_BATTERY_EMPTY, Items.REDSTONE, Items.REDSTONE);

        RecipeJsonConverter.write_special_recipetype("ammo_change_recipe", new TGIdentifier("ammo_change_recipe"));

        RecipeJsonConverter.addMiningheadChangeRecipe((GenericGunMeleeCharge) CHAINSAW, 0, CHAINSAW, CHAINSAWBLADES_STEEL);
        RecipeJsonConverter.addMiningheadChangeRecipe((GenericGunMeleeCharge) CHAINSAW, 1, CHAINSAW, CHAINSAWBLADES_OBSIDIAN);
        RecipeJsonConverter.addMiningheadChangeRecipe((GenericGunMeleeCharge) CHAINSAW, 2, CHAINSAW, CHAINSAWBLADES_CARBON);

        RecipeJsonConverter.addMiningheadChangeRecipe((GenericGunMeleeCharge) POWERHAMMER, 0, POWERHAMMER, POWERHAMMERHEAD_STEEL);
        RecipeJsonConverter.addMiningheadChangeRecipe((GenericGunMeleeCharge) POWERHAMMER, 1, POWERHAMMER, POWERHAMMERHEAD_OBSIDIAN);
        RecipeJsonConverter.addMiningheadChangeRecipe((GenericGunMeleeCharge) POWERHAMMER, 2, POWERHAMMER, POWERHAMMERHEAD_CARBON);

        RecipeJsonConverter.addMiningheadChangeRecipe((GenericGunMeleeCharge) MININGDRILL, 0, MININGDRILL, MININGDRILLHEAD_OBSIDIAN);
        RecipeJsonConverter.addMiningheadChangeRecipe((GenericGunMeleeCharge) MININGDRILL, 1, MININGDRILL, MININGDRILLHEAD_CARBON);

        RecipeJsonConverter.addShapelessRecipe(AMMO_BENCH, Items.CRAFTING_TABLE, Items.GUNPOWDER, TAG_IRON_INGOTS);
        RecipeJsonConverter.addShapelessRecipe(CAMO_BENCH, Items.CRAFTING_TABLE, TAG_DYE, TAG_DYE, TAG_DYE);

        RecipeJsonConverter.addShapelessRecipe(RAW_RUBBER, TAG_LOGS, Items.BOWL);

        addGunRecipes();
        addArmorRecipes();
        addNonMachineRecipes();

        RecipeJsonConverter.addAmmoBenchRecipe(new ItemStack(PISTOL_ROUNDS, 12));
        RecipeJsonConverter.addAmmoBenchRecipe(new ItemStack(SHOTGUN_ROUNDS, 16));
        RecipeJsonConverter.addAmmoBenchRecipe(new ItemStack(RIFLE_ROUNDS, 8));
        RecipeJsonConverter.addAmmoBenchRecipe(new ItemStack(SNIPER_ROUNDS, 4));
        RecipeJsonConverter.addAmmoBenchRecipe(new ItemStack(RIFLE_ROUNDS_STACK, 2));

        addCamoGroupRecipies();

        addSmeltingRecipes();
    }

    /**
     * Recipes that needed machines in 1.12 but are craftable by hand for now
     */
    public static void addNonMachineRecipes(){
        RecipeJsonConverter.addShapedRecipe(new ItemStack(MECHANICAL_PARTS_OBSIDIAN_STEEL,2)," i ", "ifi", " i ", 'f', Items.QUARTZ, 'i', TAG_OBSIDIAN_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(MECHANICAL_PARTS_CARBON,2)," i ", "ifi", " i ", 'f', Items.BLAZE_ROD, 'i', TAG_CARBON_PLATES);

        //RecipeJsonConverter.addShapedRecipe(new ItemStack(RIFLE_ROUNDS,8), "clc","clc","igi", 'c', TAG_COPPER_NUGGETS, 'l', TAG_LEAD_INGOTS, 'g', Items.GUNPOWDER, 'i', TAG_COPPER_INGOTS);
        //RecipeJsonConverter.addShapedRecipe(new ItemStack(SNIPER_ROUNDS,4), "clc","ili","igi", 'c', TAG_COPPER_NUGGETS, 'l', TAG_LEAD_INGOTS, 'g', Items.GUNPOWDER, 'i', TAG_COPPER_INGOTS);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(PISTOL_ROUNDS_INCENDIARY, 4), PISTOL_ROUNDS, PISTOL_ROUNDS, PISTOL_ROUNDS, PISTOL_ROUNDS, Items.BLAZE_POWDER);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(RIFLE_ROUNDS_INCENDIARY, 4), RIFLE_ROUNDS, RIFLE_ROUNDS, RIFLE_ROUNDS, RIFLE_ROUNDS, Items.BLAZE_POWDER);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(SNIPER_ROUNDS_INCENDIARY, 2), SNIPER_ROUNDS, SNIPER_ROUNDS, Items.BLAZE_POWDER);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(SHOTGUN_ROUNDS_INCENDIARY, 8), SHOTGUN_ROUNDS, SHOTGUN_ROUNDS, SHOTGUN_ROUNDS, SHOTGUN_ROUNDS, SHOTGUN_ROUNDS, SHOTGUN_ROUNDS, SHOTGUN_ROUNDS, SHOTGUN_ROUNDS, Items.BLAZE_POWDER);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(COMPRESSED_AIR_TANK_EMPTY,4), " l ", "i i", "i i", 'i', TAG_IRON_INGOTS, 'l', Items.LEVER);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(COMPRESSED_AIR_TANK,1), COMPRESSED_AIR_TANK_EMPTY, Items.WATER_BUCKET, Items.COAL);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(WIRE_GOLD,1)," cc"," c ","cc ",'c', TAG_GOLD_NUGGETS);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(CARBON_FIBERS, 1), Items.DIAMOND, Items.BLAZE_POWDER);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(PLATE_CARBON,1), "pp", 'p', TAG_CARBON_PLATES);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(ENERGY_CELL,4), "gwg","prp","prp", 'p', TAG_PLASTIC_SHEETS, 'r',Items.REDSTONE_BLOCK, 'w', TAG_COPPER_WIRES, 'g', TAG_GOLD_INGOTS);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(ENERGY_CELL, 1), TGItems.ENERGY_CELL_EMPTY, Items.REDSTONE, Items.REDSTONE, Items.REDSTONE, Items.REDSTONE);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(FUEL_TANK,2 ),FUEL_TANK_EMPTY, FUEL_TANK_EMPTY, Items.LAVA_BUCKET);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(ADVANCED_ROUNDS,16), "i", "t", 'i', TAG_OBSIDIAN_INGOTS, 't', TGX);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(GRENADE_40MM,12), " i ","sts","sgs", 's', TAG_IRON_NUGGETS, 't', Blocks.TNT, 'g', Items.GUNPOWDER, 'i', TAG_IRON_INGOTS);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(BIO_TANK,1), BIO_TANK_EMPTY, BIOMASS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(NUCLEAR_POWERCELL_EMPTY,2), "wgw","prp","prp", 'p', TAG_LEAD_INGOTS, 'r',Items.REDSTONE_BLOCK, 'w', TAG_GOLD_WIRES, 'g', CIRCUIT_BOARD_BASIC);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(NUCLEAR_POWERCELL, 1), NUCLEAR_POWERCELL_EMPTY, ENRICHED_URANIUM);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(GAUSSRIFLE_SLUGS,4), "i", "t", 'i', TAG_TITANIUM_INGOTS, 't', TAG_OBSIDIAN_INGOTS);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(NETHER_CHARGE, 4), Items.NETHERRACK, Items.SOUL_SAND, Items.LAVA_BUCKET);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(LASER_FOCUS,1), "rrr", "rdr", "rrr", 'r', Items.REDSTONE, 'd', Items.DIAMOND);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(CYBERNETIC_PARTS,1), Items.SOUL_SAND, Items.REDSTONE, TAG_GOLD_WIRES, TAG_PLASTIC_SHEETS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(RAD_EMITTER,1), " c ", "lul", "lpl", 'c', CIRCUIT_BOARD_ADVANCED, 'l', TAG_LEAD_INGOTS, 'u', TAG_URANIUM_ENRICHED, 'p', MECHANICAL_PARTS_CARBON);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(SONIC_EMITTER,1), " t ", "cpc", "tbt", 'b', CIRCUIT_BOARD_ADVANCED, 't', TAG_TITANIUM_INGOTS, 'c', COIL, 'p', MECHANICAL_PARTS_CARBON);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGX,4), "glg","lbl", "glg", 'g', Items.GUNPOWDER, 'l', Items.LAPIS_LAZULI, 'b', Items.BLAZE_POWDER);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGX,4), "glg","lbl", "glg", 'l', Items.GUNPOWDER, 'g', Items.LAPIS_LAZULI, 'b', Items.BLAZE_POWDER);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TREATED_LEATHER,1), Items.LEATHER, Items.LEATHER, Items.SLIME_BALL, Items.GUNPOWDER);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(CHAINSAWBLADES_STEEL,1), " i", "ip", " i", 'i', TAG_STEEL_INGOTS, 'p', MECHANICAL_PARTS_IRON);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(CHAINSAWBLADES_OBSIDIAN,1), " i", "ip", " i", 'i', TAG_OBSIDIAN_INGOTS, 'p', MECHANICAL_PARTS_OBSIDIAN_STEEL);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(CHAINSAWBLADES_CARBON,1), " i", "ip", " i", 'i', TAG_CARBON_PLATES, 'p', MECHANICAL_PARTS_CARBON);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(POWERHAMMERHEAD_STEEL,1), "i  ","iii", "i  ", 'i', TAG_STEEL_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(POWERHAMMERHEAD_OBSIDIAN,1), "i  ","iii", "i  ", 'i', TAG_OBSIDIAN_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(POWERHAMMERHEAD_CARBON,1), "i  ","iii", "i  ", 'i', TAG_CARBON_PLATES);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(MININGDRILLHEAD_OBSIDIAN, 1), " ii", "iii", " ii", 'i', TAG_OBSIDIAN_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(MININGDRILLHEAD_CARBON, 1), " ii", "iii", " ii", 'i', TAG_CARBON_PLATES);

        //RecipeJsonConverter.addShapelessRecipe(new ItemStack(Items.GRAY_CONCRETE, 8), TAG_CONCRETE_POWDER, TAG_CONCRETE_POWDER, TAG_CONCRETE_POWDER, TAG_CONCRETE_POWDER, TAG_CONCRETE_POWDER, TAG_CONCRETE_POWDER, TAG_CONCRETE_POWDER, TAG_CONCRETE_POWDER, Items.WATER_BUCKET);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(POWER_ARMOR_PLATING,2), "tmt", "bcb", "pmp", 'b', CIRCUIT_BOARD_BASIC, 't', TAG_TITANIUM_INGOTS, 'c', CYBERNETIC_PARTS, 'm', MECHANICAL_PARTS_CARBON, 'p', TAG_CARBON_PLATES);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(POWER_ARMOR_PLATING_MK2,4), "tmt", "bcb", "pmp", 'b', CIRCUIT_BOARD_ADVANCED, 't', TAG_NETHERITE_INGOTS, 'c', CYBERNETIC_PARTS, 'm', MECHANICAL_PARTS_CARBON, 'p', POWER_ARMOR_PLATING);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(NETHER_ARMOR_PLATING,4), " i ", "cbc", "tpt", 't', TAG_NETHERITE_INGOTS, 'b', CIRCUIT_BOARD_ADVANCED, 'c', CYBERNETIC_PARTS, 'i', TAG_TITANIUM_INGOTS, 'p', TAG_CARBON_PLATES);



        TAG_LIST.put(TAG_CONCRETE, Arrays.asList(
                Items.WHITE_CONCRETE,
                Items.ORANGE_CONCRETE,
                Items.MAGENTA_CONCRETE,
                Items.LIGHT_BLUE_CONCRETE,
                Items.YELLOW_CONCRETE,
                Items.LIME_CONCRETE,
                Items.PINK_CONCRETE,
                Items.GRAY_CONCRETE,
                Items.LIGHT_GRAY_CONCRETE,
                Items.CYAN_CONCRETE,
                Items.PURPLE_CONCRETE,
                Items.BLUE_CONCRETE,
                Items.BROWN_CONCRETE,
                Items.GREEN_CONCRETE,
                Items.RED_CONCRETE,
                Items.BLACK_CONCRETE));

        Pair<Item, Item>[] concretes = new Pair[]{
                new Pair(Items.WHITE_CONCRETE, Items.WHITE_CONCRETE_POWDER),
                new Pair(Items.ORANGE_CONCRETE, Items.ORANGE_CONCRETE_POWDER),
                new Pair(Items.MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE_POWDER),
                new Pair(Items.LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE_POWDER),
                new Pair(Items.YELLOW_CONCRETE, Items.YELLOW_CONCRETE_POWDER),
                new Pair(Items.LIME_CONCRETE, Items.LIME_CONCRETE_POWDER),
                new Pair(Items.PINK_CONCRETE, Items.PINK_CONCRETE_POWDER),
                new Pair(Items.GRAY_CONCRETE, Items.GRAY_CONCRETE_POWDER),
                new Pair(Items.LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE_POWDER),
                new Pair(Items.CYAN_CONCRETE, Items.CYAN_CONCRETE_POWDER),
                new Pair(Items.PURPLE_CONCRETE, Items.PURPLE_CONCRETE_POWDER),
                new Pair(Items.BLUE_CONCRETE, Items.BLUE_CONCRETE_POWDER),
                new Pair(Items.BROWN_CONCRETE, Items.BROWN_CONCRETE_POWDER),
                new Pair(Items.GREEN_CONCRETE, Items.GREEN_CONCRETE_POWDER),
                new Pair(Items.RED_CONCRETE, Items.RED_CONCRETE_POWDER),
                new Pair(Items.BLACK_CONCRETE, Items.BLACK_CONCRETE_POWDER),
        };
        for (var concrete : concretes) {
            RecipeJsonConverter.addShapelessRecipe(new ItemStack(concrete.getLeft(), 8), concrete.getRight(), concrete.getRight(), concrete.getRight(), concrete.getRight(), concrete.getRight(), concrete.getRight(), concrete.getRight(), concrete.getRight(), Items.WATER_BUCKET);
        }

        RecipeJsonConverter.addShapedRecipe(new ItemStack(CONCRETE_BROWN, 32), "ccc", "cic", "ccc", 'c', TAG_CONCRETE, 'i', Items.IRON_BARS);

    }

    public static void addSmeltingRecipes(){
        RecipeJsonConverter.addSmeltingAndBlastingRecipe(new ItemStack(TIN_INGOT), TIN_ORE, "tin_ingot", 0.7, 200);
        RecipeJsonConverter.addSmeltingAndBlastingRecipe(new ItemStack(TIN_INGOT), DEEPSLATE_TIN_ORE, "tin_ingot", 0.7, 200);
        RecipeJsonConverter.addSmeltingAndBlastingRecipe(new ItemStack(TIN_INGOT), RAW_TIN, "tin_ingot", 0.7, 200);

        RecipeJsonConverter.addSmeltingAndBlastingRecipe(new ItemStack(LEAD_INGOT), LEAD_ORE, "lead_ingot", 0.8, 200);
        RecipeJsonConverter.addSmeltingAndBlastingRecipe(new ItemStack(LEAD_INGOT), DEEPSLATE_LEAD_ORE, "lead_ingot", 0.8, 200);
        RecipeJsonConverter.addSmeltingAndBlastingRecipe(new ItemStack(LEAD_INGOT), RAW_LEAD, "lead_ingot", 0.8, 200);

        RecipeJsonConverter.addBlastingRecipe(new ItemStack(TITANIUM_INGOT), TITANIUM_ORE, "titanium_ingot", 1.5, 200);
        RecipeJsonConverter.addBlastingRecipe(new ItemStack(TITANIUM_INGOT), DEEPSLATE_TITANIUM_ORE, "titanium_ingot", 1.5, 200);
        RecipeJsonConverter.addBlastingRecipe(new ItemStack(TITANIUM_INGOT), RAW_TITANIUM, "titanium_ingot", 1.5, 200);

        RecipeJsonConverter.addBlastingRecipe(new ItemStack(STEEL_INGOT), RAW_STEEL_INGOT, "steel_ingot", 1.2, 200);
        RecipeJsonConverter.addBlastingRecipe(new ItemStack(OBSIDIAN_STEEL_INGOT), RAW_OBSIDIAN_STEEL_INGOT, "obsidian_steel_ingot", 1.5, 200);

        RecipeJsonConverter.addSmeltingAndBlastingRecipe(new ItemStack(RUBBER_BAR), RAW_RUBBER, "rubber_bar", 0.5, 200);
    }

    public static void addCamoGroupRecipies(){
        RecipeJsonConverter.addCamoGroupRecipe("camo_techguns_concrete", CONCRETE_BROWN, CONCRETE_BROWN_PIPES, CONCRETE_GREY, CONCRETE_GREY_DARK, CONCRETE_BROWN_LIGHT, CONCRETE_BROWN_LIGHT_SCAFF);
        RecipeJsonConverter.addCamoGroupRecipe("camo_minecraft_concrete",
                Items.WHITE_CONCRETE,
                Items.ORANGE_CONCRETE,
                Items.MAGENTA_CONCRETE,
                Items.LIGHT_BLUE_CONCRETE,
                Items.YELLOW_CONCRETE,
                Items.LIME_CONCRETE,
                Items.PINK_CONCRETE,
                Items.GRAY_CONCRETE,
                Items.LIGHT_GRAY_CONCRETE,
                Items.CYAN_CONCRETE,
                Items.PURPLE_CONCRETE,
                Items.BLUE_CONCRETE,
                Items.BROWN_CONCRETE,
                Items.GREEN_CONCRETE,
                Items.RED_CONCRETE,
                Items.BLACK_CONCRETE);

        RecipeJsonConverter.addCamoGroupRecipe("camo_minecraft_concrete_powder",
                Items.WHITE_CONCRETE_POWDER,
                Items.ORANGE_CONCRETE_POWDER,
                Items.MAGENTA_CONCRETE_POWDER,
                Items.LIGHT_BLUE_CONCRETE_POWDER,
                Items.YELLOW_CONCRETE_POWDER,
                Items.LIME_CONCRETE_POWDER,
                Items.PINK_CONCRETE_POWDER,
                Items.GRAY_CONCRETE_POWDER,
                Items.LIGHT_GRAY_CONCRETE_POWDER,
                Items.CYAN_CONCRETE_POWDER,
                Items.PURPLE_CONCRETE_POWDER,
                Items.BLUE_CONCRETE_POWDER,
                Items.BROWN_CONCRETE_POWDER,
                Items.GREEN_CONCRETE_POWDER,
                Items.RED_CONCRETE_POWDER,
                Items.BLACK_CONCRETE_POWDER);
    }

    /**
     * 'm' is expected to be the magazine in the pattern
     * @param gun
     * @param components
     */
    protected static void addForAllCombos(GenericGun gun , Object... components){
        AmmoType type = gun.getAmmoType();
        if(type.getEmptyMag()[0] != ItemStack.EMPTY){

            RecipeJsonConverter.addGunShapedRecipe(gun, false, AmmoTypes.TYPE_DEFAULT, "", ArrayUtils.addAll(components, new Object[]{'m', type.getEmptyMag()[0]}));
            for (AmmoVariant var : type.getVariants()){
                RecipeJsonConverter.addGunShapedRecipe(gun, true, var.getKey(), "", ArrayUtils.addAll(components, new Object[]{'m', var.getAmmo()[0]}));
            }
        } else {
            throw new UnsupportedOperationException("Only guns with Magazines are supported!");
        }


    }

    protected static void addForAllToolCombos(GenericGun gun, Item[] heads, Object... components){
        AmmoType type = gun.getAmmoType();
        if(type.getEmptyMag()[0] != ItemStack.EMPTY){

            for(int i=0; i<heads.length; i++) {
                RecipeJsonConverter.addMiningToolShapedRecipe(gun, false, AmmoTypes.TYPE_DEFAULT, "", i, ArrayUtils.addAll(components, new Object[]{'m', type.getEmptyMag()[0], 'h', heads[i]}));
                for (AmmoVariant var : type.getVariants()) {
                    RecipeJsonConverter.addMiningToolShapedRecipe(gun, true, var.getKey(), "", i, ArrayUtils.addAll(components, new Object[]{'m', var.getAmmo()[0], 'h', heads[i]}));
                }
            }
        } else {
            throw new UnsupportedOperationException("Only guns with Magazines are supported!");
        }


    }

    public static void addGunRecipes() {

        RecipeJsonConverter.addEmptyGunRecipe(HANDCANNON,  "bfs", 'b', TGItems.BARREL_STONE, 'f', Items.FLINT_AND_STEEL, 's', TGItems.STOCK_WOOD);

        addForAllCombos(PISTOL, "bsp"," fp","  m", 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.MECHANICAL_PARTS_OBSIDIAN_STEEL, 'p', TGItems.PLASTIC_SHEET, 's', TAG_STEEL_INGOTS);

        RecipeJsonConverter.addEmptyGunRecipe(REVOLVER,  "bmf"," s ", 'f', Items.FLINT_AND_STEEL, 'b', TGItems.BARREL_IRON, 's', TGItems.STOCK_WOOD, 'm', TGItems.MECHANICAL_PARTS_IRON);

        RecipeJsonConverter.addEmptyGunRecipe(SAWEDOFF,  "bfw","bf ", 'b', TGItems.BARREL_IRON, 'f', Items.FLINT_AND_STEEL, 'w', TGItems.STOCK_WOOD);

        addForAllCombos(THOMPSON, "bfs"," m ", 'f', TGItems.RECEIVER_IRON, 'b', TGItems.BARREL_IRON, 's', TGItems.STOCK_WOOD);

        addForAllCombos(M4," gr","bfs","nmi", 'g', Items.GLASS_PANE, 'r', Items.REDSTONE, 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_STEEL, 's', TGItems.STOCK_PLASTIC, 'n', TAG_IRON_NUGGETS, 'i', TAG_IRON_INGOTS);


        RecipeJsonConverter.addEmptyGunRecipe(BOLTACTION, "gi ", "bfs", 'g', TAG_GLASS_BLOCKS, 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_IRON, 's', TGItems.STOCK_WOOD,'i', TAG_IRON_INGOTS);

        RecipeJsonConverter.addEmptyGunRecipe(COMBAT_SHOTGUN, "bfs","i  ",'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_STEEL, 's', TGItems.STOCK_PLASTIC, 'i', TAG_STEEL_INGOTS);


        addForAllCombos(FLAMETHROWER, "prs","fm ",'r', TGItems.RECEIVER_IRON, 'p', TGItems.PUMP_MECHANISM, 's', TGItems.STOCK_PLASTIC, 'f', Items.FLINT_AND_STEEL);

        addForAllCombos(BIOGUN, "frs"," m ",'r', TGItems.RECEIVER_STEEL, 'f', TGItems.PUMP_MECHANISM, 's', TGItems.STOCK_PLASTIC);

        addForAllCombos(LASERGUN, " gd","brs"," mp", 'g', Items.GLASS_PANE, 'd', Items.REDSTONE, 'b', TGItems.BARREL_LASER, 'p', TGItems.MECHANICAL_PARTS_CARBON, 's', TGItems.STOCK_PLASTIC, 'r', TGItems.RECEIVER_OBSIDIAN_STEEL);

        addForAllCombos(BLASTERRIFLE, "pcg","brs"," m ", 'g', TAG_GLASS_BLOCKS,'p', TAG_CARBON_PLATES, 'c', CIRCUIT_BOARD_ADVANCED, 'b', TGItems.BARREL_LASER, 'r', TGItems.RECEIVER_CARBON, 's', TGItems.STOCK_CARBON);

        addForAllCombos(AK47, "bfs","wm ", 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_IRON, 's', TGItems.STOCK_WOOD, 'w', TAG_LOGS);

        addForAllCombos(AS50, "dpd","bbf", " mt", 'f', TGItems.RECEIVER_OBSIDIAN_STEEL, 'b', TGItems.BARREL_OBSIDIAN_STEEL, 't', TGItems.STOCK_PLASTIC, 'd', Items.DIAMOND, 'p', TAG_OBSIDIAN_INGOTS);

        RecipeJsonConverter.addGunShapedRecipe(ROCKET_LAUNCHER, false, AmmoTypes.TYPE_DEFAULT, "", "bb","f ", 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_STEEL);
        for(AmmoVariant var: ROCKET_LAUNCHER.getAmmoType().getVariants()){
            RecipeJsonConverter.addGunShapedRecipe(ROCKET_LAUNCHER, true, var.getKey(), "", "mbb"," f ", 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_STEEL, 'm', var.getAmmo()[0]);
        }

        RecipeJsonConverter.addGunShapedRecipe(GUIDED_MISSLE_LAUNCHER, false, AmmoTypes.TYPE_DEFAULT, "", "gc","bb","f ", 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_OBSIDIAN_STEEL, 'g', TAG_GLASS_BLOCKS, 'c', CIRCUIT_BOARD_ADVANCED);
        for(AmmoVariant var: GUIDED_MISSLE_LAUNCHER.getAmmoType().getVariants()){
            RecipeJsonConverter.addGunShapedRecipe(GUIDED_MISSLE_LAUNCHER, true, var.getKey(), "", " gc","mbb"," f ", 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_OBSIDIAN_STEEL, 'g', TAG_GLASS_BLOCKS, 'c', CIRCUIT_BOARD_ADVANCED, 'm', var.getAmmo()[0]);
        }

        addForAllCombos(LMG, " gr","bfs"," m ", 'g', Items.GLASS_PANE, 'r', Items.REDSTONE, 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_OBSIDIAN_STEEL, 's', TGItems.STOCK_PLASTIC);

        //addForAllCombos(LMG, " gr","bfs"," m ", 'g', Items.GLASS_PANE, 'r', Items.REDSTONE, 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_OBSIDIAN_STEEL, 's', TGItems.STOCK_PLASTIC);

        addForAllCombos(MINIGUN, "bbe","bbr","bbm", 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'e', TGItems.ELECTRIC_ENGINE, 'r', TGItems.RECEIVER_OBSIDIAN_STEEL);

        addForAllCombos(PDW, "brs"," m ", 'b', TGItems.BARREL_CARBON, 'r', TGItems.RECEIVER_CARBON, 's', TGItems.STOCK_CARBON);

        addForAllCombos(PULSERIFLE,"dpc","brs"," m ", 'b', TGItems.BARREL_CARBON, 'r', TGItems.RECEIVER_CARBON, 's', TGItems.STOCK_CARBON, 'd', Items.DIAMOND, 'p', TAG_TITANIUM_INGOTS, 'c', CIRCUIT_BOARD_ADVANCED);

        RecipeJsonConverter.addAmmoTransferRecipe(GOLDEN_REVOLVER,  true, AmmoTypes.TYPE_DEFAULT,"", "ggg","grg","ggg", 'g', TAG_GOLD_INGOTS, 'r', new ItemStack(REVOLVER,1));

        RecipeJsonConverter.addGunShapedRecipe(NETHERBLASTER, true,AmmoTypes.TYPE_DEFAULT, "", "cpc","bns","cpc", 'c', TGItems.CYBERNETIC_PARTS, 'p', TAG_OBSIDIAN_INGOTS, 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'n', TGItems.NETHER_CHARGE, 's', TGItems.PUMP_MECHANISM);

        addForAllCombos(AUG, "gpg","bfs","i m", 'g', Items.GLASS_PANE, 'p', TAG_STEEL_INGOTS, 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'f', TGItems.RECEIVER_STEEL, 's', TGItems.STOCK_PLASTIC, 'i', TAG_PLASTIC_SHEETS);


        RecipeJsonConverter.addEmptyGunRecipe(GRENADE_LAUNCHER, "brs"," p ", 'b', TGItems.BARREL_OBSIDIAN_STEEL, 'r', TGItems.RECEIVER_STEEL, 's', TGItems.STOCK_PLASTIC, 'p', TAG_STEEL_INGOTS);

        addForAllCombos(SONICSHOTGUN, " p ", "ers", " m ", 'p', TAG_TITANIUM_INGOTS, 'e', TGItems.SONIC_EMITTER, 'r', TGItems.RECEIVER_CARBON, 's', TGItems.STOCK_CARBON);

        addForAllCombos(NUCLEAR_DEATHRAY, "ltl","ers"," m ", 'l', TAG_LEAD_INGOTS, 't', TAG_TITANIUM_INGOTS, 'e', TGItems.RAD_EMITTER, 'r', TGItems.RECEIVER_CARBON, 's', TGItems.STOCK_CARBON);

        addForAllCombos(MAC10, " pi","bri"," m ", 'p', TAG_PLASTIC_SHEETS, 'i', TAG_IRON_NUGGETS, 'r', TGItems.RECEIVER_STEEL, 'b', TGItems.BARREL_OBSIDIAN_STEEL);

        addForAllCombos(SCAR, "gpd","brs", " m ", 'r', TGItems.RECEIVER_OBSIDIAN_STEEL, 'b', TGItems.BARREL_OBSIDIAN_STEEL, 's', TGItems.STOCK_PLASTIC,'d', Items.DIAMOND, 'p', TAG_PLASTIC_SHEETS, 'g', TAG_GLASS_BLOCKS);

        addForAllCombos(VECTOR, " gd","brs", " m ", 'r', TGItems.RECEIVER_OBSIDIAN_STEEL, 'b', TGItems.BARREL_OBSIDIAN_STEEL, 's', TGItems.STOCK_PLASTIC,'m', TGItems.SMG_MAGAZINE, 'd', Items.REDSTONE, 'g', Items.GLASS_PANE);

        addForAllCombos(MIBGUN, "bsp"," fp","  m", 'b', TGItems.BARREL_LASER, 'f', TGItems.MECHANICAL_PARTS_CARBON, 'p', TAG_TITANIUM_INGOTS, 's', TGItems.SONIC_EMITTER, 'm', TGItems.ENERGY_CELL);

        RecipeJsonConverter.addGunShapedRecipe(GAUSS_RIFLE, true,AmmoTypes.TYPE_DEFAULT, "", "dpc","brs"," ae", 'b', TGItems.BARREL_GAUSS, 'r', TGItems.RECEIVER_CARBON, 's', TGItems.STOCK_CARBON, 'e', TGItems.ENERGY_CELL, 'a', TGItems.GAUSSRIFLE_SLUGS, 'd', Items.DIAMOND, 'p', TAG_TITANIUM_INGOTS, 'c', CIRCUIT_BOARD_ADVANCED);
        RecipeJsonConverter.addGunShapedRecipe(GAUSS_RIFLE, false,AmmoTypes.TYPE_DEFAULT, "", "dpc","brs","  e", 'b', TGItems.BARREL_GAUSS, 'r', TGItems.RECEIVER_CARBON, 's', TGItems.STOCK_CARBON, 'e', ENERGY_CELL_EMPTY, 'd', Items.DIAMOND, 'p', TAG_TITANIUM_INGOTS, 'c', CIRCUIT_BOARD_ADVANCED);

        addForAllCombos(TFG, "t  ","bpr","tm ", 'b', TGItems.BARREL_TITANIUM, 'r', TGItems.RECEIVER_TITANIUM, 't', TAG_TITANIUM_INGOTS, 'p', TGItems.PLASMA_GENERATOR);

        addForAllCombos(LASERPISTOL, "obo","scm","ssp", 'b', TGItems.BARREL_LASER, 'o', TAG_OBSIDIAN_INGOTS, 's', TAG_STEEL_NUGGETS, 'p', TAG_PLASTIC_SHEETS, 'c', CIRCUIT_BOARD_ADVANCED);

        addForAllCombos(TESLAGUN, " gd", "crs", " m ", 'g', Items.GLASS_PANE, 'd', Items.REDSTONE, 'c', TGItems.COIL, 'r', TGItems.RECEIVER_CARBON, 's', TGItems.STOCK_CARBON);

        RecipeJsonConverter.addAmmoTransferRecipe(GRIM_REAPER, true, AmmoTypes.TYPE_DEFAULT, "", "rr ", "rrc", 'r', new ItemStack(GUIDED_MISSLE_LAUNCHER), 'c', TGItems.RECEIVER_CARBON);

        RecipeJsonConverter.addAmmoTransferRecipe(M4_INFILTRATOR,true, AmmoTypes.TYPE_DEFAULT,"", "gpg","wwm","rri", 'm', new ItemStack(M4), 'g', TAG_GLASS_BLOCKS, 'p', TAG_STEEL_INGOTS, 'w', TAG_WOOL,'i',TAG_STEEL_INGOTS, 'r', Items.REDSTONE);


        addForAllToolCombos(POWERHAMMER, new Item[]{POWERHAMMERHEAD_STEEL, POWERHAMMERHEAD_OBSIDIAN, POWERHAMMERHEAD_CARBON}, " i ", "hpr", " im", 'p', new ItemStack(Blocks.PISTON,1), 'r', TGItems.RECEIVER_IRON, 'i', TGItems.MECHANICAL_PARTS_IRON);

        addForAllToolCombos(CHAINSAW, new Item[]{CHAINSAWBLADES_STEEL, CHAINSAWBLADES_OBSIDIAN, CHAINSAWBLADES_CARBON}, "  p","hsr","  m", 's', TAG_STEEL_INGOTS, 'r', TGItems.RECEIVER_IRON, 'p', TGItems.PLASTIC_SHEET);

        addForAllToolCombos(MININGDRILL, new Item[]{MININGDRILLHEAD_OBSIDIAN, MININGDRILLHEAD_CARBON}, "  p","hsr","  m", 's', TAG_STEEL_INGOTS, 'r', TGItems.RECEIVER_IRON, 'p', TGItems.PLASTIC_SHEET);

        /*

        RecipeJsonConverter.addShapedRecipe(new ItemStack(stielgranate,16), " it"," wi","i  ",'i', "ingotIron",'w', "plankWood", 't', Blocks.TNT);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(powerhammer,1), " m ", "spr", " mc", 'p', new ItemStack(Blocks.PISTON,1), 'r', TGItems.RECEIVER_IRON, 'm', TGItems.MECHANICAL_PARTS_IRON, 's', "plateIron", 'c', TGItems.COMPRESSED_AIR_TANK);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(powerhammer,1,powerhammer.getMaxDamage()), " m ", "spr", " mc", 'p', new ItemStack(Blocks.PISTON,1), 'r', TGItems.RECEIVER_IRON, 'm', TGItems.MECHANICAL_PARTS_IRON, 's', "plateIron", 'c', TGItems.COMPRESSED_AIR_TANK_EMPTY);

        //RecipeJsonConverter.addRecipe(new ShapelessOreRecipeCopyNBT(new ItemStack(powerHammerAdv,1), new ItemStack(powerHammer,1), "gemDiamond", "gemDiamond", "gemDiamond"));

        RecipeJsonConverter.addShapedRecipe(new ItemStack(chainsaw,1), "ccp","mmr","ccf", 'c', TGItems.MECHANICAL_PARTS_IRON, 'm', "plateIron", 'r', TGItems.RECEIVER_IRON, 'p', TGItems.PLASTIC_SHEET, 'f', TGItems.FUEL_TANK);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(chainsaw,1,chainsaw.getMaxDamage()), "ccp","mmr","ccf", 'c', TGItems.MECHANICAL_PARTS_IRON, 'm', "plateIron", 'r', TGItems.RECEIVER_IRON, 'p', TGItems.PLASTIC_SHEET, 'f', TGItems.FUEL_TANK_EMPTY);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(fraggrenade,16), " if","iti"," i ",'i', "ingotSteel",'f', Items.FLINT_AND_STEEL, 't', Blocks.TNT);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(miningdrill,1), " m ","drs"," f ", 'm', TGItems.MECHANICAL_PARTS_CARBON, 'f', TGItems.FUEL_TANK, 'd', TGItems.MININGDRILLHEAD_OBSIDIAN, 's', TGItems.STOCK_PLASTIC, 'r', TGItems.RECEIVER_OBSIDIAN_STEEL);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(miningdrill,1,miningdrill.getMaxDamage()), " m ","drs"," f ", 'm', TGItems.MECHANICAL_PARTS_CARBON, 'f', TGItems.FUEL_TANK_EMPTY, 'd', TGItems.MININGDRILLHEAD_OBSIDIAN, 's', TGItems.STOCK_PLASTIC, 'r', TGItems.RECEIVER_OBSIDIAN_STEEL);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(shishkebap,1),"p ","pm","sf", 'p', "plateObsidianSteel", 'm', TGItems.PUMP_MECHANISM, 's', "sheetPlastic", 'f', TGItems.FUEL_TANK);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(shishkebap,1,shishkebap.getMaxDamage()),"p ","pm","sf", 'p', "plateObsidianSteel", 'm', TGItems.PUMP_MECHANISM, 's', "sheetPlastic", 'f', TGItems.FUEL_TANK_EMPTY);
        */
    }

    public static void addArmorRecipes(){
        addSimpleArmorRecipe(
                TGArmors.T1_SCOUT_HELMET,
                TGArmors.T1_SCOUT_CHESTPLATE,
                TGArmors.T1_SCOUT_LEGGINGS,
                TGArmors.T1_SCOUT_BOOTS,
                HEAVY_CLOTH);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T1_COMBAT_HELMET,1), "iii","c c", 'i', TAG_IRON_INGOTS, 'c', TGItems.HEAVY_CLOTH);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T1_COMBAT_CHESTPLATE,1), "c c","iii","ccc", 'i', TAG_IRON_INGOTS, 'c', TGItems.HEAVY_CLOTH);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T1_COMBAT_LEGGINGS,1), "iii","c c","c c", 'i', TAG_IRON_INGOTS, 'c', TGItems.HEAVY_CLOTH);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T1_COMBAT_BOOTS,1), "c c","i i", 'i', TAG_IRON_INGOTS, 'c', TGItems.HEAVY_CLOTH);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T1_MINER_HELMET,1), "iyi","c c",'i', TAG_IRON_INGOTS, 'c', TGItems.HEAVY_CLOTH, 'y', TAG_DYE);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T1_MINER_CHESTPLATE,1), "c c","ici","ccc",'i', TAG_IRON_INGOTS, 'c', TGItems.HEAVY_CLOTH);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T1_MINER_LEGGINGS,1), "ici","c c","c c", 'i', TAG_IRON_INGOTS, 'c', TGItems.HEAVY_CLOTH);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T1_MINER_BOOTS,1), "c c","i i", 'i', TAG_IRON_NUGGETS, 'c', TGItems.HEAVY_CLOTH);

        addSimpleArmorRecipe(
                TGArmors.T1_STEAM_HELMET,
                TGArmors.T1_STEAM_CHESTPLATE,
                TGArmors.T1_STEAM_LEGGINGS,
                TGArmors.T1_STEAM_BOOTS,
                STEAMARMOR_PLATE);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_COMBAT_HELMET,1), "iii","h h", 'h', TGItems.HEAVY_CLOTH,'i', TAG_OBSIDIAN_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_COMBAT_CHESTPLATE,1), "h h","iii","iii", 'h', TGItems.HEAVY_CLOTH,'i', TAG_OBSIDIAN_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_COMBAT_LEGGINGS,1), "ihi","i i","h h", 'h', TGItems.HEAVY_CLOTH,'i', TAG_OBSIDIAN_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_COMBAT_BOOTS,1), "h h","i i", 'h',TGItems.HEAVY_CLOTH,'i', TAG_OBSIDIAN_INGOTS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_COMMANDO_HELMET,1), "ihi","hgh", 'h',TAG_RUBBER,'i', TAG_OBSIDIAN_INGOTS,'g',TAG_GLASS_PANES);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_COMMANDO_CHESTPLATE,1), "h h","hih","iii", 'h',TAG_RUBBER,'i', TAG_OBSIDIAN_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_COMMANDO_LEGGINGS,1), "hih","i i","h h", 'h',TAG_RUBBER,'i', TAG_OBSIDIAN_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_COMMANDO_BOOTS,1), "i i","h h", 'h',TAG_RUBBER,'i', TAG_OBSIDIAN_INGOTS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_COMBAT_HELMET,1), "ppp","f f", 'f', TAG_CARBON_FIBERS,'p', TAG_CARBON_PLATES);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_COMBAT_CHESTPLATE,1), "p p","ppp","fpf", 'f', TAG_CARBON_FIBERS,'p', TAG_CARBON_PLATES);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_COMBAT_LEGGINGS,1), "pfp","p p","f f", 'f', TAG_CARBON_FIBERS,'p', TAG_CARBON_PLATES);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_COMBAT_BOOTS,1), "f f","p p", 'f', TAG_CARBON_FIBERS,'p', TAG_CARBON_PLATES);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_POWER_HELMET,1), "cpc","pgp", 'p', TGItems.POWER_ARMOR_PLATING, 'g', TAG_GLASS_PANES, 'c', TAG_ADVANCED_CIRCUITS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_POWER_CHESTPLATE,1), "p p","ece","ppp", 'p', TGItems.POWER_ARMOR_PLATING, 'c', TAG_ADVANCED_CIRCUITS, 'e', TGItems.ELECTRIC_ENGINE);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_POWER_LEGGINGS,1), "pcp","e e","p p", 'p', TGItems.POWER_ARMOR_PLATING, 'c', TAG_ADVANCED_CIRCUITS, 'e', TGItems.ELECTRIC_ENGINE);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_POWER_BOOTS,1), "e e","p p", 'p', TGItems.POWER_ARMOR_PLATING, 'e',TGItems.ELECTRIC_ENGINE);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_MINER_HELMET,1), "pcp","lgl", 'p', TAG_CARBON_PLATES, 'g', TAG_GLASS_PANES, 'c', TAG_ADVANCED_CIRCUITS, 'l', TAG_TITANIUM_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_MINER_CHESTPLATE,1), "p p","lcl","lpl", 'p',  TAG_CARBON_PLATES, 'c', TAG_ADVANCED_CIRCUITS, 'l', TAG_TITANIUM_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_MINER_LEGGINGS,1), "ppp","c c","l l", 'p',  TAG_CARBON_PLATES, 'c', TAG_ADVANCED_CIRCUITS, 'l', TAG_TITANIUM_INGOTS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T3_MINER_BOOTS,1), "l l","p p", 'p',  TAG_CARBON_PLATES, 'l',TAG_TITANIUM_INGOTS);

        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGArmors.T3_EXO_HELMET,1), TGArmors.T3_COMBAT_HELMET,TGItems.MECHANICAL_PARTS_CARBON, TAG_ADVANCED_CIRCUITS, TGItems.ELECTRIC_ENGINE, TAG_TITANIUM_INGOTS);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGArmors.T3_EXO_CHESTPLATE,1), TGArmors.T3_COMBAT_CHESTPLATE,TGItems.MECHANICAL_PARTS_CARBON, TAG_ADVANCED_CIRCUITS, TGItems.ELECTRIC_ENGINE, TAG_TITANIUM_INGOTS, TAG_TITANIUM_INGOTS);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGArmors.T3_EXO_LEGGINGS,1), TGArmors.T3_COMBAT_LEGGINGS,TGItems.MECHANICAL_PARTS_CARBON, TAG_ADVANCED_CIRCUITS, TGItems.ELECTRIC_ENGINE, TAG_TITANIUM_INGOTS, TAG_TITANIUM_INGOTS);
        RecipeJsonConverter.addShapelessRecipe(new ItemStack(TGArmors.T3_EXO_BOOTS,1), TGArmors.T3_COMBAT_BOOTS,TGItems.MECHANICAL_PARTS_CARBON, TAG_ADVANCED_CIRCUITS, TGItems.ELECTRIC_ENGINE, TAG_TITANIUM_INGOTS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_RIOT_HELMET,1), "php","l l",'p', TAG_LEAD_INGOTS, 'l', TGItems.TREATED_LEATHER, 'h', TGArmors.T2_COMBAT_HELMET);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_RIOT_CHESTPLATE,1), "p p","lcl","lpl",'p', TAG_LEAD_INGOTS, 'l', TGItems.TREATED_LEATHER, 'c', TGArmors.T2_COMBAT_CHESTPLATE);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_RIOT_LEGGINGS,1), "lhl","p p","l l",'p', TAG_LEAD_INGOTS, 'l', TGItems.TREATED_LEATHER, 'h', TGArmors.T2_COMBAT_LEGGINGS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_RIOT_BOOTS,1), "lhl","p p",'p', TAG_LEAD_INGOTS, 'l', TGItems.TREATED_LEATHER, 'h', TGArmors.T2_COMBAT_BOOTS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T2_BERET_HELMET,1), " cc","c c", 'c', TGItems.HEAVY_CLOTH);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T4_POWER_HELMET,1), "cpc","pgp", 'p', POWER_ARMOR_PLATING_MK2, 'g', TAG_GLASS_PANES, 'c', TAG_ELITE_CIRCUITS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T4_POWER_CHESTPLATE,1), "p p","cpc","ppp", 'p', POWER_ARMOR_PLATING_MK2, 'c', TAG_ELITE_CIRCUITS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T4_POWER_LEGGINGS,1), "ppp","c c","p p", 'p', POWER_ARMOR_PLATING_MK2, 'c', TAG_ELITE_CIRCUITS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T4_POWER_BOOTS,1), "c c","p p", 'p', POWER_ARMOR_PLATING_MK2, 'c',TAG_ELITE_CIRCUITS);

        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T4_PRAETOR_HELMET,1), "cpc","pgp", 'p', NETHER_ARMOR_PLATING, 'g', TAG_GLASS_PANES, 'c', TAG_ELITE_CIRCUITS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T4_PRAETOR_CHESTPLATE,1), "p p","cpc","ppp", 'p', NETHER_ARMOR_PLATING, 'c', TAG_ELITE_CIRCUITS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T4_PRAETOR_LEGGINGS,1), "ppp","c c","p p", 'p', NETHER_ARMOR_PLATING, 'c', TAG_ELITE_CIRCUITS);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(TGArmors.T4_PRAETOR_BOOTS,1), "c c","p p", 'p', NETHER_ARMOR_PLATING, 'c',TAG_ELITE_CIRCUITS);

        addSimpleArmorRecipe(
                TGArmors.T2_HAZMAT_HELMET,
                TGArmors.T2_HAZMAT_CHESTPLATE,
                TGArmors.T2_HAZMAT_LEGGINGS,
                TGArmors.T2_HAZMAT_BOOTS,
                PROTECTIVE_FIBER);
    }


    protected static void addSimpleArmorRecipe(Item head, Item chest, Item legs, Item boots, Item material){
        RecipeJsonConverter.addShapedRecipe(new ItemStack(head), "xxx", "x x", 'x', material);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(chest), "x x", "xxx", "xxx", 'x', material);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(legs), "xxx", "x x", "x x", 'x', material);
        RecipeJsonConverter.addShapedRecipe(new ItemStack(boots), "x x", "x x", 'x', material);
    }

}
