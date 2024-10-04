package net.hoys.turtlemod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hoys.turtlemod.block.ModBlocks;
import net.hoys.turtlemod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LUTONIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_LUTONIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LUTONIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LUTONIUM_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK
        );
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LUTONIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LUTONIUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_COIN, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NICKEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SILVER, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVER_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUTONIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUTONIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUTONIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.LUTONIUM_BOOTS));



    }
}
