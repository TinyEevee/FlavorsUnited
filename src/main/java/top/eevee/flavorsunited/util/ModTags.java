package top.eevee.flavorsunited.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import top.eevee.flavorsunited.FlavorsUnited;

public class ModTags {
    public static class Blocks{
        private static TagKey<Block> creatTag(String name){
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(FlavorsUnited.MODID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = creatTag("transformable_items");

        private static TagKey<Item> creatTag(String name){
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(FlavorsUnited.MODID, name));
        }
    }
}
