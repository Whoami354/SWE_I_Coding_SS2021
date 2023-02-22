import java.util.ArrayList;
import java.util.List;

public class Container {
    private List<Event> events = new ArrayList<>();

    public List<Event> sortAscending(Intervall intervall) {
        AscendingEvent ascending = new AscendingEvent();
        return ascending.sortEventAscending(getEventsInIntervall(intervall));
    }

    public void addEvent(Event event) {
        try {
            events.add(event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Event> sortDescending(Intervall intervall) {
        DescendingEvent descending = new DescendingEvent();
        return descending.sortEventDescending(getEventsInIntervall(intervall));
    }

    public void deleteEvents(int position) {
        events.remove(position - 1);
    }

    public List<Event> getEventsInIntervall(Intervall intervall) {
        List<Event> eventsInIntervall = new ArrayList<>();
        for (Event event : events) {
            eventsInIntervall.addAll(event.getEventsInIntervall(intervall));
        }
        return eventsInIntervall;
    }
}
