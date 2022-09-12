package me.desmondcchi.smash.ChampKits;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class KnightKit {
	public static void equip(PlayerInventory inventory) {
		inventory.clear();
		
		inventory.setItem(0, createKnightSword());
		
		inventory.setItem(EquipmentSlot.HEAD, createKnightHelmet());
		inventory.setItem(EquipmentSlot.CHEST, createKnightChestplate());
		inventory.setItem(EquipmentSlot.LEGS, createKnightLeggings());
		inventory.setItem(EquipmentSlot.FEET, createKnightBoots());
	}
	
	private static ItemStack createKnightSword() {
		ItemStack item = new ItemStack(Material.IRON_SWORD);
		ItemMeta meta = item.getItemMeta();
	
		meta.setDisplayName(ChatColor.WHITE + "Knight's Sword");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.GOLD + "Charge up ultimate by hitting enemy players with full charge.");
		lore.add("");
		meta.setLore(lore);
		
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createKnightHelmet() {
		ItemStack item = new ItemStack(Material.IRON_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Knight's Helmet");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createKnightChestplate() {
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Knight's Chestplate");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createKnightLeggings() {
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Knight's Leggings");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createKnightBoots() {
		ItemStack item = new ItemStack(Material.IRON_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Knight's Boots");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
}
