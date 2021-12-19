package com.extrablocksmod.gamearoo.init;

import java.util.List;

import com.extrablocksmod.gamearoo.objects.blocks.BlockBase;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.GLASS);
}
