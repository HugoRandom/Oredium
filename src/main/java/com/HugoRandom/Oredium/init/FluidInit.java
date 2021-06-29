package com.HugoRandom.Oredium.init;

import com.HugoRandom.Oredium.Oredium;

import net.minecraft.fluid.Fluid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {
	
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, Oredium.MOD_ID);
    
	// Hugodium
	
	public static final ResourceLocation HUGODIUM_STILL = new ResourceLocation("oredium", "blocks/fluids/hugodium_fluid_still");
    public static final ResourceLocation HUGODIUM_FLOW = new ResourceLocation("oredium", "blocks/fluids/hugodium_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> HUGODIUM = 
    		FLUIDS.register("molten_hugodium", () -> new ForgeFlowingFluid.Source(FluidInit.HugodiumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_HUGODIUM = 
    		FLUIDS.register("flowing_molten_hugodium", () -> new ForgeFlowingFluid.Flowing(FluidInit.HugodiumProperties()));
    public static final ForgeFlowingFluid.Properties HugodiumProperties(){
    	return new ForgeFlowingFluid.Properties(HUGODIUM, flowing_HUGODIUM, 
    			FluidAttributes.builder(HUGODIUM_STILL, HUGODIUM_FLOW)
    			.overlay(HUGODIUM_STILL)
    			.luminosity(15)
    			.density(3000)
    			.viscosity(6000)
    			.temperature(1500)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.bucket(ItemInit.HUGODIUM_BUCKET)
    			.block(BlockInit.MOLTEN_HUGODIUM)
    			.explosionResistance(1000.0f)
    			.tickRate(20)
    			.levelDecreasePerBlock(2);
    }
    
    // Alezarita
    
    public static final ResourceLocation ALEZARITA_STILL = new ResourceLocation("oredium", "blocks/fluids/alezarita_fluid_still");
    public static final ResourceLocation ALEZARITA_FLOW = new ResourceLocation("oredium", "blocks/fluids/alezarita_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> ALEZARITA = 
    		FLUIDS.register("molten_alezarita", () -> new ForgeFlowingFluid.Source(FluidInit.AlezaritaProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ALEZARITA = 
    		FLUIDS.register("flowing_molten_alezarita", () -> new ForgeFlowingFluid.Flowing(FluidInit.AlezaritaProperties()));
    public static final ForgeFlowingFluid.Properties AlezaritaProperties(){
    	return new ForgeFlowingFluid.Properties(ALEZARITA, flowing_ALEZARITA, 
    			FluidAttributes.builder(ALEZARITA_STILL, ALEZARITA_FLOW)
    			.overlay(ALEZARITA_STILL)
    			.luminosity(15)
    			.density(3000)
    			.viscosity(6000)
    			.temperature(1500)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.bucket(ItemInit.ALEZARITA_BUCKET)
    			.block(BlockInit.MOLTEN_ALEZARITA)
    			.explosionResistance(1000.0f)
    			.tickRate(20)
    			.levelDecreasePerBlock(2);
    }
    
    // Axidita
    
    public static final ResourceLocation AXIDITA_STILL = new ResourceLocation("oredium", "blocks/fluids/axidita_fluid_still");
    public static final ResourceLocation AXIDITA_FLOW = new ResourceLocation("oredium", "blocks/fluids/axidita_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> AXIDITA = 
    		FLUIDS.register("molten_axidita", () -> new ForgeFlowingFluid.Source(FluidInit.AxiditaProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_AXIDITA = 
    		FLUIDS.register("flowing_molten_axidita", () -> new ForgeFlowingFluid.Flowing(FluidInit.AxiditaProperties()));
    public static final ForgeFlowingFluid.Properties AxiditaProperties(){
    	return new ForgeFlowingFluid.Properties(AXIDITA, flowing_AXIDITA, 
    			FluidAttributes.builder(AXIDITA_STILL, AXIDITA_FLOW)
    			.overlay(AXIDITA_STILL)
    			.luminosity(15)
    			.density(3000)
    			.viscosity(6000)
    			.temperature(1000)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.bucket(ItemInit.AXIDITA_BUCKET)
    			.block(BlockInit.MOLTEN_AXIDITA)
    			.explosionResistance(1000.0f)
    			.tickRate(20)
    			.levelDecreasePerBlock(2);
    }
    
    // Franitolina
   
    public static final ResourceLocation FRANITOLINA_STILL = new ResourceLocation("oredium", "blocks/fluids/franitolina_fluid_still");
    public static final ResourceLocation FRANITOLINA_FLOW = new ResourceLocation("oredium", "blocks/fluids/franitolina_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> FRANITOLINA = 
    		FLUIDS.register("molten_franitolina", () -> new ForgeFlowingFluid.Source(FluidInit.FranitolinaProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_FRANITOLINA = 
    		FLUIDS.register("flowing_molten_franitolina", () -> new ForgeFlowingFluid.Flowing(FluidInit.FranitolinaProperties()));
    public static final ForgeFlowingFluid.Properties FranitolinaProperties(){
    	return new ForgeFlowingFluid.Properties(FRANITOLINA, flowing_FRANITOLINA, 
    			FluidAttributes.builder(FRANITOLINA_STILL, FRANITOLINA_FLOW)
    			.overlay(FRANITOLINA_STILL)
    			.luminosity(15)
    			.density(3000)
    			.viscosity(6000)
    			.temperature(1500)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.bucket(ItemInit.FRANITOLINA_BUCKET)
    			.block(BlockInit.MOLTEN_FRANITOLINA)
    			.explosionResistance(1000.0f)
    			.tickRate(20)
    			.levelDecreasePerBlock(2);
    }
    
    // Miguelitio
   
    public static final ResourceLocation MIGUELITIO_STILL = new ResourceLocation("oredium", "blocks/fluids/miguelitio_fluid_still");
    public static final ResourceLocation MIGUELITIO_FLOW = new ResourceLocation("oredium", "blocks/fluids/miguelitio_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> MIGUELITIO = 
    		FLUIDS.register("molten_miguelitio", () -> new ForgeFlowingFluid.Source(FluidInit.MiguelitioProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_MIGUELITIO = 
    		FLUIDS.register("flowing_molten_miguelitio", () -> new ForgeFlowingFluid.Flowing(FluidInit.MiguelitioProperties()));
    public static final ForgeFlowingFluid.Properties MiguelitioProperties(){
    	return new ForgeFlowingFluid.Properties(MIGUELITIO, flowing_MIGUELITIO, 
    			FluidAttributes.builder(MIGUELITIO_STILL, MIGUELITIO_FLOW)
    			.overlay(MIGUELITIO_STILL)
    			.luminosity(15)
    			.density(3000)
    			.viscosity(6000)
    			.temperature(1500)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.bucket(ItemInit.MIGUELITIO_BUCKET)
    			.block(BlockInit.MOLTEN_MIGUELITIO)
    			.explosionResistance(1000.0f)
    			.tickRate(20)
    			.levelDecreasePerBlock(2);
    }
    
    // Shine
   
    public static final ResourceLocation SHINE_STILL = new ResourceLocation("oredium", "blocks/fluids/shine_fluid_still");
    public static final ResourceLocation SHINE_FLOW = new ResourceLocation("oredium", "blocks/fluids/shine_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> SHINE = 
    		FLUIDS.register("molten_shine", () -> new ForgeFlowingFluid.Source(FluidInit.ShineProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_SHINE = 
    		FLUIDS.register("flowing_molten_shine", () -> new ForgeFlowingFluid.Flowing(FluidInit.ShineProperties()));
    public static final ForgeFlowingFluid.Properties ShineProperties(){
    	return new ForgeFlowingFluid.Properties(SHINE, flowing_SHINE, 
    			FluidAttributes.builder(SHINE_STILL, SHINE_FLOW)
    			.overlay(SHINE_STILL)
    			.luminosity(15)
    			.density(3000)
    			.viscosity(6000)
    			.temperature(800)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.bucket(ItemInit.SHINE_BUCKET)
    			.block(BlockInit.MOLTEN_SHINE)
    			.explosionResistance(1000.0f)
    			.tickRate(20)
    			.levelDecreasePerBlock(2);
    }
    
    // Cesarita
   
    public static final ResourceLocation CESARITA_STILL = new ResourceLocation("oredium", "blocks/fluids/cesarita_fluid_still");
    public static final ResourceLocation CESARITA_FLOW = new ResourceLocation("oredium", "blocks/fluids/cesarita_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> CESARITA = 
    		FLUIDS.register("molten_cesarita", () -> new ForgeFlowingFluid.Source(FluidInit.CesaritaProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_CESARITA = 
    		FLUIDS.register("flowing_molten_cesarita", () -> new ForgeFlowingFluid.Flowing(FluidInit.CesaritaProperties()));
    public static final ForgeFlowingFluid.Properties CesaritaProperties(){
    	return new ForgeFlowingFluid.Properties(CESARITA, flowing_CESARITA, 
    			FluidAttributes.builder(CESARITA_STILL, CESARITA_FLOW)
    			.overlay(CESARITA_STILL)
    			.luminosity(15)
    			.density(3000)
    			.viscosity(6000)
    			.temperature(1000)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.bucket(ItemInit.CESARITA_BUCKET)
    			.block(BlockInit.MOLTEN_CESARITA)
    			.explosionResistance(1000.0f)
    			.tickRate(20)
    			.levelDecreasePerBlock(2);
    }
    
    // Caballerita
  
    public static final ResourceLocation CABALLERITA_STILL = new ResourceLocation("oredium", "blocks/fluids/caballerita_fluid_still");
    public static final ResourceLocation CABALLERITA_FLOW = new ResourceLocation("oredium", "blocks/fluids/caballerita_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> CABALLERITA = 
    		FLUIDS.register("molten_caballerita", () -> new ForgeFlowingFluid.Source(FluidInit.CaballeritaProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_CABALLERITA = 
    		FLUIDS.register("flowing_molten_caballerita", () -> new ForgeFlowingFluid.Flowing(FluidInit.CaballeritaProperties()));
    public static final ForgeFlowingFluid.Properties CaballeritaProperties(){
    	return new ForgeFlowingFluid.Properties(CABALLERITA, flowing_CABALLERITA, 
    			FluidAttributes.builder(CABALLERITA_STILL, CABALLERITA_FLOW)
    			.overlay(CABALLERITA_STILL)
    			.luminosity(15)
    			.density(3000)
    			.viscosity(6000)
    			.temperature(1000)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.bucket(ItemInit.CABALLERITA_BUCKET)
    			.block(BlockInit.MOLTEN_CABALLERITA)
    			.explosionResistance(1000.0f)
    			.tickRate(20)
    			.levelDecreasePerBlock(2);
    }
    
    // Enderium
    
    public static final ResourceLocation ENDERIUM_STILL = new ResourceLocation("oredium", "blocks/fluids/enderium_fluid_still");
    public static final ResourceLocation ENDERIUM_FLOW = new ResourceLocation("oredium", "blocks/fluids/enderium_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> ENDERIUM = 
    		FLUIDS.register("molten_enderium", () -> new ForgeFlowingFluid.Source(FluidInit.EnderiumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_ENDERIUM = 
    		FLUIDS.register("flowing_molten_enderium", () -> new ForgeFlowingFluid.Flowing(FluidInit.EnderiumProperties()));
    public static final ForgeFlowingFluid.Properties EnderiumProperties(){
    	return new ForgeFlowingFluid.Properties(ENDERIUM, flowing_ENDERIUM, 
    			FluidAttributes.builder(ENDERIUM_STILL, ENDERIUM_FLOW)
    			.overlay(ENDERIUM_STILL)
    			.luminosity(15)
    			.density(3000)
    			.viscosity(6000)
    			.temperature(1500)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.bucket(ItemInit.ENDERIUM_BUCKET)
    			.block(BlockInit.MOLTEN_ENDERIUM)
    			.explosionResistance(1000.0f)
    			.tickRate(20)
    			.levelDecreasePerBlock(2);
    }
    
    // Infernum
    
    public static final ResourceLocation INFERNUM_STILL = new ResourceLocation("oredium", "blocks/fluids/infernum_fluid_still");
    public static final ResourceLocation INFERNUM_FLOW = new ResourceLocation("oredium", "blocks/fluids/infernum_fluid_flow");;
    public static final RegistryObject<ForgeFlowingFluid.Source> INFERNUM = 
    		FLUIDS.register("infernum", () -> new ForgeFlowingFluid.Source(FluidInit.InfernumProperties()));
    public static final RegistryObject<ForgeFlowingFluid.Flowing> flowing_INFERNUM = 
    		FLUIDS.register("flowing_infernum", () -> new ForgeFlowingFluid.Flowing(FluidInit.InfernumProperties()));
    public static final ForgeFlowingFluid.Properties InfernumProperties(){
    	return new ForgeFlowingFluid.Properties(INFERNUM, flowing_INFERNUM, 
    			FluidAttributes.builder(INFERNUM_STILL, INFERNUM_FLOW)
    			.overlay(INFERNUM_STILL)
    			.luminosity(15)
    			.density(3000)
    			.viscosity(6000)
    			.temperature(2500)
    			.sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA))
    			.bucket(ItemInit.INFERNUM_BUCKET)
    			.block(BlockInit.INFERNUM)
    			.explosionResistance(1000.0f)
    			.tickRate(20)
    			.levelDecreasePerBlock(2);
    }
}
