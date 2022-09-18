package com.znd.smash;

import org.bukkit.plugin.java.JavaPlugin;

import com.znd.smash.commands.Smash;
import com.znd.smash.helpers.ChampionPlayerLists;
import com.znd.smash.listeners.DoubleJump;
import com.znd.smash.listeners.InventoryClick;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getConfig().addDefault("knight", "");
		this.getConfig().addDefault("archer", "");
		this.getConfig().addDefault("tank", "");
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		
		ChampionPlayerLists playerLists = new ChampionPlayerLists();
		
		//Commands
		this.getCommand("smash").setExecutor(new Smash());
		
		//Listeners
		this.getServer().getPluginManager().registerEvents(new InventoryClick(this), this);
		this.getServer().getPluginManager().registerEvents(new DoubleJump(this), this);
	}
	
	@Override
	public void onDisable() {
		
	}
}
