package dev.doaddon.throwablecheese;

import dev.doaddon.throwablecheese.registry.EntityRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ThrowableCheese {
    public static final String MOD_ID = "throwablecheese";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static void init() {
        EntityRegistry.init();
    }
}
