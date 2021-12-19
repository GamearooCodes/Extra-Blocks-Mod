package com.extrablocksmod.gamearoo.objects.blocks;

import com.extrablocksmod.gamearoo.extrablocksmod;
import com.extrablocksmod.gamearoo.init.BlockInit;
import com.extrablocksmod.gamearoo.init.ItemInit;
import com.extrablocksmod.gamearoo.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(extrablocksmod.extrablocksmodtab);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		extrablocksmod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0 , "invatory");
	}

}
