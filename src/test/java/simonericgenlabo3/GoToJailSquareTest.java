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

    @Test
    public void goToJailSquareShouldMoveThePlayerPieceToJailSquare (){
        Die dice[] = {new Die(), new Die()};
        Cup cup = new Cup(dice);
        Board board = new Board();
        Piece piece = new Piece(("Piece"), new GoSquare());
        Player player = new Player(("Player" ), piece, cup, board);
        player.setLocation(new GoToJailSquare());
        assertEquals("Square 10", piece.getLocation().getName());
    }
}