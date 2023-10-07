package com.clientcrash.raidglow;
import org.bukkit.plugin.java.JavaPlugin;

public final class RaidGlow extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(new RaidEventListener(), this);
        RaidUtils.setMobsRemaining(this.getConfig().getInt("mobs_remaining_for_glow"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
