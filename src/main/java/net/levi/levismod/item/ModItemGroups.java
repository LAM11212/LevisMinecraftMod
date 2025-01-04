package net.levi.levismod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.levi.levismod.Levismod;
import net.levi.levismod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup ELEMENTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Levismod.MOD_ID, "elements"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.elements"))
                    .icon(() -> new ItemStack(ModItems.WATER_INGOT)).entries((displayContext, entries) -> {
                        //MODITEMS
                        entries.add(ModItems.WATER_INGOT);
                        entries.add(ModItems.RAW_WATER_ORE);
                        entries.add(ModItems.FIRE_INGOT);
                        entries.add(ModItems.RAW_FIRE_ORE);
                        entries.add(ModItems.EARTH_INGOT);
                        entries.add(ModItems.RAW_EARTH_ORE);
                        entries.add(ModItems.AIR_INGOT);
                        entries.add(ModItems.RAW_AIR_ORE);

                        //MODBLOCKS
                        entries.add(ModBlocks.WATER_BLOCK);
                        entries.add(ModBlocks.EARTH_BLOCK);
                        entries.add(ModBlocks.FIRE_BLOCK);
                        entries.add(ModBlocks.AIR_BLOCK);
                        entries.add(ModBlocks.RAW_WATER_BLOCK);
                        entries.add(ModBlocks.RAW_EARTH_BLOCK);
                        entries.add(ModBlocks.RAW_FIRE_BLOCK);
                        entries.add(ModBlocks.RAW_AIR_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        Levismod.LOGGER.info("Registering item Groups for" + Levismod.MOD_ID);
    }
}
