package simonericgenlabo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for squares
 */
public class GoSquareTest {

    @Test
    public void goSquareShouldBeNamedGo() {
        assertEquals("Go", new GoSquare().getName());
    }

    @Test
    public void goSquareShouldAdd200ToPlayerCash(){
        Die dice[] = {new Die(), new Die()};
        Cup cup = new Cup(dice);
        Board board = new Board();
        Player player = new Player(("Player" ), new Piece(("Piece"), new GoSquare()), cup, board);
        int oldCash = player.getNetWorth();
        player.setLocation(new GoSquare());
        assertEquals((oldCash+200), player.getNetWorth());
    }
}