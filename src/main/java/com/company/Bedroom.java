package com.company;

public class Bedroom extends Room{
    public Bedroom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are in a bedroom. There is a dresser to your left.";
    }
}
