package net.nrobot10.moreminerals.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nrobot10.moreminerals.MoreMinerals;

public class ModItems {

    public static final Item GRAPHITE = registerItem("graphite", new Item(new Item.Settings()));

    public static final Item RAW_AMBER = registerItem("raw_amber", new Item(new Item.Settings()));

    public static final Item AMBER = registerItem("amber", new Item(new Item.Settings()));

    public static final Item NO = registerItem("no", new Item(new Item.Settings()));

    public static final Item SLATE = registerItem("slate", new Item(new Item.Settings()));

    public static final Item DUCK = registerItem("duck_thing", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreMinerals.MOD_ID, name), item);
    }

    public static void registerModItems () {
        MoreMinerals.LOGGER.info("Registering Mod Items for " + MoreMinerals.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(GRAPHITE);
            entries.add(RAW_AMBER);
            entries.add(AMBER);
            entries.add(SLATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(GRAPHITE);
            entries.add(RAW_AMBER);
            entries.add(AMBER);
            entries.add(SLATE);
        });
    }
}
