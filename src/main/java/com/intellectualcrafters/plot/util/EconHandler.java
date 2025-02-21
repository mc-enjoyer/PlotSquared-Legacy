package com.intellectualcrafters.plot.util;

import com.intellectualcrafters.plot.object.ConsolePlayer;
import com.intellectualcrafters.plot.object.OfflinePlotPlayer;
import com.intellectualcrafters.plot.object.PlotPlayer;

public abstract class EconHandler {
    public static EconHandler manager;
    
    public double getMoney(PlotPlayer player) {
        if (ConsolePlayer.isConsole(player)) {
            return Double.MAX_VALUE;
        }
        return Double.NaN;
    }
    public abstract void withdrawMoney(PlotPlayer player, double amount);
    public abstract void depositMoney(PlotPlayer player, double amount);
    public abstract void depositMoney(OfflinePlotPlayer player, double amount);
    
    public void setPermission(String player, String perm, boolean value) {
        setPermission(null, player, perm, value);
    }
    
    public abstract void setPermission(String world, String player, String perm, boolean value);
    
    public abstract boolean hasPermission(String world, String player, String perm);
    
    public boolean hasPermission(String player, String perm) {
        return hasPermission(null, player, perm);
    }
}
