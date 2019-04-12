package simonericgenlabo3;

import java.util.Random;

public class Die {

    private int faceValue;
    private Random rand;
    Die(){
        rand = new Random();
        roll();
    }

    public int getFaceValue() {
        return faceValue;
    }

    void roll(){
        faceValue = rand.nextInt(5);
        faceValue++;
    }
}
