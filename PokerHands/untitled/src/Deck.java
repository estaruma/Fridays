import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    // list of cards
    private List<Card> cards;


    // deck - 52 cards:
    // dealing cards
    // shuffling
    public Deck() {
        // create array for the list of cards
        this.cards = new ArrayList<>();
        // for each of the 52 cards suits and values
        char[] suits = {'C', 'D', 'H', 'S'};
        char[] values = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};

        // initialise deck
        for (char suit : suits) {
            for (char value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    //shuffle the cards
    public void shuffleCards() {
        Collections.shuffle(cards);
    }

    //dealing the cards
    // deal a specified number of cards from the top of deck
    // remove the dealt cards from the deck
        public List<Card> deal(int numberOfCards) {
            //if there isnt enough cards
            if (numberOfCards > cards.size()) {
                throw new IllegalArgumentException("Not enough cards to deal");
            }
            List<Card> dealtCards = new ArrayList<>();

            for (int i = 0; i < numberOfCards; i++) {
                dealtCards.add(cards.remove(0));
            }
            return dealtCards;
        }

        public void dealAndPrint5Cards() {
        List<Card> hand = deal(5);
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    // getter for the cards list
    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

}
