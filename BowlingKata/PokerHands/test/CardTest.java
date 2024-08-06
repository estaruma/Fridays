import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    public void CardCreationTest() {
        Card card = new Card('C', '2');
        assertEquals('C', card.getSuit(), "Suit should be C");
        assertEquals('2', card.getValue(), "Suit should be 2");
    }

    @Test
    public void stringTes() {
        Card card = new Card('S', '3');
        assertEquals("3S", card.toString(), "This should be 3S");
    }

}