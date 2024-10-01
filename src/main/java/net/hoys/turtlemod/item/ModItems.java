package net.hoys.turtlemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hoys.turtlemod.TurtleMod;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LUTONIUM = registerItem("lutonium", new Item(new Item.Settings()));
    public static final Item RAW_LUTONIUM = registerItem("raw_lutonium", new Item(new Item.Settings()));

    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TurtleMod.MOD_ID, name), item);
    }


    public static void registerModItems() {
        TurtleMod.LOGGER.info("Registering Mod Items for " + TurtleMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LUTONIUM);
            entries.add(RAW_LUTONIUM);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(CAULIFLOWER);
        });


    }
}