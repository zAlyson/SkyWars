package com.zalyson.core.models.arena.chest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@AllArgsConstructor
@Getter
public class Chest {

    private String name;
    private List<Item> items;

}
