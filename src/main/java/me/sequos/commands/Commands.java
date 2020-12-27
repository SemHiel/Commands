package me.sequos.commands;

import me.sequos.commands.commands2.Feed;
import me.sequos.commands.commands2.God;
import org.bukkit.plugin.java.JavaPlugin;

public final class Commands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.print("Command Plugin has been enabled.");
        getCommand("god").setExecutor(new God());
        getCommand("feed").setExecutor(new Feed());

    }

}
