package me.sequos.commands.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {

    @EventHandler
    void onPlayerMove(PlayerMoveEvent event){
        Player player = event.getPlayer();
        if(player.hasPermission("commands.god")){
            event.setCancelled(true);
        }
    }

}
