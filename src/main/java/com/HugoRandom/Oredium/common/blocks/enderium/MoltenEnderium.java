package com.HugoRandom.Oredium.common.blocks.enderium;

import com.HugoRandom.Oredium.init.FluidInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class MoltenEnderium extends FlowingFluidBlock{

	public MoltenEnderium() {
		super(FluidInit.ENDERIUM, AbstractBlock.Properties
				.of(Material.LAVA, MaterialColor.COLOR_PURPLE)
				.lightLevel((lightLevel) -> 15)
				.strength(100.0f)				
				.speedFactor(0.4F)
				.jumpFactor(0.2F)
				.randomTicks()
				.noDrops());
	}	
}