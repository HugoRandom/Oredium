package com.HugoRandom.Oredium.events;

import com.HugoRandom.Oredium.Oredium;
import com.HugoRandom.Oredium.init.ArmorInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Oredium.MOD_ID, bus = Bus.FORGE)
public class ArmorEvents {

	// METER EL DA:O CONTRA DRAGON
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public static void onEntityHurt(LivingAttackEvent event) {
		ItemStack helmet = event.getEntityLiving().getItemBySlot(EquipmentSlotType.HEAD);
		ItemStack chest = event.getEntityLiving().getItemBySlot(EquipmentSlotType.CHEST);
        ItemStack legs = event.getEntityLiving().getItemBySlot(EquipmentSlotType.LEGS);
        ItemStack boots = event.getEntityLiving().getItemBySlot(EquipmentSlotType.FEET);       
		
        if (helmet.getItem() == ArmorInit.ALEZARITA_HELMET.get() && chest.getItem() == ArmorInit.ALEZARITA_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.ALEZARITA_LEGGINGS.get() && boots.getItem() == ArmorInit.ALEZARITA_BOOTS.get()) {
			if (!(event.getSource() == DamageSource.FALL || event.getSource() == DamageSource.LAVA)) {
				event.getEntityLiving().addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 100, 0));
			}
		}
		else if (helmet.getItem() == ArmorInit.AXIDITA_HELMET.get() && chest.getItem() == ArmorInit.AXIDITA_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.AXIDITA_LEGGINGS.get() && boots.getItem() == ArmorInit.AXIDITA_BOOTS.get()) {
			if(event.getSource() == DamageSource.CACTUS || event.getSource() == DamageSource.SWEET_BERRY_BUSH) {
				event.setCanceled(true);
			}
		}		
		else if (helmet.getItem() == ArmorInit.CABALLERITA_HELMET.get() && chest.getItem() == ArmorInit.CABALLERITA_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.CABALLERITA_LEGGINGS.get() && boots.getItem() == ArmorInit.CABALLERITA_BOOTS.get()) {
			if(event.getSource() == DamageSource.IN_FIRE || event.getSource() == DamageSource.ON_FIRE || event.getSource() == DamageSource.HOT_FLOOR ) {
				event.setCanceled(true);				
			}							
		}	
		else if (helmet.getItem() == ArmorInit.CESARITA_HELMET.get() && chest.getItem() == ArmorInit.CESARITA_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.CESARITA_LEGGINGS.get() && boots.getItem() == ArmorInit.CESARITA_BOOTS.get()) {
			if(event.getSource() == DamageSource.WITHER) {
				event.setCanceled(true);				
			}							
		}	
		else if (helmet.getItem() == ArmorInit.ENDERIUM_HELMET.get() && chest.getItem() == ArmorInit.ENDERIUM_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.ENDERIUM_LEGGINGS.get() && boots.getItem() == ArmorInit.ENDERIUM_BOOTS.get()) {
			if(event.getSource() == DamageSource.DRAGON_BREATH || event.getSource() == DamageSource.FALL) {
				event.setCanceled(true);				
			}				
		}
		else if (helmet.getItem() == ArmorInit.FRANITOLINA_HELMET.get() && chest.getItem() == ArmorInit.FRANITOLINA_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.FRANITOLINA_LEGGINGS.get() && boots.getItem() == ArmorInit.FRANITOLINA_BOOTS.get()) {
			if(event.getSource() == DamageSource.IN_WALL || event.getSource() == DamageSource.ANVIL) {
				event.setCanceled(true);				
			}				
		}
		else if (helmet.getItem() == ArmorInit.SHINE_HELMET.get() && chest.getItem() == ArmorInit.SHINE_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.SHINE_LEGGINGS.get() && boots.getItem() == ArmorInit.SHINE_BOOTS.get()) {
			if(event.getSource().isMagic()) {
				event.setCanceled(true);
			}
		}		
		else if (helmet.getItem() == ArmorInit.MIGUELITIO_HELMET.get() && chest.getItem() == ArmorInit.MIGUELITIO_CHESTPLATE.get()
				&& legs.getItem() == ArmorInit.MIGUELITIO_LEGGINGS.get() && boots.getItem() == ArmorInit.MIGUELITIO_BOOTS.get()) {
			if(event.getSource() == DamageSource.LIGHTNING_BOLT || event.getSource() == DamageSource.FLY_INTO_WALL) {
				event.setCanceled(true);
			}
		}
		else
		{
			// Nothing
		}
	}
}
