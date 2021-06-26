package com.HugoRandom.Oredium.common.blocks.enderita;

import java.util.Random;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

public class EnderitaOre extends OreBlock{	
	
	public EnderitaOre() {
		super(AbstractBlock.Properties
        		.of(Material.STONE)
        		.sound(SoundType.STONE)
        		.requiresCorrectToolForDrops()
        		.harvestTool(ToolType.PICKAXE)
        		.strength(3.0f, 3.0f)
        		.harvestLevel(1));		
	}
	
	@Override
	protected int xpOnDrop(Random rand) {		
		return MathHelper.nextInt(rand, 1, 3);
	}
}
