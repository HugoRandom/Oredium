package com.HugoRandom.Oredium.init;

import com.HugoRandom.Oredium.Oredium;
import com.HugoRandom.Oredium.core.enums.ItemTierOredium;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolInit {

	// -- DEFERRED REGISTER
	
	public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);
	
	// Swords
	
	public static final RegistryObject<SwordItem> HUGODIUM_SWORD = TOOLS.register("hugodium_sword", 
			() -> new SwordItem(ItemTierOredium.HUGODIUM, 3, -2.4F, new Item.Properties().fireResistant()));
	public static final RegistryObject<SwordItem> ALEZARITA_SWORD = TOOLS.register("alezarita_sword", 
			() -> new SwordItem(ItemTierOredium.ALEZARITA, 3, -2.4F, new Item.Properties().fireResistant()));
	public static final RegistryObject<SwordItem> AXIDITA_SWORD = TOOLS.register("axidita_sword", 
			() -> new SwordItem(ItemTierOredium.AXIDITA, 3, -2.4F, new Item.Properties()));
	public static final RegistryObject<SwordItem> FRANITOLINA_SWORD = TOOLS.register("franitolina_sword", 
			() -> new SwordItem(ItemTierOredium.FRANITOLINA, 3, -2.4F, new Item.Properties()));
	public static final RegistryObject<SwordItem> MIGUELITIO_SWORD = TOOLS.register("miguelitio_sword", 
			() -> new SwordItem(ItemTierOredium.MIGUELITIO, 3, -2.4F, new Item.Properties().fireResistant()));
	public static final RegistryObject<SwordItem> SHINE_SWORD = TOOLS.register("shine_sword", 
			() -> new SwordItem(ItemTierOredium.SHINE, 3, -2.4F, new Item.Properties()));
	public static final RegistryObject<SwordItem> CESARITA_SWORD = TOOLS.register("cesarita_sword", 
			() -> new SwordItem(ItemTierOredium.CESARITA, 3, -2.4F, new Item.Properties()));
	public static final RegistryObject<SwordItem> CABALLERITA_SWORD = TOOLS.register("caballerita_sword", 
			() -> new SwordItem(ItemTierOredium.CABALLERITA, 3, -2.4F, new Item.Properties()));
	public static final RegistryObject<SwordItem> ENDERIUM_SWORD = TOOLS.register("enderium_sword", 
			() -> new SwordItem(ItemTierOredium.ENDERIUM, 3, -2.4F, new Item.Properties()));
	
	// Pickaxes
	
	public static final RegistryObject<PickaxeItem> HUGODIUM_PICKAXE = TOOLS.register("hugodium_pickaxe", 
			() -> new PickaxeItem(ItemTierOredium.HUGODIUM, 1, -2.8F, new Item.Properties().fireResistant()));
	public static final RegistryObject<PickaxeItem> ALEZARITA_PICKAXE = TOOLS.register("alezarita_pickaxe", 
			() -> new PickaxeItem(ItemTierOredium.ALEZARITA, 1, -2.8F, new Item.Properties().fireResistant()));
	public static final RegistryObject<PickaxeItem> AXIDITA_PICKAXE = TOOLS.register("axidita_pickaxe", 
			() -> new PickaxeItem(ItemTierOredium.AXIDITA, 1, -2.8F, new Item.Properties()));
	public static final RegistryObject<PickaxeItem> FRANITOLINA_PICKAXE = TOOLS.register("franitolina_pickaxe", 
			() -> new PickaxeItem(ItemTierOredium.FRANITOLINA, 1, -2.8F, new Item.Properties()));
	public static final RegistryObject<PickaxeItem> MIGUELITIO_PICKAXE = TOOLS.register("miguelitio_pickaxe", 
			() -> new PickaxeItem(ItemTierOredium.MIGUELITIO, 1, -2.8F, new Item.Properties().fireResistant()));
	public static final RegistryObject<PickaxeItem> SHINE_PICKAXE = TOOLS.register("shine_pickaxe", 
			() -> new PickaxeItem(ItemTierOredium.SHINE, 1, -2.8F, new Item.Properties()));
	public static final RegistryObject<PickaxeItem> CESARITA_PICKAXE = TOOLS.register("cesarita_pickaxe", 
			() -> new PickaxeItem(ItemTierOredium.CESARITA, 1, -2.8F, new Item.Properties()));
	public static final RegistryObject<PickaxeItem> CABALLERITA_PICKAXE = TOOLS.register("caballerita_pickaxe", 
			() -> new PickaxeItem(ItemTierOredium.CABALLERITA, 1, -2.8F, new Item.Properties()));
	public static final RegistryObject<PickaxeItem> ENDERIUM_PICKAXE = TOOLS.register("enderium_pickaxe", 
			() -> new PickaxeItem(ItemTierOredium.ENDERIUM, 1, -2.8F, new Item.Properties()));
	
	// Axes
	
	public static final RegistryObject<AxeItem> HUGODIUM_AXE = TOOLS.register("hugodium_axe", 
			() -> new AxeItem(ItemTierOredium.HUGODIUM, 4, -3.0F, new Item.Properties().fireResistant()));
	public static final RegistryObject<AxeItem> ALEZARITA_AXE = TOOLS.register("alezarita_axe", 
			() -> new AxeItem(ItemTierOredium.ALEZARITA, 4, -3.0F, new Item.Properties().fireResistant()));
	public static final RegistryObject<AxeItem> AXIDITA_AXE = TOOLS.register("axidita_axe", 
			() -> new AxeItem(ItemTierOredium.AXIDITA, 4, -3.0F, new Item.Properties()));
	public static final RegistryObject<AxeItem> FRANITOLINA_AXE = TOOLS.register("franitolina_axe", 
			() -> new AxeItem(ItemTierOredium.FRANITOLINA, 4, -3.0F, new Item.Properties()));
	public static final RegistryObject<AxeItem> MIGUELITIO_AXE = TOOLS.register("miguelitio_axe", 
			() -> new AxeItem(ItemTierOredium.MIGUELITIO, 4, -3.0F, new Item.Properties().fireResistant()));
	public static final RegistryObject<AxeItem> SHINE_AXE = TOOLS.register("shine_axe", 
			() -> new AxeItem(ItemTierOredium.SHINE, 4, -3.0F, new Item.Properties()));
	public static final RegistryObject<AxeItem> CESARITA_AXE = TOOLS.register("cesarita_axe", 
			() -> new AxeItem(ItemTierOredium.CESARITA, 4, -3.0F, new Item.Properties()));
	public static final RegistryObject<AxeItem> CABALLERITA_AXE = TOOLS.register("caballerita_axe", 
			() -> new AxeItem(ItemTierOredium.CABALLERITA, 4, -3.0F, new Item.Properties()));
	public static final RegistryObject<AxeItem> ENDERIUM_AXE = TOOLS.register("enderium_axe", 
			() -> new AxeItem(ItemTierOredium.ENDERIUM, 4, -3.0F, new Item.Properties()));
	
	// Shovels
	
	public static final RegistryObject<ShovelItem> HUGODIUM_SHOVEL = TOOLS.register("hugodium_shovel", 
			() -> new ShovelItem(ItemTierOredium.HUGODIUM, 1.5F, -3.0F, new Item.Properties().fireResistant()));
	public static final RegistryObject<ShovelItem> ALEZARITA_SHOVEL = TOOLS.register("alezarita_shovel", 
			() -> new ShovelItem(ItemTierOredium.ALEZARITA, 1.5F, -3.0F, new Item.Properties().fireResistant()));
	public static final RegistryObject<ShovelItem> AXIDITA_SHOVEL = TOOLS.register("axidita_shovel", 
			() -> new ShovelItem(ItemTierOredium.AXIDITA, 1.5F, -3.0F, new Item.Properties()));
	public static final RegistryObject<ShovelItem> FRANITOLINA_SHOVEL = TOOLS.register("franitolina_shovel", 
			() -> new ShovelItem(ItemTierOredium.FRANITOLINA, 1.5F, -3.0F, new Item.Properties()));
	public static final RegistryObject<ShovelItem> MIGUELITIO_SHOVEL = TOOLS.register("miguelitio_shovel", 
			() -> new ShovelItem(ItemTierOredium.MIGUELITIO, 1.5F, -3.0F, new Item.Properties().fireResistant()));
	public static final RegistryObject<ShovelItem> SHINE_SHOVEL = TOOLS.register("shine_shovel", 
			() -> new ShovelItem(ItemTierOredium.SHINE, 1.5F, -3.0F, new Item.Properties()));
	public static final RegistryObject<ShovelItem> CESARITA_SHOVEL = TOOLS.register("cesarita_shovel", 
			() -> new ShovelItem(ItemTierOredium.CESARITA, 1.5F, -3.0F, new Item.Properties()));
	public static final RegistryObject<ShovelItem> CABALLERITA_SHOVEL = TOOLS.register("caballerita_shovel", 
			() -> new ShovelItem(ItemTierOredium.CABALLERITA, 1.5F, -3.0F, new Item.Properties()));
	public static final RegistryObject<ShovelItem> ENDERIUM_SHOVEL = TOOLS.register("enderium_shovel", 
			() -> new ShovelItem(ItemTierOredium.ENDERIUM, 1.5F, -3.0F, new Item.Properties()));
		
	// Hoes
		
	public static final RegistryObject<HoeItem> HUGODIUM_HOE = TOOLS.register("hugodium_hoe", 
			() -> new HoeItem(ItemTierOredium.HUGODIUM, -3, 0.0F, new Item.Properties().fireResistant()));	
	public static final RegistryObject<HoeItem> ALEZARITA_HOE = TOOLS.register("alezarita_hoe", 
			() -> new HoeItem(ItemTierOredium.ALEZARITA, -3, 0.0F, new Item.Properties().fireResistant()));
	public static final RegistryObject<HoeItem> AXIDITA_HOE = TOOLS.register("axidita_hoe", 
			() -> new HoeItem(ItemTierOredium.AXIDITA, -3, 0.0F, new Item.Properties()));
	public static final RegistryObject<HoeItem> FRANITOLINA_HOE = TOOLS.register("franitolina_hoe", 
			() -> new HoeItem(ItemTierOredium.FRANITOLINA, -3, 0.0F, new Item.Properties()));
	public static final RegistryObject<HoeItem> MIGUELITIO_HOE = TOOLS.register("miguelitio_hoe", 
			() -> new HoeItem(ItemTierOredium.MIGUELITIO, -3, 0.0F, new Item.Properties().fireResistant()));
	public static final RegistryObject<HoeItem> SHINE_HOE = TOOLS.register("shine_hoe", 
			() -> new HoeItem(ItemTierOredium.SHINE, -3, 0.0F, new Item.Properties()));
	public static final RegistryObject<HoeItem> CESARITA_HOE = TOOLS.register("cesarita_hoe", 
				() -> new HoeItem(ItemTierOredium.CESARITA, -3, 0.0F, new Item.Properties()));
	public static final RegistryObject<HoeItem> CABALLERITA_HOE = TOOLS.register("caballerita_hoe", 
			() -> new HoeItem(ItemTierOredium.CABALLERITA, -3, 0.0F, new Item.Properties()));
	public static final RegistryObject<HoeItem> ENDERIUM_HOE = TOOLS.register("enderium_hoe", 
			() -> new HoeItem(ItemTierOredium.ENDERIUM, -3, 0.0F, new Item.Properties()));
}
