public class Card {
    private char suit;
    private char value;

    // card suit and value is set once created
    // constructor - suit, value

    public Card(char suit, char value) {
        this.suit = suit;
        this.value = value;
    }
    public char getSuit() {
        return suit;
    }

    public char getValue() {
        return value;
    }

    // string of card

    @Override
    public String toString() {
        return "" + value + suit;
    }


}
