package net.hoys.turtlemod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hoys.turtlemod.TurtleMod;
import net.hoys.turtlemod.block.custom.MagicBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block LUTONIUM_BLOCK = registerBlock("lutonium_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RAW_LUTONIUM_BLOCK = registerBlock("raw_lutonium_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));



    public static final Block LUTONIUM_ORE = registerBlock("lutonium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(30, 35),
                    AbstractBlock.Settings.create().strength(12f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LUTONIUM_DEEPSLATE_ORE = registerBlock("lutonium_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(40, 45),
                    AbstractBlock.Settings.create().strength(15f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));



    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            new MagicBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));







    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TurtleMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TurtleMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TurtleMod.LOGGER.info("Registering Mod Blocks for " + TurtleMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.LUTONIUM_BLOCK);
            entries.add(ModBlocks.RAW_LUTONIUM_BLOCK);
            entries.add(ModBlocks.LUTONIUM_ORE);
            entries.add(ModBlocks.LUTONIUM_DEEPSLATE_ORE);
        });
    }
}
