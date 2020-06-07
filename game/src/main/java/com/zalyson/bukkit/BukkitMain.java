package com.zalyson.bukkit;

import com.zalyson.core.Core;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitMain extends JavaPlugin {

    @Override
    public void onEnable() {
        new Core();
    }
}
