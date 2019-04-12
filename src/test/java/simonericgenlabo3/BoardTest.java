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
    Square goSquare;
    Board board;

    @BeforeEach
    public void createDummyObjects() {
         board = new Board();
    }

    @RepeatedTest(40)
    public void boardCreateSquares(RepetitionInfo repetitionInfo) {
        Square square = board.getSquare(goSquare, repetitionInfo.getCurrentRepetition());

        // first square should be named "Go"
        if(repetitionInfo.getCurrentRepetition() == 1) {
            assertEquals("Go", square.getName());
        } else {
            assertEquals("Square " + (repetitionInfo.getCurrentRepetition() - 1), square.getName());
        }
    }
}