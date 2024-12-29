package net.levi.levismod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.levi.levismod.Levismod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //WATER ELEMENT ITEMS
    public static final Item WATER_INGOT = registerItem("water_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_WATER_ORE = registerItem("raw_water_ore", new Item(new FabricItemSettings()));
    //FIRE ELEMENT ITEMS
    public static final Item FIRE_INGOT = registerItem("fire_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_FIRE_ORE = registerItem("raw_fire_ore", new Item(new FabricItemSettings()));
    //TODO add earth and air elements

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(WATER_INGOT);
        entries.add(RAW_WATER_ORE);

        entries.add(FIRE_INGOT);
        entries.add(RAW_FIRE_ORE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Levismod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Levismod.LOGGER.info("Registering Mod Items for " + Levismod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
