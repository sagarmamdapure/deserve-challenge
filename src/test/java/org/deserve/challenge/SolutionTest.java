package org.deserve.challenge;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SolutionTest {

    public void tearDown() {
    }

    @Test
    public void testSolution() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(5);
        HashMap<Integer, Integer> snakes = new HashMap<>();
        snakes.put(6, 2);
        Board board = new Board(1, 100, snakes);
        assertEquals(board.play(dice.roll()), 2);
    }

    @Test
    public void testEndToEndSolution() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(5);
        HashMap<Integer, Integer> snakes = new HashMap<>();
        snakes.put(11, 2);
        Board board = new Board(1, 100, snakes);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(board.play(dice.roll()));
        }
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6, 2, 7, 12, 17, 22, 27, 32, 37, 42));
        assertEquals(result, expected);
    }

    @Test
    public void testMaxPosition() {
        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(100);
        HashMap<Integer, Integer> snakes = new HashMap<>();
        snakes.put(11, 2);
        Board board = new Board(1, 100, snakes);
        assertEquals(-1, board.play(dice.roll()));
    }
}