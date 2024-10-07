package net.hoys.turtlemod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {

    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 2), 0.15f).build();

    public static final FoodComponent GARLIC = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 2), 0.15f).build();

    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 2), 0.15f).build();

    public static final FoodComponent PEPPER = new FoodComponent.Builder().nutrition(1).saturationModifier(2.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 1), 1.0f).snack().build();

    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 2), 0.15f).build();

    public static final FoodComponent COFFEE_BEAN = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 2), 0.15f).build();

    public static final FoodComponent CORN = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 2), 0.15f).build();

    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(1).saturationModifier(2.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 1), 1.0f).snack().build();
}
