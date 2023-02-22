package Nimm_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public void shuffle() {
        Random random = new Random();
        boolean[] usedCards = new boolean[104];
        for (int i = 1; i <= 104; i++) {
            int randomValue;
            do {
                randomValue = 1 + random.nextInt(104);
            } while (usedCards[randomValue - 1]);
            Card newCard = new Card(randomValue);
            cards.add(newCard);
            usedCards[randomValue - 1] = true;
        }
    }

    public Card getNextCard() {
        return cards.remove(0);
    }

}
