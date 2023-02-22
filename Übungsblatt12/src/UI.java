import java.util.List;
import java.util.Scanner;

public class UI {
    Scanner sc = new Scanner(System.in);

    public void printWelcome() {
        System.out.println("Herzlich Willkommen!" +
                "\nWas möchten Sie tun?");
    }

    public void displayOption() {
        System.out.println("(1) Programm beenden!" +
                         "\n(2) Termin festlegen" +
                         "\n(3) Termine ausgeben lassen" +
                         "\n(4) Temin(e) löschen");
    }

    public void printGoodbye() {
        System.out.println("Auf Wiedersehen!");
    }

    public void printEvents(List<Event> events) {
        int counter = 1;
        if (events.size() == 0) {
            System.out.println("Keine Events vorhanden");
        }
        for (Event event : events) {
            System.out.println(counter++ + ". " + event);
        }
    }

    public String askDate() {
        System.out.println("Bitte geben Sie Ihr Datum ein! (Format: DD.MM.YYYY)");
        return sc.nextLine();
    }

    public String askTime() {
        System.out.println("Bitte geben Sie Ihre Uhzeit ein! (Format: hh:mm)");
        return sc.nextLine();
    }

    public String askDescription() {
        System.out.println("Was wollen Sie an diesem Tag machen?");
        return sc.nextLine();
    }

    public int askHowLong() {
        System.out.println("Wie lange soll das Ereigniss in Minuten dauern! (Höchstens 600 Minuten)");
        return sc.nextInt();
    }

    public int askHowToSort() {
        System.out.println("Wie wollen Sie Ihre Liste sortiert ausgeben lassen?\n" +
                            "(1) Aufsteigend\n" +
                            "(2) Absteigend");
        return sc.nextInt();
    }

    public int  askWhatToDelete() {
        System.out.println("Welcher Temin Soll gelöscht werden? Geben Sie bitte den entsprechenden Index als Zahl an.");
        return sc.nextInt();
    }

    public void printErrorMainMenu() {
        System.err.println("Bitte geben Sie einen Wert zwischen 1 und 4 ein.");
    }

    public void printErrorSortMenu() {
        System.err.println("Bitte geben Sie eine Zahl zwischen 1 oder 2 ein.");
    }

    public int getInput() {
        int input = sc.nextInt();
        sc.nextLine();
        return input;
    }

    public void printFailInputError(String message) {
        System.err.println(message);
    }

    public int askWhatRepeatingEvents(){
        System.out.println("Wie wollen Sie Ihre Termine auf welche Weise wiederholen?\n" +
                "(1) Wöchentlich\n" +
                "(2) Monatlich\n" +
                "(3) Jährlich\n" +
                "(4) Keins von den genannten Optionen!");
        return sc.nextInt();
    }

    public String askIntervall(){
        System.out.println("Geben Sie bitte Ihr Zeitintervall an! (Format: DD.MM.YYYY-DD.MM.YYYY)");
        sc.nextLine();
        return sc.nextLine();
    }

}

