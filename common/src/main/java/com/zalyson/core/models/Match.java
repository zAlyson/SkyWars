package com.zalyson.core.models;

import com.zalyson.core.models.types.MatchState;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Match {

    private MatchState state = MatchState.WAITINGSTART;

    private int playerCount;

    private int maxPlayers;

}
