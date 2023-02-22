package Nimm_6;

public class Card implements Comparable<Card> {
    private int aValue;
    private int horns;

    public Card(int aValue) {
        this.aValue = aValue;
        initHorns();
    }

    public int getaValue() {
        return aValue;
    }

    public int getHorns() {
        return horns;
    }

    public void initHorns() {
        if (aValue % 5 == 0) {
            horns = 2;
        }
        if (aValue % 10 == 0) {
            horns = 3;
        }
        if (aValue % 11 == 0) {
            horns = 5;
        }
        if (aValue == 55) {
            horns = 7;
        }
    }

    public int difference(Card card) {
        return Math.abs(getaValue() - card.getaValue());
    }

    @Override
    public String toString() {
        return "|" + aValue + "," + horns + "|";
    }

    @Override
    public int compareTo(Card o) {
        return this.getaValue() - o.getaValue();
    }
}
