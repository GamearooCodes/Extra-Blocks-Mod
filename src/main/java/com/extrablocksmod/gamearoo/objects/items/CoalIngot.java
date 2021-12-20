package com.extrablocksmod.gamearoo.objects.items;

import com.extrablocksmod.gamearoo.extrablocksmod;
import com.extrablocksmod.gamearoo.init.ItemInit;
import com.extrablocksmod.gamearoo.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CoalIngot extends Item implements IHasModel {
	public CoalIngot(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(extrablocksmod.extrablocksmoditemstab);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public int getItemBurnTime(ItemStack itemStack) {
		return 3600;
	}
	
	@Override
	public void registerModels() {
		extrablocksmod.proxy.registerItemRenderer(this, 0, "inventory");

	}
}
