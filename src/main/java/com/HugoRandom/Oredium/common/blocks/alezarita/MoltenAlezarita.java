package com.HugoRandom.Oredium.common.blocks.alezarita;

import com.HugoRandom.Oredium.init.FluidInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class MoltenAlezarita extends FlowingFluidBlock{

	public MoltenAlezarita() {
		super(FluidInit.ALEZARITA, AbstractBlock.Properties
				.of(Material.LAVA, MaterialColor.COLOR_BLUE)
				.lightLevel((lightLevel) -> 15)
				.strength(100.0f)				
				.speedFactor(0.4F)
				.jumpFactor(0.2F)
				.randomTicks()
				.noDrops());
	}	
	
}
