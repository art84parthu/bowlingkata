package coding.kata.bowling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game = new Game();

    @Test
    public void knockLessThan10PinsInARoll() {
        game.roll(7);
        assertEquals(7, game.score());
        game.roll(6);
        assertEquals(13, game.score());
    }

}
