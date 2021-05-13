package com.company;

public class isFightable implements Interactable{
    @Override
    public String interact(Player player) {
        return "You were an attacked by an animal, but you barely managed to escape";
    }
}
