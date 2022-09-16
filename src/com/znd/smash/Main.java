package com.znd.smash;

import org.bukkit.plugin.java.JavaPlugin;

import com.znd.smash.commands.Smash;
import com.znd.smash.listeners.DoubleJump;
import com.znd.smash.listeners.InventoryClick;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		//Commands
		this.getCommand("smash").setExecutor(new Smash());
		
		//Listeners
		this.getServer().getPluginManager().registerEvents(new InventoryClick(), this);
		this.getServer().getPluginManager().registerEvents(new DoubleJump(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
