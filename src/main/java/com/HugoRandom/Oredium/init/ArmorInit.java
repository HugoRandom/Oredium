package com.HugoRandom.Oredium.init;

import com.HugoRandom.Oredium.Oredium;
import com.HugoRandom.Oredium.common.armors.*;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorInit {
	
	// -- DEFERRED REGISTER
	
	public static final DeferredRegister<Item> ARMORS = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);

	// Helmets
		
	public static final RegistryObject<ArmorItem> HUGODIUM_HELMET = ARMORS.register("hugodium_helmet", 
			() -> new HugodiumArmor(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> ALEZARITA_HELMET = ARMORS.register("alezarita_helmet", 
			() -> new AlezaritaArmor(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> AXIDITA_HELMET = ARMORS.register("axidita_helmet", 
			() -> new AxiditaArmor(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> FRANITOLINA_HELMET = ARMORS.register("franitolina_helmet", 
			() -> new FranitolinaArmor(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> MIGUELITIO_HELMET = ARMORS.register("miguelitio_helmet", 
			() -> new MiguelitioArmor(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> SHINE_HELMET = ARMORS.register("shine_helmet", 
			() -> new ShineArmor(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> CESARITA_HELMET = ARMORS.register("cesarita_helmet", 
			() -> new CesaritaArmor(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> CABALLERITA_HELMET = ARMORS.register("caballerita_helmet", 
			() -> new CaballeritaArmor(EquipmentSlotType.HEAD));
	public static final RegistryObject<ArmorItem> ENDERIUM_HELMET = ARMORS.register("enderium_helmet", 
			() -> new EnderiumArmor(EquipmentSlotType.HEAD));
		
	// Chestplates
		
	public static final RegistryObject<ArmorItem> HUGODIUM_CHESTPLATE = ARMORS.register("hugodium_chestplate", 
			() -> new HugodiumArmor(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> ALEZARITA_CHESTPLATE = ARMORS.register("alezarita_chestplate", 
			() -> new AlezaritaArmor(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> AXIDITA_CHESTPLATE = ARMORS.register("axidita_chestplate", 
			() -> new AxiditaArmor(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> FRANITOLINA_CHESTPLATE = ARMORS.register("franitolina_chestplate", 
			() -> new FranitolinaArmor(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> MIGUELITIO_CHESTPLATE = ARMORS.register("miguelitio_chestplate", 
			() -> new MiguelitioArmor(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> SHINE_CHESTPLATE = ARMORS.register("shine_chestplate", 
			() -> new ShineArmor(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> CESARITA_CHESTPLATE = ARMORS.register("cesarita_chestplate", 
			() -> new CesaritaArmor(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> CABALLERITA_CHESTPLATE = ARMORS.register("caballerita_chestplate", 
			() -> new CaballeritaArmor(EquipmentSlotType.CHEST));
	public static final RegistryObject<ArmorItem> ENDERIUM_CHESTPLATE = ARMORS.register("enderium_chestplate", 
			() -> new EnderiumArmor(EquipmentSlotType.CHEST));
		
	// Leggings
		
	public static final RegistryObject<ArmorItem> HUGODIUM_LEGGINGS = ARMORS.register("hugodium_leggings", 
			() -> new HugodiumArmor(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> ALEZARITA_LEGGINGS = ARMORS.register("alezarita_leggings", 
			() -> new AlezaritaArmor(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> AXIDITA_LEGGINGS = ARMORS.register("axidita_leggings", 
			() -> new AxiditaArmor(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> FRANITOLINA_LEGGINGS = ARMORS.register("franitolina_leggings", 
			() -> new FranitolinaArmor(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> MIGUELITIO_LEGGINGS = ARMORS.register("miguelitio_leggings", 
			() -> new MiguelitioArmor(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> SHINE_LEGGINGS = ARMORS.register("shine_leggings", 
			() -> new ShineArmor(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> CESARITA_LEGGINGS = ARMORS.register("cesarita_leggings", 
			() -> new CesaritaArmor(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> CABALLERITA_LEGGINGS = ARMORS.register("caballerita_leggings", 
			() -> new CaballeritaArmor(EquipmentSlotType.LEGS));
	public static final RegistryObject<ArmorItem> ENDERIUM_LEGGINGS = ARMORS.register("enderium_leggings", 
			() -> new EnderiumArmor(EquipmentSlotType.LEGS));
		
	// Boots
		
	public static final RegistryObject<ArmorItem> HUGODIUM_BOOTS = ARMORS.register("hugodium_boots", 
			() -> new HugodiumArmor(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> ALEZARITA_BOOTS = ARMORS.register("alezarita_boots", 
			() -> new AlezaritaArmor(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> AXIDITA_BOOTS = ARMORS.register("axidita_boots", 
			() -> new AxiditaArmor(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> FRANITOLINA_BOOTS = ARMORS.register("franitolina_boots", 
			() -> new FranitolinaArmor(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> MIGUELITIO_BOOTS = ARMORS.register("miguelitio_boots", 
			() -> new MiguelitioArmor(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> SHINE_BOOTS = ARMORS.register("shine_boots", 
			() -> new ShineArmor(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> CESARITA_BOOTS = ARMORS.register("cesarita_boots", 
			() -> new CesaritaArmor(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> CABALLERITA_BOOTS = ARMORS.register("caballerita_boots", 
			() -> new CaballeritaArmor(EquipmentSlotType.FEET));
	public static final RegistryObject<ArmorItem> ENDERIUM_BOOTS = ARMORS.register("enderium_boots", 
			() -> new EnderiumArmor(EquipmentSlotType.FEET));
		
}
