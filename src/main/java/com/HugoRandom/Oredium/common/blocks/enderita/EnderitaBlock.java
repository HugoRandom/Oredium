package com.HugoRandom.Oredium.common.blocks.enderita;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class EnderitaBlock extends Block {
	
	public EnderitaBlock() {
		super(AbstractBlock.Properties
        		.of(Material.GLASS, MaterialColor.COLOR_PURPLE)
        		.sound(SoundType.GLASS)
        		.requiresCorrectToolForDrops()
        		.harvestTool(ToolType.PICKAXE)
        		.strength(2.0f, 3.0f)
        		.harvestLevel(1)
        		.lightLevel((lightLevel) -> 2));
	}		
}
