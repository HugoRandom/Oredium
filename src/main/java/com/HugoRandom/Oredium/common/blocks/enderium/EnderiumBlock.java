package com.HugoRandom.Oredium.common.blocks.enderium;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EnderiumBlock extends Block{
	
	public EnderiumBlock() {
		super(AbstractBlock.Properties
        		.of(Material.METAL)
        		.sound(SoundType.METAL)
        		.requiresCorrectToolForDrops()
        		.harvestTool(ToolType.PICKAXE)
        		.strength(8.0f, 30.0f)
        		.harvestLevel(3)
        		.lightLevel((lightLevel) -> 3));
	}	
}