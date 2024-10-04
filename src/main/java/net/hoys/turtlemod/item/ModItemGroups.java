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
                        entries.add(ModBlocks.LUTONIUM_DEEPSLATE_ORE);
                    })).build());


    public static final ItemGroup CUSTOM_FOODS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TurtleMod.MOD_ID, "custom_foods"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.COOKED_BEEF))
                    .displayName(Text.translatable("itemgroup.turtlemod.custom_foods"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.CAULIFLOWER);
                    })).build());

    public static final ItemGroup CUSTOM_ORES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TurtleMod.MOD_ID, "custom_ores"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.DIAMOND_ORE))
                    .displayName(Text.translatable("itemgroup.turtlemod.custom_ores"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.RAW_NICKEL);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.RAW_SILVER);
                        entries.add(ModItems.RAW_TITANIUM);
                    })).build());



    public static final ItemGroup MISCELLANEOUS_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TurtleMod.MOD_ID, "miscellaneous_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(Items.WAXED_EXPOSED_CUT_COPPER_STAIRS))
                    .displayName(Text.translatable("itemgroup.turtlemod.miscellaneous"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModItems.COPPER_COIN);
                        entries.add(ModItems.CHISEL);
                    })).build());


    public static void registerItemGroups() {
        TurtleMod.LOGGER.info("Registering Item Groups for " + TurtleMod.MOD_ID);

    }
}
