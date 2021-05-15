package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BedroomTest {



    @Test
    void testGetDescription() {
        Room bedroom = new Bedroom("Bedroom");
        String description = bedroom.getDescription();
        assertEquals("You are in a bedroom. There is a dresser to your left.", description);
    }
}