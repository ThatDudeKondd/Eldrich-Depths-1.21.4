package net.thatdudekondd.eldrich_depths.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.thatdudekondd.eldrich_depths.EldrichDepths;

import java.util.function.Function;

public class ModItems {
    public static final Item WARDEN_HEAD = registerItem("warden_head", Item::new, new Item.Settings());

    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(EldrichDepths.MOD_ID,name));
        return Items.register(registryKey, factory, settings);
    }

    public static void registerModItems() {
        EldrichDepths.LOGGER.info("Registering Mod Items for " + EldrichDepths.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(WARDEN_HEAD);
        });
    }
}