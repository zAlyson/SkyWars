package com.zalyson.core.manager;

import com.zalyson.core.models.arena.Arena;
import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class ArenaManager {

    private final Map<String, Arena> arenaMap;

}
