package com.company;

public class RoomFactory {
    public Room getRoom(String name, String type) {
        switch(type) {
            case "Basement":
                return new Basement(name);
            case "BasementRoom":
                return new BasementRoom(name);
            case "Bedroom":
                return new Bedroom(name);
            case "Closet":
                return new Closet(name);
            case "Hallway":
                return new Hallway(name);
            case "Stairwell":
                return new Stairwell(name);
            case "Tunnel":
                return new Tunnel(name);
            default:
                return null;
        }
    }
}
