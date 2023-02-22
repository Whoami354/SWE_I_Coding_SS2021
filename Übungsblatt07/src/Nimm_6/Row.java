package Nimm_6;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private List<Card> rowCards;

    public int getScore() {
        int sum = 0;
        for (Card card : rowCards) {
            sum += card.getHorns();
        }
        return sum;
    }

    public boolean canAddCard(Card c) {
        return !(c.getaValue() < rowCards.get(0).getaValue());
    }

    public void setupWithCard(Card c) {
        rowCards = new ArrayList<>();
        rowCards.add(c);
    }

    public Card getactualCard() {
        return rowCards.get(0);
    }

    public void addCard(Card card) {
        rowCards.add(0, card);
    }

    public boolean isFull() {
        return (rowCards.size() == 5);
    }

    public List<Card> getRowCards() {
        return rowCards;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = rowCards.size() - 1; i >= 0; i--) {
            result.append(rowCards.get(i));
        }
        return result.toString();
    }
}
