package com.company;

public class Tunnel extends Room{
    public Tunnel(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "The tunnel is dark and musty. Something shiny is glistening in the corner";
    }
}
