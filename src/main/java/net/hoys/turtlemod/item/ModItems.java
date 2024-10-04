package net.hoys.turtlemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hoys.turtlemod.TurtleMod;
import net.hoys.turtlemod.item.custom.ChiselItem;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LUTONIUM = registerItem("lutonium", new Item(new Item.Settings()));
    public static final Item RAW_LUTONIUM = registerItem("raw_lutonium", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(2)));

    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)));
    public static final Item COPPER_COIN = registerItem("copper_coin", new Item(new Item.Settings()));

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