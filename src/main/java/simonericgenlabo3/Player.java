package simonericgenlabo3;

public class Player {

    private String name;
    private Piece piece;
    private Cup cup;
    private Board board;
    private int cash = 1500; // each player receives $1500 at the beginning of the game

    public Player(String name, Piece piece, Cup cup, Board board){
        this.name = name;
        this.piece = piece;
        this.cup = cup;
        this.board = board;
    }

    public void takeTurn(){
        cup.roll();
        int fvTot = cup.getTotal();
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
    }

    public void setLocation(Square location) {
        piece.setLocation(location);
        location.landedOn(this);
    }

    public int getNetWorth() {
        return cash;
    }

    public void addCash(int cash) {
        this.cash += cash;
    }

    public void reduceCash(int cash) {
        this.cash -= cash;
    }
}
