package com.zalyson.core.models.game;

import com.zalyson.core.models.types.PlayerType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GamePlayer {

    private String name;
    private Integer kills;

    private PlayerType playerType;

}
