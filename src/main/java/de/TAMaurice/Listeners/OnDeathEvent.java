package de.TAMaurice.Listeners;

import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class OnDeathEvent implements Listener {
    @EventHandler
    public void onPlayerDeathEvent(PlayerDeathEvent pde) {
        ArrayList<ItemStack> inventoryList = new ArrayList<ItemStack>();
        Player player = pde.getEntity().getPlayer();

        for(ItemStack i : player.getInventory().getContents())
        {
            if(i != null)
            {
                inventoryList.add(i);
            }
        }

        if (inventoryList.size() <= 27) {
            player.getLocation().getBlock().setType(Material.CHEST);
            Chest chest = (Chest) player.getLocation().getBlock().getState();

            chest.getInventory().setContents(inventoryList.toArray(new ItemStack[inventoryList.size()]));
            pde.getDrops().clear();
        }
    }
}
