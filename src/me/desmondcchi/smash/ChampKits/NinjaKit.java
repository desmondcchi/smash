package me.desmondcchi.smash.ChampKits;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import net.md_5.bungee.api.ChatColor;

public class NinjaKit {
	public static void equip(PlayerInventory inventory) {
		inventory.clear();
		
		inventory.setItem(0, createNinjaSword());
		inventory.setItem(1, createFlashbang());
		inventory.setItem(2, createStealthCapsule());
		
		inventory.setItem(EquipmentSlot.FEET, createNinjaBoots());
	}
	
	private static ItemStack createNinjaSword() {
		ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Ninja Blade");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("Charge up ultimate by killing enemy players.");
		lore.add("");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createNinjaBoots() {
		ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "Ninja Boots");
		meta.setColor(Color.BLACK);
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("Double tap space to double jump.");
		lore.add("");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	private static ItemStack createFlashbang() {
		ItemStack item = new ItemStack(Material.FIREWORK_STAR);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Flashbang");
	
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("Right click to throw flashbang (causes blindness on explosive impact).");
		lore.add("");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.setAmount(6);
		
		return item;
	}
	
	private static ItemStack createStealthCapsule() {
		ItemStack item = new ItemStack(Material.SOUL_LANTERN);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "Stealth Capsule");
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("Right click to use stealth capsule to turn invisible for 2 seconds.");
		lore.add("");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.setAmount(3);
		
		return item;
	}
}
