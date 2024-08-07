public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1 ", 8.0);
        Book book2 = new Book("Book 2 ", 8.0);
        Book book3 = new Book("Book 3 ", 8.0);
        Book book4 = new Book("Book 4 ", 8.0);
        Book book5 = new Book("Book 5 ", 8.0);


        BookSeries bookSeries = new BookSeries();
        bookSeries.addBook(book1);
        bookSeries.addBook(book2);
        bookSeries.addBook(book3);
        bookSeries.addBook(book4);
        bookSeries.addBook(book5);

        Discount discount = new Discount(0, 0);

        Basket basket = new Basket(bookSeries, discount);

        basket.addItem(new ShoppingBag(book1, 1));
        basket.addItem(new ShoppingBag(book2, 1));
        basket.addItem(new ShoppingBag(book3, 1));
        basket.addItem(new ShoppingBag(book4, 1));
        basket.addItem(new ShoppingBag(book5, 1));

        System.out.println(basket);


    }
}