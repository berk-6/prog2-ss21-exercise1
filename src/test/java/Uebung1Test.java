import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Uebung1Test {

    @Test
    void checkPasswordTooShort() {
        boolean actual = Uebung1.checkPasswordLength("1234567");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void checkPasswordCorrectLength() {
        boolean actual = Uebung1.checkPasswordLength("1234567890");
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void checkPasswordTooLong() {
        boolean actual = Uebung1.checkPasswordLength("12345678901234567890123456");
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    void hasUpperCase() {
        boolean actual = Uebung1.checkUpperAndLowerCases("ABCDEFGHIJK");
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    void hasLowerCase() {
        boolean actual = Uebung1.checkUpperAndLowerCases("abcdefhje");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void hasDigit() {
        boolean actual = Uebung1.hasDigit("asfqwr124");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void hasSymbol() {
        boolean actual = Uebung1.hasSymbol("ASaksaf@");
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void continuousNumbers() {
        boolean actual = Uebung1.continuousNumbers("123");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void sameNumbers(){
        boolean actual = Uebung1.sameNumbersInARow("1111");
        boolean expected = false;
        assertEquals(expected, actual);
    }
}

/* Repo-Link: https://github.com/berk-6/prog2-ss21-exercise1 */