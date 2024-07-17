package dev.doaddon.throwablecheese.datagen;

import dev.doaddon.throwablecheese.datagen.tags.ThrowableCheeseTags;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ThrowableCheeseDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ThrowableCheeseTags::new);
    }
}
