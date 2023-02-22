package Nimm_6;

import java.util.List;

abstract public class AbstractPlayer implements Comparable<AbstractPlayer> {
    protected Hand hand;
    private HornedOxPile hornedOxPile = new HornedOxPile();
    protected Card selectedCard;
    private int score = 0;
    private String name;

    public AbstractPlayer(String name) {
        this.name = name;
    }

    abstract public void chooseCard();

    public void deal(List<Card> cards) {
        hand = new Hand(cards);
    }

    public Card getSelectedCard() {
        return selectedCard;
    }

    public void takeCards(List<Card> cards) {
        hornedOxPile.addCards(cards);
    }

    public int countScore() {
        score += hornedOxPile.getScore();
        return score;
    }

    public int getScore() {
        return score;
    }

    public void setupHornOxPile() {
        this.hornedOxPile = new HornedOxPile();
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(AbstractPlayer o) {
        return selectedCard.compareTo(o.selectedCard);
    }

    public abstract Row chooseRow(List<Row> rowList);

    @Override
    public String toString() {
        return "Name: " + name + " Score: " + score;
    }
}
