package com.HugoRandom.Oredium.core.enums;

import java.util.function.Supplier;

import com.HugoRandom.Oredium.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public enum ArmorOredium implements IArmorMaterial{

	HUGODIUM("oredium:hugodium", 34, new int[]{5, 8, 10, 5}, 11, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.0F, 0.5F, () -> { return Ingredient.of(ItemInit.HUGODIUM_INGOT.get()); }),
	ALEZARITA("oredium:alezarita", 33, new int[]{4, 8, 10, 4}, 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 1.5F, 0.2F, () -> { return Ingredient.of(ItemInit.ALEZARITA_INGOT.get()); }),
	AXIDITA("oredium:axidita", 30, new int[]{3, 6, 8, 3}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.5F, 0.0F, () -> {return Ingredient.of(ItemInit.AXIDITA.get()); }),
	FRANITOLINA("oredium:franitolina", 30, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.5F, 0.1F, () -> { return Ingredient.of(ItemInit.FRANITOLINA_INGOT.get()); }),
	MIGUELITIO("oredium:miguelitio", 35, new int[]{6, 9, 11, 5}, 17, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.5F, 0.2F, () -> {return Ingredient.of(ItemInit.MIGUELITIO_INGOT.get()); }),
	SHINE("oredium:shine", 17, new int[]{2, 5, 6, 2}, 19, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {return Ingredient.of(ItemInit.SHINE_INGOT.get()); }),
	CESARITA("oredium:cesarita", 30, new int[]{3, 6, 8, 3}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.5F, 0.1F, () -> { return Ingredient.of(ItemInit.CESARITA_INGOT.get()); }),
	CABALLERITA("oredium:caballerita", 27, new int[]{3, 6, 8, 3}, 12, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.1F, () -> {return Ingredient.of(ItemInit.CABALLERITA_INGOT.get()); }),
	ENDERIUM("oredium:enderium", 34, new int[]{4, 7, 9, 4}, 20, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> { return Ingredient.of(ItemInit.ENDERIUM_INGOT.get()); });

	private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] slotProtections;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final LazyValue<Ingredient> repairIngredient;

	private ArmorOredium(String name, int durability, int[] protections, int enchantment, SoundEvent sound, float toughness, float knockback, Supplier<Ingredient> ingredient) {
	      this.name = name;
	      this.durabilityMultiplier = durability;
	      this.slotProtections = protections;
	      this.enchantmentValue = enchantment;
	      this.sound = sound;
	      this.toughness = toughness;
	      this.knockbackResistance = knockback;
	      this.repairIngredient = new LazyValue<>(ingredient);
	   }

	@Override
	public int getDurabilityForSlot(EquipmentSlotType slot) {
		return HEALTH_PER_SLOT[slot.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType slot) {
		return this.slotProtections[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {		
		return this.sound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient.get();
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public String getName() {		
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
