package simonericgenlabo3;

public class Player {

    private String name;
    private Piece piece;
    private Die[] dice;

    Player(String name, Piece piece, Die dice []){
        this.name = name;
        this.piece = piece;
        this.dice = dice;
    }

    public void takeTurn(){
        int fvTot = 0;
        for (int i = 0; i < dice.length; i++){
            dice[i].roll();
            fvTot += dice[i].getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc ;
        piece.setLocation(newLoc);
    }
}
