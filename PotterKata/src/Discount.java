import java.util.HashMap;
import java.util.Map;

public class Discount {
    private int numOfBooks;

    private double percentage;





    private static final double DISCOUNT_FOR_TWO_BOOKS = 0.05;
    private static final double DISCOUNT_FOR_THREE_BOOKS = 0.10;

    private static final double DISCOUNT_FOR_FOUR_BOOKS = 0.20;

    private static final double DISCOUNT_FOR_FIVE_BOOKS = 0.25;


    // mapping different books to the discount percentage
    private static final Map<Integer, Double> DISCOUNT_RATES = new HashMap<>();

    // static initialisation block
    // check for 2,3,4, 5 different books
    static {
        DISCOUNT_RATES.put(2, DISCOUNT_FOR_TWO_BOOKS);
        DISCOUNT_RATES.put(3, DISCOUNT_FOR_THREE_BOOKS);
        DISCOUNT_RATES.put(4, DISCOUNT_FOR_FOUR_BOOKS);
        DISCOUNT_RATES.put(5, DISCOUNT_FOR_FIVE_BOOKS);
    }


    // calculates and returns the discounted price based on the number of different books
    // totalPrice x 0.95
    public double applyDiscount(int numOfDifferentBooks, double totalPrice) {
        Double discountPercentage = DISCOUNT_RATES.get(numOfDifferentBooks);
        if (discountPercentage != null) {
            return totalPrice * (1 - discountPercentage);
        }
        return totalPrice;
    }
}
