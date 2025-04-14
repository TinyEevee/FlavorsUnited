package top.eevee.flavorsunited.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.eevee.flavorsunited.FlavorsUnited;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(FlavorsUnited.MODID);

    public static final DeferredItem<Item> COOKING_OIL = ITEMS.registerItem("cookingoil",Item::new,new Item.Properties());

    public static final DeferredItem<Item> COOKING_SALT = ITEMS.registerItem("cookingsalt",Item::new,new Item.Properties());

    public static final DeferredItem<Item> SOY_SAUCE = ITEMS.registerItem("soysauce",Item::new,new Item.Properties());

    public static final DeferredItem<Item> VINRGAR = ITEMS.registerItem("vinrgar",Item::new,new Item.Properties());

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
