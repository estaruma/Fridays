import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void testGetTitle() {
        Book book = new Book("Harry Potter", 8.0);
        assertEquals("Harry Potter", book.getTitle());
    }

    @Test
    public void testGetPrice() {
        Book book = new Book("Harry Potter", 8.0);
        assertEquals(8.0, book.getPrice(), 0.0);
    }

    @Test
    public void testEquals() {
        Book book1 = new Book("Harry Potter", 8.0);
        Book book2 = new Book("Harry Potter", 10.0);
        Book book3 = new Book("Lord of the Rings", 8.0);
        assertTrue(book1.equals(book2));
        assertFalse(book1.equals(book3));
    }

}