package com.extrablocksmod.gamearoo.tabs;

import com.extrablocksmod.gamearoo.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class extrablocksmodtab extends CreativeTabs {
	
	public extrablocksmodtab(String label) {
		super("extrablocksmodtab");
		this.setBackgroundImageName("extrablocksmod.png");
		
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.ruby);
	}
	
	
	

}
