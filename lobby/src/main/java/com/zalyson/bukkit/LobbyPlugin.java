package com.zalyson.bukkit;

import com.zalyson.core.server.Server;
import com.zalyson.core.server.ServerType;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbyPlugin extends JavaPlugin {

    private final Server server;

    public LobbyPlugin() {
        this.server = new Server(
                1,
                ServerType.LOBBY,
                getServer().getIp(),
                getServer().getPort()
        );
    }

    @Override
    public void onEnable() {

        getLogger().info(
                "\n " +
                        " §a Lobby #" + server.getId() + "§a iniciando.."
                        + "\n "
        );

    }
}
