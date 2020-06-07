package com.zalyson.core.models.arena;

import com.zalyson.core.models.arena.chest.Chest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Location;

import java.util.Set;

@AllArgsConstructor
@Getter
public class Arena {

    private String name;

    private String world;

    private Location middleLocation;

    private Set<Location> spawnLocation;

    private Set<Chest> chests;

}
