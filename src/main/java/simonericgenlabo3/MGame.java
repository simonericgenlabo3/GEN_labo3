package simonericgenlabo3;

import java.util.ArrayList;

public class MGame {
    static private int N = 20;
    private int roundCount = 0;
    private Die dice[] = new Die[2];
    private Board board = new Board();
    private ArrayList<Player> players = new ArrayList<Player>();

    public MGame(int nbOfPlayer) {
        if(nbOfPlayer < 2 || nbOfPlayer > 8) {
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < nbOfPlayer; ++i) {
            players.add(new Player(("Player" + i), new Piece(("Piece" + i), new Square("Go")), dice, board));
        }
    }

    public void playGame() {
        for(; roundCount < N; ++roundCount) {
            playRound();
        }
    }

    private void playRound() {
        for (Player player : players) {
            player.takeTurn();
        }
    }
}
