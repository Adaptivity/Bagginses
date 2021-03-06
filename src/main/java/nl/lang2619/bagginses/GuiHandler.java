package nl.lang2619.bagginses;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import nl.lang2619.bagginses.items.bags.container.BagContainer;
import nl.lang2619.bagginses.items.bags.gui.BagGui;
import nl.lang2619.bagginses.proxy.GuiInfo;

/**
 * Created by Tim on 8/24/2014.
 */
public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if (ID == GuiInfo.GUI_BACKPACK) {
            return new BagContainer(player.inventory, player.getCurrentEquippedItem());
        }
        if (ID == GuiInfo.GUI_BACKPACK_VOID) {
            return new BagContainer(player.inventory, player.getCurrentEquippedItem());
        }
        if (ID == GuiInfo.GUI_BACKPACK_T2) {
            return new BagContainer(player.inventory, player.getCurrentEquippedItem());
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == GuiInfo.GUI_BACKPACK) {
            return new BagGui(player.inventory, player.getCurrentEquippedItem(), "tier");
        }
        if (ID == GuiInfo.GUI_BACKPACK_VOID) {
            return new BagGui(player.inventory, player.getCurrentEquippedItem(), "void");
        }
        if (ID == GuiInfo.GUI_BACKPACK_T2) {
            return new BagGui(player.inventory, player.getCurrentEquippedItem(), "tier2");
        }
        return null;
    }
}
