package com.company;

public class Closet extends Room{
    public Closet(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You are in a dirty closet. There is a shelf with a bag on it.";
    }
}
