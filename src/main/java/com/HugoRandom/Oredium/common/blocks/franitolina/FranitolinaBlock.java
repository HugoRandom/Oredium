package com.HugoRandom.Oredium.common.blocks.franitolina;

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

public class FranitolinaBlock extends Block{
	
	public FranitolinaBlock() {
		super(AbstractBlock.Properties
        		.of(Material.METAL)
        		.sound(SoundType.METAL)
        		.requiresCorrectToolForDrops()
        		.harvestTool(ToolType.PICKAXE)
        		.strength(5.0f, 8.0f)
        		.harvestLevel(2));
	}	
	
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState state, World worldIn, BlockPos pos, Random rand) {
		super.animateTick(state, worldIn, pos, rand);
			if (rand.nextInt(8) == 0) {
				worldIn.addParticle(ParticleInit.FRANITOLINA_PARTICLE.get(), (double)pos.getX() + rand.nextDouble(), (double)pos.getY() + 1.1D, (double)pos.getZ() + rand.nextDouble(), 0.0D, 0.0D, 0.0D);
	    }
	}	
}
