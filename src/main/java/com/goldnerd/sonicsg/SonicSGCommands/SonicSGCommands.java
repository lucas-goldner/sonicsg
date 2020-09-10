package com.goldnerd.sonicsg.SonicSGCommands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SonicSGCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender.hasPermission("SonicSG.sonicsign")){
            if(cmd.getName().equalsIgnoreCase("sonicsign")){
                Player p = (Player) sender;
                p.getWorld().getBlockAt(p.getLocation()).setType(Material.SIGN);
            }
        } else {
            sender.sendMessage(ChatColor.RED+"You do not have the permission to use this command");
        }
        return true;
    }
}
