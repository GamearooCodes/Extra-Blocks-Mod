package com.extrablocksmod.gamearoo.tabs;

import com.extrablocksmod.gamearoo.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class extrablocksmoditemstab extends CreativeTabs {
	
	public extrablocksmoditemstab(String label) {
		super("extrablocksmoditemstab");
		this.setBackgroundImageName("extrablocksmod.png");
		
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ItemInit.ruby);
	}
	
	
	

}
