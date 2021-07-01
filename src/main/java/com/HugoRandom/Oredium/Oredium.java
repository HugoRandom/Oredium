package com.HugoRandom.Oredium;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.HugoRandom.Oredium.init.ArmorInit;
import com.HugoRandom.Oredium.init.BlockInit;
import com.HugoRandom.Oredium.init.FluidInit;
import com.HugoRandom.Oredium.init.FoodInit;
import com.HugoRandom.Oredium.init.ItemInit;
import com.HugoRandom.Oredium.init.ParticleInit;
import com.HugoRandom.Oredium.init.ToolInit;
import com.HugoRandom.Oredium.world.OreGeneration;
import com.HugoRandom.Oredium.events.ArmorEvents;

@Mod(Oredium.MOD_ID)
public class Oredium
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "oredium";
    public static final ItemGroup OREDIUM_TAB_ITEMS = new OrediumTabItems("oredium_tab_items");    
    public static final ItemGroup OREDIUM_TAB_TOOLS = new OrediumTabTools("oredium_tab_tools");    
    public static final ItemGroup OREDIUM_TAB_ARMORS = new OrediumTabArmors("oredium_tab_armors");    

    public Oredium() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        FluidInit.FLUIDS.register(bus);
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);    
        FoodInit.FOODS.register(bus);       
        ArmorInit.ARMORS.register(bus);           
        ToolInit.TOOLS.register(bus);
        ParticleInit.PARTICLES.register(bus);
      
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(ArmorEvents.class);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }    
        
    public static class OrediumTabItems extends ItemGroup{

		public OrediumTabItems(String label) {
			super(label);
		}

		@Override
		public ItemStack makeIcon() {			
			return ItemInit.ENDERIUM_INGOT.get().getDefaultInstance();
		}
    
		@Override
		public void fillItemList(NonNullList<ItemStack> items) {
			// Ores
			items.add(ItemInit.ALEZARITA_ORE.get().getDefaultInstance());
			items.add(ItemInit.AXIDITA_ORE.get().getDefaultInstance());
			items.add(ItemInit.CABALLERITA_ORE.get().getDefaultInstance());
			items.add(ItemInit.CESARITA_ORE.get().getDefaultInstance());
			items.add(ItemInit.ENDERITA_ORE.get().getDefaultInstance());
			items.add(ItemInit.FRANITOLINA_ORE.get().getDefaultInstance());
			items.add(ItemInit.HUGODIUM_ORE.get().getDefaultInstance());
			items.add(ItemInit.MIGUELITIO_ORE.get().getDefaultInstance());
			items.add(ItemInit.SHINE_ORE.get().getDefaultInstance());	
			// Nuggets
			items.add(ItemInit.ALEZARITA_NUGGET.get().getDefaultInstance());
			items.add(ItemInit.AXIDITA_NUGGET.get().getDefaultInstance());
			items.add(ItemInit.CABALLERITA_NUGGET.get().getDefaultInstance());
			items.add(ItemInit.CESARITA_NUGGET.get().getDefaultInstance());
			items.add(ItemInit.ENDERIUM_NUGGET.get().getDefaultInstance());
			items.add(ItemInit.FRANITOLINA_NUGGET.get().getDefaultInstance());
			items.add(ItemInit.HUGODIUM_NUGGET.get().getDefaultInstance());
			items.add(ItemInit.MIGUELITIO_NUGGET.get().getDefaultInstance());
			items.add(ItemInit.SHINE_NUGGET.get().getDefaultInstance());
			// Ingots and Gems
			items.add(ItemInit.ALEZARITA_INGOT.get().getDefaultInstance());
			items.add(ItemInit.AXIDITA.get().getDefaultInstance());
			items.add(ItemInit.CABALLERITA_INGOT.get().getDefaultInstance());
			items.add(ItemInit.CESARITA_INGOT.get().getDefaultInstance());
			items.add(ItemInit.ENDERIUM_INGOT.get().getDefaultInstance());
			items.add(ItemInit.FRANITOLINA_INGOT.get().getDefaultInstance());
			items.add(ItemInit.HUGODIUM_INGOT.get().getDefaultInstance());
			items.add(ItemInit.MIGUELITIO_INGOT.get().getDefaultInstance());
			items.add(ItemInit.SHINE_INGOT.get().getDefaultInstance());
			// Enderita, Enderium and MIX
			items.add(ItemInit.ENDERITA.get().getDefaultInstance());	
			items.add(ItemInit.ENDERITA_PLATE.get().getDefaultInstance());
			items.add(ItemInit.ENDERITA_CRYSTAL.get().getDefaultInstance());
			items.add(ItemInit.ENDERIUM_GEM.get().getDefaultInstance());
			items.add(ItemInit.OREDIUM_AMULET.get().getDefaultInstance());
			// Blocks
			items.add(ItemInit.ALEZARITA_BLOCK.get().getDefaultInstance());	
			items.add(ItemInit.AXIDITA_BLOCK.get().getDefaultInstance());
			items.add(ItemInit.CABALLERITA_BLOCK.get().getDefaultInstance());	
			items.add(ItemInit.CESARITA_BLOCK.get().getDefaultInstance());	
			items.add(ItemInit.ENDERITA_BLOCK.get().getDefaultInstance());
			items.add(ItemInit.REFINED_ENDERITA_BLOCK.get().getDefaultInstance());
			items.add(ItemInit.ENDERIUM_BLOCK.get().getDefaultInstance());
			items.add(ItemInit.FRANITOLINA_BLOCK.get().getDefaultInstance());
			items.add(ItemInit.HUGODIUM_BLOCK.get().getDefaultInstance());
			items.add(ItemInit.MIGUELITIO_BLOCK.get().getDefaultInstance());
			items.add(ItemInit.SHINE_BLOCK.get().getDefaultInstance());
			items.add(ItemInit.OREDIUM_BLOCK.get().getDefaultInstance());
			// Lamps
			items.add(ItemInit.ALEZARITA_LAMP.get().getDefaultInstance());	
			items.add(ItemInit.AXIDITA_LAMP.get().getDefaultInstance());
			items.add(ItemInit.CABALLERITA_LAMP.get().getDefaultInstance());	
			items.add(ItemInit.CESARITA_LAMP.get().getDefaultInstance());	
			items.add(ItemInit.ENDERITA_LAMP.get().getDefaultInstance());
			items.add(ItemInit.FRANITOLINA_LAMP.get().getDefaultInstance());
			items.add(ItemInit.HUGODIUM_LAMP.get().getDefaultInstance());
			items.add(ItemInit.MIGUELITIO_LAMP.get().getDefaultInstance());
			items.add(ItemInit.SHINE_LAMP.get().getDefaultInstance());
			// Foods		
			items.add(FoodInit.ALEZARITA_CHICKEN.get().getDefaultInstance());
			items.add(FoodInit.CABALLERITA_CAKE.get().getDefaultInstance());
			items.add(FoodInit.CLORETS.get().getDefaultInstance());
			items.add(FoodInit.BLUE_CLORETS.get().getDefaultInstance());
			items.add(FoodInit.ENDERITA_APPLE.get().getDefaultInstance());
			items.add(FoodInit.ENDERIUM_APPLE.get().getDefaultInstance());
			items.add(FoodInit.FRAOPU.get().getDefaultInstance());
			items.add(FoodInit.HUGODIUM_SMOOTHIE.get().getDefaultInstance());
			items.add(FoodInit.PEPENNE.get().getDefaultInstance());		    		
			items.add(FoodInit.SHINE_CUPCAKE.get().getDefaultInstance());
			// Buckets
			items.add(ItemInit.ALEZARITA_BUCKET.get().getDefaultInstance());	
			items.add(ItemInit.AXIDITA_BUCKET.get().getDefaultInstance());
			items.add(ItemInit.CABALLERITA_BUCKET.get().getDefaultInstance());	
			items.add(ItemInit.CESARITA_BUCKET.get().getDefaultInstance());	
			items.add(ItemInit.ENDERIUM_BUCKET.get().getDefaultInstance());
			items.add(ItemInit.FRANITOLINA_BUCKET.get().getDefaultInstance());
			items.add(ItemInit.HUGODIUM_BUCKET.get().getDefaultInstance());
			items.add(ItemInit.INFERNUM_BUCKET.get().getDefaultInstance());
			items.add(ItemInit.MIGUELITIO_BUCKET.get().getDefaultInstance());
			items.add(ItemInit.SHINE_BUCKET.get().getDefaultInstance());
			// Specials			
			items.add(ItemInit.SPECIAL_ITEM.get().getDefaultInstance());					
			super.fillItemList(items);
		}
    }
    
    public static class OrediumTabTools extends ItemGroup {
    	public OrediumTabTools(String label) {
			super(label);
		}

		@Override
		public ItemStack makeIcon() {			
			return ToolInit.ENDERIUM_PICKAXE.get().getDefaultInstance();
		}
    
		@Override
		public void fillItemList(NonNullList<ItemStack> items) {
			// Alezarita
			items.add(ToolInit.ALEZARITA_SWORD.get().getDefaultInstance());
			items.add(ToolInit.ALEZARITA_PICKAXE.get().getDefaultInstance());
			items.add(ToolInit.ALEZARITA_AXE.get().getDefaultInstance());	
			items.add(ToolInit.ALEZARITA_SHOVEL.get().getDefaultInstance());
			items.add(ToolInit.ALEZARITA_HOE.get().getDefaultInstance());
			// Axidita
			items.add(ToolInit.AXIDITA_SWORD.get().getDefaultInstance());
			items.add(ToolInit.AXIDITA_PICKAXE.get().getDefaultInstance());
			items.add(ToolInit.AXIDITA_AXE.get().getDefaultInstance());
			items.add(ToolInit.AXIDITA_SHOVEL.get().getDefaultInstance());
			items.add(ToolInit.AXIDITA_HOE.get().getDefaultInstance());
			// Caballerita
			items.add(ToolInit.CABALLERITA_SWORD.get().getDefaultInstance());
			items.add(ToolInit.CABALLERITA_PICKAXE.get().getDefaultInstance());
			items.add(ToolInit.CABALLERITA_AXE.get().getDefaultInstance());
			items.add(ToolInit.CABALLERITA_SHOVEL.get().getDefaultInstance());
			items.add(ToolInit.CABALLERITA_HOE.get().getDefaultInstance());
			// Cesarita
			items.add(ToolInit.CESARITA_SWORD.get().getDefaultInstance());
			items.add(ToolInit.CESARITA_PICKAXE.get().getDefaultInstance());
			items.add(ToolInit.CESARITA_AXE.get().getDefaultInstance());	
			items.add(ToolInit.CESARITA_SHOVEL.get().getDefaultInstance());
			items.add(ToolInit.CESARITA_HOE.get().getDefaultInstance());
			// Enderium
			items.add(ToolInit.ENDERIUM_SWORD.get().getDefaultInstance());
			items.add(ToolInit.ENDERIUM_PICKAXE.get().getDefaultInstance());
			items.add(ToolInit.ENDERIUM_AXE.get().getDefaultInstance());
			items.add(ToolInit.ENDERIUM_SHOVEL.get().getDefaultInstance());
			items.add(ToolInit.ENDERIUM_HOE.get().getDefaultInstance());
			// Franitolina
			items.add(ToolInit.FRANITOLINA_SWORD.get().getDefaultInstance());
			items.add(ToolInit.FRANITOLINA_PICKAXE.get().getDefaultInstance());
			items.add(ToolInit.FRANITOLINA_AXE.get().getDefaultInstance());	
			items.add(ToolInit.FRANITOLINA_SHOVEL.get().getDefaultInstance());
			items.add(ToolInit.FRANITOLINA_HOE.get().getDefaultInstance());
			// Hugodium
			items.add(ToolInit.HUGODIUM_SWORD.get().getDefaultInstance());
			items.add(ToolInit.HUGODIUM_PICKAXE.get().getDefaultInstance());
			items.add(ToolInit.HUGODIUM_AXE.get().getDefaultInstance());
			items.add(ToolInit.HUGODIUM_SHOVEL.get().getDefaultInstance());
			items.add(ToolInit.HUGODIUM_HOE.get().getDefaultInstance());
			// Miguelitio
			items.add(ToolInit.MIGUELITIO_SWORD.get().getDefaultInstance());
			items.add(ToolInit.MIGUELITIO_PICKAXE.get().getDefaultInstance());
			items.add(ToolInit.MIGUELITIO_AXE.get().getDefaultInstance());
			items.add(ToolInit.MIGUELITIO_SHOVEL.get().getDefaultInstance());
			items.add(ToolInit.MIGUELITIO_HOE.get().getDefaultInstance());
			// Shine
			items.add(ToolInit.SHINE_SWORD.get().getDefaultInstance());
			items.add(ToolInit.SHINE_PICKAXE.get().getDefaultInstance());
			items.add(ToolInit.SHINE_AXE.get().getDefaultInstance());
			items.add(ToolInit.SHINE_SHOVEL.get().getDefaultInstance());
			items.add(ToolInit.SHINE_HOE.get().getDefaultInstance());			
		}
    }
    
    public static class OrediumTabArmors extends ItemGroup {
    	
    	public OrediumTabArmors(String label) {
			super(label);
		}

		@Override
		public ItemStack makeIcon() {			
			return ArmorInit.ENDERIUM_HELMET.get().getDefaultInstance();
		}
    
		@Override
		public void fillItemList(NonNullList<ItemStack> items) {
			// Alezarita
			items.add(ArmorInit.ALEZARITA_HELMET.get().getDefaultInstance());
			items.add(ArmorInit.ALEZARITA_CHESTPLATE.get().getDefaultInstance());
			items.add(ArmorInit.ALEZARITA_LEGGINGS.get().getDefaultInstance());
			items.add(ArmorInit.ALEZARITA_BOOTS.get().getDefaultInstance());
			// Axidita
			items.add(ArmorInit.AXIDITA_HELMET.get().getDefaultInstance());
			items.add(ArmorInit.AXIDITA_CHESTPLATE.get().getDefaultInstance());
			items.add(ArmorInit.AXIDITA_LEGGINGS.get().getDefaultInstance());
			items.add(ArmorInit.AXIDITA_BOOTS.get().getDefaultInstance());
			// Caballerita
			items.add(ArmorInit.CABALLERITA_HELMET.get().getDefaultInstance());
			items.add(ArmorInit.CABALLERITA_CHESTPLATE.get().getDefaultInstance());
			items.add(ArmorInit.CABALLERITA_LEGGINGS.get().getDefaultInstance());
			items.add(ArmorInit.CABALLERITA_BOOTS.get().getDefaultInstance());
			// Cesarita
			items.add(ArmorInit.CESARITA_HELMET.get().getDefaultInstance());
			items.add(ArmorInit.CESARITA_CHESTPLATE.get().getDefaultInstance());
			items.add(ArmorInit.CESARITA_LEGGINGS.get().getDefaultInstance());
			items.add(ArmorInit.CESARITA_BOOTS.get().getDefaultInstance());
			// Enderium
			items.add(ArmorInit.ENDERIUM_HELMET.get().getDefaultInstance());
			items.add(ArmorInit.ENDERIUM_CHESTPLATE.get().getDefaultInstance());
			items.add(ArmorInit.ENDERIUM_LEGGINGS.get().getDefaultInstance());
			items.add(ArmorInit.ENDERIUM_BOOTS.get().getDefaultInstance());
			// Franitolina
			items.add(ArmorInit.FRANITOLINA_HELMET.get().getDefaultInstance());
			items.add(ArmorInit.FRANITOLINA_CHESTPLATE.get().getDefaultInstance());
			items.add(ArmorInit.FRANITOLINA_LEGGINGS.get().getDefaultInstance());
			items.add(ArmorInit.FRANITOLINA_BOOTS.get().getDefaultInstance());
			// Hugodium
			items.add(ArmorInit.HUGODIUM_HELMET.get().getDefaultInstance());
			items.add(ArmorInit.HUGODIUM_CHESTPLATE.get().getDefaultInstance());
			items.add(ArmorInit.HUGODIUM_LEGGINGS.get().getDefaultInstance());
			items.add(ArmorInit.HUGODIUM_BOOTS.get().getDefaultInstance());
			// Miguelitio
			items.add(ArmorInit.MIGUELITIO_HELMET.get().getDefaultInstance());
			items.add(ArmorInit.MIGUELITIO_CHESTPLATE.get().getDefaultInstance());
			items.add(ArmorInit.MIGUELITIO_LEGGINGS.get().getDefaultInstance());
			items.add(ArmorInit.MIGUELITIO_BOOTS.get().getDefaultInstance());
			// Shine
			items.add(ArmorInit.SHINE_HELMET.get().getDefaultInstance());
			items.add(ArmorInit.SHINE_CHESTPLATE.get().getDefaultInstance());			
			items.add(ArmorInit.SHINE_LEGGINGS.get().getDefaultInstance());
			items.add(ArmorInit.SHINE_BOOTS.get().getDefaultInstance());
			
		}
    }
}
