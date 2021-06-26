package com.HugoRandom.Oredium.init;

import com.HugoRandom.Oredium.Oredium;
import com.HugoRandom.Oredium.common.items.SpecialItem;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	
	// -- DEFERRED REGISTER
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);

	// Ingots
	
	public static final RegistryObject<Item> HUGODIUM_INGOT = ITEMS.register("hugodium_ingot", 
			() -> new Item(new Item.Properties().fireResistant()));	
	public static final RegistryObject<Item> ALEZARITA_INGOT = ITEMS.register("alezarita_ingot", 
			() -> new Item(new Item.Properties().fireResistant()));
	public static final RegistryObject<Item> FRANITOLINA_INGOT = ITEMS.register("franitolina_ingot", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> MIGUELITIO_INGOT = ITEMS.register("miguelitio_ingot", 
			() -> new Item(new Item.Properties().fireResistant()));
	public static final RegistryObject<Item> SHINE_INGOT = ITEMS.register("shine_ingot", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> CESARITA_INGOT = ITEMS.register("cesarita_ingot", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> CABALLERITA_INGOT = ITEMS.register("caballerita_ingot", 
			() -> new Item(new Item.Properties().fireResistant()));
	public static final RegistryObject<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot", 
			() -> new Item(new Item.Properties().fireResistant()));
		
	// Gems
		
	public static final RegistryObject<Item> AXIDITA = ITEMS.register("axidita", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> ENDERITA = ITEMS.register("enderita", 
			() -> new Item(new Item.Properties()));	
	
	// Nuggets
	
	public static final RegistryObject<Item> HUGODIUM_NUGGET = ITEMS.register("hugodium_nugget", 
			() -> new Item(new Item.Properties().fireResistant()));	
	public static final RegistryObject<Item> ALEZARITA_NUGGET = ITEMS.register("alezarita_nugget", 
			() -> new Item(new Item.Properties().fireResistant()));
	public static final RegistryObject<Item> FRANITOLINA_NUGGET = ITEMS.register("franitolina_nugget", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> MIGUELITIO_NUGGET = ITEMS.register("miguelitio_nugget", 
			() -> new Item(new Item.Properties().fireResistant()));
	public static final RegistryObject<Item> SHINE_NUGGET = ITEMS.register("shine_nugget", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> CESARITA_NUGGET = ITEMS.register("cesarita_nugget", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> CABALLERITA_NUGGET = ITEMS.register("caballerita_nugget", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget", 
			() -> new Item(new Item.Properties()));
	
	// -- ENDERITA AND ENDERIUM
	
	public static final RegistryObject<Item> ENDERITA_CRYSTAL= ITEMS.register("enderita_crystal", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> ENDERITA_PLATE = ITEMS.register("enderita_plate", 
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> ENDERIUM_GEM = ITEMS.register("enderium_gem", 
			() -> new Item(new Item.Properties()));
	
	// -- SPECIAL ITEMS
	
	public static final RegistryObject<Item> OREDIUM_AMULET = ITEMS.register("oredium_amulet", 
			() -> new Item(new Item.Properties()
					.stacksTo(1)
					.rarity(Rarity.EPIC)));
	public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item", 
			() -> new SpecialItem(new Item.Properties()
					.stacksTo(1)
					.durability(10)
					.rarity(Rarity.EPIC)));
	
	// -- BLOCK ITEMS
	
	// Blocks
	
	public static final RegistryObject<BlockItem> HUGODIUM_BLOCK = ITEMS.register("hugodium_block", 
			() -> new BlockItem(BlockInit.HUGODIUM_BLOCK.get(), new Item.Properties().fireResistant()));	
	public static final RegistryObject<BlockItem> ALEZARITA_BLOCK = ITEMS.register("alezarita_block", 
			() -> new BlockItem(BlockInit.ALEZARITA_BLOCK.get(), new Item.Properties().fireResistant()));
	public static final RegistryObject<BlockItem> AXIDITA_BLOCK = ITEMS.register("axidita_block", 
			() -> new BlockItem(BlockInit.AXIDITA_BLOCK.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> FRANITOLINA_BLOCK = ITEMS.register("franitolina_block", 
			() -> new BlockItem(BlockInit.FRANITOLINA_BLOCK.get(), new Item.Properties()));	
	public static final RegistryObject<BlockItem> MIGUELITIO_BLOCK = ITEMS.register("miguelitio_block", 
			() -> new BlockItem(BlockInit.MIGUELITIO_BLOCK.get(), new Item.Properties().fireResistant()));	
	public static final RegistryObject<BlockItem> SHINE_BLOCK = ITEMS.register("shine_block", 
			() -> new BlockItem(BlockInit.SHINE_BLOCK.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> CESARITA_BLOCK = ITEMS.register("cesarita_block", 
			() -> new BlockItem(BlockInit.CESARITA_BLOCK.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> CABALLERITA_BLOCK = ITEMS.register("caballerita_block", 
			() -> new BlockItem(BlockInit.CABALLERITA_BLOCK.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> ENDERITA_BLOCK = ITEMS.register("enderita_block", 
			() -> new BlockItem(BlockInit.ENDERITA_BLOCK.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> REFINED_ENDERITA_BLOCK = ITEMS.register("refined_enderita_block", 
			() -> new BlockItem(BlockInit.REFINED_ENDERITA_BLOCK.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> ENDERIUM_BLOCK = ITEMS.register("enderium_block", 
			() -> new BlockItem(BlockInit.ENDERIUM_BLOCK.get(), new Item.Properties()));
	
	public static final RegistryObject<BlockItem> HUGODIUM_LAMP = ITEMS.register("hugodium_lamp", 
			() -> new BlockItem(BlockInit.HUGODIUM_LAMP.get(), new Item.Properties()));	
	public static final RegistryObject<BlockItem> ALEZARITA_LAMP = ITEMS.register("alezarita_lamp", 
			() -> new BlockItem(BlockInit.ALEZARITA_LAMP.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> AXIDITA_LAMP = ITEMS.register("axidita_lamp", 
			() -> new BlockItem(BlockInit.AXIDITA_LAMP.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> FRANITOLINA_LAMP = ITEMS.register("franitolina_lamp", 
			() -> new BlockItem(BlockInit.FRANITOLINA_LAMP.get(), new Item.Properties()));	
	public static final RegistryObject<BlockItem> MIGUELITIO_LAMP = ITEMS.register("miguelitio_lamp", 
			() -> new BlockItem(BlockInit.MIGUELITIO_LAMP.get(), new Item.Properties()));	
	public static final RegistryObject<BlockItem> SHINE_LAMP = ITEMS.register("shine_lamp", 
			() -> new BlockItem(BlockInit.SHINE_LAMP.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> CESARITA_LAMP = ITEMS.register("cesarita_lamp", 
			() -> new BlockItem(BlockInit.CESARITA_LAMP.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> CABALLERITA_LAMP = ITEMS.register("caballerita_lamp", 
			() -> new BlockItem(BlockInit.CABALLERITA_LAMP.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> ENDERITA_LAMP = ITEMS.register("enderita_lamp", 
			() -> new BlockItem(BlockInit.ENDERITA_LAMP.get(), new Item.Properties()));
	
	// Ores
	
	public static final RegistryObject<BlockItem> HUGODIUM_ORE = ITEMS.register("hugodium_ore", 
			() -> new BlockItem(BlockInit.HUGODIUM_ORE.get(), new Item.Properties().fireResistant()));		
	public static final RegistryObject<BlockItem> ALEZARITA_ORE = ITEMS.register("alezarita_ore", 
			() -> new BlockItem(BlockInit.ALEZARITA_ORE.get(), new Item.Properties().fireResistant()));
	public static final RegistryObject<BlockItem> AXIDITA_ORE = ITEMS.register("axidita_ore", 
			() -> new BlockItem(BlockInit.AXIDITA_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> FRANITOLINA_ORE = ITEMS.register("franitolina_ore", 
			() -> new BlockItem(BlockInit.FRANITOLINA_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> MIGUELITIO_ORE = ITEMS.register("miguelitio_ore", 
			() -> new BlockItem(BlockInit.MIGUELITIO_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> SHINE_ORE = ITEMS.register("shine_ore", 
			() -> new BlockItem(BlockInit.SHINE_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> CESARITA_ORE = ITEMS.register("cesarita_ore", 
			() -> new BlockItem(BlockInit.CESARITA_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> CABALLERITA_ORE = ITEMS.register("caballerita_ore", 
			() -> new BlockItem(BlockInit.CABALLERITA_ORE.get(), new Item.Properties()));
	public static final RegistryObject<BlockItem> ENDERITA_ORE = ITEMS.register("enderita_ore", 
			() -> new BlockItem(BlockInit.ENDERITA_ORE.get(), new Item.Properties()));
}
