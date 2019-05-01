package simonericgenlabo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for squares
 */
public class GoToJailSquareTest {

    @Test
    public void goToJailSquareShouldBeNamedGoToJail() {
        assertEquals("GoToJail", new GoToJailSquare().getName());
    }
}