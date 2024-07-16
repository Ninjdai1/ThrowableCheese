package dev.doaddon.throwablecheese.forge.client;

import dev.doaddon.throwablecheese.ThrowableCheese;
import dev.doaddon.throwablecheese.client.ThrowableCheeseClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegisterEvent;

@Mod.EventBusSubscriber(modid = ThrowableCheese.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThrowableCheeseClientForge {
    @SubscribeEvent
    public static void beforeClientSetup(RegisterEvent event) {
        ThrowableCheeseClient.preInitClient();
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ThrowableCheeseClient.initClient();
    }
}

