package dev.doaddon.throwablecheese.mixin;

import dev.doaddon.throwablecheese.entity.CheeseEntity;
import dev.doaddon.throwablecheese.registry.ThrowableCheeseTags;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(value = Item.class, remap = false)
public abstract class ThrowableCheeseItemMixin {

    @Inject(
            method = "use",
            at = @At("HEAD"),
            cancellable = true
    )
    @Mutable
    public void use(Level level, Player player, InteractionHand interactionHand, CallbackInfoReturnable<InteractionResultHolder<ItemStack>> cir) {
        if(player.getItemInHand(interactionHand).is(ThrowableCheeseTags.PIECE_OF_CHEESE) && player.isShiftKeyDown()){
            ItemStack itemStack = player.getItemInHand(interactionHand);
            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.EGG_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
            if (!level.isClientSide) {
                CheeseEntity cheeseEntity = new CheeseEntity(level, player);
                cheeseEntity.setItem(itemStack);
                cheeseEntity.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                level.addFreshEntity(cheeseEntity);
            }

            player.awardStat(Stats.ITEM_USED.get(player.getUseItem().getItem()));
            if (!player.getAbilities().instabuild) {
                itemStack.shrink(1);
            }

            cir.setReturnValue(InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide()));
        }
    }
}
