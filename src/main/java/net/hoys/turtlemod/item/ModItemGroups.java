package net.hoys.turtlemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hoys.turtlemod.TurtleMod;
import net.hoys.turtlemod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup LUTONIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TurtleMod.MOD_ID, "lutonium_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.LUTONIUM))
                    .displayName(Text.translatable("itemgroup.turtlemod.lutonium_items"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.LUTONIUM);
                        entries.add(ModItems.RAW_LUTONIUM);
                        entries.add(ModBlocks.LUTONIUM_BLOCK);
                        entries.add(ModBlocks.RAW_LUTONIUM_BLOCK);
                        entries.add(ModBlocks.LUTONIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LUTONIUM_ORE);

                        entries.add(ModItems.LUTONIUM_HELMET);
                        entries.add(ModItems.LUTONIUM_CHESTPLATE);
                        entries.add(ModItems.LUTONIUM_LEGGINGS);
                        entries.add(ModItems.LUTONIUM_BOOTS);

                    })).build());


    public static final ItemGroup CUSTOM_FOODS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TurtleMod.MOD_ID, "custom_foods"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.COOKED_BEEF))
                    .displayName(Text.translatable("itemgroup.turtlemod.custom_foods"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.GARLIC);
                        entries.add(ModItems.STRAWBERRY);
                        entries.add(ModItems.PEPPER);
                        entries.add(ModItems.BLUEBERRY);
                        entries.add(ModItems.COFFEE_BEAN);
                        entries.add(ModItems.CORN);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.RADISH);
                        entries.add(ModItems.CABBAGE);
                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.EGGPLANT);

                        entries.add(ModItems.CAULIFLOWER_SEEDS);
                        entries.add(ModItems.GARLIC_SEEDS);
                        entries.add(ModItems.STRAWBERRY_SEEDS);
                        entries.add(ModItems.PEPPER_SEEDS);
                        entries.add(ModItems.BLUEBERRY_SEEDS);
                        entries.add(ModItems.COFFEE_BEAN_SEEDS);
                        entries.add(ModItems.CORN_SEEDS);
                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.RADISH_SEEDS);
                        entries.add(ModItems.CABBAGE_SEEDS);
                        entries.add(ModItems.PINEAPPLE_SEEDS);
                        entries.add(ModItems.EGGPLANT_SEEDS);


                    })).build());

    public static final ItemGroup CUSTOM_ORES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TurtleMod.MOD_ID, "custom_ores"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.DIAMOND_ORE))
                    .displayName(Text.translatable("itemgroup.turtlemod.custom_ores"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.RAW_NICKEL);
                        entries.add(ModItems.NICKEL_INGOT);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.LEAD_INGOT);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.SILVER_INGOT);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);

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

                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.NICKEL_BLOCK);
                        entries.add(ModBlocks.RAW_NICKEL_BLOCK);
                        entries.add(ModBlocks.LEAD_BLOCK);
                        entries.add(ModBlocks.RAW_LEAD_BLOCK);
                        entries.add(ModBlocks.SILVER_BLOCK);
                        entries.add(ModBlocks.RAW_SILVER_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                    })).build());

    public static final ItemGroup NEW_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TurtleMod.MOD_ID, "new_tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.IRON_PICKAXE))
                    .displayName(Text.translatable("itemgroup.turtlemod.tools"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);

                        entries.add(ModItems.TIN_SWORD);
                        entries.add(ModItems.TIN_SHOVEL);
                        entries.add(ModItems.TIN_PICKAXE);
                        entries.add(ModItems.TIN_AXE);
                        entries.add(ModItems.TIN_HOE);
                        entries.add(ModItems.TIN_HELMET);
                        entries.add(ModItems.TIN_CHESTPLATE);
                        entries.add(ModItems.TIN_LEGGINGS);
                        entries.add(ModItems.TIN_BOOTS);

                        entries.add(ModItems.NICKEL_SWORD);
                        entries.add(ModItems.NICKEL_SHOVEL);
                        entries.add(ModItems.NICKEL_PICKAXE);
                        entries.add(ModItems.NICKEL_AXE);
                        entries.add(ModItems.NICKEL_HOE);
                        entries.add(ModItems.NICKEL_HELMET);
                        entries.add(ModItems.NICKEL_CHESTPLATE);
                        entries.add(ModItems.NICKEL_LEGGINGS);
                        entries.add(ModItems.NICKEL_BOOTS);

                        entries.add(ModItems.LEAD_SWORD);
                        entries.add(ModItems.LEAD_SHOVEL);
                        entries.add(ModItems.LEAD_PICKAXE);
                        entries.add(ModItems.LEAD_AXE);
                        entries.add(ModItems.LEAD_HOE);
                        entries.add(ModItems.LEAD_HELMET);
                        entries.add(ModItems.LEAD_CHESTPLATE);
                        entries.add(ModItems.LEAD_LEGGINGS);
                        entries.add(ModItems.LEAD_BOOTS);

                        entries.add(ModItems.SILVER_SWORD);
                        entries.add(ModItems.SILVER_SHOVEL);
                        entries.add(ModItems.SILVER_PICKAXE);
                        entries.add(ModItems.SILVER_AXE);
                        entries.add(ModItems.SILVER_HOE);
                        entries.add(ModItems.SILVER_HELMET);
                        entries.add(ModItems.SILVER_CHESTPLATE);
                        entries.add(ModItems.SILVER_LEGGINGS);
                        entries.add(ModItems.SILVER_BOOTS);

                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_HOE);
                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);
                    })).build());

    public static final ItemGroup MISCELLANEOUS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TurtleMod.MOD_ID, "miscellaneous_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.WAXED_EXPOSED_CUT_COPPER_STAIRS))
                    .displayName(Text.translatable("itemgroup.turtlemod.miscellaneous"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.COPPER_COIN);
                        entries.add(ModItems.CHISEL);

                        entries.add(ModBlocks.MAGIC_BLOCK);
                        entries.add(ModItems.TITANIUM_BOW);
                        entries.add(ModItems.GOLDEN_BOW);




                    })).build());


    public static void registerItemGroups() {
        TurtleMod.LOGGER.info("Registering Item Groups for " + TurtleMod.MOD_ID);

    }
}
