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
import net.minecraft.item.Items;
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
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.NICKEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.NICKEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LEAD_INGOT, RecipeCategory.DECORATIONS, ModBlocks.LEAD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER_INGOT, RecipeCategory.DECORATIONS, ModBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TITANIUM_BLOCK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_LUTONIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_LUTONIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN, RecipeCategory.DECORATIONS, ModBlocks.RAW_TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_NICKEL, RecipeCategory.DECORATIONS, ModBlocks.RAW_NICKEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_LEAD, RecipeCategory.DECORATIONS, ModBlocks.RAW_LEAD_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_SILVER, RecipeCategory.DECORATIONS, ModBlocks.RAW_SILVER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TITANIUM, RecipeCategory.DECORATIONS, ModBlocks.RAW_TITANIUM_BLOCK);

        // COPPER ----------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" * ")
                .input('R', Items.COPPER_INGOT).input('*', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL)
                .pattern(" R ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', Items.COPPER_INGOT).input('*', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE)
                .pattern("RRR")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', Items.COPPER_INGOT).input('*', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_AXE)
                .pattern("RR ")
                .pattern("R* ")
                .pattern(" * ")
                .input('R', Items.COPPER_INGOT).input('*', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COPPER_HOE)
                .pattern("RR ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', Items.COPPER_INGOT).input('*', Items.STICK)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        // TIN ----------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TIN_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" * ")
                .input('R', ModItems.TIN_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.TIN_INGOT), conditionsFromItem(ModItems.TIN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TIN_SHOVEL)
                .pattern(" R ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.TIN_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.TIN_INGOT), conditionsFromItem(ModItems.TIN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TIN_PICKAXE)
                .pattern("RRR")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.TIN_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.TIN_INGOT), conditionsFromItem(ModItems.TIN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TIN_AXE)
                .pattern("RR ")
                .pattern("R* ")
                .pattern(" * ")
                .input('R', ModItems.TIN_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.TIN_INGOT), conditionsFromItem(ModItems.TIN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TIN_HOE)
                .pattern("RR ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.TIN_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.TIN_INGOT), conditionsFromItem(ModItems.TIN_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);


        // NICKEL ----------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" * ")
                .input('R', ModItems.NICKEL_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_SHOVEL)
                .pattern(" R ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.NICKEL_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_PICKAXE)
                .pattern("RRR")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.NICKEL_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_AXE)
                .pattern("RR ")
                .pattern("R* ")
                .pattern(" * ")
                .input('R', ModItems.NICKEL_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.NICKEL_HOE)
                .pattern("RR ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.NICKEL_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.NICKEL_INGOT), conditionsFromItem(ModItems.NICKEL_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        // LEAD ----------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAD_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" * ")
                .input('R', ModItems.LEAD_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.LEAD_INGOT), conditionsFromItem(ModItems.LEAD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAD_SHOVEL)
                .pattern(" R ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.LEAD_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.LEAD_INGOT), conditionsFromItem(ModItems.LEAD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAD_PICKAXE)
                .pattern("RRR")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.LEAD_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.LEAD_INGOT), conditionsFromItem(ModItems.LEAD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAD_AXE)
                .pattern("RR ")
                .pattern("R* ")
                .pattern(" * ")
                .input('R', ModItems.LEAD_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.LEAD_INGOT), conditionsFromItem(ModItems.LEAD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.LEAD_HOE)
                .pattern("RR ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.LEAD_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.LEAD_INGOT), conditionsFromItem(ModItems.LEAD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        // SILVER ----------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SILVER_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" * ")
                .input('R', ModItems.SILVER_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SILVER_SHOVEL)
                .pattern(" R ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.SILVER_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SILVER_PICKAXE)
                .pattern("RRR")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.SILVER_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SILVER_AXE)
                .pattern("RR ")
                .pattern("R* ")
                .pattern(" * ")
                .input('R', ModItems.SILVER_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.SILVER_HOE)
                .pattern("RR ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.SILVER_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.SILVER_INGOT), conditionsFromItem(ModItems.SILVER_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        // TITANIUM ----------------------------------------------------------
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_SWORD)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" * ")
                .input('R', ModItems.TITANIUM_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_SHOVEL)
                .pattern(" R ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.TITANIUM_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_PICKAXE)
                .pattern("RRR")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.TITANIUM_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_AXE)
                .pattern("RR ")
                .pattern("R* ")
                .pattern(" * ")
                .input('R', ModItems.TITANIUM_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_HOE)
                .pattern("RR ")
                .pattern(" * ")
                .pattern(" * ")
                .input('R', ModItems.TITANIUM_INGOT).input('*', Items.STICK)
                .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);




        /*

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_LUTONIUM, 32)
                .input(ModBlocks.MAGIC_BLOCK)
                .criterion(hasItem(ModBlocks.MAGIC_BLOCK), conditionsFromItem(ModBlocks.MAGIC_BLOCK))
                .offerTo(exporter, Identifier.of(TurtleMod.MOD_ID, "raw_lutonium_from_magic_block"));


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




        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_TIN)
                .criterion(hasItem(ModItems.RAW_TIN), conditionsFromItem(ModItems.RAW_TIN))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_TIN, 9)
                .input(ModBlocks.RAW_TIN_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_TIN_BLOCK), conditionsFromItem(ModBlocks.RAW_TIN_BLOCK))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_NICKEL_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_NICKEL)
                .criterion(hasItem(ModItems.RAW_NICKEL), conditionsFromItem(ModItems.RAW_NICKEL))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_NICKEL, 9)
                .input(ModBlocks.RAW_NICKEL_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_NICKEL_BLOCK), conditionsFromItem(ModBlocks.RAW_NICKEL_BLOCK))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_LEAD_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_LEAD)
                .criterion(hasItem(ModItems.RAW_LEAD), conditionsFromItem(ModItems.RAW_LEAD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_NICKEL, 9)
                .input(ModBlocks.RAW_NICKEL_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_NICKEL_BLOCK), conditionsFromItem(ModBlocks.RAW_NICKEL_BLOCK))
                .offerTo(exporter);


        */
    }
}
