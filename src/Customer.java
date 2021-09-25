import java.util.ArrayList;

public class Customer extends Person {
    String name;
    ArrayList<Integer> incomingList = new ArrayList<Integer>();
    ArrayList<Integer> oncomingList = new ArrayList<Integer>();

    public Customer(String name) {
        super(name);
        this.name = name;
        this.incomingList = incomingList;
        this.oncomingList = oncomingList;
    }

    public void addIncome(int income)
    {
        //int size = incoming.size();
        this.incomingList.add(income);
    }

    public void addOutComing(int outcome)
    {
        this.oncomingList.add(outcome);
    }


    public ArrayList<Integer> getIncomingList() {
        return incomingList;
    }

    public ArrayList<Integer> getOncomingList() {
        return oncomingList;
    }
}
