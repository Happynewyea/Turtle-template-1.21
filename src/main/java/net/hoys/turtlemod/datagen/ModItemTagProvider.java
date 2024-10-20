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


        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.COPPER_SWORD)
                .add(ModItems.TIN_SWORD)
                .add(ModItems.NICKEL_SWORD)
                .add(ModItems.LEAD_SWORD)
                .add(ModItems.SILVER_SWORD)
                .add(ModItems.TITANIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.COPPER_SHOVEL)
                .add(ModItems.TIN_SHOVEL)
                .add(ModItems.NICKEL_SHOVEL)
                .add(ModItems.LEAD_SHOVEL)
                .add(ModItems.SILVER_SHOVEL)
                .add(ModItems.TITANIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.COPPER_PICKAXE)
                .add(ModItems.TIN_PICKAXE)
                .add(ModItems.NICKEL_PICKAXE)
                .add(ModItems.LEAD_PICKAXE)
                .add(ModItems.SILVER_PICKAXE)
                .add(ModItems.TITANIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.COPPER_AXE)
                .add(ModItems.TIN_AXE)
                .add(ModItems.NICKEL_AXE)
                .add(ModItems.LEAD_AXE)
                .add(ModItems.SILVER_AXE)
                .add(ModItems.TITANIUM_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.COPPER_HOE)
                .add(ModItems.TIN_HOE)
                .add(ModItems.NICKEL_HOE)
                .add(ModItems.LEAD_HOE)
                .add(ModItems.SILVER_HOE)
                .add(ModItems.TITANIUM_HOE);


        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.COPPER_BOOTS)
                .add(ModItems.TIN_BOOTS)
                .add(ModItems.NICKEL_BOOTS)
                .add(ModItems.LEAD_BOOTS)
                .add(ModItems.SILVER_BOOTS)
                .add(ModItems.TITANIUM_BOOTS)
                .add(ModItems.LUTONIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.COPPER_LEGGINGS)
                .add(ModItems.TIN_LEGGINGS)
                .add(ModItems.NICKEL_LEGGINGS)
                .add(ModItems.LEAD_LEGGINGS)
                .add(ModItems.SILVER_LEGGINGS)
                .add(ModItems.TITANIUM_LEGGINGS)
                .add(ModItems.LUTONIUM_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.COPPER_CHESTPLATE)
                .add(ModItems.TIN_CHESTPLATE)
                .add(ModItems.NICKEL_CHESTPLATE)
                .add(ModItems.LEAD_CHESTPLATE)
                .add(ModItems.SILVER_CHESTPLATE)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.LUTONIUM_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.COPPER_HELMET)
                .add(ModItems.TIN_HELMET)
                .add(ModItems.NICKEL_HELMET)
                .add(ModItems.LEAD_HELMET)
                .add(ModItems.SILVER_HELMET)
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.LUTONIUM_HELMET);


        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .addTag(ItemTags.FOOT_ARMOR);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .addTag(ItemTags.LEG_ARMOR);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .addTag(ItemTags.CHEST_ARMOR);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .addTag(ItemTags.HEAD_ARMOR);

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .addTag(ItemTags.FOOT_ARMOR)
                .addTag(ItemTags.LEG_ARMOR)
                .addTag(ItemTags.CHEST_ARMOR)
                .addTag(ItemTags.HEAD_ARMOR);

        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .addTag(ItemTags.SWORDS);

        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .addTag(ItemTags.SWORDS);

        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .addTag(ItemTags.AXES)
                .addTag(ItemTags.SWORDS);

        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .addTag(ItemTags.AXES)
                .addTag(ItemTags.SWORDS);

        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .addTag(ItemTags.AXES)
                .addTag(ItemTags.SHOVELS)
                .addTag(ItemTags.PICKAXES)
                .addTag(ItemTags.HOES);

        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .addTag(ItemTags.AXES)
                .addTag(ItemTags.SHOVELS)
                .addTag(ItemTags.PICKAXES)
                .addTag(ItemTags.HOES);

        getOrCreateTagBuilder(ItemTags.FISHING_ENCHANTABLE)
                .add(ModItems.TITANIUM_FISHING_ROD);

        getOrCreateTagBuilder(ItemTags.TRIDENT_ENCHANTABLE);

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .addTag(ItemTags.FOOT_ARMOR)
                .addTag(ItemTags.LEG_ARMOR)
                .addTag(ItemTags.CHEST_ARMOR)
                .addTag(ItemTags.HEAD_ARMOR)
                .addTag(ItemTags.SWORDS)
                .addTag(ItemTags.AXES)
                .addTag(ItemTags.PICKAXES)
                .addTag(ItemTags.SHOVELS)
                .addTag(ItemTags.HOES)

                .add(ModItems.TITANIUM_BOW)
                .add(ModItems.GOLDEN_BOW)
                .add(ModItems.COPPER_BOW)
                .add(ModItems.LEAD_BOW);

        getOrCreateTagBuilder(ItemTags.BOW_ENCHANTABLE)
                .add(ModItems.TITANIUM_BOW)
                .add(ModItems.GOLDEN_BOW)
                .add(ModItems.COPPER_BOW)
                .add(ModItems.LEAD_BOW);

        getOrCreateTagBuilder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .addTag(ItemTags.FOOT_ARMOR)
                .addTag(ItemTags.LEG_ARMOR)
                .addTag(ItemTags.CHEST_ARMOR)
                .addTag(ItemTags.HEAD_ARMOR);

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.TITANIUM_INGOT);


        getOrCreateTagBuilder(ItemTags.CROSSBOW_ENCHANTABLE)
                .add(ModItems.TITANIUM_BOW);

        // getOrCreateTagBuilder(ItemTags.)

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .addTag(ItemTags.FOOT_ARMOR)
                .addTag(ItemTags.LEG_ARMOR)
                .addTag(ItemTags.CHEST_ARMOR)
                .addTag(ItemTags.HEAD_ARMOR);




    }
}
