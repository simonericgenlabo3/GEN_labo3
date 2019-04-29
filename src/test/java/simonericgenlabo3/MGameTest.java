package simonericgenlabo3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for Board
 */
public class MGameTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 9, Integer.MAX_VALUE})
    void invalidPlayerNumberShouldThrowAnException(int number) {
        assertThrows(IllegalArgumentException.class, () -> {
            new MGame(number);
        });
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5, 6, 7, 8})
    void shouldCreateBoardWithValidNumberOfPlayer(int number) {
        MGame mgame = new MGame(number);
        assertNotNull(mgame);
    }
}