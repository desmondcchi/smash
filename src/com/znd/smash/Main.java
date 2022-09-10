package com.znd.smash;

import org.bukkit.plugin.java.JavaPlugin;

import com.znd.smash.commands.SmashChamps;
import com.znd.smash.listeners.InventoryClick;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getCommand("smash").setExecutor(new SmashChamps());
		
		this.getServer().getPluginManager().registerEvents(new InventoryClick(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
