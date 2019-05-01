package simonericgenlabo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PieceTest {

    @BeforeAll
    public static void pieceCreationTest(){
        Piece piece = new Piece("test", new RegularSquare("1"));
        assertNotNull(piece);
    }

    @Test
    public void pieceGetSetLocationTest(){
        Square square1 = new RegularSquare("1");
        Square square2 = new RegularSquare("2");
        Piece piece = new Piece("test", square1);
        assertEquals(piece.getLocation().getName(), square1.getName());
        piece.setLocation(square2);
        assertEquals(piece.getLocation().getName(), square2.getName());
    }
}
