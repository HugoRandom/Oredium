package com.HugoRandom.Oredium.init;

import com.HugoRandom.Oredium.Oredium;
import com.HugoRandom.Oredium.common.blocks.alezarita.*;
import com.HugoRandom.Oredium.common.blocks.axidita.*;
import com.HugoRandom.Oredium.common.blocks.caballerita.*;
import com.HugoRandom.Oredium.common.blocks.cesarita.*;
import com.HugoRandom.Oredium.common.blocks.enderita.*;
import com.HugoRandom.Oredium.common.blocks.enderium.*;
import com.HugoRandom.Oredium.common.blocks.franitolina.*;
import com.HugoRandom.Oredium.common.blocks.hugodium.*;
import com.HugoRandom.Oredium.common.blocks.infernum.*;
import com.HugoRandom.Oredium.common.blocks.miguelitio.*;
import com.HugoRandom.Oredium.common.blocks.shine.*;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	// -- DEFERRED REGISTER	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Oredium.MOD_ID);	
	
	// Hugodium	
	public static final RegistryObject<Block> HUGODIUM_ORE = BLOCKS.register("hugodium_ore", () -> new HugodiumOre());
	public static final RegistryObject<Block> HUGODIUM_BLOCK = BLOCKS.register("hugodium_block", () -> new HugodiumBlock());
	public static final RegistryObject<Block> HUGODIUM_LAMP = BLOCKS.register("hugodium_lamp", () -> new HugodiumLamp());
	public static final RegistryObject<FlowingFluidBlock> MOLTEN_HUGODIUM = BLOCKS.register("molten_hugodium", () -> new MoltenHugodium());
	
	// Alezarita
	public static final RegistryObject<Block> ALEZARITA_ORE = BLOCKS.register("alezarita_ore", () -> new AlezaritaOre());
	public static final RegistryObject<Block> ALEZARITA_BLOCK = BLOCKS.register("alezarita_block", () -> new AlezaritaBlock()); 
	public static final RegistryObject<Block> ALEZARITA_LAMP = BLOCKS.register("alezarita_lamp", () -> new AlezaritaLamp());
	public static final RegistryObject<FlowingFluidBlock> MOLTEN_ALEZARITA = BLOCKS.register("molten_alezarita", () -> new MoltenAlezarita());
    
	// Axidita
	public static final RegistryObject<Block> AXIDITA_ORE = BLOCKS.register("axidita_ore", () -> new AxiditaOre()); 
	public static final RegistryObject<Block> AXIDITA_BLOCK = BLOCKS.register("axidita_block", () -> new AxiditaBlock()); 
	public static final RegistryObject<Block> AXIDITA_LAMP = BLOCKS.register("axidita_lamp", () -> new AxiditaLamp());
	public static final RegistryObject<FlowingFluidBlock> MOLTEN_AXIDITA = BLOCKS.register("molten_axidita", () -> new MoltenAxidita());
    
	// Franitolina
	public static final RegistryObject<Block> FRANITOLINA_ORE = BLOCKS.register("franitolina_ore", () -> new FranitolinaOre());
	public static final RegistryObject<Block> FRANITOLINA_BLOCK = BLOCKS.register("franitolina_block", () -> new FranitolinaBlock());
	public static final RegistryObject<Block> FRANITOLINA_LAMP = BLOCKS.register("franitolina_lamp", () -> new FranitolinaLamp());
	public static final RegistryObject<FlowingFluidBlock> MOLTEN_FRANITOLINA = BLOCKS.register("molten_franitolina", () -> new MoltenFranitolina());
    
	// Miguelitio
	public static final RegistryObject<Block> MIGUELITIO_ORE = BLOCKS.register("miguelitio_ore", () -> new MiguelitioOre()); 
	public static final RegistryObject<Block> MIGUELITIO_BLOCK = BLOCKS.register("miguelitio_block", () -> new MiguelitioBlock());	
	public static final RegistryObject<Block> MIGUELITIO_LAMP = BLOCKS.register("miguelitio_lamp", () -> new MiguelitioLamp());
	public static final RegistryObject<FlowingFluidBlock> MOLTEN_MIGUELITIO = BLOCKS.register("molten_miguelitio", () -> new MoltenMiguelitio());
    
	// Shine
	public static final RegistryObject<Block> SHINE_ORE = BLOCKS.register("shine_ore", () -> new ShineOre()); 
	public static final RegistryObject<Block> SHINE_BLOCK = BLOCKS.register("shine_block", () -> new ShineBlock());
	public static final RegistryObject<Block> SHINE_LAMP = BLOCKS.register("shine_lamp", () -> new ShineLamp());
	public static final RegistryObject<FlowingFluidBlock> MOLTEN_SHINE = BLOCKS.register("molten_shine", () -> new MoltenShine());
    
	// Cesarita
	public static final RegistryObject<Block> CESARITA_ORE = BLOCKS.register("cesarita_ore", () -> new CesaritaOre()); 
	public static final RegistryObject<Block> CESARITA_BLOCK = BLOCKS.register("cesarita_block", () -> new CesaritaBlock());
	public static final RegistryObject<Block> CESARITA_LAMP = BLOCKS.register("cesarita_lamp", () -> new CesaritaLamp());
	public static final RegistryObject<FlowingFluidBlock> MOLTEN_CESARITA = BLOCKS.register("molten_cesarita", () -> new MoltenCesarita());
    
	// Caballerita
	public static final RegistryObject<Block> CABALLERITA_ORE = BLOCKS.register("caballerita_ore", () -> new CaballeritaOre()); 
	public static final RegistryObject<Block> CABALLERITA_BLOCK = BLOCKS.register("caballerita_block", () -> new CaballeritaBlock());
	public static final RegistryObject<Block> CABALLERITA_LAMP = BLOCKS.register("caballerita_lamp", () -> new CaballeritaLamp());
	public static final RegistryObject<FlowingFluidBlock> MOLTEN_CABALLERITA = BLOCKS.register("molten_caballerita", () -> new MoltenCaballerita());
    
	// Enderita
	public static final RegistryObject<Block> ENDERITA_ORE = BLOCKS.register("enderita_ore", () -> new EnderitaOre()); 
	public static final RegistryObject<Block> ENDERITA_BLOCK = BLOCKS.register("enderita_block", () -> new EnderitaBlock());
	public static final RegistryObject<Block> REFINED_ENDERITA_BLOCK = BLOCKS.register("refined_enderita_block", () -> new RefinedEnderitaBlock());
	public static final RegistryObject<Block> ENDERITA_LAMP = BLOCKS.register("enderita_lamp", () -> new EnderitaLamp());
	
	// Enderium
	public static final RegistryObject<Block> ENDERIUM_BLOCK = BLOCKS.register("enderium_block", () -> new EnderiumBlock());
	public static final RegistryObject<FlowingFluidBlock> MOLTEN_ENDERIUM = BLOCKS.register("molten_enderium", () -> new MoltenEnderium());
    
	// Infernum	
    public static final RegistryObject<FlowingFluidBlock> INFERNUM = BLOCKS.register("infernum", () -> new Infernum());
    
}
