package me.metalllama55.myFirstPlugin.Listeners;

import java.util.Iterator;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;

public class PlayerListener implements Listener{
	
	public void onPlayerJoin(PlayerJoinEvent event) {
		
		event.setJoinMessage("Welcome to the Server!");
		
	} 
	
	public void onPlayerLeave(PlayerKickEvent event) {
		for(Player player : Bukkit.getOnlinePlayers()) {
			UUID uuid = player.getUniqueId();
		}
		
		event.setLeaveMessage("left the server, Goodbye!");
		
	} 

}
