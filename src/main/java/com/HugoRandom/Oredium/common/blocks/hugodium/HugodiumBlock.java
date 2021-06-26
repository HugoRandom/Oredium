package com.HugoRandom.Oredium.common.blocks.hugodium;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HugodiumBlock extends Block{
	
	public HugodiumBlock() {
		super(AbstractBlock.Properties
        		.of(Material.METAL)
        		.sound(SoundType.METAL)
        		.requiresCorrectToolForDrops()
        		.harvestTool(ToolType.PICKAXE)
        		.strength(9.0f, 12.0f)
        		.harvestLevel(3));
	}	
}