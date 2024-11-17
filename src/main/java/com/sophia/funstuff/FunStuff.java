package com.sophia.funstuff;

import com.sophia.funstuff.block.ModBlocks;
import com.sophia.funstuff.item.ModItemGroups;
import com.sophia.funstuff.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//hoi
public class FunStuff implements ModInitializer {
	public static final String MOD_ID = "funstuff";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);

	}
}