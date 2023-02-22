package Nimm_6;

import java.util.Comparator;

public class ScoreComparator implements Comparator<AbstractPlayer> {
    @Override
    public int compare(AbstractPlayer o1, AbstractPlayer o2) {
        if(o1.getScore() < o2.getScore()){
            return -1;
        }else if(o2.getScore() < o1.getScore()){
            return 1;
        }else {
            return 0;
        }
    }
}
