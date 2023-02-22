import java.util.List;

public class DescendingEvent {
    public List<Event> sortEventDescending(List<Event> events) {
        events.sort(new EventComparator(1));
        return events;
    }
}
