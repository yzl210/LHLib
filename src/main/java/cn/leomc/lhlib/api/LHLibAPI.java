package cn.leomc.lhlib.api;

import cn.leomc.lhlib.LHLib;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class LHLibAPI {

    private static HashMap<JavaPlugin, LHLib> INSTANCES = new HashMap<>();

    public static LHLib get(JavaPlugin plugin){
        return INSTANCES.containsKey(plugin) ? INSTANCES.get(plugin) : INSTANCES.put(plugin, new LHLib(plugin));
    }

    public static HashMap<JavaPlugin, LHLib> getInstances() {
        return INSTANCES;
    }
}
