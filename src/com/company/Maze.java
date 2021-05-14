package com.company;

public class Maze {
    private static Maze instance = new Maze();
    private Room currentRoom;
    private RoomFactory roomFactory = new RoomFactory();
    private boolean isFinished = false;

    public static Maze getInstance() {
        return instance;
    }

    private Maze() {
        Room firstTunnel = roomFactory.getRoom("Entrance tunnel", "Tunnel");
        Room basement = roomFactory.getRoom("Basement", "Basement");
        Room closet = roomFactory.getRoom("Closet", "Closet");
        Room basementSecondRoom = roomFactory.getRoom("Second room in basement", "BasementRoom");
        Room bedroom = roomFactory.getRoom("West bedroom", "Bedroom");
        Room hallway = roomFactory.getRoom("Long hallway", "Hallway");
        Room stairwell = roomFactory.getRoom("Stairwell to exit", "Stairwell");
        firstTunnel.setExit(new isNotAnExit());
        firstTunnel.setInteractable(new isLootable());
        firstTunnel.setDown(basement);
        basement.setExit(new isNotAnExit());
        basement.setInteractable(new isLootable());
        basement.setUp(firstTunnel);
        basement.setWest(basementSecondRoom);
        basementSecondRoom.setExit(new isNotAnExit());
        basementSecondRoom.setInteractable(new isLootable());
        basementSecondRoom.setEast(basement);
        firstTunnel.setEast(closet);
        closet.setExit(new isNotAnExit());
        closet.setInteractable(new isLootable());
        closet.setWest(firstTunnel);
        firstTunnel.setWest(bedroom);
        bedroom.setExit(new isNotAnExit());
        bedroom.setInteractable(new isLootable());
        bedroom.setEast(firstTunnel);
        bedroom.setDown(basementSecondRoom);
        basementSecondRoom.setUp(bedroom);
        firstTunnel.setNorth(hallway);
        hallway.setExit(new isNotAnExit());
        hallway.setInteractable(new isFightable());
        hallway.setSouth(firstTunnel);
        hallway.setNorth(stairwell);
        stairwell.setExit(new isAnExit());
        stairwell.setInteractable(new isNotInteractable());
        stairwell.setSouth(hallway);
        currentRoom = firstTunnel;
    }

    public String exitCurrentRoom() {
        if (currentRoom.isExit) {
            isFinished = true;
        }

        return currentRoom.exit();
    }

    public String interactWithCurrentRoom() {
        return currentRoom.interact();
    }

    public boolean move(char dir) {
        if (currentRoom.isValidDirection(dir)) {
            currentRoom = currentRoom.getAdjoiningRoom(dir);
            return true;
        } else {
            return false;
        }
    }

    public String getCurrentRoomDescription() {
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }

    public boolean isFinished() {
        return isFinished;
    }
}
