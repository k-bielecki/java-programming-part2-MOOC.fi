import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add (Card card) {
        cards.add(card);
    }

    public void print() {
        cards.stream()
                .forEach(o-> System.out.println(o));
    }

    public void sort(){
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        Collections.sort(this.cards, comparator);
    }

    public int compareTo(Hand hand) {
        if (this.sumOfHand() == hand.sumOfHand()) {
            return 0;
        }
        if (this.sumOfHand() < hand.sumOfHand()) {
            return -1;
        }
        return 1;
    }

    public int sumOfHand() {
        int sum = this.cards.stream()
                .mapToInt(o-> o.getValue())
                .sum();
        return sum;
    }

    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
    }
}
