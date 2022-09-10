package com.znd.smash.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

public class InventoryClick implements Listener {
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		if (event.getView().getTitle().contains("Smash Champs")) {
			if (event.getCurrentItem() != null) {
				Player player = (Player) event.getWhoClicked();
				event.setCancelled(true);
				
				if (event.getClickedInventory().getType() == InventoryType.PLAYER) {
					return;
				}
			}
		}
	}
}
