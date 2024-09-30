package net.hoys.turtlemod;

import net.fabricmc.api.ModInitializer;

import net.hoys.turtlemod.block.ModBlocks;
import net.hoys.turtlemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TurtleMod implements ModInitializer {
	public static final String MOD_ID = "turtlemod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		// LOGGER.info("Hello Fabric world!");
	}
}