package com.HugoRandom.Oredium.common.foods;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SoupItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AlezaritaChicken extends SoupItem{

	public AlezaritaChicken() {
		super(new Properties()							
				.food(ALEZARITA_CHICKEN));		
	}
	
	public static final Food ALEZARITA_CHICKEN = new Food.Builder()
			.effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 2400, 0), 1.0f)
			.nutrition(8)
			.saturationMod(0.8f)
			.alwaysEat()
			.build();
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack_, World worldIn, List<ITextComponent> toolTip, ITooltipFlag flagIn) {
		super.appendHoverText(stack_, worldIn, toolTip, flagIn);		
		toolTip.add(new TranslationTextComponent("tooltip.alezarita_chicken"));
	}
}