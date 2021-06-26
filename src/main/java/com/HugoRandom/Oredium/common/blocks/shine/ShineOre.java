package com.HugoRandom.Oredium.common.blocks.shine;

import java.util.Random;

import com.HugoRandom.Oredium.init.ParticleInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

public class ShineOre extends OreBlock{

	public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;
	
	public ShineOre() {
		super(AbstractBlock.Properties
        		.of(Material.STONE)
        		.sound(SoundType.STONE)
        		.requiresCorrectToolForDrops()
        		.harvestTool(ToolType.PICKAXE)
        		.strength(3.0f, 3.0f)
        		.harvestLevel(1)
        		.lightLevel((lightLevel) -> 1));
		this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
	}
	
	public void stepOn(World worldIn, BlockPos pos, Entity entity) {
		interact(worldIn.getBlockState(pos), worldIn, pos);
		super.stepOn(worldIn, pos, entity);
	}

	public ActionResultType use(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity entity, Hand handIn, BlockRayTraceResult result) {
		if (worldIn.isClientSide) {
			spawnParticles(worldIn, pos);
		} 
		else {
			interact(blockState, worldIn, pos);
		}
		ItemStack itemstack = entity.getItemInHand(handIn);
	   	return itemstack.getItem() instanceof BlockItem && (new BlockItemUseContext(entity, handIn, itemstack, result)).canPlace() ? ActionResultType.PASS : ActionResultType.SUCCESS;
	}	

   	private static void interact(BlockState blockState, World worldIn, BlockPos pos) {
   		spawnParticles(worldIn, pos);
   		if (!blockState.getValue(LIT)) {
   			worldIn.setBlock(pos, blockState.setValue(LIT, Boolean.valueOf(true)), 3);
   		}
   	}

   	public boolean isRandomlyTicking(BlockState blockState) {
   		return blockState.getValue(LIT);
   	}

   	public void randomTick(BlockState blockState, ServerWorld server, BlockPos pos, Random rand) {
	   if (blockState.getValue(LIT)) {
		   server.setBlock(pos, blockState.setValue(LIT, Boolean.valueOf(false)), 3);
	   }
   	} 	

   	@OnlyIn(Dist.CLIENT)
   	public void animateTick(BlockState blockState, World worldIn, BlockPos pos, Random rand) {
   		if (blockState.getValue(LIT)) {
   			spawnParticles(worldIn, pos);
   		}
   	}

   	private static void spawnParticles(World worldIn, BlockPos pos) {
   		double d0 = 0.5625D;
   		Random random = worldIn.random;
   		for(Direction direction : Direction.values()) {
   			BlockPos blockpos = pos.relative(direction);
   			if (!worldIn.getBlockState(blockpos).isSolidRender(worldIn, blockpos)) {
   				Direction.Axis direction$axis = direction.getAxis();
   				double d1 = direction$axis == Direction.Axis.X ? 0.5D + d0 * (double)direction.getStepX() : (double)random.nextFloat();
   				double d2 = direction$axis == Direction.Axis.Y ? 0.5D + d0 * (double)direction.getStepY() : (double)random.nextFloat();
   				double d3 = direction$axis == Direction.Axis.Z ? 0.5D + d0 * (double)direction.getStepZ() : (double)random.nextFloat();
   				worldIn.addParticle(ParticleInit.SHINE_PARTICLE.get(), (double)pos.getX() + d1, (double)pos.getY() + d2, (double)pos.getZ() + d3, 0.0D, 0.0D, 0.0D);
   			}
   		}
   	}

   protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> stateContainer) {
      stateContainer.add(LIT);
   }
}
