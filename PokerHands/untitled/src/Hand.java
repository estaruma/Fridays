import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hand {
    private final List<Card> cards;

    public Hand(List<Card> cards) {
        if (cards == null || cards.size() != 5) {
            throw new IllegalArgumentException("Must have 5 cards");
        }
        this.cards = new ArrayList<>(cards);
        // Compare by value first
        // If values are the same, compare by suit
        Collections.sort(this.cards, Comparator.comparingInt(Card::getValue).thenComparingInt(Card::getSuit));
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

    public HandRank getRank() {
        // Rank of hand

        if (isStraightFlush()) return HandRank.STRAIGHT_FLUSH;
        if (isFourOfAKind()) return HandRank.FOUR_OF_A_KIND;
        if (isFullHouse()) return HandRank.FULL_HOUSE;
        if (isFlush()) return HandRank.FLUSH;
        if (isStraight()) return HandRank.STRAIGHT;
        if (isThreeOfAKind()) return HandRank.THREE_OF_A_KIND;
        if (isTwoPair()) return HandRank.TWO_PAIR;
        if (isPair()) return HandRank.PAIR;
        return HandRank.HIGH_CARD;
    }

    private boolean isFlush() {
        char suit = cards.get(0).getSuit();
        return cards.stream().allMatch(card -> card.getSuit() == suit);
    }

    private boolean isStraight() {
        for (int i = 0; i < cards.size() - 1; i++) {
            if (cards.get(i).getValue() + 1 != cards.get(i + 1).getValue()) {
                return false;
            }
        }
        return true;
    }

    private boolean isStraightFlush() {
        return isFlush() && isStraight();
    }

    private boolean isFourOfAKind() {
        Map<Character, Long> valueCount = cards.stream()
                .collect(Collectors.groupingBy(Card::getValue, Collectors.counting()));
        return valueCount.containsValue(4L);
    }

    private boolean isFullHouse() {
        Map<Character, Long> valueCount = cards.stream()
                .collect(Collectors.groupingBy(Card::getValue, Collectors.counting()));
        return valueCount.containsValue(3L) && valueCount.containsValue(2L);
    }

    private boolean isThreeOfAKind() {
        Map<Character, Long> valueCount = cards.stream()
                .collect(Collectors.groupingBy(Card::getValue, Collectors.counting()));
        return valueCount.containsValue(3L) && !valueCount.containsValue(2L);
    }

    private boolean isTwoPair() {
        Map<Character, Long> valueCount = cards.stream()
                .collect(Collectors.groupingBy(Card::getValue, Collectors.counting()));
        return valueCount.values().stream().filter(count -> count == 2).count() == 2;
    }

    private boolean isPair() {
        Map<Character, Long> valueCount = cards.stream()
                .collect(Collectors.groupingBy(Card::getValue, Collectors.counting()));
        return valueCount.containsValue(2L);
    }

    @Override
    public String toString() {
        return cards.toString();
    }

    public enum HandRank {
        HIGH_CARD,
        PAIR,
        TWO_PAIR,
        THREE_OF_A_KIND,
        STRAIGHT,
        FLUSH,
        FULL_HOUSE,
        FOUR_OF_A_KIND,
        STRAIGHT_FLUSH
    }
}