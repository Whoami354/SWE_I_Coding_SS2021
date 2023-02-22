package Nimm_6;

import java.util.Arrays;

public class Table {
    private Row[] rows = new Row[4];

    public void setUpRows(Card[] cards) {
        for (int k = 0; k < 4; k++) {
            rows[k] = new Row();
            rows[k].setupWithCard(cards[k]);
        }
    }

    public void addCard(AbstractPlayer player) {
        Row minrow = getMinimalRow(player.getSelectedCard());
        if (minrow == null) {
            minrow = player.chooseRow(Arrays.asList(rows));
            player.takeCards(minrow.getRowCards());
            minrow.setupWithCard(player.getSelectedCard());
        } else if (minrow.isFull()) {
            player.takeCards(minrow.getRowCards());
            minrow.setupWithCard(player.getSelectedCard());
        } else {
            minrow.addCard(player.getSelectedCard());
        }
    }

    private Row getMinimalRow(Card card) {
        int mindifference = 105;
        Row minrow = null;
        for (Row row : rows) {
            if (row.getactualCard().difference(card) < mindifference && row.canAddCard(card)) {
                mindifference = row.getactualCard().difference(card);
                minrow = row;
            }
        }
        return minrow;
    }

    public Row[] getRows() {
        return rows;
    }
}
