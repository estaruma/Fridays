import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Basket {

    //  store shoppingBag objects
    private List<ShoppingBag> items = new ArrayList<>();


    // used to apply discount
    private Discount discount;

    public Basket(Discount discount) {
        this.discount = discount;
    }

    // Add shoppingBag item to items list

    public void addItem(ShoppingBag item) {
        items.add(item);
    }

    public double getTotalPrice() {
        Map<Book, Integer> bookCounts = getBookCounts();
        return calculateOptimisedPrics(bookCounts);
    }

    // unique books
    // use discount class
    private Map<Book, Integer> getBookCounts() {
        Map<Book, Integer> bookCounts = new HashMap<>();
        for (ShoppingBag bag : items) {
            Book book = bag.getBook();
            int quantity = bag.getQuantity();
            bookCounts.put(book, bookCounts.getOrDefault(book, 0) + quantity);
        }
        return bookCounts;
    }

    // maximise the applying of discounts

    private double calculateOptimisedPrics(Map<Book, Integer> bookCounts) {
        double totalPrice = 0.0;
        while (!bookCounts.isEmpty()) {
            int setSize = Math.min(bookCounts.size(), 5);
            totalPrice += calculatePriceForSet(bookCounts, setSize);
        }
        return totalPrice;
    }

    private double calculatePriceForSet(Map<Book, Integer> bookCounts, int setSize) {
        int booksInSet = 0;
        double setPrice = 0.0;

        //iterator to safely remove entries
        Iterator<Map.Entry<Book, Integer>> iterator = bookCounts.entrySet().iterator();

        while (iterator.hasNext() && booksInSet < setSize) {
            Map.Entry<Book, Integer> entry = iterator.next();
            Book book = entry.getKey();
            int quantity = entry.getValue();

            if (quantity > 0) {
                booksInSet++;
                setPrice += book.getPrice();

                // Update quantity or remove book
                if (quantity == 1) {
                    iterator.remove();
                } else {
                    // Update the quantity
                    entry.setValue(quantity - 1);
                }
            }
        }
        return discount.applyDiscount(booksInSet, setPrice);
    }




//        // Iterate over the entries
//        for (Map.Entry<Book, Integer> entry : bookCounts.entrySet()) {
//            // Stop if there is a set
//            if (booksInSet >= setSize) {
//                break;
//            }
//
//            // Get the current book and its quantity
//            Book book = entry.getKey();
//            int quantity = entry.getValue();
//
//            // If there are copies of this book available
//            if (quantity > 0) {
//                booksInSet++;
//                setPrice += book.getPrice();
//
//                // update quantity  or remove book
//
//                if (quantity == 1) {
//                    // remove so map wouldnt show there is still a copy available
//                    bookCounts.remove(book);
//                } else {
//                    // if greater than 1, decremement by 1
//                    entry.setValue(quantity - 1);
//                }
//            }
//        }
//
//        // Calculate the discounted price for this set of books
//        return discount.applyDiscount(booksInSet, setPrice);
//    }
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


