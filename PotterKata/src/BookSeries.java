import java.util.ArrayList;
import java.util.List;

public class BookSeries {

    private List<Book> books;

    public BookSeries() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public int getNumberOfBooks() {
        return books.size();
    }

}
