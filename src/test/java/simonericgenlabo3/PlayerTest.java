package simonericgenlabo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class PlayerTest {

    @BeforeAll
    public static void playerCreationTest(){
        Piece piece = new Piece("test", new RegularSquare("1"));
        Die dice [] = {new Die(), new Die()};
        Cup cup = new Cup(dice);
        Board board = new Board();
        Player player = new Player("player one", piece, cup, board);
        assertNotNull(player);
    }

    @Test
    public void playerShouldStartWith1500Dollars() {
        Player player = new Player("player one", null, null, null);
        assertEquals(1500, player.getNetWorth());
    }

    @Test
    public void addCash() {
        Player player = new Player("player one", null, null, null);
        player.addCash(200);
        assertEquals(1700, player.getNetWorth());
        player.addCash(150);
        assertEquals(1850, player.getNetWorth());
    }

    @Test
    public void reduceCash() {
        Player player = new Player("player one", null, null, null);
        player.reduceCash(200);
        assertEquals(1300, player.getNetWorth());
        player.reduceCash(1300);
        assertEquals(0, player.getNetWorth());
    }

    @Test
    public void playerShouldMoveAfterATurn() {
        Piece piece = new Piece("test", new GoSquare());
        Cup cup = mock(Cup.class);
        when(cup.getTotal()).thenReturn(3);
        Board board = new Board();
        Player player = new Player("player one", piece, cup, board);
        player.takeTurn();
        assertEquals("Square 3", piece.getLocation().getName());
    }
}
