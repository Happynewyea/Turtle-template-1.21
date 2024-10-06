package net.hoys.turtlemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hoys.turtlemod.block.ModBlocks;
import net.hoys.turtlemod.block.custom.CauliflowerBlock;
import net.hoys.turtlemod.block.custom.GarlicBlock;
import net.hoys.turtlemod.block.custom.StrawberryBlock;
import net.hoys.turtlemod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.LUTONIUM_BLOCK);
        addDrop(ModBlocks.RAW_LUTONIUM_BLOCK);

        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.RAW_TIN_BLOCK);
        addDrop(ModBlocks.NICKEL_BLOCK);
        addDrop(ModBlocks.RAW_NICKEL_BLOCK);
        addDrop(ModBlocks.LEAD_BLOCK);
        addDrop(ModBlocks.RAW_LEAD_BLOCK);
        addDrop(ModBlocks.SILVER_BLOCK);
        addDrop(ModBlocks.RAW_SILVER_BLOCK);
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);

        addDrop(ModBlocks.MAGIC_BLOCK);

        addDrop(ModBlocks.LUTONIUM_ORE, oreDrops(ModBlocks.LUTONIUM_ORE, ModItems.RAW_LUTONIUM));
        addDrop(ModBlocks.DEEPSLATE_LUTONIUM_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_LUTONIUM_ORE, ModItems.RAW_LUTONIUM, 1, 2));

        addDrop(ModBlocks.TIN_ORE, oreDrops(ModBlocks.TIN_ORE, ModItems.RAW_TIN));
        addDrop(ModBlocks.DEEPSLATE_TIN_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_TIN_ORE, ModItems.RAW_TIN, 1, 2));
        addDrop(ModBlocks.NICKEL_ORE, oreDrops(ModBlocks.NICKEL_ORE, ModItems.RAW_NICKEL));
        addDrop(ModBlocks.DEEPSLATE_NICKEL_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_NICKEL_ORE, ModItems.RAW_NICKEL, 1, 2));
        addDrop(ModBlocks.LEAD_ORE, oreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));
        addDrop(ModBlocks.DEEPSLATE_LEAD_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_LEAD_ORE, ModItems.RAW_LEAD, 1, 2));
        addDrop(ModBlocks.SILVER_ORE, oreDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));
        addDrop(ModBlocks.DEEPSLATE_SILVER_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_SILVER_ORE, ModItems.RAW_SILVER, 1, 2));
        addDrop(ModBlocks.TITANIUM_ORE, oreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM, 1, 2));


        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWERS)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerBlock.AGE, 4));
        this.addDrop(ModBlocks.CAULIFLOWERS, this.cropDrops(ModBlocks.CAULIFLOWERS, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder));

        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.GARLICS)
                .properties(StatePredicate.Builder.create().exactMatch(GarlicBlock.AGE, 3));
        this.addDrop(ModBlocks.GARLICS, this.cropDrops(ModBlocks.GARLICS, ModItems.GARLIC, ModItems.GARLIC_SEEDS, builder2));

        BlockStatePropertyLootCondition.Builder builder3 = BlockStatePropertyLootCondition.builder(ModBlocks.STRAWBERRIES)
                .properties(StatePredicate.Builder.create().exactMatch(StrawberryBlock.AGE, 4));
        this.addDrop(ModBlocks.STRAWBERRIES, this.cropDrops(ModBlocks.STRAWBERRIES, ModItems.STRAWBERRY, ModItems.STRAWBERRY_SEEDS, builder3));


    }
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                        ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
