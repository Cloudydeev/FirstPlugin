package me.cloudy.listeners;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
@EventHandler
    public void onJoin(PlayerJoinEvent event){
 event.getPlayer().sendMessage(" Welcome" + event.getPlayer().getName());
}
}
