package net.hoys.turtlemod;

import net.fabricmc.api.ModInitializer;

import net.hoys.turtlemod.block.ModBlocks;
import net.hoys.turtlemod.datagen.ModWorldGenerator;
import net.hoys.turtlemod.item.ModItemGroups;
import net.hoys.turtlemod.item.ModItems;
import net.hoys.turtlemod.util.ModLootTableModifiers;
import net.hoys.turtlemod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TurtleMod implements ModInitializer {
	public static final String MOD_ID = "turtlemod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();

		ModWorldGeneration.generateModWorldGen();
		// LOGGER.info("Hello Fabric world!");
	}
}