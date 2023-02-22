import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UI guess = new UI(sc);
        guess.check();
    }
}