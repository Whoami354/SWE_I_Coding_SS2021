import java.util.ArrayList;
import java.util.List;

public class MonthlyRepeatingEvents extends RepeatingEvent {
    public MonthlyRepeatingEvents(MyTime time, String description, int duration) throws Exception {
        super(time, description, duration);
    }

    @Override
    public List<Event> getEventsInIntervall(Intervall intervall) {
        List<Event> monthlyEvents = new ArrayList<>();
        MyTime t = getTime().setMonth(intervall.getStart().getMonth());
        while (intervall.getEnd().isBefore(t)) {
            try {
                monthlyEvents.add(new SingleEvent(t, getDescription(), getDuration()));
                t = t.addMonth(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return monthlyEvents;
    }
}
