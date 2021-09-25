import java.util.ArrayList;

public class Producer implements Runnable {
    String producerName;
    EventProduction eventProduction;


    public Producer(String producerName) {
        this.producerName = producerName;
    }

    public Producer(EventProduction eventProduction) {
        this.eventProduction = eventProduction;
    }

    @Override
    public void run() {
        ArrayList<Event> eventProductionList = this.eventProduction.getEventProductionList();
        for (Event event : eventProductionList) {
            System.out.println(event);
            this.eventProduction.removeEvent(event);
            System.out.println(event.toString() + "EventCost is:" + event.getEventCost()+ "Thred id is: \n");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
