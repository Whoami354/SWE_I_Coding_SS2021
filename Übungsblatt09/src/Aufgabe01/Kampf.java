package Aufgabe01;

public class Kampf {

    private Boxer[] boxers;
    private int result;

    public Kampf(Boxer[] boxers, int result) {
        this.boxers = boxers;
        this.result = result;
    }

    public Boxer getWinner(){
        if(result == -1){
            return null;
        }
        return boxers[result];
    }

    public Boxer getLoser(){
        if(result == -1){
            return null;
        }
        return boxers[1-result];
    }

}
