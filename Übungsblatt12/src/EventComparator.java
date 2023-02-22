import java.util.Comparator;

public class EventComparator implements Comparator<Event> {
    private int order;

    public EventComparator(int order) {
        this.order = order;
    }

    @Override
    public int compare(Event o1, Event o2) {
        int timeCompare = o2.getTime().compareTo(o1.getTime());
        if (timeCompare == 0) {
            return o2.getDescription().compareTo(o1.getDescription());
        }
        return timeCompare*order;
    }
}
