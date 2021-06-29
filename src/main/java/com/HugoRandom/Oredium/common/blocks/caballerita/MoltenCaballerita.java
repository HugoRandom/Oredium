package com.HugoRandom.Oredium.common.blocks.caballerita;

import com.HugoRandom.Oredium.init.FluidInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class MoltenCaballerita extends FlowingFluidBlock{

	public MoltenCaballerita() {
		super(FluidInit.CABALLERITA, AbstractBlock.Properties
				.of(Material.LAVA, MaterialColor.COLOR_YELLOW)
				.lightLevel((lightLevel) -> 15)
				.strength(100.0f)				
				.speedFactor(0.3F)
				.jumpFactor(0.1F)
				.randomTicks()
				.noDrops());
	}	
}