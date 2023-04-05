package leet;

import org.junit.jupiter.api.Test;

import static leet.RomeToInt.romeToInt;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomeToIntTest extends TwoSum {

    @Test
    void romeToIntTest() {
        assertEquals(58, romeToInt("LVIII"));
    }
}