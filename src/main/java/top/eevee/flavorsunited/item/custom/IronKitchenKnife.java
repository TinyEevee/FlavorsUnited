package top.eevee.flavorsunited.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.context.UseOnContext;

import java.util.function.Consumer;

public class IronKitchenKnife extends Item {

    public IronKitchenKnife(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltipsComponent, TooltipFlag tooltipFlag) {
        if(Screen.hasShiftDown()){
            tooltipsComponent.accept(Component.literal("按住shift查看内容").withStyle(ChatFormatting.YELLOW));
            tooltipsComponent.accept(Component.translatable("tooltip.flavorsunited.ironpan").withStyle(ChatFormatting.GREEN));
        }else {
            tooltipsComponent.accept(Component.literal("111按住shift查看内容").withStyle(ChatFormatting.GOLD));
            tooltipsComponent.accept(Component.literal("111shift查看内容").withStyle(ChatFormatting.GRAY));
        }
        super.appendHoverText(stack, context, display, tooltipsComponent, tooltipFlag);
    }

    @Override
    public InteractionResult useOn(UseOnContext context){

        return null;
    }

}
