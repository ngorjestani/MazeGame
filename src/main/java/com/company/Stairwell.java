package com.company;

public class Stairwell extends Room{
    public Stairwell(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are in a stairwell with a door at the top.";
    }
}
