package com.znd.smash.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SmashChamps implements CommandExecutor {
	public static Inventory champMenu = createChampMenu();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("smash") && args[0].equalsIgnoreCase("champs")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				
				player.openInventory(champMenu);
				return true;
			}
		}
		
		return true;
	}
	
	private static Inventory createChampMenu() {
		Inventory inventory = Bukkit.createInventory(null, 9, ChatColor.GOLD + "" + ChatColor.BOLD + "Smash Champs");
		inventory.setItem(4, createPyroMenuKit());
		
		return inventory;
	}	
	
	private static ItemStack createPyroMenuKit() {
		ItemStack item = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GOLD + "Pyrotechnic");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.RED + "Click to select kit!");
		meta.setLore(lore);
		
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		return item;
	}
}
