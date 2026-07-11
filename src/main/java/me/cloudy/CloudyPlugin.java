package me.cloudy;


import me.cloudy.listeners.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public class CloudyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("cloudy plugin enabled");
       getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }
}
