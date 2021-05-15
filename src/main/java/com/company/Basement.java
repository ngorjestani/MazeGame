package com.company;

public class Basement extends Room{
    public Basement(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are in a dimly lit basement. There is a rug on the floor. You see something move underneath it.";
    }
}
