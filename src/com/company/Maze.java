package com.company;

public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze(Player player) {
        this.player = player;
        Room firstTunnel = new Tunnel("Entrance tunnel");
        Room basement = new Basement("Basement");
        Room closet = new Closet("Closet");
        Room basementSecondRoom = new BasementRoom("Second room in basement");
        Room bedroom = new Bedroom("West bedroom");
        Room hallway = new Hallway("Long hallway");
        Room stairwell = new Stairwell("Stairwell to exit");
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

    public int getPlayerScore() {
        return player.getScore();
    }

    public String getPlayerInventory() {
        return player.getInventory();
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

