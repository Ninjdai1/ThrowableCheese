package dev.doaddon.throwablecheese.registry;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.doaddon.throwablecheese.ThrowableCheese;
import dev.doaddon.throwablecheese.entity.CheeseEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public class EntityRegistry {
    private static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ThrowableCheese.MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<CheeseEntity>> THROWABLE_CHEESE = create(
            "cheese",
            () -> EntityType.Builder.<CheeseEntity>of(CheeseEntity::new, MobCategory.MISC).sized(0.25f, 0.25f).build(new ResourceLocation(ThrowableCheese.MOD_ID, "cheese").toString())
    );

    public static <T extends EntityType<?>> RegistrySupplier<T> create(final String path, final Supplier<T> type) {
        return ENTITY_TYPES.register(new ResourceLocation(ThrowableCheese.MOD_ID, path), type);
    }

    public static void init(){
        ThrowableCheese.LOGGER.debug("Registering Mod Entities for " + ThrowableCheese.MOD_ID);
        ENTITY_TYPES.register();
    }
}