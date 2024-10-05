package net.hoys.turtlemod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hoys.turtlemod.TurtleMod;
import net.hoys.turtlemod.block.custom.CauliflowerCropBlock;
import net.hoys.turtlemod.block.custom.GarlicCropBlock;
import net.hoys.turtlemod.block.custom.MagicBlock;
import net.hoys.turtlemod.block.custom.StrawberryCropBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
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
    public static final Block DEEPSLATE_LUTONIUM_ORE = registerBlock("deepslate_lutonium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(40, 45),
                    AbstractBlock.Settings.create().strength(15f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));


    public static final Block TIN_ORE = registerBlock("tin_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 5),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block NICKEL_ORE = registerBlock("nickel_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 5),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 5),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 5),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 5),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));


    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block NICKEL_BLOCK = registerBlock("nickel_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));


    public static final Block CAULIFLOWER_CROP = Registry.register(Registries.BLOCK, Identifier.of(TurtleMod.MOD_ID, "cauliflower_crop"),
            new CauliflowerCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    public static final Block GARLIC_CROP = Registry.register(Registries.BLOCK, Identifier.of(TurtleMod.MOD_ID, "garlic_crop"),
            new GarlicCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    public static final Block STRAWBERRY_CROP = Registry.register(Registries.BLOCK, Identifier.of(TurtleMod.MOD_ID, "strawberry_crop"),
            new StrawberryCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

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
            entries.add(ModBlocks.DEEPSLATE_LUTONIUM_ORE);

            entries.add(ModBlocks.TIN_BLOCK);
            entries.add(ModBlocks.NICKEL_BLOCK);
            entries.add(ModBlocks.LEAD_BLOCK);
            entries.add(ModBlocks.SILVER_BLOCK);
            entries.add(ModBlocks.TITANIUM_BLOCK);

            entries.add(ModBlocks.RAW_TIN_BLOCK);
            entries.add(ModBlocks.RAW_NICKEL_BLOCK);
            entries.add(ModBlocks.RAW_LEAD_BLOCK);
            entries.add(ModBlocks.RAW_SILVER_BLOCK);
            entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.TIN_ORE);
            entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
            entries.add(ModBlocks.NICKEL_ORE);
            entries.add(ModBlocks.DEEPSLATE_NICKEL_ORE);
            entries.add(ModBlocks.LEAD_ORE);
            entries.add(ModBlocks.DEEPSLATE_LEAD_ORE);
            entries.add(ModBlocks.SILVER_ORE);
            entries.add(ModBlocks.DEEPSLATE_SILVER_ORE);
            entries.add(ModBlocks.TITANIUM_ORE);
            entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        });
    }
}
