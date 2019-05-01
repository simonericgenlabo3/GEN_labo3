package simonericgenlabo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for squares
 */
public class RegularSquareTest {

    @Test
    public void constructor() {
        assertEquals("Square 2", new RegularSquare("Square 2").getName());
    }
}