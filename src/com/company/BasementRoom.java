package com.company;

public class BasementRoom extends Room{
    public BasementRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You found a small room. There is a buzzing noise.";
    }
}
