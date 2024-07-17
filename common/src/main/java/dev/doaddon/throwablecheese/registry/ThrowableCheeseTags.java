package dev.doaddon.throwablecheese.registry;

import dev.doaddon.throwablecheese.ThrowableCheese;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ThrowableCheeseTags {
    public static final TagKey<Item> PIECE_OF_CHEESE = TagKey.create(Registries.ITEM, new ResourceLocation(ThrowableCheese.MOD_ID, "piece_of_cheese"));
    public static final TagKey<Item> THROWABLE = TagKey.create(Registries.ITEM, new ResourceLocation(ThrowableCheese.MOD_ID, "throwable"));
}