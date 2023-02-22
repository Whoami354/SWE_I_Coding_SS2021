import java.util.ArrayList;
import java.util.List;

public class SingleEvent extends Event{
    public SingleEvent(MyTime time, String description, int duration) throws Exception {
        super(time, description, duration);
    }

    @Override
    public List<Event> getEventsInIntervall(Intervall intervall) {
        List<Event> events = new ArrayList<>();
        if(intervall.isinIntervall(this.getTime())){
            events.add(this);
        }
        return events;
    }
}
