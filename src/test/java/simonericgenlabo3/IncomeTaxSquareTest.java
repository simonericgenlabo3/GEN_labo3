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
}