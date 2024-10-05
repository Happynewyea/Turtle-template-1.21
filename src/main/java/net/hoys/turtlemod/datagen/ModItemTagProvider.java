package net.hoys.turtlemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.hoys.turtlemod.item.ModItems;
import net.hoys.turtlemod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.RAW_LUTONIUM);


        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.LUTONIUM_HELMET)
                .add(ModItems.LUTONIUM_CHESTPLATE)
                .add(ModItems.LUTONIUM_LEGGINGS)
                .add(ModItems.LUTONIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD)
                .add(ModItems.TIN_SWORD);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL)
                .add(ModItems.TIN_SHOVEL);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE)
                .add(ModItems.TIN_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.COPPER_AXE)
                .add(ModItems.TIN_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.COPPER_HOE)
                .add(ModItems.TIN_HOE);


    }
}
