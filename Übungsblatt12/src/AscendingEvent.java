import java.util.List;

public class AscendingEvent {
    public List<Event> sortEventAscending(List<Event> events) {
        events.sort(new EventComparator(-1));
        return events;
    }
}
