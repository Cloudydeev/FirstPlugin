package me.cloudy.listeners;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

@EventHandler

    public void onJoin(PlayerJoinEvent event){
    //Variables
    Player player = event.getPlayer();
    String playerName = player.getName();
    String playerWorld = player.getWorld().getName();
    int nameLength = playerName.length();
    int playerHunger = player.getFoodLevel();
    int total = playerHunger + nameLength ;
    boolean isOp = player.isOp();
    double playerHealth = player.getHealth();
    double halfHealth = playerHealth/2 ;
    double maxHealth = playerHealth*2;
    String status ;
    boolean isFullHealth = playerHealth ==20 ;
    boolean canUseAdminPanel = isOp && isFullHealth ;
    boolean specialPlayer = isOp || playerName.equals("Cloudy");
    String healthRank;
    // IF
    //Status condition
    if (isOp) {
        status = "Admin";
    } else {
        status = "Member";
    }
    //healthRank condition
    if (playerHealth >=20){
        healthRank = "Healthy";
    }
    else if (playerHealth >= 10) {
        healthRank = "Normal";
    }
    else {
        healthRank = "Low";
    }

    //Message
    player.sendMessage(
            "Welcome " + playerName + "\n" +
                    "World: " + playerWorld + "\n" +
                    "Status: " + status + "\n" +
                    "Health: " + playerHealth + "\n" +
                    "Health Rank: " + healthRank + "\n"+
                    "Half Health: " + halfHealth + "\n" +
                    "Hunger: " + playerHunger + "\n" +
                    "Name Length: " + nameLength + "\n" +
                    "Total: " + total + "\n" +
                    "Full Health: " + isFullHealth + "\n" +
                    "Can Use Admin Panel: " + canUseAdminPanel + "\n" +
                    "Special Player: " + specialPlayer
    );
}
}
