package com.example.arcanedivinity.datagen;

import com.example.arcanedivinity.block.ModBlocks;
import com.example.arcanedivinity.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(ModItems.RAW_ARCANIUM_ORE.get()), RecipeCategory.MISC,
                ModItems.ARCANIUM_INGOT.get(), 0.3f, 150, "arcane_divinity");
        oreSmelting(consumer, List.of(ModBlocks.ARCANIUM_ORE_BLOCK.get()), RecipeCategory.MISC,
                ModItems.ARCANIUM_INGOT.get(), 0.3f, 150, "arcane_divinity");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, ModItems.ARCANIUM_INGOT.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARCANIUM_BLOCK.get());
    }
}
