package com.company;

public class isNotAnExit implements Exit{
    public boolean isExit() {
        return false;
    }

    public String exit() {
        return "This room is not an exit";
    }
}
