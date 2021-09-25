import java.util.Objects;

public abstract class Event {

    Celebrator celebrator;
    int numOfCelebrators;
    int eventDay;
    int eventMonth;
    int eventYear;
    static double cost = 10;

    public Event(Celebrator celebrator, int numOfCelebartors, int eventDay, int eventMonth, int eventYear) {
        this.celebrator = celebrator;
        this.numOfCelebrators = numOfCelebartors;
        this.eventDay = eventDay;
        this.eventMonth = eventMonth;
        this.eventYear = eventYear;
    }

    public double getEventCost() {
        return cost*this.numOfCelebrators;
    }

    public void setEventCost(double cost) {
        if(cost <0){cost =1;}
    }

    public double get() {
        return cost * this.numOfCelebrators;
    }

    public Celebrator getCelebrator() {
        return celebrator;
    }

    public int getNumOfCelebrators() {
        return numOfCelebrators;
    }

    public int getEventDay() {
        return eventDay;
    }

    public int getEventMonth() {
        return eventMonth;
    }

    public int getEventYear() {
        return eventYear;
    }

    public static double getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return eventDay == event.eventDay && eventMonth == event.eventMonth && eventYear == event.eventYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventDay, eventMonth, eventYear);
    }
}
