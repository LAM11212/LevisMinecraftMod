package net.levi.levismod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.levi.levismod.Levismod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block WATER_BLOCK = registerBlock("water_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.CORAL)));
    public static final Block RAW_WATER_BLOCK = registerBlock("raw_water_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).strength(2f),
                    UniformIntProvider.create(2, 5)));
    public static final Block EARTH_BLOCK = registerBlock("earth_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.GRASS)));
    public static final Block RAW_EARTH_BLOCK = registerBlock("raw_earth_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2.5f),
                    UniformIntProvider.create(4, 6)));
    public static final Block FIRE_BLOCK = registerBlock("fire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.NETHERRACK)));
    public static final Block RAW_FIRE_BLOCK = registerBlock("raw_fire_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_GOLD_ORE).strength(3f),
                    UniformIntProvider.create(5, 8)));
    public static final Block AIR_BLOCK = registerBlock("air_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.GLASS)));
    public static final Block RAW_AIR_BLOCK = registerBlock("raw_air_block",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(3.5f),
                    UniformIntProvider.create(6, 9)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Levismod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Levismod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Levismod.LOGGER.info("Registering ModBlocks for" + Levismod.MOD_ID);
    }
}
