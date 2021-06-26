package com.HugoRandom.Oredium.common.blocks.caballerita;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CaballeritaBlock extends Block{
	
	public CaballeritaBlock() {
		super(AbstractBlock.Properties
        		.of(Material.METAL)
        		.sound(SoundType.METAL)
        		.requiresCorrectToolForDrops()
        		.harvestTool(ToolType.PICKAXE)
        		.strength(5.0f, 6.0f)
        		.harvestLevel(2)
        		.lightLevel((lightLevel) -> 5));
	}	
}
