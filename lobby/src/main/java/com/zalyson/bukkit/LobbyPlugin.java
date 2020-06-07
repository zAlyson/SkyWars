package com.zalyson.bukkit;

import com.zalyson.core.server.Server;
import org.bukkit.plugin.java.JavaPlugin;

public class LobbyPlugin extends JavaPlugin {

    private final Lobby lobby;

    public LobbyPlugin() {
        this.lobby = new Lobby(
                1,
                new Server(
                        getServer().getIp(),
                        getServer().getPort()
                ),
                this
        );
    }

    @Override
    public void onEnable() {

        getLogger().info(
                "\n " +
                        " §a Lobby #" + lobby.getId() + "§a iniciando.."
                        + "\n "
        );

    }
}
