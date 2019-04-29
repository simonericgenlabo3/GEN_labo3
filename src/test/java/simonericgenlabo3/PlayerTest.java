package simonericgenlabo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @BeforeAll
    public static void playerCreationTest(){
        Piece piece = new Piece("test", new RegularSquare("1"));
        Die dice [] = {new Die(), new Die()};
        Board board = new Board();
        Player player = new Player("player one", piece, dice, board);
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
}
