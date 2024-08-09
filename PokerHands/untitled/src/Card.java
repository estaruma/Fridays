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

    // Convert card value to an integer for comparison
    public int getValueRank() {
        switch (value) {
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case 'T': return 10;  // T stands for 10
            case 'J': return 11;
            case 'Q': return 12;
            case 'K': return 13;
            case 'A': return 14;
            default: throw new IllegalArgumentException(value + "is in invalid.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (suit != card.suit) return false;
        return value == card.value;
    }

    // generates hashcode for card object

    @Override
    public int hashCode() {
        // intialises the hashcode
        int result = (int) suit;
        result = 31 * result + (int) value;
        return result;
    }


}
