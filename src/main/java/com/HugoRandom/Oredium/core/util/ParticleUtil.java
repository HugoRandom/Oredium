package com.HugoRandom.Oredium.core.util;

import com.HugoRandom.Oredium.Oredium;
import com.HugoRandom.Oredium.common.particles.OrediumParticle;
import com.HugoRandom.Oredium.common.particles.FranitolinaParticle;
import com.HugoRandom.Oredium.common.particles.ShineParticle;
import com.HugoRandom.Oredium.init.ParticleInit;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = Oredium.MOD_ID, bus = Bus.MOD)
public class ParticleUtil {

	@SuppressWarnings("resource")
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void RegisterParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register(ParticleInit.SHINE_PARTICLE.get(), ShineParticle.Factory :: new);
		Minecraft.getInstance().particleEngine.register(ParticleInit.FRANITOLINA_PARTICLE.get(), FranitolinaParticle.Factory :: new);
		Minecraft.getInstance().particleEngine.register(ParticleInit.OREDIUM_PARTICLE.get(), OrediumParticle.Factory :: new);
	}
}
