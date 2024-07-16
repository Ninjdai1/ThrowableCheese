package dev.doaddon.throwablecheese.datagen.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.satisfy.meadow.registry.ObjectRegistry;

import java.util.concurrent.CompletableFuture;

public class ThrowableCheeseTags extends FabricTagProvider.ItemTagProvider {
    public ThrowableCheeseTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(dev.doaddon.throwablecheese.registry.ThrowableCheeseTags.PIECE_OF_CHEESE)
                .addOptional(ObjectRegistry.PIECE_OF_CHEESE.getId())
                .addOptional(ObjectRegistry.PIECE_OF_AMETHYST_CHEESE.getId())
                .addOptional(ObjectRegistry.PIECE_OF_BUFFALO_CHEESE.getId())
                .addOptional(ObjectRegistry.PIECE_OF_GOAT_CHEESE.getId())
                .addOptional(ObjectRegistry.PIECE_OF_GRAIN_CHEESE.getId())
                .addOptional(ObjectRegistry.PIECE_OF_SHEEP_CHEESE.getId())
                .addOptional(ObjectRegistry.PIECE_OF_WARPED_CHEESE.getId());
    }
}