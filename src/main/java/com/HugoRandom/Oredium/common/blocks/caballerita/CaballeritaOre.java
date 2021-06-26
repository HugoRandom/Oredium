package com.HugoRandom.Oredium.common.blocks.caballerita;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CaballeritaOre extends OreBlock {
	
	public CaballeritaOre() {
		super(AbstractBlock.Properties
	    		.of(Material.STONE)
	    		.sound(SoundType.STONE)
	    		.requiresCorrectToolForDrops()
	    		.harvestTool(ToolType.PICKAXE)
	    		.strength(3.5f, 2.5f)
	    		.harvestLevel(2)
	    		.lightLevel((lightLevel) -> 2));
	}	
}
