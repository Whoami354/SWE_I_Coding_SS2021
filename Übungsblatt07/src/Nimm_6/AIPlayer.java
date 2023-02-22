package Nimm_6;

import java.util.List;

public class AIPlayer extends AbstractPlayer {
    UI ui = new UI();

    public AIPlayer(String name) {
        super(name);
    }

    @Override
    public void chooseCard() {
        ui.printPlayerInformation(getName());
        selectedCard = hand.removeFromHand(0);
    }

    @Override
    public Row chooseRow(List<Row> rowList) {
        return rowList.get(0);
    }


}
