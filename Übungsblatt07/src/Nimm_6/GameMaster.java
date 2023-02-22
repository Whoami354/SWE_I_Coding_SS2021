package Nimm_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameMaster {
    private List<AbstractPlayer> players;
    private Deck deck;
    private Table table;
    private UI ui;


    public GameMaster(List<AbstractPlayer> players, UI ui) {
        this.players = players;
        this.table = new Table();
        this.ui = ui;
    }

    private void deal() {
        for (AbstractPlayer player : players) {
            List<Card> cards = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                cards.add(deck.getNextCard());
            }
            player.deal(cards);
        }
    }

    public void start() {
        while (highestScore() < 66) {
            deck = new Deck();
            deck.shuffle();
            deal();
            setUpTable();
            for (AbstractPlayer player : players) {
                player.setupHornOxPile();
            }
            ui.printScores(players);
            for (int a = 1; a <= 10; a++) {
                ui.allRows(Arrays.asList(table.getRows()));
                getPlayersCards();
                for (AbstractPlayer player : players) {
                    table.addCard(player);
                }

            }
        }
        ui.printScores(players);
        getWinerandLoser();
    }

    private void setUpTable() {
        Card[] cards = new Card[4];
        for (int l = 0; l < cards.length; l++) {
            cards[l] = deck.getNextCard();
        }
        table.setUpRows(cards);
    }

    public void getPlayersCards() {
        for (AbstractPlayer player : players) {
            player.chooseCard();
        }
        Collections.sort(players);
    }

    private int highestScore() {
        int max = 0;
        for (AbstractPlayer player : players) {
            if (player.countScore() > max) {
                max = player.getScore();
            }
        }
        return max;
    }

    private void getWinerandLoser() {
        players.sort(new ScoreComparator());
        ui.printWinners(players.subList(0, 3));
        ui.printLosers(players.subList(players.size()-3, players.size()));
    }
}
