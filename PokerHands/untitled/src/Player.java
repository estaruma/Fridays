import java.util.List;

public class Player {
    private String name;
    private Hand hand;


    // Constructor
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }


    // play info
    public void display() {
        System.out.println("Player: " + name);
        if (hand != null) {
            System.out.println("Hand: " + hand);
            System.out.println("Rank: " + hand.getRank());
        } else {
            System.out.println("Hand: No hand assigned");
        }
    }

    public static void main(String[] args) {
        // Example usage
        List<Card> cards = List.of(
                new Card('H', 'A'),
                new Card('H', 'K'),
                new Card('H', 'Q'),
                new Card('H', 'J'),
                new Card('H', 'T')
        );

        Hand hand = new Hand(cards);

        Player player = new Player("Bill Bob");
        player.setHand(hand);
        player.display();
    }
}
