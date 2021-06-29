package com.HugoRandom.Oredium.common.blocks.franitolina;

import com.HugoRandom.Oredium.init.FluidInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class MoltenFranitolina extends FlowingFluidBlock{

	public MoltenFranitolina() {
		super(FluidInit.FRANITOLINA, AbstractBlock.Properties
				.of(Material.LAVA, MaterialColor.COLOR_ORANGE)
				.lightLevel((lightLevel) -> 15)
				.strength(100.0f)				
				.speedFactor(0.3F)
				.jumpFactor(0.1F)
				.randomTicks()
				.noDrops());
	}	
}