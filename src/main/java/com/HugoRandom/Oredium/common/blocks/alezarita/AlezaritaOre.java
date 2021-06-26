package com.HugoRandom.Oredium.common.blocks.alezarita;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class AlezaritaOre extends OreBlock {
	
	public AlezaritaOre() {
		super(AbstractBlock.Properties
	    		.of(Material.STONE)
	    		.sound(SoundType.NETHER_ORE)
	    		.requiresCorrectToolForDrops()
	    		.harvestTool(ToolType.PICKAXE)
	    		.strength(3.0f, 3.0f)
	    		.harvestLevel(3));
	}	
}
