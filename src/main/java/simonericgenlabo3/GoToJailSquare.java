package simonericgenlabo3;

public class GoToJailSquare extends Square {
    public GoToJailSquare() {
        super("GoToJail");
    }

    @Override
    public void landedOn(Player player) {
        player.setLocation(new RegularSquare("Square 10"));
    }
}
