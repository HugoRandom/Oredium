package com.HugoRandom.Oredium.common.blocks.axidita;

import com.HugoRandom.Oredium.init.FluidInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class MoltenAxidita extends FlowingFluidBlock{

	public MoltenAxidita() {
		super(FluidInit.AXIDITA, AbstractBlock.Properties
				.of(Material.LAVA, MaterialColor.COLOR_GREEN)
				.lightLevel((lightLevel) -> 15)
				.strength(100.0f)				
				.speedFactor(0.3F)
				.jumpFactor(0.1F)
				.randomTicks()
				.noDrops());
	}	
}