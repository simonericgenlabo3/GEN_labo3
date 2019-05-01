package simonericgenlabo3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupTest {

    @BeforeAll
    public static void cupCreationTest(){
        Die dice[] = {new Die(), new Die()};
        Cup cup = new Cup(dice);
        assertNotNull(cup);
    }

    @RepeatedTest(100)
    public void totalFor2DieMustBeBetween2and12 (){
        Die dice[] = {new Die(), new Die()};
        Cup cup = new Cup(dice);

        assertTrue((cup.getTotal() > 1) && (cup.getTotal() < 13));
        cup.roll();
        assertTrue((cup.getTotal() > 1) && (cup.getTotal() < 13));
    }
}
