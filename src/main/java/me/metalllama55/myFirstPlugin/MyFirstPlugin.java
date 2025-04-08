package me.metalllama55.myFirstPlugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.metalllama55.myFirstPlugin.Listeners.PlayerListener;

public final class MyFirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
    	
    	getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    	System.out.println(Bukkit.getOnlinePlayers());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
