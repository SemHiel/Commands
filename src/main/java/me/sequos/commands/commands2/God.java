package me.sequos.commands.commands2;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("commands.god")){
                player.setInvulnerable(true);
                player.sendMessage(ChatColor.BOLD + "You are god now!");
            }else{
                player.sendMessage(ChatColor.DARK_RED + "You do not have permissions for this commands");
            }
        }

        return false;
    }
}
