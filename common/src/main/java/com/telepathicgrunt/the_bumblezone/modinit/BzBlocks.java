package com.telepathicgrunt.the_bumblezone.modinit;

import com.telepathicgrunt.the_bumblezone.Bumblezone;
import com.telepathicgrunt.the_bumblezone.blocks.*;
import com.telepathicgrunt.the_bumblezone.modinit.registry.RegistryEntry;
import com.telepathicgrunt.the_bumblezone.modinit.registry.ResourcefulRegistries;
import com.telepathicgrunt.the_bumblezone.modinit.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;


public class BzBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(BuiltInRegistries.BLOCK, Bumblezone.MODID);
    public static final ResourcefulRegistry<Block> CURTAINS = ResourcefulRegistries.create(BLOCKS);

    //Blocks
    public static final RegistryEntry<Block> POROUS_HONEYCOMB = BLOCKS.register("porous_honeycomb_block", PorousHoneycomb::new);
    public static final RegistryEntry<Block> FILLED_POROUS_HONEYCOMB = BLOCKS.register("filled_porous_honeycomb_block", FilledPorousHoneycomb::new);
    public static final RegistryEntry<Block> EMPTY_HONEYCOMB_BROOD = BLOCKS.register("empty_honeycomb_brood_block", EmptyHoneycombBrood::new);
    public static final RegistryEntry<Block> HONEYCOMB_BROOD = BLOCKS.register("honeycomb_brood_block", HoneycombBrood::new);
    public static final RegistryEntry<Block> SUGAR_INFUSED_STONE = BLOCKS.register("sugar_infused_stone", SugarInfusedStone::new);
    public static final RegistryEntry<Block> SUGAR_INFUSED_COBBLESTONE = BLOCKS.register("sugar_infused_cobblestone", SugarInfusedCobblestone::new);
    public static final RegistryEntry<Block> HONEY_CRYSTAL = BLOCKS.register("honey_crystal", HoneyCrystal::new);
    public static final RegistryEntry<Block> STICKY_HONEY_RESIDUE = BLOCKS.register("sticky_honey_residue", StickyHoneyResidue::new);
    public static final RegistryEntry<Block> STICKY_HONEY_REDSTONE = BLOCKS.register("sticky_honey_redstone", StickyHoneyRedstone::new);
    public static final RegistryEntry<Block> BEEHIVE_BEESWAX = BLOCKS.register("beehive_beeswax", BeehiveBeeswax::new);
    public static final RegistryEntry<Block> PILE_OF_POLLEN = BLOCKS.register("pile_of_pollen", PileOfPollen::new);
    public static final RegistryEntry<Block> PILE_OF_POLLEN_SUSPICIOUS = BLOCKS.register("pile_of_pollen_suspicious", PileOfPollenSuspicious::new);
    public static final RegistryEntry<Block> HONEY_WEB = BLOCKS.register("honey_web", HoneyWeb::new);
    public static final RegistryEntry<Block> REDSTONE_HONEY_WEB = BLOCKS.register("redstone_honey_web", RedstoneHoneyWeb::new);
    public static final RegistryEntry<Block> HONEY_COCOON = BLOCKS.register("honey_cocoon", HoneyCocoon::new);
    public static final RegistryEntry<Block> ROYAL_JELLY_BLOCK = BLOCKS.register("royal_jelly_block", RoyalJellyBlock::new);
    public static final RegistryEntry<Block> GLISTERING_HONEY_CRYSTAL = BLOCKS.register("glistering_honey_crystal", GlisteringHoneyCrystal::new);
    public static final RegistryEntry<Block> CARVABLE_WAX = BLOCKS.register("carvable_wax", CarvableWax::new);
    public static final RegistryEntry<Block> ANCIENT_WAX_BRICKS = BLOCKS.register("ancient_wax_bricks", AncientWax::new);
    public static final RegistryEntry<Block> ANCIENT_WAX_DIAMOND = BLOCKS.register("ancient_wax_diamond", AncientWax::new);
    public static final RegistryEntry<Block> ANCIENT_WAX_COMPOUND_EYES = BLOCKS.register("ancient_wax_compound_eyes", AncientWax::new);
    public static final RegistryEntry<Block> ANCIENT_WAX_BRICKS_STAIRS = BLOCKS.register("ancient_wax_bricks_stairs", () -> new AncientWaxStairs(BzBlocks.ANCIENT_WAX_BRICKS.get().defaultBlockState()));
    public static final RegistryEntry<Block> ANCIENT_WAX_DIAMOND_STAIRS = BLOCKS.register("ancient_wax_diamond_stairs", () -> new AncientWaxStairs(BzBlocks.ANCIENT_WAX_DIAMOND.get().defaultBlockState()));
    public static final RegistryEntry<Block> ANCIENT_WAX_COMPOUND_EYES_STAIRS = BLOCKS.register("ancient_wax_compound_eyes_stairs", () -> new AncientWaxStairs(BzBlocks.ANCIENT_WAX_COMPOUND_EYES.get().defaultBlockState()));
    public static final RegistryEntry<Block> ANCIENT_WAX_BRICKS_SLAB = BLOCKS.register("ancient_wax_bricks_slab", AncientWaxSlab::new);
    public static final RegistryEntry<Block> ANCIENT_WAX_DIAMOND_SLAB = BLOCKS.register("ancient_wax_diamond_slab", AncientWaxSlab::new);
    public static final RegistryEntry<Block> ANCIENT_WAX_COMPOUND_EYES_SLAB = BLOCKS.register("ancient_wax_compound_eyes_slab", AncientWaxSlab::new);
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CHANNEL = BLOCKS.register("luminescent_wax_channel", () -> new LuminescentWaxChannel(MapColor.TERRACOTTA_BROWN, 0));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CHANNEL_RED = BLOCKS.register("luminescent_wax_channel_red", () -> new LuminescentWaxChannel(MapColor.COLOR_RED, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CHANNEL_PURPLE = BLOCKS.register("luminescent_wax_channel_purple", () -> new LuminescentWaxChannel(MapColor.COLOR_PURPLE, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CHANNEL_BLUE = BLOCKS.register("luminescent_wax_channel_blue", () -> new LuminescentWaxChannel(MapColor.COLOR_BLUE, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CHANNEL_GREEN = BLOCKS.register("luminescent_wax_channel_green", () -> new LuminescentWaxChannel(MapColor.COLOR_GREEN, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CHANNEL_YELLOW = BLOCKS.register("luminescent_wax_channel_yellow", () -> new LuminescentWaxChannel(MapColor.COLOR_YELLOW, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CHANNEL_WHITE = BLOCKS.register("luminescent_wax_channel_white", () -> new LuminescentWaxChannel(MapColor.SNOW, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CORNER = BLOCKS.register("luminescent_wax_corner", () -> new LuminescentWaxCornerNode(MapColor.TERRACOTTA_BROWN, 0));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CORNER_RED = BLOCKS.register("luminescent_wax_corner_red", () -> new LuminescentWaxCornerNode(MapColor.COLOR_RED, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CORNER_PURPLE = BLOCKS.register("luminescent_wax_corner_purple", () -> new LuminescentWaxCornerNode(MapColor.COLOR_PURPLE, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CORNER_BLUE = BLOCKS.register("luminescent_wax_corner_blue", () -> new LuminescentWaxCornerNode(MapColor.COLOR_BLUE, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CORNER_GREEN = BLOCKS.register("luminescent_wax_corner_green", () -> new LuminescentWaxCornerNode(MapColor.COLOR_GREEN, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CORNER_YELLOW = BLOCKS.register("luminescent_wax_corner_yellow", () -> new LuminescentWaxCornerNode(MapColor.COLOR_YELLOW, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_CORNER_WHITE = BLOCKS.register("luminescent_wax_corner_white", () -> new LuminescentWaxCornerNode(MapColor.SNOW, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_NODE = BLOCKS.register("luminescent_wax_node", () -> new LuminescentWaxCornerNode(MapColor.TERRACOTTA_BROWN, 0));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_NODE_RED = BLOCKS.register("luminescent_wax_node_red", () -> new LuminescentWaxCornerNode(MapColor.COLOR_RED, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_NODE_PURPLE = BLOCKS.register("luminescent_wax_node_purple", () -> new LuminescentWaxCornerNode(MapColor.COLOR_PURPLE, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_NODE_BLUE = BLOCKS.register("luminescent_wax_node_blue", () -> new LuminescentWaxCornerNode(MapColor.COLOR_BLUE, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_NODE_GREEN = BLOCKS.register("luminescent_wax_node_green", () -> new LuminescentWaxCornerNode(MapColor.COLOR_GREEN, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_NODE_YELLOW = BLOCKS.register("luminescent_wax_node_yellow", () -> new LuminescentWaxCornerNode(MapColor.COLOR_YELLOW, 15));
    public static final RegistryEntry<Block> LUMINESCENT_WAX_NODE_WHITE = BLOCKS.register("luminescent_wax_node_white", () -> new LuminescentWaxCornerNode(MapColor.SNOW, 15));
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE = BLOCKS.register("super_candle_base", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_WICK = BLOCKS.register("super_candle_wick", () -> new SuperCandleWick(false));
    public static final RegistryEntry<Block> SUPER_CANDLE_WICK_SOUL = BLOCKS.register("super_candle_wick_soul", () -> new SuperCandleWick(true));
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_BLACK = BLOCKS.register("super_candle_base_black", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_BLUE = BLOCKS.register("super_candle_base_blue", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_BROWN = BLOCKS.register("super_candle_base_brown", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_CYAN = BLOCKS.register("super_candle_base_cyan", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_GRAY = BLOCKS.register("super_candle_base_gray", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_GREEN = BLOCKS.register("super_candle_base_green", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_LIGHT_BLUE = BLOCKS.register("super_candle_base_light_blue", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_LIGHT_GRAY = BLOCKS.register("super_candle_base_light_gray", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_LIME = BLOCKS.register("super_candle_base_lime", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_MAGENTA = BLOCKS.register("super_candle_base_magenta", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_ORANGE = BLOCKS.register("super_candle_base_orange", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_PINK = BLOCKS.register("super_candle_base_pink", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_PURPLE = BLOCKS.register("super_candle_base_purple", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_RED = BLOCKS.register("super_candle_base_red", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_WHITE = BLOCKS.register("super_candle_base_white", SuperCandleBase::new);
    public static final RegistryEntry<Block> SUPER_CANDLE_BASE_YELLOW = BLOCKS.register("super_candle_base_yellow", SuperCandleBase::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_BLACK = CURTAINS.register("string_curtain_black", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_BLUE = CURTAINS.register("string_curtain_blue", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_BROWN = CURTAINS.register("string_curtain_brown", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_CYAN = CURTAINS.register("string_curtain_cyan", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_GRAY = CURTAINS.register("string_curtain_gray", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_GREEN = CURTAINS.register("string_curtain_green", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_LIGHT_BLUE = CURTAINS.register("string_curtain_light_blue", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_LIGHT_GRAY = CURTAINS.register("string_curtain_light_gray", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_LIME = CURTAINS.register("string_curtain_lime", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_MAGENTA = CURTAINS.register("string_curtain_magenta", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_ORANGE = CURTAINS.register("string_curtain_orange", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_PINK = CURTAINS.register("string_curtain_pink", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_PURPLE = CURTAINS.register("string_curtain_purple", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_RED = CURTAINS.register("string_curtain_red", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_WHITE = CURTAINS.register("string_curtain_white", StringCurtain::new);
    public static final RegistryEntry<Block> STRING_CURTAIN_YELLOW = CURTAINS.register("string_curtain_yellow", StringCurtain::new);
    public static final RegistryEntry<Block> INCENSE_BASE_CANDLE = BLOCKS.register("incense_candle_base", IncenseCandleBase::new);
    public static final RegistryEntry<Block> CRYSTALLINE_FLOWER = BLOCKS.register("crystalline_flower", CrystallineFlower::new);
    public static final RegistryEntry<Block> ESSENCE_BLOCK_RED = BLOCKS.register("essence_block_red", EssenceBlockRed::new);
    public static final RegistryEntry<Block> ESSENCE_BLOCK_PURPLE = BLOCKS.register("essence_block_purple", EssenceBlockPurple::new);
    public static final RegistryEntry<Block> ESSENCE_BLOCK_BLUE = BLOCKS.register("essence_block_blue", EssenceBlockBlue::new);
    public static final RegistryEntry<Block> ESSENCE_BLOCK_GREEN = BLOCKS.register("essence_block_green", EssenceBlockGreen::new);
    public static final RegistryEntry<Block> ESSENCE_BLOCK_YELLOW = BLOCKS.register("essence_block_yellow", EssenceBlockYellow::new);
    public static final RegistryEntry<Block> ESSENCE_BLOCK_WHITE = BLOCKS.register("essence_block_white", EssenceBlockWhite::new);
    public static final RegistryEntry<Block> HEAVY_AIR = BLOCKS.register("heavy_air", HeavyAir::new);
    public static final RegistryEntry<Block> WINDY_AIR = BLOCKS.register("windy_air", WindyAir::new);
    public static final RegistryEntry<Block> INFINITY_BARRIER = BLOCKS.register("infinity_barrier", InfinityBarrier::new);
    public static final RegistryEntry<Block> DENSE_BUBBLE_BLOCK = BLOCKS.register("dense_bubble_block", DenseBubbleBlock::new);
   }