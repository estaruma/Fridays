import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {


    @Test
    public void isYearDivisibleBy400() {
        assertTrue(LeapYear.isLeapYear(400), "400 is a Leap year");

    }

    @Test
    public void isYearDivisbleBy100ButNot400() {
        assertFalse(LeapYear.isLeapYear(2023), "2023 is not a leap year");
        assertFalse(LeapYear.isLeapYear(2100), "2100 is not a leap year");
    }

    @Test
    public void isYearDivisbleBy4ButNot100() {
        assertTrue(LeapYear.isLeapYear(2024), "2024 is a leap year");
    }

}