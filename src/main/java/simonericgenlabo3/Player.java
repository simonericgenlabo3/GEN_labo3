package simonericgenlabo3;

public class Player {

    private String name;
    private Piece piece;
    private Die[] dice;
    private Board board;
    private int cash = 1500; // each player receives $1500 at the beginning of the game

    Player(String name, Piece piece, Die dice [], Board board){
        this.name = name;
        this.piece = piece;
        this.dice = dice;
        this.board = board;
    }

    public void takeTurn(){
        int fvTot = 0;
        for (int i = 0; i < dice.length; i++){
            dice[i].roll();
            fvTot += dice[i].getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
    }
}
