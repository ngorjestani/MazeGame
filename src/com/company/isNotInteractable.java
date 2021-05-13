package com.company;

public class isNotInteractable implements Interactable{
    @Override
    public String interact(Player player) {
        return "There is nothing in this room";
    }
}
