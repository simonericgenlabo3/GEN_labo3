package simonericgenlabo3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for Board
 */
public class BoardTest {
    Board board;

    @BeforeEach
    public void createDummyObjects() {
         board = new Board();
    }

    @RepeatedTest(39)
    public void boardCreateSquares(RepetitionInfo repetitionInfo) {
        Square square = board.getSquare(new GoSquare(), repetitionInfo.getCurrentRepetition());

        final int GO_SQUARE         = 0;
        final int INCOME_TAX_SQUARE = 4;
        final int GO_TO_JAIL_SQUARE = 30;

        if(repetitionInfo.getCurrentRepetition() == GO_SQUARE) {
            assertEquals("Go", square.getName());
        } else if(repetitionInfo.getCurrentRepetition() == INCOME_TAX_SQUARE) {
            assertEquals("IncomeTax", square.getName());
        } else if(repetitionInfo.getCurrentRepetition() == GO_TO_JAIL_SQUARE) {
            assertEquals("GoToJail", square.getName());
        } else {
            assertEquals("Square " + repetitionInfo.getCurrentRepetition(), square.getName());
        }
    }

    @Test
    public void getSquareShouldReturnCorrectSquare() {
        assertEquals(new RegularSquare("Square 15"), board.getSquare(new RegularSquare("Square 5"), 10));

        // exceeding 39
        assertEquals(new GoSquare(), board.getSquare(new RegularSquare("39"), 1));
    }
}