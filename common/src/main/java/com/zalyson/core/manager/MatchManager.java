package com.zalyson.core.manager;

import com.zalyson.core.models.Match;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@AllArgsConstructor
@Getter

public class MatchManager {

    private final Map<Integer, Match> matchMap;


}
