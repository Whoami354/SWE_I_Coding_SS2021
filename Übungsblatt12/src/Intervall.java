public class Intervall {
    private MyTime start;
    private MyTime end;
    public Intervall(String intervall) throws Exception {
        String[] minussplit = intervall.split("-");
        if(minussplit.length != 2){
            throw new Exception("Falsche Eingabe!");
        }
        start = new MyTime(minussplit[0],"00:00");
        end = new MyTime(minussplit[1],"00:00");
    }

    public MyTime getStart() {
        return start;
    }

    public MyTime getEnd() {
        return end;
    }

    public boolean isinIntervall(MyTime time){
        return time.isBefore(start) && end.isBefore(time);
    }
}
