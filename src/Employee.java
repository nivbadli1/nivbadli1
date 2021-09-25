import java.util.ArrayList;

public class Employee extends Person implements Runnable{

    protected int employeeId;
    ArrayList<Customer> customersArrList = new ArrayList<Customer>();

    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId =  employeeId;
    }

    public void addCustomer(Customer customer)
    {
        this.customersArrList.add(customer);
    }


    //    public void calculateIncomingAndOutcoming(Customer customer)
//    {
//        int totalIncoming = 0;
//        int totalOutcoming =0;
//        int size = customer.getIncomingList().size();
//        for(int i=0; i < customer.getIncomingList().size();i++)
//        {
//            totalIncoming+=customer.getIncomingList().get(i);
//
//        }
//
//        for(int i=0; i < customer.getIncomingList().size();i++)
//        {
//            totalOutcoming+=customer.getIncomingList().get(i);
//        }
//
//        System.out.println("Customer: " + customer.getId() + "Employee: " + this.name + "TotalIncoming - TotalOutcoming:" + (totalIncoming - totalOutcoming) + "\n" );
//    }

    @Override
    public void run() {
        int totalIncoming = 0;
        int totalOutcoming =0;
        int customersArrListSize = customersArrList.size();
        Customer customer;
        System.out.println("Emploeyy : " + employeeId + " start run");
        for(int j=0; j < customersArrListSize;j++)
        {
            customer = customersArrList.get(j);
            System.out.println("emplwyy: " + employeeId + " start working on customer: " + customer.getName() + "");

            for(int i=0; i < customer.getIncomingList().size();i++)
            {
                totalIncoming+=customer.getIncomingList().get(i);

            }

            for(int i=0; i < customer.getOncomingList().size();i++)
            {
                totalOutcoming+=customer.getIncomingList().get(i);
            }

            System.out.println("emplwyy: " + employeeId + " fiunished working on customer: " + customer.getName() + "");
            System.out.println("Customer: " + customer.getName() + " Employee: " + this.name + " TotalIncoming - TotalOutcoming:" + (totalIncoming - totalOutcoming) + "\n" );
        }

        System.out.println("Emploeyy : " + employeeId + "finished run");

    }
}
