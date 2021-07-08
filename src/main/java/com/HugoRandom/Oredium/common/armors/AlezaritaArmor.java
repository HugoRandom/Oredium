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

public class AlezaritaArmor extends ArmorItem{

	EffectInstance Effect = new EffectInstance(Effects.JUMP, 400, 0, false, false);
	
	public AlezaritaArmor(EquipmentSlotType slot) {
		super(ArmorOredium.ALEZARITA, 
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
		toolTip.add(new TranslationTextComponent("tooltip.alezarita_armor"));
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
		if (helmet.getItem() == ArmorInit.ALEZARITA_HELMET.get() && chest.getItem() == ArmorInit.ALEZARITA_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.ALEZARITA_LEGGINGS.get() && boots.getItem() == ArmorInit.ALEZARITA_BOOTS.get()) {
			player.addEffect(this.Effect);			
		}		
	}
}