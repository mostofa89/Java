package OOP.Class_Object;

public class CustomerDriverCode {
    public static void main(String[] args) {
        System.out.println("1-------------------------");
        Customer customer1 = new Customer();
        System.out.println("2-------------------------");
        customer1.buyTicket("Bob", 23);
        customer1.buyTicket("Henry", 7);
        customer1.buyTicket("Alexa", 30);
        customer1.buyTicket("Jonas", 43);
        System.out.println("3-------------------------");
        customer1.ShowDetails();
        System.out.println("4-------------------------");
        Customer customer2 = new Customer();
        customer2.buyTicket("Tomas", 60);
        customer2.buyTicket("Harry", 28);
        System.out.println("5-------------------------");
        customer2.ShowDetails();
        System.out.println("6-------------------------");

    }
}
