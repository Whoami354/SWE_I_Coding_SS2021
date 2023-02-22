public class MyTime implements Comparable<MyTime> {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int min;

    private MyTime(int day, int month, int year, int hour, int min) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
    }

    public MyTime(String date, String time) throws Exception {
        String[] splitDate = date.split("\\.");
        String[] splitTime = time.split(":");
        if (splitDate.length != 3 || splitTime.length != 2) {
            throw new Exception("Falsche Eingabe");
        }
        day = Integer.parseInt(splitDate[0]);
        month = Integer.parseInt(splitDate[1]);
        year = Integer.parseInt(splitDate[2]);
        hour = Integer.parseInt(splitTime[0]);
        min = Integer.parseInt(splitTime[1]);
        validateDate();
    }

    public void validateDate() throws Exception {
        if (month < 1 || month > 12) {
            throw new Exception("Bitte geben Sie die Monatszahl zwischen 1 und 12 ein!");
        }
        if (hour < 0 || hour > 23) {
            throw new Exception("Bitte geben Sie einen Werte der Stunde zwischen 0 und 24 ein!");
        }
        if (min < 0 || min > 59) {
            throw new Exception("Bitte geben Sie einen Wert der Minuten zwischen 0 und 59 ein!");
        }
        if (getDays() < day || day < 1) {
            throw new Exception("Es gibeben Sie einen Tag zwischen 1 und " + getDays() + " ein!");
        }
    }

    public MyTime calcEndTime(int duration) {
        int newDay = day - 1;
        int newMonth = month - 1;
        int newMinutes = (min + duration) % 60;
        duration = (duration + min) / 60;
        int newHours = (hour + duration) % 24;
        duration = (duration + hour) / 24;
        int newDays = (newDay + duration) % getDays();
        duration = (duration + newDay) / getDays();
        int newMonths = (duration + newMonth) % 12;
        duration = (duration + newMonth) / 12;
        int restYear = duration + year;
        return new MyTime(newDays + 1, newMonths + 1, restYear, newHours, newMinutes);
    }

    private int getDays() {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear()) {
            days[1] = 29;
        }
        return days[month - 1];
    }

    public boolean isLeapYear() {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public boolean isBefore(MyTime t) {
        if (this.year != t.year) return t.year < year;
        if (this.month != t.month) return t.month < month;
        if (this.day != t.day) return t.day < day;
        if (this.hour != t.hour) return t.hour < hour;
        return t.min < min;
    }

    public boolean isBeforeDayAndMonth(MyTime t){
        if(this.month != t.month) return t.month < month;
        return t.day < day;
    }

    public boolean isEquals(MyTime t) {
        return !t.isBefore(this) && !this.isBefore(t);
    }

    public MyTime setYear(int newyear) {
        return new MyTime(day,month,newyear,hour,min);
    }

    public MyTime addMonth(int newMonth){
        int newMonths = ((month-1) + newMonth) % 12;
        int editionYear = ((month-1) + newMonth) / 12;
        int newYear = editionYear + year;
        return new MyTime(day,newMonths+1,newYear,hour,min);
    }

    public MyTime setMonth(int newMonth){
        return new MyTime(day,newMonth,year,hour,min);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d Uhr %02d.%02d.%04d", hour, min, day, month, year);
    }

    @Override
    public int compareTo(MyTime o) {
        if (this.isBefore(o)) {
            return 1;
        }
        if (o.isBefore(this)) {
            return -1;
        }
        return 0;
    }
}
