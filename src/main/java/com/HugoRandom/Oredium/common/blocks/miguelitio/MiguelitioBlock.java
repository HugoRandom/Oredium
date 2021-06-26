package com.HugoRandom.Oredium.common.blocks.miguelitio;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MiguelitioBlock extends Block{
	
	public MiguelitioBlock() {
		super(AbstractBlock.Properties
        		.of(Material.METAL)
        		.sound(SoundType.METAL)
        		.requiresCorrectToolForDrops()
        		.harvestTool(ToolType.PICKAXE)
        		.strength(6.0f, 6.0f)
        		.harvestLevel(3));
	}	
}
