package me.desmondcchi.smash.ChampKits;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class KnightKit {
	public static void equip(Inventory inventory) {
		inventory.clear();
		
		inventory.setItem(0, new ItemStack(Material.IRON_SWORD));
	}
	
	private ItemStack createKnightSword() {
		ItemStack item = new ItemStack(Material.IRON_SWORD);
		
		return item;
	}
}
