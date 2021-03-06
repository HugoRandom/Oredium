package com.HugoRandom.Oredium.common.armors;

import java.util.List;

import com.HugoRandom.Oredium.core.enums.ArmorOredium;
import com.HugoRandom.Oredium.init.ArmorInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
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

public class HugodiumArmor extends ArmorItem{

	EffectInstance Effect = new EffectInstance(Effects.DIG_SPEED, 400, 1, false, false);
	
	public HugodiumArmor(EquipmentSlotType slot) {
		super(ArmorOredium.HUGODIUM, 
				slot, 
				new Item.Properties()
							.stacksTo(1)
							.fireResistant()
							.rarity(Rarity.UNCOMMON));
	}	
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack_, World worldIn, List<ITextComponent> toolTip, ITooltipFlag flagIn) {
		super.appendHoverText(stack_, worldIn, toolTip, flagIn);		
		toolTip.add(new TranslationTextComponent("tooltip.hugodium_armor"));
	}	

	@Override
	public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
		return true;
	}
	
	@Override
	public int getEntityLifespan(ItemStack itemStack, World world) {		
		return 12000;
	}

	@Override
	public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
		ItemStack helmet = player.getItemBySlot(EquipmentSlotType.HEAD);
		ItemStack chest = player.getItemBySlot(EquipmentSlotType.CHEST);
        ItemStack legs = player.getItemBySlot(EquipmentSlotType.LEGS);
        ItemStack boots = player.getItemBySlot(EquipmentSlotType.FEET);       
		if (helmet.getItem() == ArmorInit.HUGODIUM_HELMET.get() && chest.getItem() == ArmorInit.HUGODIUM_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.HUGODIUM_LEGGINGS.get() && boots.getItem() == ArmorInit.HUGODIUM_BOOTS.get()) {
			player.addEffect(this.Effect);			
		}		
	}
}



