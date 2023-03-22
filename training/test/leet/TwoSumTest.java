package leet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest extends TwoSum {

    @Test
    void testTwoSum() {
        int[] nums = {2,7,11,15};
        int[] actual = twoSum(nums, 9);

        int[] expected = {0, 1};

        Assertions.assertArrayEquals(expected, actual);
    }
}