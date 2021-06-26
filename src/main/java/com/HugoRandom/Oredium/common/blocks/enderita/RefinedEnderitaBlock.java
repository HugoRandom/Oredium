package com.HugoRandom.Oredium.common.blocks.enderita;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class RefinedEnderitaBlock extends Block {
	
	public RefinedEnderitaBlock() {
		super(AbstractBlock.Properties
        		.of(Material.STONE, MaterialColor.COLOR_PURPLE)
        		.sound(SoundType.STONE)
        		.requiresCorrectToolForDrops()
        		.harvestTool(ToolType.PICKAXE)
        		.strength(2.0f, 3.0f)
        		.harvestLevel(1)
        		.lightLevel((lightLevel) -> 3));
	}		
}
