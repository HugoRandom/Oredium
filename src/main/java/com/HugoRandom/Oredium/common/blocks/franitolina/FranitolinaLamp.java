package com.HugoRandom.Oredium.common.blocks.franitolina;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FranitolinaLamp extends Block{
	
	public FranitolinaLamp() {
		super(AbstractBlock.Properties
        		.of(Material.BUILDABLE_GLASS)
        		.sound(SoundType.GLASS)
        		.strength(0.5f, 4.0f)
        		.harvestLevel(2)
        		.lightLevel((lightLevel) -> 15));
	}
}