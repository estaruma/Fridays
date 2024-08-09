public class Book {
    private String title;
    private double price;


    // construction for price and title

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // access title and price and return title and price
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title;
    }

    // equals between instance of a class between different collections
    // same title - same book
    // hashmap/ Hashset
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        // check if class of current object is the same as the class of object
        if (object == null || getClass() !=object.getClass()) return false;
        Book book = (Book) object;
        return title.equals(book.title);
    }




}
