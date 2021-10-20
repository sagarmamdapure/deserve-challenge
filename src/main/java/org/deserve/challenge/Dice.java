package org.deserve.challenge;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private final boolean isCrooked;

    public Dice(boolean isCrooked) {
        this.isCrooked = isCrooked;
    }

    public int roll() {
        if (isCrooked) return ThreadLocalRandom.current().nextInt(1, 4) * 2;
        else return ThreadLocalRandom.current().nextInt(1, 7);
    }
}
