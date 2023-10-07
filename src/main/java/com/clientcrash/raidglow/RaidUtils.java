package com.clientcrash.raidglow;

import org.bukkit.Raid;
import java.util.ArrayList;

public class RaidUtils {
    private static int mobs_remaining = 2;
    private static ArrayList<Raid> raids = new ArrayList<>();

    public static int getMobsRemaining() {
        return mobs_remaining;
    }

    public static void setMobsRemaining(int mobsRemaining) {
        mobs_remaining = mobsRemaining;
    }

    public static ArrayList<Raid> getRaids() {
        return new ArrayList<>(raids);
    }

    public static void setRaids(ArrayList<Raid> newRaids) {
        raids = new ArrayList<>(newRaids);
    }

    public static void addRaid(Raid raid) {
        raids.add(raid);
    }

    public static void removeRaid(Raid raid) {
        raids.remove(raid);
    }
}
