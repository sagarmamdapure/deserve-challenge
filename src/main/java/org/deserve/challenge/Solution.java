package org.deserve.challenge;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Dice dice = new Dice(false);
        HashMap<Integer, Integer> snakes = new HashMap<>();
        snakes.put(14, 7);
        Board board = new Board(0, 100, snakes);
        for (int i = 0; i < 10; i++) {
            board.play(dice.roll());
        }
    }
}