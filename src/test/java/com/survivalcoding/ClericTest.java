package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClericTest {

    @Test
    @DisplayName("mp를 소모하여 체력을 MAX_HP 만큼 회복")
    void selfAid() {
        final Cleric cleric = new Cleric ();
        cleric.selfAid();

        assertEquals(5, cleric.mp);
        assertEquals(50, cleric.hp);
    }
}