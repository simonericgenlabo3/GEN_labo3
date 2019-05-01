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
}