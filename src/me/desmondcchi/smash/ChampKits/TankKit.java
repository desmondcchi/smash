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

public class TankKit {
	public static void equip(PlayerInventory inventory) {
		inventory.clear();
		
		inventory.setItemInOffHand(createTankShield());
		inventory.setItem(0, createTankBattleaxe());
		
		inventory.setItem(EquipmentSlot.HEAD, createTankHelmet());
		inventory.setItem(EquipmentSlot.CHEST, createTankChestplate());
		inventory.setItem(EquipmentSlot.LEGS, createTankLeggings());
		inventory.setItem(EquipmentSlot.FEET, createTankBoots());
	}
	
	private static ItemStack createTankShield() {
		ItemStack item = new ItemStack(Material.SHIELD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Tank's Shield");
		meta.setUnbreakable(true);
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.GOLD + "Charge up ultimate by blocking hits with ");
	    lore.add(ChatColor.GOLD + "shield or taking daamage.");
		lore.add("");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createTankBattleaxe() {
		ItemStack item = new ItemStack(Material.STONE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Tank's Battleaxe");
		meta.setUnbreakable(true);
		
		item.setItemMeta(meta);
		return item;
	}
	
	private static ItemStack createTankHelmet() {
		ItemStack item = new ItemStack(Material.NETHERITE_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Tank's Helmet");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_FIRE, 2, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createTankChestplate() {
		ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Tank's Chestplate");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_FIRE, 2, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createTankLeggings() {
		ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Tank's Leggings");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_FIRE, 2, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createTankBoots() {
		ItemStack item = new ItemStack(Material.NETHERITE_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Tank's Boots");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_PROJECTILE, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_EXPLOSIONS, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_FIRE, 2, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
}
