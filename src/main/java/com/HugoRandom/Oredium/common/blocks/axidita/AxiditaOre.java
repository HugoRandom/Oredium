package com.HugoRandom.Oredium.common.blocks.axidita;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AxiditaOre extends OreBlock{
	
	public AxiditaOre() {
		super(AbstractBlock.Properties
	    		.of(Material.STONE)
	    		.sound(SoundType.STONE)
	    		.requiresCorrectToolForDrops()
	    		.harvestTool(ToolType.PICKAXE)
	    		.strength(3.0f, 3.0f)
	    		.harvestLevel(2));
	}	
}