package net.nrobot10.moreminerals.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.nrobot10.moreminerals.MoreMinerals;

public class ModBlocks {

    public static final Block GRAPHITE_ORE = registerBlock("graphite_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block GRAPHITE_BLOCK = registerBlock("graphite_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block AMBER_ORE = registerBlock("amber_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block AMBER_BLOCK = registerBlock("amber_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.GLASS)));

    public static final Block SLATE_BLOCK = registerBlock("slate_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE_ORE = registerBlock("slate_ore",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block AMBER_BRICKS = registerBlock("amber_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MoreMinerals.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MoreMinerals.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MoreMinerals.LOGGER.info("Registering Mod Blocks for " + MoreMinerals.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(GRAPHITE_ORE);
            entries.add(GRAPHITE_BLOCK);
            entries.add(AMBER_ORE);
            entries.add(AMBER_BLOCK);
            entries.add(SLATE_BLOCK);
            entries.add(SLATE_ORE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(GRAPHITE_ORE);
            entries.add(GRAPHITE_BLOCK);
            entries.add(AMBER_ORE);
            entries.add(AMBER_BLOCK);
            entries.add(SLATE_BLOCK);
            entries.add(SLATE_ORE);
            entries.add(AMBER_BRICKS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(AMBER_BRICKS);
        });
    }
}
