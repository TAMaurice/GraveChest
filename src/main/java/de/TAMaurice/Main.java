package de.TAMaurice;

import de.TAMaurice.Listeners.OnDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("\n\nSTARTING GRAVECHEST-1.0-SNAPSHOT\n");
        getServer().getPluginManager().registerEvents(new OnDeathEvent(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("\n\nSTOPPING GRAVECHEST-1.0-SNAPSHOT\n");
    }
}