package simonericgenlabo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PieceTest {

    @BeforeAll
    public void PieceCreationTest(){
        Piece piece = new Piece("test", new Square("1"));
        assertNotNull(piece);
    }

    @Test
    public void PieceGetSetLocationTest(){
        Square square1 = new Square("1");
        Square square2 = new Square("2");
        Piece piece = new Piece("test", square1);
        assertEquals(piece.getLocation().getName(), square1.getName());
        piece.setLocation(square2);
        assertEquals(piece.getLocation().getName(), square2.getName());
    }
}
