import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    private Basket basket;
    private Discount discount;

    @BeforeEach
    public void setUp() {
        // Initialize the discount and basket before each test
        discount = new Discount();
        basket = new Basket(discount);
    }

    @Test
    public void testAddSingleItem() {
        Book book1 = new Book("Book 1", 8.0);
        ShoppingBag bag1 = new ShoppingBag(book1, 1);

        basket.addItem(bag1);
        double totalPrice = basket.getTotalPrice();

        assertEquals(8.0, totalPrice);
    }

    @Test
    public void testAddMultipleSameBooks() {
        Book book1 = new Book("Book 1", 8);
        ShoppingBag bag1 = new ShoppingBag(book1, 3);

        basket.addItem(bag1);
        double totalPrice = basket.getTotalPrice();

        assertEquals(24, totalPrice);
    }

    @Test
    public void testDiscountForFiveDifferentBooks() {
        Book book1 = new Book("Book 1", 8.0);
        Book book2 = new Book("Book 2", 8.0);
        Book book3 = new Book("Book 3", 8.0);
        Book book4 = new Book("Book 4", 8.0);
        Book book5 = new Book("Book 5", 8.0);

        basket.addItem(new ShoppingBag(book1, 1));
        basket.addItem(new ShoppingBag(book2, 1));
        basket.addItem(new ShoppingBag(book3, 1));
        basket.addItem(new ShoppingBag(book4, 1));
        basket.addItem(new ShoppingBag(book5, 1));

        double totalPrice = basket.getTotalPrice();

        double expectedTotal = (8.0 + 8.0 + 8.0 + 8.0 + 8.0) * 0.75;
        assertEquals(expectedTotal, totalPrice);
    }

    @Test
    public void testToStringMethod() {
        Book book1 = new Book("Book 1", 10.0);
        ShoppingBag bag1 = new ShoppingBag(book1, 1);
        basket.addItem(bag1);

        String basketContents = basket.toString();


        assertTrue(basketContents.contains("Basket contents:"), "Basket contents:.");
        assertTrue(basketContents.contains("Book 1"), "Book 1");
        assertTrue(basketContents.contains("Total price after discount:"), "Total price after discount:");
    }
}