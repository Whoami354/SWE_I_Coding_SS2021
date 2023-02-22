package Nimm_6;

import java.util.ArrayList;
import java.util.List;

public class HornedOxPile {
    List<Card> cards = new ArrayList<>();

    public void addCards(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public int getScore() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getHorns();
        }
        return sum;
    }

}
