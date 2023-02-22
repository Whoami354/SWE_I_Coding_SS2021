import java.util.ArrayList;
import java.util.List;

public class YearlyRepeatingEvent extends RepeatingEvent {
    public YearlyRepeatingEvent(MyTime time, String description, int duration) throws Exception {
        super(time, description, duration);
    }

    @Override
    public List<Event> getEventsInIntervall(Intervall intervall) {
        List<Event> allyearlyEvents = new ArrayList<>();
        try {
            int safeYear = intervall.getStart().getYear();
            MyTime t = getTime().setYear(safeYear);
            while (intervall.getEnd().isBefore(t)) {
                allyearlyEvents.add(new SingleEvent(t, getDescription(), getDuration()));
                safeYear++;
                t = getTime().setYear(safeYear);
            }
            return allyearlyEvents;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public boolean isInIntervall(MyTime start, MyTime end) {
        if (start.isBeforeDayAndMonth(this.getTime())) {
            return false;
        }
        return end.isBeforeDayAndMonth(this.getTime());
    }
}
