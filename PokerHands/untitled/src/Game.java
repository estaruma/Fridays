import java.util.ArrayList;
import java.util.List;

public class Game {
    private Deck deck;

    // holds players
    private List<Player> players;

    // checks for at least one player
    public Game(List<Player> players) {
        if (players == null || players.size() < 1) {
            throw new IllegalArgumentException("One player required");
        }
        this.players = new ArrayList<>(players);
        this.deck = new Deck();
    }

    public void start() {
        // Shuffle the deck
        deck.shuffleCards();

        // Deal 5 cards to each player
        for (Player player : players) {
            List<Card> handCards = deck.deal(5);
            Hand hand = new Hand(handCards);
        }

        // Display each player's hand and rank
        for (Player player : players) {
            player.display();
            System.out.println();
        }

        // Determine the winner
        determineWinner();
    }

    private void determineWinner() {
        Player winner = players.get(0);
        Hand.HandRank highestRank = winner.getHand().getRank();

        for (Player player : players) {
            Hand.HandRank rank = player.getHand().getRank();
            if (rank.ordinal() > highestRank.ordinal()) {
                winner = player;
                highestRank = rank;
            }
        }

        System.out.println("Winner: " + winner.getName() + " with a " + highestRank.name().replace('_', ' '));
    }
}