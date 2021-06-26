package com.HugoRandom.Oredium.common.blocks.miguelitio;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MiguelitioOre extends OreBlock{
	
	public MiguelitioOre() {
		super(AbstractBlock.Properties
	    		.of(Material.STONE)
	    		.sound(SoundType.NETHER_ORE)
	    		.requiresCorrectToolForDrops()
	    		.harvestTool(ToolType.PICKAXE)
	    		.strength(4.0f, 4.0f)
	    		.harvestLevel(3));
	}	
}
