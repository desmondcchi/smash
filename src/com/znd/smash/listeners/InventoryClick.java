package com.znd.smash.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

import me.desmondcchi.smash.ChampKits.ArcherKit;
import me.desmondcchi.smash.ChampKits.KnightKit;
import net.md_5.bungee.api.ChatColor;

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
				
				if (event.getCurrentItem().getType() == Material.IRON_SWORD) {
					player.closeInventory();
					player.sendTitle(ChatColor.GOLD + "Selected " + ChatColor.GRAY + "Knight" + ChatColor.GOLD + "!", null, 20, 80, 20);
					
					KnightKit.equip(player.getInventory());
				}
				else if (event.getCurrentItem().getType() == Material.BOW) {
					player.closeInventory();
					player.sendTitle(ChatColor.GOLD + "Selected " + ChatColor.GRAY + "Archer" + ChatColor.GOLD + "!", null, 20, 80, 20);
				
					ArcherKit.equip(player.getInventory());
				}
			}
		}
	}
}
