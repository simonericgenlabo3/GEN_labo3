package simonericgenlabo3;

import java.util.ArrayList;

public class Board {
    private String name;
    private ArrayList<Square> squares = new ArrayList<Square>();

    public Board() {
        // create squares
        squares.add(new GoSquare());

        for(int i = 1; i < 40; ++i) {
            squares.add(new RegularSquare("Square " + i));
        }
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        return squares.get((squares.indexOf(oldLoc) + fvTot) % 40);
    }
}
