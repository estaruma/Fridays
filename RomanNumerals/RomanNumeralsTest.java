import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    public void test1returnsI() {
        assertEquals("I", RomanNumerals.romanNumerals(1));
    }

    @Test
    public void test2ReturnsII() {
        assertEquals("II", RomanNumerals.romanNumerals(2));
    }

    @Test
    public void test3ReturnsIII() {
        assertEquals("III", RomanNumerals.romanNumerals(3));
    }

    @Test
    public void test4ReturnsIV() {
        assertEquals("IV", RomanNumerals.romanNumerals(4));
    }

    @Test
    public void test5ReturnsV() {
        assertEquals("V", RomanNumerals.romanNumerals(5));
    }

    @Test
    public void test6ReturnsVI() {
        assertEquals("VI", RomanNumerals.romanNumerals(6));
    }

    @Test
    public void test7ReturnsVII() {
        assertEquals("VII", RomanNumerals.romanNumerals(7));
    }

    @Test
    public void test8ReturnsVIII() {
        assertEquals("VIII", RomanNumerals.romanNumerals(8));
    }

    @Test
    public void test9ReturnsIX() {
        assertEquals("IX", RomanNumerals.romanNumerals(9));
    }

    @Test
    public void test10ReturnsX() {
        assertEquals("X", RomanNumerals.romanNumerals(10));
    }

    @Test
    public void testThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumerals.romanNumerals(11);
        });
    }
}
