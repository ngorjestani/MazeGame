package com.company;

import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class HallwayTest {

    @org.junit.jupiter.api.Test
    void testGetDescription() {
        Room hallway = new Hallway("Hallway");
        String description = hallway.getDescription();
        assertEquals("You are in a long hallway. There is a door at the end. There is a shadow in front of it.", description);
    }
}