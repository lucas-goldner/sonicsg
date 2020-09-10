package com.goldnerd.sonicsg;

import com.goldnerd.sonicsg.SonicSGEvents.EventsBeforeGame;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class SonicSG extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventsBeforeGame(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "[SonicSG]: Plugin started");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "[SonicSG]: Plugin stopped");
    }
}
