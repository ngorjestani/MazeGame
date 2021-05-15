package com.company;

public class Hallway extends Room{
    public Hallway(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are in a long hallway. There is a door at the end. There is a shadow in front of it.";
    }
}
