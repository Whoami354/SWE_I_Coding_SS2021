package Nimm_6;

import java.util.List;

public class HumanPlayer extends AbstractPlayer {
    private UI ui;

    public HumanPlayer(UI ui, String name) {
        super(name);
        this.ui = ui;
    }


    @Override
    public void chooseCard() {
        ui.printPlayerInformation(getName());
        selectedCard = hand.removeFromHand(ui.inputChoice(hand.getCards()));
    }

    @Override
    public Row chooseRow(List<Row> rowList) {
        ui.printPlayerInformation(getName());
        return ui.chooseRow(rowList);
    }
}
