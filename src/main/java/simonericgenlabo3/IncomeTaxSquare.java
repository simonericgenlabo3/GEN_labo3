package simonericgenlabo3;

import static java.lang.Math.max;

public class IncomeTaxSquare extends Square {
    public IncomeTaxSquare() {
        super("IncomeTax");
    }

    @Override
    public void landedOn(Player player) {
        player.reduceCash(max(200,(int)(player.getNetWorth()*0.1)));
    }
}
