package com.HugoRandom.Oredium.common.items;

import java.util.List;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SpecialItem extends Item{

	public SpecialItem(Properties properties) {
		super(properties);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack_, World worldIn, List<ITextComponent> toolTip,
			ITooltipFlag flagIn) {
		super.appendHoverText(stack_, worldIn, toolTip, flagIn);		
		if(InputMappings.isKeyDown(Minecraft.getInstance().getWindow().getWindow(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
			toolTip.add(new StringTextComponent("Summon 1 Zombie - 5 s Cool"));
		}
		else {			
			toolTip.add(new TranslationTextComponent("tooltip.special_item.hold_shift"));
		}
	}
	
	@Override
	public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {		
		playerIn.addEffect(new EffectInstance(Effects.GLOWING, 20, 5));
		ZombieEntity Zombie1 = new ZombieEntity(worldIn);
		Zombie1.setPos(playerIn.getX(), playerIn.getY(), playerIn.getZ());
		worldIn.addFreshEntity(Zombie1);
		playerIn.getCooldowns().addCooldown(this, 100);
		
		return ActionResult.success(playerIn.getItemInHand(handIn));
		// return super.use(worldIn, playerIn, handIn);
	}
}
