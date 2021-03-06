package org.deserve.challenge;

import java.util.Map;

public class Board {
    private final Map<Integer, Integer> snakes;
    private final int maxPosition;
    private int currentPosition;

    public Board(int startPosition, int maxPosition, Map<Integer, Integer> snakes) {
        this.snakes = snakes;
        this.currentPosition = startPosition;
        this.maxPosition = maxPosition;
    }

    public int play(int faceValue) {
        this.currentPosition += faceValue;
        if (this.currentPosition >= maxPosition) {
            System.out.printf("Roll dice face value is %d, current position is %d. GAME OVER", faceValue, this.currentPosition);
            return -1;
        }
        if (snakes.containsKey(this.currentPosition)) {
            System.out.printf(
                    "Roll dice face value is %d, Snake bite at %d position, current position is %d\n",
                    faceValue, this.currentPosition, this.snakes.get(this.currentPosition));
            this.currentPosition = snakes.get(this.currentPosition);
        } else {
            System.out.printf(
                    "Roll dice face value is %d, current position is %d\n", faceValue, this.currentPosition);
        }
        return this.currentPosition;
    }
}