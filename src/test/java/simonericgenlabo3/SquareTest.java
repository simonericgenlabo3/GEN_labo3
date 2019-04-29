package simonericgenlabo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for squares
 */
public class SquareTest {
    @Test
    public void constructor() {
        Square square = new Square("Square 1");
        assertEquals("Square 1", square.getName());
    }

    @Test
    public void sameSquaresShouldBeEquals() {
        Square square1 = new Square("Square 1");
        Square square2 = new Square("Square 1");

        assertTrue(square1.equals(square2));
    }

    @Test
    void twoDifferentSquaresShouldNotBeEquals() {
        Square square1 = new Square("Square 1");
        Square square2 = new Square("Square 2");

        assertFalse(square1.equals(square2));
    }
}