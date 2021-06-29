package com.HugoRandom.Oredium.common.blocks.shine;

import com.HugoRandom.Oredium.init.FluidInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class MoltenShine extends FlowingFluidBlock{

	public MoltenShine() {
		super(FluidInit.SHINE, AbstractBlock.Properties
				.of(Material.LAVA, MaterialColor.COLOR_LIGHT_BLUE)
				.lightLevel((lightLevel) -> 15)
				.strength(100.0f)				
				.speedFactor(0.2F)
				.jumpFactor(0.1F)
				.randomTicks()
				.noDrops());
	}	
}