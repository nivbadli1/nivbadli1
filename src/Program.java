public class Program {

    public static void main(String[] args) {

        Customer customer1 = new Customer("A");
        Customer customer2 = new Customer("B");
        Customer customer3 = new Customer("C");
        Customer customer4 = new Customer("D");
        Customer customer5 = new Customer("E");


        Employee employee1 = new Employee("niv",1);
        Employee employee2 = new Employee("lior",2);

        employee1.addCustomer(customer1);
        employee1.addCustomer(customer2);
        employee1.addCustomer(customer3);
        employee2.addCustomer(customer4);
        employee2.addCustomer(customer5);

        for (int i =10; i<200; i++)
        {
            customer1.addIncome(i);
            customer2.addIncome(i);
            customer3.addIncome(i);
            customer4.addIncome(i);
            customer5.addIncome(i);

        }
        for (int i =10; i<200; i++)
        {
            customer1.addOutComing(i);
            customer2.addOutComing(i);
            customer3.addOutComing(i);
            customer4.addOutComing(i);
            customer5.addOutComing(i);
        }

        Thread t1 = new Thread(employee1);
        Thread t2 = new Thread(employee2);

        t1.start();
        t2.start();

}
}

//
//
//        Celebrator celebrator1 = new Celebrator("niv","badli","3",1995);
//        Celebrator celebrator2 = new Celebrator("maayan","sidon","1",1997);
//        Wedding wedding1 = new Wedding(celebrator1,120,3,4,2021,celebrator2);
//        Celebrator celebrator3 = new Celebrator("tal","badli","2",1995);
//        Celebrator celebrator4 = new Celebrator("tal","sidon","3",1997);
//        //System.out.println(wedding1.toString());
//        Birthday birthday1 = new Birthday(celebrator3,130,3,4,2021);
//        Birthday birthday2 = new Birthday(celebrator4,900,3,4,2021);
//        //System.out.println(birthday1.toString());
//        //System.out.println(birthday2.toString());
//        EventProduction eventProductionList = new EventProduction("eventProduction1");
//        eventProductionList.addEvent(wedding1);
//        eventProductionList.addEvent(birthday1);
//        eventProductionList.addEvent(birthday2);
//        //System.out.println(eventProductionList.toString());
//        //eventProductionList.removeEvent(birthday1);
//        //System.out.println(eventProductionList.toString());
//
//
//        Producer producer1 = new Producer("prod1");
//        Producer producer2 = new Producer("prod2");
//        producer1.eventProduction = eventProductionList;
//        producer2.eventProduction = eventProductionList;
//        Thread thread1 = new Thread(producer1);
//        Thread thread2 = new Thread(producer2);
//        thread1.start();
//        thread2.start();
////        while(thread1.isAlive() && thread2.isAlive())
////        {
////            //System.out.println(thread1.getState());
////            //System.out.println(thread2.getState());
////            System.out.println("Threds in progress...");
////        }
//
//        System.out.println("Producers done with all events");
//
//
////
////        Inter1 i1 = new Inter2(3);
////        Inter2[] arr = new Inter2[3];
////
////        arr[0] = new ClassA();
////        arr[1] = new ClassB();
////        arr[2] = new ClassC();
////
////        arr[0].funci1();
////
////        //ClassA ca = new ClassB();
//
