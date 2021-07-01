package com.HugoRandom.Oredium.common.blocks;

import java.util.Random;

import com.HugoRandom.Oredium.init.ParticleInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class OrediumBlock extends Block{
	
	public OrediumBlock() {
		super(AbstractBlock.Properties
        		.of(Material.METAL)
        		.sound(SoundType.METAL)
        		.requiresCorrectToolForDrops()
        		.harvestTool(ToolType.PICKAXE)
        		.strength(8.0f, 30.0f)
        		.harvestLevel(3)
        		.lightLevel((lightLevel) -> 7));
	}	
	
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState state, World worldIn, BlockPos pos, Random rand) {
		super.animateTick(state, worldIn, pos, rand);
			if (rand.nextInt(10) == 0) {
				worldIn.addParticle(ParticleInit.OREDIUM_PARTICLE.get(), (double)pos.getX() + rand.nextDouble(), (double)pos.getY() + 1.1D, (double)pos.getZ() + rand.nextDouble(), 0.0D, 0.0D, 0.0D);
	    }
	}	
}
