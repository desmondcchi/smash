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
		inventory.setItem(0, createSorcererMenuKit());
		inventory.setItem(1, createNinjaMenuKit());
		inventory.setItem(2, createIceMageMenuKit());
		inventory.setItem(3, createArcherMenuKit());
		inventory.setItem(4, createPyroMenuKit());
		inventory.setItem(5, createDragonbornMenuKit());
		inventory.setItem(6, createDemonMenuKit());
		inventory.setItem(7, createKnightMenuKit());
		

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
	
	private static ItemStack createDragonbornMenuKit() {
		ItemStack item = new ItemStack(Material.DRAGON_EGG);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Dragonborn");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.RED + "Click to select kit!");
		meta.setLore(lore);
		
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		return item;		
	}
	
	private static ItemStack createDemonMenuKit() {
		ItemStack item = new ItemStack(Material.REDSTONE);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.DARK_RED + "Demon");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.RED + "Click to select kit!");
		meta.setLore(lore);
		
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		return item;		
	}
	
	private static ItemStack createKnightMenuKit() {
		ItemStack item = new ItemStack(Material.IRON_SWORD);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GRAY + "Knight");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.RED + "Click to select kit!");
		meta.setLore(lore);
		
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		return item;		
	}
	
	private static ItemStack createArcherMenuKit() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.GREEN + "Archer");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.RED + "Click to select kit!");
		meta.setLore(lore);
		
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		return item;		
	}
	
	private static ItemStack createSorcererMenuKit() {
		ItemStack item = new ItemStack(Material.BOOK);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.BLUE + "Sorcerer");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.RED + "Click to select kit!");
		meta.setLore(lore);
		
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		return item;		
	}
	
	private static ItemStack createNinjaMenuKit() {
		ItemStack item = new ItemStack(Material.STRING);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.WHITE + "Ninja");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.RED + "Click to select kit!");
		meta.setLore(lore);
		
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		
		return item;		
	}
	
	private static ItemStack createIceMageMenuKit() {
		ItemStack item = new ItemStack(Material.POWDER_SNOW_BUCKET);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.AQUA + "Ice Mage");
		
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
