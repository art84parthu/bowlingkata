package coding.kata.bowling;

public class Game {
    private int[] rolls = new int[21];
    private int rollIndex = 0;

    public void roll(int pinsKnockedDown) {
        rolls[rollIndex++] = pinsKnockedDown;
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(rollIndex)) {
                score += getStrikeScore(rollIndex);
            } else if (isSpare(rollIndex)) {
                score += getSpareScore(rollIndex);
            } else {
                score += getFrameScore(rollIndex);
            }
            rollIndex = getIndexOfRollInNextFrame(rollIndex);
        }
        return score;
    }

    private boolean isStrike(int i) {
        return rolls[i] == 10;
    }

    private int getIndexOfRollInNextFrame(int i) {
        if (isStrike(i)) {
            return i + 1;
        } else {
            return i + 2;
        }
    }

    private int getFrameScore(int i) {
        return rolls[i] + rolls[i + 1];
    }

    private int getSpareScore(int i) {
        return (10 + rolls[i + 2]);
    }

    private int getStrikeScore(int i) {
        return (10 + rolls[i + 1] + rolls[i + 2]);
    }

    private boolean isSpare(int i) {
        return getFrameScore(i) == 10;
    }
}
