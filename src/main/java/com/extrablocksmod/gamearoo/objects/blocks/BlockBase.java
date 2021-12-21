package com.extrablocksmod.gamearoo.objects.blocks;

import java.util.Random;

import com.extrablocksmod.gamearoo.extrablocksmod;
import com.extrablocksmod.gamearoo.init.BlockInit;
import com.extrablocksmod.gamearoo.init.ItemInit;
import com.extrablocksmod.gamearoo.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBase extends Block implements IHasModel {
	
	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(extrablocksmod.extrablocksmodtab);
		setHardness(6.0f);
		setResistance(35.0f);
		setLightLevel(25.0f);
		setLightOpacity(1);
		setHarvestLevel("pick_axe", 3);
		setSoundType(SoundType.STONE);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemInit.ruby;
	}
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		return 9;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		return true;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return true;
	}
	
	
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	protected boolean canSilkHarvest() {
		return true;
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		extrablocksmod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0 , "invatory");
	}

}
