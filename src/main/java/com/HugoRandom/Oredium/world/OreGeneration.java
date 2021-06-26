package com.HugoRandom.Oredium.world;

import com.HugoRandom.Oredium.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {

	public static void generateOres (final BiomeLoadingEvent event) {
		if (!(event.getCategory().equals(Category.NETHER) || event.getCategory().equals(Category.THEEND))) {
			generationOredium(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
					BlockInit.AXIDITA_ORE.get().defaultBlockState(), 4, 8, 24, 6);	
			generationOredium(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
					BlockInit.SHINE_ORE.get().defaultBlockState(), 8, 5, 64, 25);	
			generationOredium(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
					BlockInit.CESARITA_ORE.get().defaultBlockState(), 5, 5, 16, 5);	
			generationOredium(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
					BlockInit.CABALLERITA_ORE.get().defaultBlockState(), 4, 6, 16, 4);	
			generationOredium(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
					BlockInit.ENDERITA_ORE.get().defaultBlockState(), 8, 8, 64, 20);	
		}
		if (event.getCategory().equals(Category.ICY) || event.getCategory().equals(Category.EXTREME_HILLS)){
			generationOredium(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, 
					BlockInit.FRANITOLINA_ORE.get().defaultBlockState(), 6, 10, 52, 14);
		}
		if (event.getCategory().equals(Category.NETHER)){
			generationOredium(event, OreFeatureConfig.FillerBlockType.NETHERRACK, 
					BlockInit.HUGODIUM_ORE.get().defaultBlockState(), 4, 32, 64, 6);
			generationOredium(event, OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, 
					BlockInit.ALEZARITA_ORE.get().defaultBlockState(), 7, 8, 100, 15);
			generationOredium(event, OreFeatureConfig.FillerBlockType.NETHERRACK, 
					BlockInit.MIGUELITIO_ORE.get().defaultBlockState(), 6, 24, 100, 15);
		}
	}
		
	private static void generationOredium (BiomeLoadingEvent settings, RuleTest fillerType, BlockState state, 
			int veinSize, int minHeight, int maxHeight, int amount) {
		settings.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
				.configured(new OreFeatureConfig(fillerType, state, veinSize))
				.decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight))
				.squared().count(amount)));		
	}
}
