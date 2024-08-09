import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountTest {

    @Test
    public void NoDiscountTest() {
        Discount discount = new Discount();
        double totalPrice = 8.0;
        int numOfDifferentBooks = 1;

        double expectedPrice = 8.0;
        assertEquals(expectedPrice, discount.applyDiscount(numOfDifferentBooks, totalPrice), 0.0);
    }

    @Test
    public void fivePercentDiscountTest() {
        Discount discount = new Discount();
        double totalPrice = 16.0;
        int numOfDifferentBooks = 2;

        double expectedPrice = 16.0 * 0.95;
        assertEquals(expectedPrice, discount.applyDiscount(numOfDifferentBooks, totalPrice));
    }

    @Test
    public void tenPercentDiscountTest() {
        Discount discount = new Discount();
        double totalPrice = 24.0;
        int numOfDifferentBooks = 3;

        double expectedPrice = 24.0 * 0.90;
        assertEquals(expectedPrice, discount.applyDiscount(numOfDifferentBooks, totalPrice));
    }

    @Test
    public void twentyPercentDiscountTest() {
        Discount discount = new Discount();
        double totalPrice = 32.0;
        int numOfDifferentBooks = 4;

        double expectedPrice = 32.0 * 0.80;
        assertEquals(expectedPrice, discount.applyDiscount(numOfDifferentBooks, totalPrice));
    }

    @Test
    public void twentyFivePercentDiscountTest() {
        Discount discount = new Discount();
        double totalPrice = 40.0;
        int numOfDifferentBooks = 5;

        double expectedPrice = 40.0 * 0.75;
        assertEquals(expectedPrice, discount.applyDiscount(numOfDifferentBooks, totalPrice));
    }

    @Test
    public void fiveOrMoreDiscountTest() {
        Discount discount = new Discount();
        double totalPrice = 48.0;
        int numOfDifferentBooks = 6;

        double expectedPrice = 48.0;
        assertEquals(expectedPrice, discount.applyDiscount(numOfDifferentBooks, totalPrice));
    }


}