package com.clientcrash.raidglow;
import org.bukkit.plugin.java.JavaPlugin;

public final class RaidGlow extends JavaPlugin {


    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new RaidEventListener(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
