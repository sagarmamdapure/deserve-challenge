package org.deserve.challenge;

import junit.framework.TestCase;
import org.junit.Test;

public class DiceTest extends TestCase {

    @Test
    public void testRollNormalCase() {
        Dice dice = new Dice(false);
        int faceValue = dice.roll();
        assertTrue(faceValue >= 1 && faceValue <= 6);
    }

    @Test
    public void testRollCrookedCase() {
        Dice dice = new Dice(true);
        int faceValue = dice.roll();
        assertEquals(0, faceValue % 2);
        assertTrue(faceValue >= 1 && faceValue <= 6);
    }
}