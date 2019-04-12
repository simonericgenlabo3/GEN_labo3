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
}