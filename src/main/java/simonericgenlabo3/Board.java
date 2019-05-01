package simonericgenlabo3;

import java.util.ArrayList;

public class Board {
    private String name;
    private ArrayList<Square> squares = new ArrayList<Square>();

    public Board() {
        final int GO_SQUARE         = 0;
        final int INCOME_TAX_SQUARE = 4;
        final int GO_TO_JAIL_SQUARE = 30;

        for(int i = 0; i < 40; ++i) {
            if(i == GO_SQUARE) {
                squares.add(new GoSquare());
            } else if(i == INCOME_TAX_SQUARE) {
                squares.add(new IncomeTaxSquare());
            } else if(i == GO_TO_JAIL_SQUARE) {
                squares.add(new GoToJailSquare());
            } else {
                squares.add(new RegularSquare("Square " + i));
            }
        }
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        return squares.get((squares.indexOf(oldLoc) + fvTot) % 40);
    }
}
