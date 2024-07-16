package dev.doaddon.throwablecheese.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import dev.doaddon.throwablecheese.ThrowableCheese;

@Mod(ThrowableCheese.MOD_ID)
public final class ThrowableCheeseForge {
    public ThrowableCheeseForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(ThrowableCheese.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        ThrowableCheese.init();
    }
}
