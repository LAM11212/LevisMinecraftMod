package net.levi.levismod;

import net.fabricmc.api.ModInitializer;

import net.levi.levismod.item.ModItemGroups;
import net.levi.levismod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Levismod implements ModInitializer {
	public static final String MOD_ID = "levismod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}