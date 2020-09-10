package com.goldnerd.sonicsg.SonicSGEvents;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventsBeforeGame implements Listener {

    @EventHandler
    public static void signCheckIn(PlayerInteractEvent event){
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        if(block.getType()==null){
            return;
        }
        if(block.getType() == Material.SIGN){
            Sign s = (Sign) block.getState();
            s.setLine(0,"Hey");
        }
    }
}
