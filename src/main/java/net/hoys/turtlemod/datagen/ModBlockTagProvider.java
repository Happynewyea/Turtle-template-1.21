package net.hoys.turtlemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hoys.turtlemod.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LUTONIUM_BLOCK)
                .add(ModBlocks.RAW_LUTONIUM_BLOCK)
                .add(ModBlocks.LUTONIUM_ORE)
                .add(ModBlocks.LUTONIUM_DEEPSLATE_ORE)
                .add(ModBlocks.MAGIC_BLOCK);


        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.LUTONIUM_BLOCK)
                .add(ModBlocks.RAW_LUTONIUM_BLOCK)
                .add(ModBlocks.LUTONIUM_ORE)
                .add(ModBlocks.LUTONIUM_DEEPSLATE_ORE);
    }
}
