package com.company;

public class isAnExit implements Exit{
    public boolean isExit() {
        return true;
    }

    public String exit() {
        return "You have exited the maze";
    }
}
