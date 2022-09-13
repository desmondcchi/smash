package me.desmondcchi.smash.ChampKits;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ArcherKit {
	public static void equip(PlayerInventory inventory) {
		inventory.clear();
		
		inventory.setItem(0, createArcherBow());
		inventory.setItem(1, createArcherSword());
		inventory.setItem(9, new ItemStack(Material.ARROW));
		
		inventory.setItem(EquipmentSlot.HEAD, createArcherHelmet());
		inventory.setItem(EquipmentSlot.CHEST, createArcherChestplate());
		inventory.setItem(EquipmentSlot.LEGS, createArcherLeggings());
		inventory.setItem(EquipmentSlot.FEET, createArcherBoots());
	}
	
	private static ItemStack createArcherBow() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Archer's Bow");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
		meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.GOLD + "Charge up ultimate by shooting enemy players with arrows.");
		lore.add("");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createArcherSword() {
		ItemStack item = new ItemStack(Material.WOODEN_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Archer's Sword");
		meta.setUnbreakable(true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createArcherHelmet() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Archer's Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.setUnbreakable(true);
		
		item.setItemMeta(meta);
		
		return item;	
	}
	
	private static ItemStack createArcherChestplate() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Archer's Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.setUnbreakable(true);
		
		item.setItemMeta(meta);
		
		return item;	
	}
	
	private static ItemStack createArcherLeggings() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Archer's Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.setUnbreakable(true);
		
		item.setItemMeta(meta);
		
		return item;	
	}
	
	private static ItemStack createArcherBoots() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Archer's Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.setUnbreakable(true);
		
		item.setItemMeta(meta);
		
		return item;
	}
}
