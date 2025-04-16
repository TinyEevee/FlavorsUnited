package top.eevee.flavorsunited.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.eevee.flavorsunited.FlavorsUnited;
import top.eevee.flavorsunited.item.custom.IronKitchenKnife;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(FlavorsUnited.MODID);

    public static final DeferredItem<Item> COOKING_OIL = ITEMS.registerItem("cookingoil",Item::new,new Item.Properties());

    public static final DeferredItem<Item> COOKING_SALT = ITEMS.registerItem("cookingsalt",Item::new,new Item.Properties());

    public static final DeferredItem<Item> SOY_SAUCE = ITEMS.registerItem("soysauce",Item::new,new Item.Properties());

    public static final DeferredItem<Item> VINRGAR = ITEMS.registerItem("vinrgar",Item::new,new Item.Properties());

    public static final DeferredItem<Item> DUCK_EGG = ITEMS.registerItem("duckegg",Item::new,new Item.Properties());

    public static final DeferredItem<Item> SALTED_DUCK_EGG = ITEMS.registerItem("saltedduckegg",Item::new,new Item.Properties());

    public static final DeferredItem<Item> OMELET = ITEMS.registerItem("omelet",Item::new,new Item.Properties());

    public static final DeferredItem<Item> RICEPORRIDGE = ITEMS.registerItem("riceporridge",Item::new,new Item.Properties());

    public static final DeferredItem<Item> IRONKITCHENKNIFE = ITEMS.registerItem("ironkitchenknife", IronKitchenKnife::new,new Item.Properties());

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
