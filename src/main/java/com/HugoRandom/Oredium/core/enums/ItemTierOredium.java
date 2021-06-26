package com.HugoRandom.Oredium.core.enums;

import java.util.function.Supplier;

import com.HugoRandom.Oredium.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ItemTierOredium implements IItemTier{

	// Material's Tiers
	
	HUGODIUM(4, 1796, 8.5f, 3.5f, 13, () -> {
	      return Ingredient.of(ItemInit.HUGODIUM_INGOT.get()); }),
	ALEZARITA(3, 1700, 8.0f, 3.0f, 12, () -> {
	      return Ingredient.of(ItemInit.ALEZARITA_INGOT.get()); }),
	AXIDITA(3, 1101, 7.0f, 2.5f, 12, () -> {
	      return Ingredient.of(ItemInit.AXIDITA.get()); }),
	FRANITOLINA(3, 1430, 7.0f, 3.0f, 15, () -> {
	      return Ingredient.of(ItemInit.FRANITOLINA_INGOT.get()); }),
	MIGUELITIO(4, 2434, 9.5f, 4.5f, 17, () -> {
	      return Ingredient.of(ItemInit.MIGUELITIO_INGOT.get()); }),
	SHINE(2, 300, 4.5f, 3.0f, 17, () -> {
	      return Ingredient.of(ItemInit.SHINE_INGOT.get()); }),
	CESARITA(3, 1637, 8.0f, 3.0f, 10, () -> {
	      return Ingredient.of(ItemInit.CESARITA_INGOT.get()); }),
	CABALLERITA(3, 1509, 7.5f, 3.0f, 11, () -> {
	      return Ingredient.of(ItemInit.CABALLERITA_INGOT.get()); }),
	ENDERIUM(4, 2238, 8.5f, 4.0f, 120, () -> {
	      return Ingredient.of(ItemInit.ENDERIUM_INGOT.get()); });
	
	private final int miningLevel;
	private final int durability;
	private final float miningSpeed;
	private final float damage;
	private final int enchantability;
	private final LazyValue<Ingredient> ingredient;

	private ItemTierOredium (int miningLevel, int durability, float miningSpeed, float damage, int enchantability, Supplier<Ingredient> ingredient) {
		this.miningLevel = miningLevel;
		this.durability = durability;
		this.miningSpeed = miningSpeed;		
		this.damage = damage;
		this.enchantability = enchantability;
		this.ingredient = new LazyValue<>(ingredient);
	}
	
	@Override
	public int getLevel() {		
		return this.miningLevel;
	}
	
	@Override
	public int getUses() {		
		return this.durability;
	}

	@Override
	public float getSpeed() {		
		return this.miningSpeed;
	}

	@Override
	public float getAttackDamageBonus() {		
		return this.damage;
	}	

	@Override
	public int getEnchantmentValue() {		
		return this.enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {		
		return this.ingredient.get();
	}
}
