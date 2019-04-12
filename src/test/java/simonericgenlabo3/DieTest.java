package simonericgenlabo3;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DieTest {

    @BeforeAll
    public static void dieCreationTest(){
        System.out.println("helo");
        Die die = new Die();
        assertNotNull(die);
    }

    @Test
    @RepeatedTest(100)
    public void faceValueMustBeBetween1and6 (){
        Die die = new Die();

        assertTrue(((die.getFaceValue() < 7) && (die.getFaceValue() > 0)));
        die.roll();
        assertTrue(((die.getFaceValue() < 7) && (die.getFaceValue() > 0)));
    }
}
