import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UI {
    private int[] secret;
    private Scanner sc;
    private CheckPosition test = new CheckPosition();
    private Turns safeTurns = new Turns();
    private Mastermind game = new Mastermind();

    public UI(Scanner sc) {
        this.sc = sc;
    }

    public void printWin(String succes){
        System.out.println("Herzlichen Glückwunsch! Du hast gewonnen: " + succes + "\n" +
                            "Das war die Richtige Reihenfolge!");
    }

    public void printLose(){
        System.out.println("Tut uns leid, dass Du die Richtige Zahlenkombination nicht erraten hast. " + "\nKopf hoch, beim nächsten mal hast Du bestimmt mehr Glück! :)");
    }

    public int[] inputguess(){
        String[] comp;
        int[] guess = new int[4];
        boolean stop = false;

        while (!stop) {
            stop = true;
            System.out.println("Bitte geben Sie ihre 4 Farbkombination ein! Bitte geben Sie zahlen zwischen 1 und 10 ein");
            comp = sc.nextLine().split(" ");
            if (comp.length != 4) {
                System.err.println("Ihre Eingabe ist entweder zu groß oder zu klein! Bitte geben Sie 4 Zahlen ein.");
                stop = false;
                continue;
            }
            try {
                for (int i = 0; i < 4; i++) {
                    guess[i] = Integer.parseInt(comp[i]);
                    if(!(guess[i]>=1&&guess[i]<=10)){
                        System.err.println("Bitte geben Sie Zahlen zwischen 1 und 10 ein!");
                        stop = false;
                    }
                }
            }catch (NumberFormatException e){
                System.err.println("Bitte nur Zahlen eingeben!");
                stop = false;
            }
        }
        return guess;
    }

    public void check(){
        random();
        int[] colorposition;
        int tries = 0;
        int still = 10;
        do {
            int[] choice = inputguess();
            safeTurns.addTurn(choice);
            colorposition = guess(choice);
            tries++;
            System.out.println("Anzahl der Versuche: " + tries + " Versuche noch übrig: " + (still-tries));
            System.out.println("Bisherige Züge: \n" + "Korrekte Farbe und Stelle: " + colorposition[0] + " Korrekte Farbe, aber falsche Stelle: " + colorposition[1] + "\n" + safeTurns);
        }while (colorposition[0] != 4 && tries<=10);
        if(tries>10){
            printLose();
        }else {
            printWin(Arrays.toString(secret));
        }
    }

    public void random() {
        Random mastermind = new Random();
        this.secret = new int[4];
        for (int k = 0; k < 4; k++) {
            secret[k] = 1 + mastermind.nextInt(9);
        }
        System.out.println(Arrays.toString(secret));
    }

    public int[] guess(int[] guess) {
        return test.colorChars(guess, secret);
    }



}
