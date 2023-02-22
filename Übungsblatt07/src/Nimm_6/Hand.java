package Nimm_6;

import java.util.List;

public class Hand {
    private final List<Card> handcards;

    public Hand(List<Card> handcards) {
        this.handcards = handcards;
    }

    public List<Card> getCards() {
        return handcards;
    }

    public Card removeFromHand(int index) {
        return handcards.remove(index);
    }

}
