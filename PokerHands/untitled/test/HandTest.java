import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HandTest {

    @Test
    public void testHighCard() {
        List<Card> cards = Arrays.asList(
                new Card('H', (char) 2),
                new Card('D', (char) 5),
                new Card('S', (char) 9),
                new Card('H', (char) 7),
                new Card('S', (char) 3)
        );
        Hand hand = new Hand(cards);
        assertEquals(Hand.HandRank.HIGH_CARD, hand.getRank());
    }

    @Test
    public void testStraight() {
        List<Card> cards = Arrays.asList(
                new Card('H', (char) 2),
                new Card('D', (char) 3),
                new Card('S', (char) 4),
                new Card('C', (char) 5),
                new Card('H', (char) 6)
        );
        Hand hand = new Hand(cards);
        assertEquals(Hand.HandRank.STRAIGHT, hand.getRank());
    }

    @Test
    public void testThreeOfAKind() {
        List<Card> cards = Arrays.asList(
                new Card('H', (char) 2),
                new Card('D', (char) 2),
                new Card('S', (char) 2),
                new Card('C', (char) 5),
                new Card('H', (char) 9)
        );
        Hand hand = new Hand(cards);
        assertEquals(Hand.HandRank.THREE_OF_A_KIND, hand.getRank());
    }

    @Test
    public void testPair() {
        List<Card> cards = Arrays.asList(
                new Card('H', (char) 2),
                new Card('D', (char) 2),
                new Card('S', (char) 5),
                new Card('C', (char) 9),
                new Card('H', (char) 4)
        );
        Hand hand = new Hand(cards);
        assertEquals(Hand.HandRank.PAIR, hand.getRank());
    }

    @Test
    public void testTwoPair() {
        List<Card> cards = Arrays.asList(
                new Card('H', (char) 2),
                new Card('D', (char) 2),
                new Card('S',  (char) 5),
                new Card('C',  (char) 5),
                new Card('H', (char) 4)
        );
        Hand hand = new Hand(cards);
        assertEquals(Hand.HandRank.TWO_PAIR, hand.getRank());
    }





    @Test
    public void testFlush() {
        List<Card> cards = Arrays.asList(
                new Card('H', (char) 2),
                new Card('H', (char) 5),
                new Card('H', (char) 8),
                new Card('H', (char) 7),
                new Card('H', (char) 9)
        );
        Hand hand = new Hand(cards);
        assertEquals(Hand.HandRank.FLUSH, hand.getRank());
    }

    @Test
    public void testFullHouse() {
        List<Card> cards = Arrays.asList(
                new Card('H', (char) 2),
                new Card('D', (char) 2),
                new Card('S',(char) 2),
                new Card('C', (char) 5),
                new Card('H', (char) 5)
        );
        Hand hand = new Hand(cards);
        assertEquals(Hand.HandRank.FULL_HOUSE, hand.getRank());
    }

}