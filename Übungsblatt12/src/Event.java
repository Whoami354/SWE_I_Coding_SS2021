import java.util.List;

public abstract class Event {
    private MyTime time;
    private String description;
    private int duration;

    public Event(MyTime time, String description, int duration) throws Exception {
        this.time = time;
        this.description = description;
        this.duration = duration;
        if (duration > 600) {
            throw new Exception("Bitte geben Sie eine Dauer ein, die 600 Minuten nicht übersteigt!");
        }
    }

    public boolean isEqual(Event e) {
        return e.description.equals(this.description) && e.time.isEquals(this.time);
    }

    public abstract List<Event> getEventsInIntervall(Intervall intervall);

    @Override
    public String toString() {
        return "Datum und Uhrzeit u. Startzeit: " + time + ", Endzeit: " + time.calcEndTime(duration) + ", Beschreibung: " + description + ", Dauer: " + duration;
    }

    public MyTime getTime() {
        return time;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }
}
