package Nimm_6;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);

    public void howManyPlayers(List<AbstractPlayer> allplayer) {
        boolean stop = false;
        while (!stop) {
            stop = true;
            System.out.println("Bitte geben Sie die Anzahl der menschlichen Spieler ein!");
            int humanplayers = sc.nextInt();
            System.out.println("Bitte geben Sie die Anzahl der Computergegner ein!");
            int aiplayers = sc.nextInt();

            if ((humanplayers + aiplayers) > 10) {
                System.err.println("Es dürfen insgesamt nur 10 Spieler teilnehmen!");
                stop = false;
                continue;
            }

            try {
                for (int i = 0; i < humanplayers; i++) {
                    allplayer.add(new HumanPlayer(new UI(), "Spieler " + (i + 1)));
                }
                for (int j = 0; j < aiplayers; j++) {
                    allplayer.add(new AIPlayer("KI " + (j + 1)));
                }
            } catch (InputMismatchException e) {
                System.err.println("Bitte nur Zahlen eingeben!");
                stop = false;
            }
        }
    }

    public int inputChoice(List<Card> cards) {
        System.out.println("Bitte wählen Sie eine Karte aus!");

        for (int i = 0; i < cards.size(); i++) {
            System.out.print((i + 1) + " " + cards.get(i) + " ");
        }
        int i;
        System.out.println();
        do {
            i = sc.nextInt();
        } while (i > cards.size() || i < 1);

        return i - 1;
    }

    public Row chooseRow(List<Row> rowList) {
        System.out.println("Wählen Sie bitte eine von 4 Reihen aus ");
        for (int j = 0; j < rowList.size(); j++) {
            System.out.println((j + 1) + " " + rowList.get(j));
        }
        int k;
        do {
            k = sc.nextInt();
        } while (k >= 5 || k < 1);

        return rowList.get(k - 1);
    }

    public void allRows(List<Row> rows) {
        for (Row row : rows) {
            System.out.println(row);
        }
    }

    public void printPlayerInformation(String name) {
        System.out.println(name + " ist an der Reihe");
    }

    public void printLosers(List<AbstractPlayer> loserplayers) {
        System.out.print("Die Top 3 Verlierer sind: ");
        printPlayers(loserplayers);
    }

    public void printWinners(List<AbstractPlayer> winnerplayers) {
        System.out.print("Die Top 3 Gewinner sind: ");
        printPlayers(winnerplayers);
    }

    private void printPlayers(List<AbstractPlayer> players) {
        for (int i = 0; i < players.size(); i++) {
            System.out.print(players.get(i));
            if (i < players.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void printScores(List<AbstractPlayer> players) {
        for (AbstractPlayer player : players) {
            System.out.println(player.getName() + ": " + player.getScore());
        }
    }


}
