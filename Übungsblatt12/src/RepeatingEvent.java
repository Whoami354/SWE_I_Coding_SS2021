public abstract class RepeatingEvent extends Event{
    private String repeatIntervall;
    public RepeatingEvent(MyTime time, String description, int duration) throws Exception {
        super(time, description, duration);
    }
}
