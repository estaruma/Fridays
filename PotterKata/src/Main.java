public class Main {
    public static void main(String[] args) {
        Discount discount = new Discount();

        Basket basket = new Basket(discount);

        Book book1 = new Book("Harry Potter 1 ", 8.0);
        Book book2 = new Book("Harry Potter 2 ", 8.0);
        Book book3 = new Book("Harry Potter 3 ", 8.0);

        // create shopping bags for each book
        ShoppingBag bag1 = new ShoppingBag(book1, 1);
        ShoppingBag bag2 = new ShoppingBag(book2, 2);
        ShoppingBag bag3 = new ShoppingBag(book3, 1);

        // add to basket

        basket.addItem(bag1);
        basket.addItem(bag2);
        basket.addItem(bag3);


        System.out.println(basket);
    }
}