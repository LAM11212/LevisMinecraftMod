package net.levi.levismod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.levi.levismod.Levismod;
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
                        entries.add(ModItems.WATER_INGOT);
                        entries.add(ModItems.RAW_WATER_ORE);

                    }).build());

    public static void registerItemGroups() {
        Levismod.LOGGER.info("Registering item Groups for" + Levismod.MOD_ID);
    }
}
