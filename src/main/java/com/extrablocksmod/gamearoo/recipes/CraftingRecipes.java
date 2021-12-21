package com.extrablocksmod.gamearoo.recipes;

import com.extrablocksmod.gamearoo.init.BlockInit;
import com.extrablocksmod.gamearoo.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingRecipes {
	public static void init() {
		//Ruby block
		ItemStack ruby = new ItemStack(ItemInit.ruby, 9);
		ItemStack ruby_block = new ItemStack(BlockInit.RUBY_BLOCK);
		GameRegistry.addShapelessRecipe(new ResourceLocation("ruby"), null, ruby, Ingredient.fromStacks(ruby_block));
	}
}
