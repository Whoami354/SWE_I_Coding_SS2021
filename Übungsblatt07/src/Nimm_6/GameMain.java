package Nimm_6;

import java.util.ArrayList;
import java.util.List;

public class GameMain {
    public static void main(String[] args) {
        UI ui = new UI();

        List<AbstractPlayer> allplayer = new ArrayList<>();

        ui.howManyPlayers(allplayer);

        GameMaster start = new GameMaster(allplayer, ui);
        start.start();
    }
}
