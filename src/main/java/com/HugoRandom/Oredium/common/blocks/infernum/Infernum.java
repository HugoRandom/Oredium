package com.HugoRandom.Oredium.common.blocks.infernum;

import com.HugoRandom.Oredium.init.FluidInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class Infernum extends FlowingFluidBlock{

	public Infernum() {
		super(FluidInit.INFERNUM, AbstractBlock.Properties
				.of(Material.LAVA, MaterialColor.COLOR_RED)
				.lightLevel((lightLevel) -> 15)
				.strength(100.0f)				
				.speedFactor(0.5F)
				.jumpFactor(0.2F)
				.randomTicks()
				.noDrops());
	}	
}
