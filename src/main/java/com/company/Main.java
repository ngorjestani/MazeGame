package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Maze currentMaze = Maze.getInstance();

        while (!currentMaze.isFinished()) {
            System.out.println(currentMaze.getCurrentRoomDescription());
            System.out.println("The exits are: " + currentMaze.getCurrentRoomExits());
            System.out.println("i - Interact\n" +
                    "n - North\n" +
                    "s - South\n" +
                    "e - East\n" +
                    "w - West\n" +
                    "u - Up\n" +
                    "d - Down\n" +
                    "x - Exit");
            char resp = keyboard.next().charAt(0);
            switch (resp) {
                case 'i' -> System.out.println(currentMaze.interactWithCurrentRoom());
                case 'x' -> System.out.println(currentMaze.exitCurrentRoom());
                case 'n', 's', 'e', 'w', 'u', 'd' -> {
                    if (!currentMaze.move(resp)) {
                        System.out.println("You can't move that direction");
                    }
                }
                default -> System.out.println("That is not a valid option.");
            }
        }
    }
}
