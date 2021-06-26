package com.HugoRandom.Oredium.init;

import com.HugoRandom.Oredium.Oredium;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ParticleInit {
	public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Oredium.MOD_ID);
	
	public static final RegistryObject<BasicParticleType> SHINE_PARTICLE = PARTICLES.register("shine_particle", 
			() -> new BasicParticleType(true));
	public static final RegistryObject<BasicParticleType> FRANITOLINA_PARTICLE = PARTICLES.register("franitolina_particle", 
			() -> new BasicParticleType(true));
	public static final RegistryObject<BasicParticleType> ENDERIUM_PARTICLE = PARTICLES.register("enderium_particle", 
			() -> new BasicParticleType(true));
}
