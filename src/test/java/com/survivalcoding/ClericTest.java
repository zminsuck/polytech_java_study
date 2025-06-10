package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("기도를 하면 기도 (초)만큼 mp를 회복")
    void selfAid() {
        final Cleric cleric = new Cleric ();

        assertEquals(5, cleric.mp);
        assertEquals(50, cleric.hp);
    }
}