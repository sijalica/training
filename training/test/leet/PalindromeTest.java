package leet;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static leet.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest extends TwoSum {

    @ParameterizedTest
    @ValueSource(ints = {121, 91019})
    void checkIsPalindrome(int x) {
        assertTrue(isPalindrome(x));
    }
}