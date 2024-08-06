public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Book1");
        ShoppingBag item1 = new ShoppingBag(book1, 3);

        System.out.println("Book: " + item1.getBook());
        System.out.println("Quantity: " + item1.getQuantity());

    }
}