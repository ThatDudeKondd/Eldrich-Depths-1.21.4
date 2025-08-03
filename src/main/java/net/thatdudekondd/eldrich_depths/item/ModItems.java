package net.thatdudekondd.eldrich_depths.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thatdudekondd.eldrich_depths.EldrichDepths;

public class ModItems {
    //public static final Item

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EldrichDepths.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EldrichDepths.LOGGER.info("Registering Mod Items for " + EldrichDepths.MOD_ID);
    }
}