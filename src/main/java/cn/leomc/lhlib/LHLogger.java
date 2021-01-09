package cn.leomc.lhlib;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

class LHLogger {

    private LHLib parent;

    protected LHLogger(LHLib parent){
        this.parent = parent;
    }

    public void log(String message){
        send(message, Bukkit.getConsoleSender());
    }

    public void send(String message, CommandSender sender){
        sender.sendMessage(handleColor(parent.getPrefix() + message));
    }

    public void send(String message){
        for(Player player : Bukkit.getOnlinePlayers())
            send(message, player);
    }

    public void error(String message){
        log(ChatColor.RED + message);
    }

    public void error(String message, CommandSender sender){
        send(ChatColor.RED + message, sender);
    }

    public void success(String message){
        log(ChatColor.GREEN + message);
    }

    public void success(String message, CommandSender sender){
        send(ChatColor.GREEN + message, sender);
    }


    public static String handleColor(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

}
