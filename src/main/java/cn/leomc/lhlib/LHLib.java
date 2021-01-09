package cn.leomc.lhlib;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class LHLib {

    private JavaPlugin plugin;
    private LHLogger logger;

    public LHLib(JavaPlugin plugin){
        this.plugin = plugin;
    }


    public LHLogger getLogger(){
        if(logger == null)
            logger = new LHLogger(this);
        return logger;
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }

    public void saveDefaultConfig(){
        if(!new File(plugin.getDataFolder(), "config.yml").exists())
            plugin.saveDefaultConfig();
    }

    public String getPrefix(){
        return plugin.getConfig().get("prefix", "[" + ChatColor.AQUA + plugin.getName() + ChatColor.RESET + "]") + " " + ChatColor.RESET;
    }

}
