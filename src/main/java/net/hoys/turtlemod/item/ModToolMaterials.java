package net.hoys.turtlemod.item;

import com.google.common.base.Suppliers;
import net.hoys.turtlemod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            59, 2.0F, 0.0F, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
	STONE(BlockTags.INCORRECT_FOR_STONE_TOOL,
            131, 4.0F, 1.0F, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
	IRON(BlockTags.INCORRECT_FOR_IRON_TOOL,
            250, 6.0F, 2.0F, 14, () -> Ingredient.ofItems(Items.IRON_INGOT)),
	DIAMOND(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1561, 8.0F, 3.0F, 10, () -> Ingredient.ofItems(Items.DIAMOND)),
	GOLD(BlockTags.INCORRECT_FOR_GOLD_TOOL,
            32, 12.0F, 0.0F, 22, () -> Ingredient.ofItems(Items.GOLD_INGOT)),
	NETHERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            2031, 9.0F, 4.0F, 15, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    COPPER(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            128, 3.0F, 1.5F, 15, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    TIN(ModTags.Blocks.INCORRECT_FOR_TIN_TOOL,
            200, 5.0F, 2.0F, 9, () -> Ingredient.ofItems(ModItems.TIN_INGOT)),
    NICKEL(ModTags.Blocks.INCORRECT_FOR_NICKEL_TOOL,
            400, 6.5F, 2.5F, 14, () -> Ingredient.ofItems(ModItems.NICKEL_INGOT)),
    LEAD(ModTags.Blocks.INCORRECT_FOR_LEAD_TOOL,
            1500, 8.5F, 3.5F, 15, () -> Ingredient.ofItems(ModItems.LEAD_INGOT)),
    SILVER(ModTags.Blocks.INCORRECT_FOR_SILVER_TOOL,
            300, 10.5F, 0.0F, 21, () -> Ingredient.ofItems(ModItems.SILVER_INGOT)),
    TITANIUM(ModTags.Blocks.INCORRECT_FOR_TITANIUM_TOOL,
            2500, 9.5F, 4.0F, 20, () -> Ingredient.ofItems(ModItems.TITANIUM_INGOT)),;


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability,final float miningSpeed,
                     final float attackDamage, final int enchantability,final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}