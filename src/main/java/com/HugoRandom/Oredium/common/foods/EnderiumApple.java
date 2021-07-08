package com.HugoRandom.Oredium.common.foods;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class EnderiumApple extends Item{

	public EnderiumApple() {
		super(new Properties()
				.rarity(Rarity.RARE)
				.food(ENDERIUM_APPLE));		
	}

	public static final Food ENDERIUM_APPLE = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.REGENERATION, 200, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.ABSORPTION, 1200, 1), 1.0f)
			.effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 1200, 0), 1.0f)
			.effect(() -> new EffectInstance(Effects.GLOWING, 100, 0), 1.0f)
			.nutrition(15)
			.saturationMod(1.0f)
			.alwaysEat()
			.build();
	
	@Override
	public boolean isFoil(ItemStack stack) {		
		return true;
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack_, World worldIn, List<ITextComponent> toolTip, ITooltipFlag flagIn) {
		super.appendHoverText(stack_, worldIn, toolTip, flagIn);		
		toolTip.add(new TranslationTextComponent("tooltip.enderium_apple"));
	}
}
