package com.HugoRandom.Oredium.common.blocks.cesarita;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CesaritaOre extends OreBlock {
	
	public CesaritaOre() {
		super(AbstractBlock.Properties
	    		.of(Material.STONE)
	    		.sound(SoundType.STONE)
	    		.requiresCorrectToolForDrops()
	    		.harvestTool(ToolType.PICKAXE)
	    		.strength(3.0f, 3.0f)
	    		.harvestLevel(2));
	}	
}
