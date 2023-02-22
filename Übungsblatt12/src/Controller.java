
public class Controller {
    private Container container = new Container();
    private UI ui = new UI();

    public void run() {
        ui.printWelcome();
        int option = 0;
        while (option != 1) {
            ui.displayOption();
            option = ui.getInput();
            try {
                switch (option) {
                    case 1 -> ui.printGoodbye();
                    case 2 -> createNewEvent();
                    case 3 -> outputSortedEvents();
                    case 4 -> deleteDates();
                    default -> ui.printErrorMainMenu();
                }
            } catch (Exception e) {
                ui.printFailInputError(e.getMessage());
            }
        }
    }

    private void createNewEvent() {
        String date = ui.askDate();
        String time = ui.askTime();
        String description = ui.askDescription();
        int duration = ui.askHowLong();
        int howToRepeat = ui.askWhatRepeatingEvents();
        try {
            switch (howToRepeat) {
                case 1:
                    break;
                case 2:
                    container.addEvent(new MonthlyRepeatingEvents(new MyTime(date, time), description, duration));
                    break;
                case 3:
                    container.addEvent(new YearlyRepeatingEvent(new MyTime(date, time), description, duration));
                    break;
                case 4:
                    container.addEvent(new SingleEvent(new MyTime(date, time), description, duration));
                    break;
            }
        } catch (Exception e) {
            ui.printFailInputError(e.getMessage());
        }
    }

    private void outputSortedEvents() throws Exception {
        int howToSort = ui.askHowToSort();
        Intervall intervall = new Intervall(ui.askIntervall());
        switch (howToSort) {
            case 1 -> ui.printEvents(container.sortAscending(intervall));
            case 2 -> ui.printEvents(container.sortDescending(intervall));
            default -> ui.printErrorSortMenu();
        }
    }

    private void deleteDates() {
        //ui.printEvents(container.sortDescending());
        int deleteEvent = ui.askWhatToDelete();
        container.deleteEvents(deleteEvent);
    }

    public void createRepeatingEvents() {
    }

}
