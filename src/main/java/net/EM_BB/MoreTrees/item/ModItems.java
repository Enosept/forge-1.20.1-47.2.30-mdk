package net.EM_BB.MoreTrees.item;

import net.EM_BB.MoreTrees.MoreTrees;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreTrees.MOD_ID);

    public static final RegistryObject<Item> PEAR = ITEMS.register("pear",
            () -> new Item(new Item.Properties().food(modFoods.PEAR)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
