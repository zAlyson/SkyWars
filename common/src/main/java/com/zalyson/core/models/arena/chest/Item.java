package com.zalyson.core.models.arena.chest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

@AllArgsConstructor
@Getter
public class Item {

    private ItemStack itemStack;

    private int percentage;

}