import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DeckTest {
    private Deck deck;
    private List<Card> originalOrder;


    // new deck each time
    @BeforeEach
    public void setUp() {
        deck = new Deck();
        originalOrder = new ArrayList<>(deck.getCards());
    }

    @Test
    public void deckShuffleTest() {
        deck.shuffleCards();
    }

    @Test
    public void testDeckInitialization() {
        assertEquals(52, deck.getCards().size(), "Deck should have 52 cards initially.");
    }

    @Test
    public void testDeskEmpty() {
        deck.deal(52);
        assertTrue(deck.isEmpty(), "All cards dealt and deck should be empty");
    }


}