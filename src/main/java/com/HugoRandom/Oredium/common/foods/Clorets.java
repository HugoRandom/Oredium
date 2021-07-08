package com.HugoRandom.Oredium.common.foods;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Food;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class Clorets extends Item{

	public Clorets() {
		super(new Properties()							
				.food(CLORETS));		
	}
	
	public static final Food CLORETS = new Food.Builder()			
			.nutrition(2)
			.saturationMod(0.2f)
			.alwaysEat()
			.fast()
			.build();
	
	@Override
	public ItemStack finishUsingItem(ItemStack stack, World world, LivingEntity player) {
		if (!world.isClientSide) {
	         player.removeEffect(Effects.CONFUSION);
	         player.removeEffect(Effects.MOVEMENT_SLOWDOWN);
	    }
		return super.finishUsingItem(stack, world, player);
	}	
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack_, World worldIn, List<ITextComponent> toolTip, ITooltipFlag flagIn) {
		super.appendHoverText(stack_, worldIn, toolTip, flagIn);		
		toolTip.add(new TranslationTextComponent("tooltip.clorets"));
	}
}