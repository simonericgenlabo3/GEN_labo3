package simonericgenlabo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for squares
 */
public class IncomeTaxSquareTest {

    @Test
    public void incomeTaxSquareShouldBeNamedIncomeTax() {
        assertEquals("IncomeTax", new IncomeTaxSquare().getName());
    }

    @Test
    public void incomeTaxSquareShouldReducePlayerWorth(){
        Die dice[] = {new Die(), new Die()};
        Cup cup = new Cup(dice);
        Board board = new Board();
        Player player = new Player(("Player" ), new Piece(("Piece"), new GoSquare()), cup, board);
        int oldCash = player.getNetWorth();
        player.setLocation(new IncomeTaxSquare());
        assertEquals(oldCash-200, player.getNetWorth());
        player.addCash(700);
        oldCash = player.getNetWorth();
        player.setLocation(new IncomeTaxSquare());
        assertEquals(oldCash-200, player.getNetWorth());
        player.addCash(1200);
        oldCash = player.getNetWorth();
        player.setLocation(new IncomeTaxSquare());
        assertEquals(oldCash-300, player.getNetWorth());
    }
}