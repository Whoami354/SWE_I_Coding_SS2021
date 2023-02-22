package Aufgabe01;

import java.util.List;

public class Rangliste {
    List<Boxer> allBoxers;

    public Rangliste(List<Boxer> allBoxers) {
        this.allBoxers = allBoxers;
    }

    public void updateBoxers(Kampf fight) {
        int winnerindex;
        int loserindex;
        winnerindex = allBoxers.indexOf(fight.getWinner());
        loserindex = allBoxers.indexOf(fight.getLoser());
        if(winnerindex > loserindex){
            allBoxers.remove(winnerindex);
            allBoxers.add(loserindex,fight.getWinner());
        }
    }

    public void update(List<Kampf> fights) {
        for (Kampf fight : fights) {
            if (fight.getWinner() == null) {
                continue;
            }
           updateBoxers(fight);
        }
    }
}
