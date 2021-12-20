package com.extrablocksmod.gamearoo.recipes;

import com.extrablocksmod.gamearoo.init.ItemInit;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	public static void init() {
		GameRegistry.addSmelting(new ItemStack(Blocks.CRAFTING_TABLE), new ItemStack(ItemInit.ruby), 0.5F);
	}
}
