package com.znd.smash.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.znd.smash.helpers.CreateChampMenu;

public class Smash implements CommandExecutor {
	public static Inventory champMenu = CreateChampMenu.createChampMenu();
	
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
}
