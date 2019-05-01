package simonericgenlabo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class PlayerTest {

    @BeforeAll
    public static void playerCreationTest(){
        Piece piece = new Piece("test", new Square("1"));
        Die dice [] = {new Die(), new Die()};
        Board board = new Board();
        Player player = new Player("player one", piece, dice, board);
        assertNotNull(player);
    }

    @Test
    public void playerShouldMoveAfterATurn(){
        Piece piece = new Piece("test", new Square("Go"));
        Die die1 = mock(Die.class);
        when(die1.getFaceValue()).thenReturn(3);
        Die dice [] = {die1, die1};
        Board board = new Board();
        Player player = new Player("player one", piece, dice, board);
        player.takeTurn();
        assertEquals("Square 6", piece.getLocation().getName());
    }
}
