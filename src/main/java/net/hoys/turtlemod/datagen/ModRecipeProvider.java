package net.hoys.turtlemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.hoys.turtlemod.TurtleMod;
import net.hoys.turtlemod.block.ModBlocks;
import net.hoys.turtlemod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> LUTONIUM_SMELTABLES = List.of(ModItems.RAW_LUTONIUM, ModBlocks.LUTONIUM_ORE,
                ModBlocks.DEEPSLATE_LUTONIUM_ORE);

        List<ItemConvertible> TIN_SMELTABLES = List.of(ModItems.RAW_TIN, ModBlocks.TIN_ORE,
                ModBlocks.DEEPSLATE_TIN_ORE);

        List<ItemConvertible> NICKEL_SMELTABLES = List.of(ModItems.RAW_NICKEL, ModBlocks.NICKEL_ORE,
                ModBlocks.DEEPSLATE_NICKEL_ORE);

        List<ItemConvertible> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD, ModBlocks.LEAD_ORE,
                ModBlocks.DEEPSLATE_LEAD_ORE);

        List<ItemConvertible> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE,
                ModBlocks.DEEPSLATE_SILVER_ORE);

        List<ItemConvertible> TITANIUM_SMELTABLES = List.of(ModItems.RAW_TITANIUM, ModBlocks.TITANIUM_ORE,
                ModBlocks.DEEPSLATE_TITANIUM_ORE);




        offerSmelting(exporter, LUTONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.LUTONIUM, 0.25f, 200, "lutonium");
        offerBlasting(exporter, LUTONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.LUTONIUM, 0.25f, 100, "lutonium");

        offerSmelting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.25f, 200, "tin");
        offerBlasting(exporter, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT, 0.25f, 100, "tin");

        offerSmelting(exporter, NICKEL_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.25f, 200, "nickel");
        offerBlasting(exporter, NICKEL_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.25f, 100, "nickel");

        offerSmelting(exporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT, 0.25f, 200, "lead");
        offerBlasting(exporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT, 0.25f, 100, "lead");

        offerSmelting(exporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.25f, 200, "silver");
        offerBlasting(exporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.25f, 100, "silver");

        offerSmelting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT, 0.25f, 200, "titanium");
        offerBlasting(exporter, TITANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.TITANIUM_INGOT, 0.25f, 100, "titanium");


        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LUTONIUM, RecipeCategory.DECORATIONS, ModBlocks.LUTONIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_LUTONIUM_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_LUTONIUM)
                .criterion(hasItem(ModItems.RAW_LUTONIUM), conditionsFromItem(ModItems.RAW_LUTONIUM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_LUTONIUM, 9)
                .input(ModBlocks.RAW_LUTONIUM_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_LUTONIUM_BLOCK), conditionsFromItem(ModBlocks.RAW_LUTONIUM_BLOCK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_LUTONIUM, 32)
                .input(ModBlocks.MAGIC_BLOCK)
                .criterion(hasItem(ModBlocks.MAGIC_BLOCK), conditionsFromItem(ModBlocks.MAGIC_BLOCK))
                .offerTo(exporter, Identifier.of(TurtleMod.MOD_ID, "raw_lutonium_from_magic_block"));

    }
}
