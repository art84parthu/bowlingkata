package coding.kata.bowling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game = new Game();

    @Test
    public void test0Score() {
        doRolls(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void test1Score() {
        doRolls(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void testSpare() {
        rollSpare();
        doRolls(18, 1);
        assertEquals(29, game.score());
    }


    @Test
    public void testStrike() {
        rollStrike();
        doRolls(18, 1);
        assertEquals(30, game.score());
    }

    @Test
    public void testAllStrikes() {
        doRolls(12, 10);
        assertEquals(300, game.score());
    }

    private void rollStrike() {
        game.roll(10);
    }

    private void rollSpare() {
        game.roll(8);
        game.roll(2);
    }

    private void doRolls(int numberOfTimes, int pinsKnockedDown) {
        for (int i = 0; i < numberOfTimes; i++) {
            game.roll(pinsKnockedDown);
        }
    }
}
