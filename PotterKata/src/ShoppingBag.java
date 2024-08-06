public class ShoppingBag {
    private Book book;
    private int quantity;

    public ShoppingBag(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;

    }

    public void setBook() {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }

    // add book to shopping bag

    @Override
    public String toString() {
        return "Shopping bag: \n" + "Book: " + book + "Quantity: " + quantity;
    }


}