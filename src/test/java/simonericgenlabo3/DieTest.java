package simonericgenlabo3;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {

    @BeforeAll
    public static void dieCreationTest(){
        System.out.println("helo");
        Die die = new Die();
        assertNotNull(die);
    }

    @RepeatedTest(100)
    public void faceValueMustBeBetween1and6 (){
        Die die = new Die();

        assertTrue(((die.getFaceValue() < 7) && (die.getFaceValue() > 0)));
        die.roll();
        assertTrue(((die.getFaceValue() < 7) && (die.getFaceValue() > 0)));
    }
}
