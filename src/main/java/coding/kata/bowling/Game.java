package coding.kata.bowling;

public class Game {
    private int score;
    private int previousRoll = 0;

    public void roll(int pinsKnockedDown) {
        score += pinsKnockedDown;
        if (previousRoll == 10) {
            score += pinsKnockedDown;
        }
        previousRoll = pinsKnockedDown;
    }

    public int score() {
        return score;
    }
}
