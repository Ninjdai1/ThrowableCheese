package dev.doaddon.throwablecheese.fabric.client;

import dev.doaddon.throwablecheese.client.ThrowableCheeseClient;
import net.fabricmc.api.ClientModInitializer;

public final class ThrowableCheeseFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ThrowableCheeseClient.preInitClient();
        ThrowableCheeseClient.initClient();
    }
}
