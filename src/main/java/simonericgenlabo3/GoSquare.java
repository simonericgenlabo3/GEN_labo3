package simonericgenlabo3;

public class GoSquare extends Square {
    public GoSquare() {
        super("Go");
    }

    @Override
    public void landedOn(Player player) {
        player.addCash(200);
    }
}
