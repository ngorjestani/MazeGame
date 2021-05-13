package com.company;

public class isLootable implements Interactable{
    @Override
    public String interact(Player player) {
        return "You have found a bag of loot in this room";
    }
}
