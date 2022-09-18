package com.znd.smash.listeners;

import java.util.ArrayList;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.plugin.Plugin;

import com.znd.smash.helpers.ChampionPlayerLists;
import com.znd.smash.helpers.ChampionPlayerLists.ListNames;

import me.desmondcchi.smash.ChampKits.ArcherKit;
import me.desmondcchi.smash.ChampKits.KnightKit;
import me.desmondcchi.smash.ChampKits.TankKit;
import net.md_5.bungee.api.ChatColor;

public class InventoryClick implements Listener {
	private Plugin plugin;
	
	public InventoryClick(Plugin plugin) {
		this.plugin = plugin;
	}
	
	// Equips the player with the champion kit and buffs after pressing on an item in the champion menu.
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		if (event.getView().getTitle().contains("Smash Champs")) {
			if (event.getCurrentItem() != null) {
				Player player = (Player) event.getWhoClicked();
				String playerUUID = player.getUniqueId().toString();
				event.setCancelled(true);
				
				if (event.getClickedInventory().getType() == InventoryType.PLAYER) {
					return;
				}
				
				if (event.getCurrentItem().getType() == Material.IRON_SWORD) {
					player.closeInventory();
					player.sendTitle(ChatColor.GOLD + "Selected " + ChatColor.GRAY + "Knight" + ChatColor.GOLD + "!", null, 20, 80, 20);
					
					player.sendMessage(ChampionPlayerLists.playerListMap.keySet().toString());
					updateConfig(playerUUID, ListNames.KNIGHT);
					
					player.setAllowFlight(true);
					
					KnightKit.equip(player.getInventory());
				}
				else if (event.getCurrentItem().getType() == Material.BOW) {
					player.closeInventory();
					player.sendTitle(ChatColor.GOLD + "Selected " + ChatColor.GREEN + "Archer" + ChatColor.GOLD + "!", null, 20, 80, 20);
				
					updateConfig(playerUUID, ListNames.ARCHER);
					
					ArcherKit.equip(player.getInventory());
				}
				else if (event.getCurrentItem().getType() == Material.NETHERITE_CHESTPLATE) {
					player.closeInventory();
					player.sendTitle(ChatColor.GOLD + "Selected " + ChatColor.BLUE + "Tank" + ChatColor.GOLD + "!", null, 20, 80, 20);
					
					updateConfig(playerUUID, ListNames.TANK);
					
					TankKit.equip(player.getInventory());
				}
			}
		}
	}
	
	// Helper function updating the config.yml file by adding the given player to the appropriate champion list.
	private void updateConfig(String playerUUID, ListNames name) {
		removePlayerFromAllLists(playerUUID);
		
		switch (name) {
			case KNIGHT:
				ChampionPlayerLists.knightList.add(playerUUID);
				break;
			case ARCHER:
				ChampionPlayerLists.archerList.add(playerUUID);
				break;
			case TANK:
				ChampionPlayerLists.tankList.add(playerUUID);
				break;
		}
		
		setConfigLists();
		plugin.saveConfig();
	}
	
	// Helper function for removing a given player from all champion lists.
	private void removePlayerFromAllLists(String playerUUID) {
		for (ArrayList<String> list : ChampionPlayerLists.playerListMap.values()) {
			list.remove(playerUUID);
		}
	}
	
	// Helper function to update all champion lists in the config.yml file.
	private void setConfigLists() {
		for (Map.Entry<String, ArrayList<String>> entry : ChampionPlayerLists.playerListMap.entrySet()) {
			plugin.getConfig().set(entry.getKey(), entry.getValue());
		}
	}
}
