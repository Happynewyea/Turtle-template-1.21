package net.hoys.turtlemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupImpl;
import net.hoys.turtlemod.TurtleMod;
import net.hoys.turtlemod.block.ModBlocks;
import net.hoys.turtlemod.item.custom.ChiselItem;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LUTONIUM = registerItem("lutonium", new Item(new Item.Settings()));
    public static final Item RAW_LUTONIUM = registerItem("raw_lutonium", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(2)));

    public static final Item COPPER_COIN = registerItem("copper_coin", new Item(new Item.Settings()));


    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)));
    public static final Item GARLIC = registerItem("garlic", new Item(new Item.Settings().food(ModFoodComponents.GARLIC)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));


    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds",
            new AliasedBlockItem(ModBlocks.CAULIFLOWERS, new Item.Settings()));
    public static final Item GARLIC_SEEDS = registerItem("garlic_seeds",
            new AliasedBlockItem(ModBlocks.GARLICS, new Item.Settings()));
    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem(ModBlocks.STRAWBERRIES, new Item.Settings()));


    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Settings()));
    public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item(new Item.Settings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Settings()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Settings()));
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new Item.Settings()));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", new Item(new Item.Settings()));


    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER, 3, -2.4F))));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER, 1.5F,-2.8F))));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 1.0F,-2.8F))));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER, 6.0F,-3.0F))));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterials.COPPER, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER, -2.0F,-1.0F))));


    public static final Item TIN_SWORD = registerItem("tin_sword",
            new SwordItem(ModToolMaterials.TIN, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TIN, 3, -2.4F))));
    public static final Item TIN_SHOVEL = registerItem("tin_shovel",
            new ShovelItem(ModToolMaterials.TIN, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TIN, 1.5F,-2.8F))));
    public static final Item TIN_PICKAXE = registerItem("tin_pickaxe",
            new PickaxeItem(ModToolMaterials.TIN, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TIN, 1.0F,-2.8F))));
    public static final Item TIN_AXE = registerItem("tin_axe",
            new AxeItem(ModToolMaterials.TIN, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TIN, 6.0F,-3.0F))));
    public static final Item TIN_HOE = registerItem("tin_hoe",
            new HoeItem(ModToolMaterials.TIN, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TIN, -2.0F,-1.0F))));


    public static final Item NICKEL_SWORD = registerItem("nickel_sword",
            new SwordItem(ModToolMaterials.NICKEL, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NICKEL, 3, -2.4F))));
    public static final Item NICKEL_SHOVEL = registerItem("nickel_shovel",
            new ShovelItem(ModToolMaterials.NICKEL, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.NICKEL, 1.5F,-2.8F))));
    public static final Item NICKEL_PICKAXE = registerItem("nickel_pickaxe",
            new PickaxeItem(ModToolMaterials.NICKEL, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.NICKEL, 1.0F,-2.8F))));
    public static final Item NICKEL_AXE = registerItem("nickel_axe",
            new AxeItem(ModToolMaterials.NICKEL, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.NICKEL, 6.0F,-3.0F))));
    public static final Item NICKEL_HOE = registerItem("nickel_hoe",
            new HoeItem(ModToolMaterials.NICKEL, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.NICKEL, -2.0F,-1.0F))));


    public static final Item LEAD_SWORD = registerItem("lead_sword",
            new SwordItem(ModToolMaterials.LEAD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LEAD, 3, -2.4F))));
    public static final Item LEAD_SHOVEL = registerItem("lead_shovel",
            new ShovelItem(ModToolMaterials.LEAD, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LEAD, 1.5F,-2.8F))));
    public static final Item LEAD_PICKAXE = registerItem("lead_pickaxe",
            new PickaxeItem(ModToolMaterials.LEAD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LEAD, 1.0F,-2.8F))));
    public static final Item LEAD_AXE = registerItem("lead_axe",
            new AxeItem(ModToolMaterials.LEAD, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LEAD, 6.0F,-3.0F))));
    public static final Item LEAD_HOE = registerItem("lead_hoe",
            new HoeItem(ModToolMaterials.LEAD, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.LEAD, -2.0F,-1.0F))));


    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SwordItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SILVER, 3, -2.3F))));
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",
            new ShovelItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SILVER, 1.5F,-2.8F))));
    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",
            new PickaxeItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SILVER, 1.0F,-2.8F))));
    public static final Item SILVER_AXE = registerItem("silver_axe",
            new AxeItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SILVER, 6.0F,-2.9F))));
    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new HoeItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SILVER, -2.0F,-1.0F))));


    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 3, -2.2F)) ));
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 1.5F,-2.8F))));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new PickaxeItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 1.0F,-2.8F))));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.TITANIUM, 6.0F,-2.9F))));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new HoeItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.TITANIUM, -2.0F,-1.0F))));







    public static final Item LUTONIUM_HELMET = registerItem("lutonium_helmet",
            new ArmorItem(ModArmorMaterials.LUTONIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item LUTONIUM_CHESTPLATE = registerItem("lutonium_chestplate",
            new ArmorItem(ModArmorMaterials.LUTONIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item LUTONIUM_LEGGINGS = registerItem("lutonium_leggings",
            new ArmorItem(ModArmorMaterials.LUTONIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item LUTONIUM_BOOTS = registerItem("lutonium_boots",
            new ArmorItem(ModArmorMaterials.LUTONIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

/*
    public static final Item TIN_HELMET = registerItem("tin_helmet",
            new ArmorItem(ModArmorMaterials.TIN_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item TIN_CHESTPLATE = registerItem("tin_chestplate",
            new ArmorItem(ModArmorMaterials.TIN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item TIN_LEGGINGS = registerItem("tin_leggings",
            new ArmorItem(ModArmorMaterials.TIN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item TIN_BOOTS = registerItem("tin_boots",
            new ArmorItem(ModArmorMaterials.TIN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));
*/

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TurtleMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        TurtleMod.LOGGER.info("Registering Mod Items for " + TurtleMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LUTONIUM);
            entries.add(RAW_LUTONIUM);

            entries.add(RAW_TIN);
            entries.add(RAW_NICKEL);
            entries.add(RAW_LEAD);
            entries.add(RAW_SILVER);
            entries.add(RAW_TITANIUM);

            entries.add(TIN_INGOT);
            entries.add(NICKEL_INGOT);
            entries.add(LEAD_INGOT);
            entries.add(SILVER_INGOT);
            entries.add(TITANIUM_INGOT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CAULIFLOWER);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(COPPER_COIN);
            entries.add(CHISEL);
        });


    }
}