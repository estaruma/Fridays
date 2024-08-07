import java.util.ArrayList;
import java.util.List;

public class Basket {

    //  store shoppingBag objects
    private List<ShoppingBag> items = new ArrayList<>();
    private Discount discount;
    private BookSeries bookSeries;

    public Basket(BookSeries bookSeries, Discount discount) {
        this.bookSeries = bookSeries;
        this.discount = discount;
    }

    // Add shoppingBag item to items list
    public void addItem(ShoppingBag item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        List<Book> differentBooks = new ArrayList<>();

        // loop over each shoppingBag in items list and add to totalPrice
        // checkes if differentBook is not alLready in shopping ba and adds to different books
        for (ShoppingBag bag : items) {
            totalPrice += bag.getTotalPrice();
            Book book = bag.getBook();
            if (!differentBooks.contains(book)) {
                differentBooks.add(book);
            }
        }

        // unique books
        // use dicount class

        int numOfDifferentBooks = differentBooks.size();
        return discount.applyDiscount(numOfDifferentBooks, totalPrice);
    }

    // use stringbuilder

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Basket contents:\n");
        for (ShoppingBag item : items) {
            sb.append(item).append("\n");
        }
        sb.append("Total price after discount: ").append(getTotalPrice());
        return sb.toString();
    }
}




    // add items, calc total cost, apply discounts






    // One copy of any of the five books costs 8 EUR - shopping bag class





    // Note that if you buy, say, four books, of which 3 are different titles, you get a 10% discount on the 3 that form part of a set, but the fourth book still costs 8 EUR.
// shopping bag class



