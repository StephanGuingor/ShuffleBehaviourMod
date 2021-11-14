package com.fanzy.shuffler;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fanzy.world.CustomEntityJoinWorldEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("shuffler")
public class Shuffler {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Shuffler() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onEntitySpawn(CustomEntityJoinWorldEvent event) {
        // do something when the server starts
        LOGGER.info(event.getEntity().getDisplayName().toString());
    }

}
