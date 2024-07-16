package dev.doaddon.throwablecheese.client;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.doaddon.throwablecheese.registry.EntityRegistry;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ThrowableCheeseClient {
    public static void initClient(){}

    public static void preInitClient(){
        registerEntityEntityRenderers();
    }

    public static void registerEntityEntityRenderers(){
        EntityRendererRegistry.register(EntityRegistry.THROWABLE_CHEESE, ThrownItemRenderer::new);
    }
}
