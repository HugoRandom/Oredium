package com.HugoRandom.Oredium.common.blocks.franitolina;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class FranitolinaOre extends OreBlock{
	
	public FranitolinaOre() {
		super(AbstractBlock.Properties
	    		.of(Material.STONE)
	    		.sound(SoundType.STONE)
	    		.requiresCorrectToolForDrops()
	    		.harvestTool(ToolType.PICKAXE)
	    		.strength(3.5f, 4.0f)
	    		.harvestLevel(2));
	}	
}
