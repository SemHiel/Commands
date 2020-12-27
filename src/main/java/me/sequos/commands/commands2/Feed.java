package me.sequos.commands.commands2;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            if(player.hasPermission("commands.feed")){
                player.setFoodLevel(20);
                player.sendMessage(ChatColor.BOLD + "You've been feeded.");
            }else{
                player.sendMessage(ChatColor.DARK_RED + "You do not have the permissions to do this.");
            }
        }else{
            System.out.println("You need to be a player");
        }

        return false;
    }
}
