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

        // first square should be named "Go"
        if(repetitionInfo.getCurrentRepetition() == 0) {
            assertEquals("Go", square.getName());
        } else {
            assertEquals("Square " + repetitionInfo.getCurrentRepetition(), square.getName());
        }
    }

    @Test
    public void getSquareShouldReturnCorrectSquare() {
        assertEquals(new RegularSquare("Square 10"), board.getSquare(new RegularSquare("Square 4"), 6));

        // exceeding 39
        assertEquals(new GoSquare(), board.getSquare(new RegularSquare("39"), 1));
    }
}