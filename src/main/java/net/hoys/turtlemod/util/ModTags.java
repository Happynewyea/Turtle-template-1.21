package net.hoys.turtlemod.util;

import net.hoys.turtlemod.TurtleMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");

        public static final TagKey<Block> NEEDS_TIN_TOOL = createTag("needs_tin_tool");
        public static final TagKey<Block> INCORRECT_FOR_TIN_TOOL = createTag("incorrect_for_tin_tool");

        public static final TagKey<Block> NEEDS_NICKEL_TOOL = createTag("needs_nickel_tool");
        public static final TagKey<Block> INCORRECT_FOR_NICKEL_TOOL = createTag("incorrect_for_nickel_tool");

        public static final TagKey<Block> NEEDS_LEAD_TOOL = createTag("needs_lead_tool");
        public static final TagKey<Block> INCORRECT_FOR_LEAD_TOOL = createTag("incorrect_for_lead_tool");

        public static final TagKey<Block> NEEDS_SILVER_TOOL = createTag("needs_silver_tool");
        public static final TagKey<Block> INCORRECT_FOR_SILVER_TOOL = createTag("incorrect_for_silver_tool");

        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = createTag("needs_titanium_tool");
        public static final TagKey<Block> INCORRECT_FOR_TITANIUM_TOOL = createTag("incorrect_for_titanium_tool");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TurtleMod.MOD_ID, name));
        }

    }

    public static class Items {

        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(TurtleMod.MOD_ID, name));
        }
    }

}
