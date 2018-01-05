package coding.kata.bowling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game = new Game();

    @Test
    public void rollsWithNoStrikeOrSpare() {
        game.roll(7);
        assertEquals(7, game.score());
        game.roll(6);
        assertEquals(13, game.score());
    }

    @Test
    public void strikeRoll() {
        game.roll(10);
        assertEquals(10, game.score());
        game.roll(7);
        assertEquals(24, game.score());
    }

}
