package net.Chompii.runic_revive_star.item;

import net.Chompii.runic_revive_star.RunicRevivalStar;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RunicRevivalStar.Mod_ID);

    public static final RegistryObject<Item> REVIVE_STAR = ITEMS.register("revive_star",
            () -> new Item(new Item.Properties().stacksTo(4).rarity(Rarity.EPIC).fireResistant()));


    private static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
