package net.yesandno.harmonic_adventure.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yesandno.harmonic_adventure.HarmonicAdventure;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, HarmonicAdventure.MOD_ID);
    public static final RegistryObject<Item> STEEL = Items.register("steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = Items.register("steel_nugget",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> BLOOD_TEAR = Items.register("blood_tear",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAHPPIRE = Items.register("sapphire",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        Items.register(eventBus);
    }

}
