package com.HugoRandom.Oredium.common.armors;

import java.util.List;

import com.HugoRandom.Oredium.core.enums.ArmorOredium;
import com.HugoRandom.Oredium.init.ArmorInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AxiditaArmor extends ArmorItem{

	EffectInstance Effect = new EffectInstance(Effects.DOLPHINS_GRACE, 400, 0, false, false);
	
	public AxiditaArmor(EquipmentSlotType slot) {
		super(ArmorOredium.AXIDITA, 
				slot, 
				new Item.Properties()
							.stacksTo(1));
	}
		
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack_, World worldIn, List<ITextComponent> toolTip, ITooltipFlag flagIn) {
		super.appendHoverText(stack_, worldIn, toolTip, flagIn);		
		toolTip.add(new TranslationTextComponent("tooltip.axidita_armor"));
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
		if (helmet.getItem() == ArmorInit.AXIDITA_HELMET.get() && chest.getItem() == ArmorInit.AXIDITA_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.AXIDITA_LEGGINGS.get() && boots.getItem() == ArmorInit.AXIDITA_BOOTS.get()) {
			player.addEffect(this.Effect);			
		}		
	}
}
