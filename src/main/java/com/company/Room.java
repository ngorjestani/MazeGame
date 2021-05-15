package com.company;

public abstract class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;
    private Interactable interactable;
    private Exit exit;
    public boolean isExit;

    public void setInteractable(Interactable interactable) {
        this.interactable = interactable;
    }

    public void setExit(Exit exit) {
        this.exit = exit;
        this.isExit = exit.isExit();
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char dir) {
        if (isValidDirection(dir)) {
            switch (dir) {
                case 'n':
                    return north;
                case 's':
                    return south;
                case 'e':
                    return east;
                case 'w':
                    return west;
                case 'u':
                    return up;
                case 'd':
                    return down;
            }
        }
        return null;
    }

    public String getExits() {
        String roomList = "";
        if (north != null) {
            roomList += "North";
        }
        if (south != null) {
            roomList += "South";
        }
        if (east != null) {
            roomList += "East";
        }
        if (west != null) {
            roomList += "West";
        }
        if (up != null) {
            roomList += "Up";
        }
        if (down != null) {
            roomList += "Down";
        }

        return roomList;
    }

    public String getName() {
        return name;
    }

    public boolean isValidDirection(char dir) {
        switch (dir) {
            case 'n':
                return north != null;
            case 's':
                return south != null;
            case 'e':
                return east != null;
            case 'w':
                return west != null;
            case 'u':
                return up != null;
            case 'd':
                return down != null;
        }
        return false;
    }

    public String interact() {
        return interactable.interact();
    }

    public String exit() {
        return exit.exit();
    }
}
