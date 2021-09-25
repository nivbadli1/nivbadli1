import java.util.ArrayList;

public class EventProduction {
    String nameEventProduction;
    ArrayList<Event> eventProductionList;

    public int numOfEvents =0;

    public EventProduction(String nameEventProduction) {
        this.nameEventProduction = nameEventProduction;
        this.eventProductionList = new ArrayList<Event>();

    }

    public void addEvent(Event event)
    {
        this.eventProductionList.add(event);
        numOfEvents++;
    }

    public ArrayList<Event> getEventProductionList() {
        return eventProductionList;
    }

    public Event removeEvent(Event event)
    {
        if(this.eventProductionList.contains(event))
        {
            this.eventProductionList.remove(event);
            numOfEvents--;
        }
        return event;
    }

    public int getNumOfEvents() {
        return numOfEvents;
    }

    @Override
    public String toString() {
        return "EventProduction{" +
                "nameEventProduction='" + nameEventProduction + '\'' +
                ", numOfEvents=" + this.getNumOfEvents() +
                '}';
    }
}
