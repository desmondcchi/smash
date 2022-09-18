package com.znd.smash.listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

public class DoubleJump implements Listener {
	private Plugin plugin;
	
	public DoubleJump(Plugin plugin) {
		this.plugin = plugin;
	}
	
	//TODO: Set cooldown for double jump and only allow ninjas to double jump.
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		if (plugin.getConfig().getList("ninja").contains(player.getUniqueId().toString())) {
			player.setAllowFlight(true);
		}
	}
	
	@EventHandler
	public void onPlayerDoubleJump(PlayerToggleFlightEvent event) {
		Player player = event.getPlayer();
		
		if (player.getGameMode() != GameMode.CREATIVE) {
			event.setCancelled(true);
			Vector velocity = player.getLocation().getDirection().multiply(1).setY(1);
			player.setVelocity(velocity);
		}
	}
}
