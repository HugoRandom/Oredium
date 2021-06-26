package com.HugoRandom.Oredium.init;

import com.HugoRandom.Oredium.Oredium;
import com.HugoRandom.Oredium.common.foods.*;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodInit {

	// -- DEFERRED REGISTER
	
	public static final DeferredRegister<Item> FOODS = DeferredRegister.create(ForgeRegistries.ITEMS, Oredium.MOD_ID);
	
	public static final RegistryObject<Item> ENDERITA_APPLE = FOODS.register("enderita_apple", () -> new EnderitaApple());
	public static final RegistryObject<Item> ENDERIUM_APPLE = FOODS.register("enderium_apple", () -> new EnderiumApple());
	public static final RegistryObject<Item> SHINE_CUPCAKE = FOODS.register("shine_cupcake", () -> new ShineCupcake());
	public static final RegistryObject<Item> CABALLERITA_CAKE = FOODS.register("caballerita_cake", () -> new CaballeritaCake());
	public static final RegistryObject<Item> PEPENNE = FOODS.register("pepenne", () -> new Pepenne());
	public static final RegistryObject<Item> ALEZARITA_CHICKEN = FOODS.register("alezarita_chicken", () -> new AlezaritaChicken());
	public static final RegistryObject<Item> FRAOPU = FOODS.register("fraopu", () -> new Fraopu());
	public static final RegistryObject<Item> CLORETS = FOODS.register("clorets", () -> new Clorets());
	public static final RegistryObject<Item> BLUE_CLORETS = FOODS.register("blue_clorets", () -> new BlueClorets());
	public static final RegistryObject<Item> HUGODIUM_SMOOTHIE = FOODS.register("hugodium_smoothie", () -> new HugodiumSmoothie());
	
}
