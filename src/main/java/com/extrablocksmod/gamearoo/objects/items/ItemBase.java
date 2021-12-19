package com.extrablocksmod.gamearoo.objects.items;

import com.extrablocksmod.gamearoo.extrablocksmod;
import com.extrablocksmod.gamearoo.init.ItemInit;
import com.extrablocksmod.gamearoo.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(extrablocksmod.extrablocksmodtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		extrablocksmod.proxy.registerItemRenderer(this, 0, "inventory");

	}

	

}

