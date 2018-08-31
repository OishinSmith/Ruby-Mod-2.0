package com.bionicfox.rubymod.init;

import java.util.ArrayList;
import java.util.List;

import com.bionicfox.rubymod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
  public static final List<Block> BLOCKS = new ArrayList<Block>();
  
  public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.SAND);
  
  public static final Block OH_HELL_NO_BLOCK = new BlockBase("oh_hell_no_block", Material.IRON);
}
