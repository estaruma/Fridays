import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzKataTest {
    @Test
    public void returnFizzBuzz() {
        assertEquals("1", FizzBuzzKata.fizzBuzz(1));
        assertEquals("2", FizzBuzzKata.fizzBuzz(2));
        assertEquals("Fizz", FizzBuzzKata.fizzBuzz(3));
        assertEquals("FizzBuzzBuzz", FizzBuzzKata.fizzBuzz(35));
        assertEquals("FizzBuzz", FizzBuzzKata.fizzBuzz(53));


    }


}