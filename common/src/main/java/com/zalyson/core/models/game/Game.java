package com.zalyson.core.models.game;

import com.zalyson.core.models.Match;
import com.zalyson.core.models.arena.Arena;
import com.zalyson.core.models.types.GameType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Set;

@AllArgsConstructor
@Getter
public class Game {

    private Match match;

    private Arena arena;

    private GameType gameType;

    private GameSettings gameSettings;

    private Set<GamePlayer> gamePlayers;

}