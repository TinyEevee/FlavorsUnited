package top.eevee.flavorsunited.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.eevee.flavorsunited.FlavorsUnited;
import top.eevee.flavorsunited.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(FlavorsUnited.MODID);

    public static final DeferredBlock<Block> SALT_ORE = registerBlock("saltore",
            () -> new DropExperienceBlock(UniformInt.of(0,1),BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK,ResourceLocation.parse("flavorsunited:saltore")))
                    .strength(2F).requiresCorrectToolForDrops().sound(SoundType.STONE)),"flavorsunited:saltore");


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, String location) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn,location);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block,String location) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(
                Registries.ITEM, ResourceLocation.parse(location)
        ))));

    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
