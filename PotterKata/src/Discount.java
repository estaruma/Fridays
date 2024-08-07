public class Discount {
    private int numOfBooks;

    private double percentage;


    // constructor
    public Discount(int numOfBooks, double percentage) {
        this.numOfBooks = numOfBooks;
        this.percentage = percentage;
    }

    // getter for numofBooks
    public int getNumOfBooks() {
        return numOfBooks;
    }

    // getter for discount
    public double getPercentage() {
        return percentage;
    }


    // method to apply different discounts

    public double applyDiscount(int numOfDifferentBooks, double totalPrice) {
        double percentage;

        // If, however, you buy two different books from the series, you get a 5% discount on those two books.
        if (numOfDifferentBooks == 2) {
            return totalPrice * 0.95;
            // If you buy 3 different books, you get a 10% discount.
        } else if (numOfDifferentBooks == 3) {
            return totalPrice * 0.90;
            // With 4 different books, you get a 20% discount.
        } else if (numOfDifferentBooks == 4) {
            return totalPrice * 0.80;
            // If you go the whole hog, and buy all 5, you get a huge 25% discount.
        } else if (numOfDifferentBooks == 5) {
            return totalPrice * 0.75;
        } else {
            return totalPrice;
        }

    }


}
