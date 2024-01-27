package net.yesandno.harmonic_adventure.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yesandno.harmonic_adventure.HarmonicAdventure;
import net.yesandno.harmonic_adventure.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HarmonicAdventure.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HARMONIC_ADVENTURE_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("harmonic_adventure_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL.get()))
                    .title(Component.translatable("creativetab.harmonic_adventure_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                       output.accept(ModItems.STEEL.get());
                       output.accept(ModItems.STEEL_NUGGET.get());
                       output.accept(ModItems.BLOOD_TEAR.get());
                       output.accept(ModItems.SAHPPIRE.get());

                       output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                       output.accept(ModBlocks.STEEL_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }
}
