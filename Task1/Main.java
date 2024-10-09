import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("William","Øster", "William1372");
        Customer customer2 = new Customer("Benedicte", "Veileborg","Benedicte1372");
        Customer customer3 = new Customer("Carl","Smart","CarlSmart1337");
        Customer customer4 = new Customer("Bent","Brandbil","Brandbilen");
        Customer customer5 = new Customer("Cristiano","Ronaldo","The GOAT");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        printCustomers(customers);

    }
    public static void printCustomers(ArrayList<Customer> customers) {

        for (Customer customer : customers) {

            System.out.println(customer+"\n");

        }

    }
}
