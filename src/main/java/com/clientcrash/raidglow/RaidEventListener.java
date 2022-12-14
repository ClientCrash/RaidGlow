package com.clientcrash.raidglow;

import org.bukkit.Raid;
import org.bukkit.entity.Raider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.raid.RaidFinishEvent;
import org.bukkit.event.raid.RaidSpawnWaveEvent;
import org.bukkit.event.raid.RaidTriggerEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RaidEventListener implements Listener {
    @EventHandler
    public void onRaidWaveSpawn(RaidSpawnWaveEvent event){

    }

    @EventHandler
    public void onRaidEnd(RaidFinishEvent event){
        RaidUtils.raids.remove(event.getRaid());
    }

    @EventHandler
    public void onRaidStart(RaidTriggerEvent event){
        RaidUtils.raids.add(event.getRaid());
    }

    @EventHandler
    public void entityKilledEvent(EntityDeathEvent event){
        for(Raid raid : RaidUtils.raids){
            if(raid.getRaiders().size() <= RaidUtils.mobs_remaining){
                for(Raider raider : raid.getRaiders()){
                    raider.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING,99999,1));
                }
            }
        }
    }


}
