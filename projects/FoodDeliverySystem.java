import java.util.*;

// Abstract User class
abstract class User {
    protected int id;
    protected String name;
    protected String email;

    public User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void viewProfile(){
        System.out.println("User ID: " + id + ", Name: " + name + ", Email: " + email);
    }

    public abstract void login();
    public abstract void logout();
}

// Customer class
class Customer extends User {
    private double walletBalance;
    private List<Order> orders;

    public Customer(int id, String name, String email, double walletBalance){
        super(id, name, email);
        this.walletBalance = walletBalance;
        this.orders = new ArrayList<>();
    }

    public void addMoney(double amount){
        walletBalance += amount;
        System.out.println(name + " added $" + amount + ". Wallet: $" + walletBalance);
    }

    public void placeOrder(Order order){
        if(walletBalance >= order.getTotalPrice()){
            walletBalance -= order.getTotalPrice();
            orders.add(order);
            System.out.println(name + " placed order " + order.getId() + ". Remaining wallet: $" + walletBalance);
        } else {
            System.out.println("Insufficient balance for " + name);
        }
    }

    @Override
    public void login(){
        System.out.println(name + " logged in as Customer.");
    }

    @Override
    public void logout(){
        System.out.println(name + " logged out.");
    }

    public List<Order> getOrders(){
        return orders;
    }
}

// DeliveryPerson class
class DeliveryPerson extends User {
    private List<Order> assignedOrders;

    public DeliveryPerson(int id, String name, String email){
        super(id, name, email);
        assignedOrders = new ArrayList<>();
    }

    public void deliverOrder(Order order){
        assignedOrders.add(order);
        order.updateStatus("Delivered");
        System.out.println(name + " delivered order " + order.getId());
    }

    @Override
    public void login(){
        System.out.println(name + " logged in as Delivery Person.");
    }

    @Override
    public void logout(){
        System.out.println(name + " logged out.");
    }
}

// Dish class
class Dish {
    private int id;
    private String name;
    private double price;

    public Dish(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + " ($" + price + ")";
    }
}

// Restaurant class
class Restaurant {
    private String name;
    List<Dish> menu;
    private List<Order> orders;

    public Restaurant(String name){
        this.name = name;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addDish(Dish dish){
        menu.add(dish);
    }

    public void showMenu(){
        System.out.println("Menu of " + name + ":");
        for(Dish d : menu){
            System.out.println("- " + d);
        }
    }

    public void receiveOrder(Order order){
        orders.add(order);
        System.out.println(name + " received order " + order.getId());
    }

    public String getName(){
        return name;
    }
}

// Order class
final class Order {
    private static int counter = 1;
    private int id;
    private Customer customer;
    private Restaurant restaurant;
    private List<Dish> dishes;
    private double totalPrice;
    private String status;

    public Order(Customer customer, Restaurant restaurant, List<Dish> dishes){
        this.id = counter++;
        this.customer = customer;
        this.restaurant = restaurant;
        this.dishes = dishes;
        this.totalPrice = calculateTotal();
        this.status = "Pending";
    }

    public double calculateTotal(){
        double total = 0;
        for(Dish d : dishes){
            total += d.getPrice();
        }
        return total;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public int getId(){
        return id;
    }

    public void updateStatus(String status){
        this.status = status;
    }

    public String toString(){
        return "Order " + id + " by " + customer.name + " from " + restaurant.getName() + 
               " - $" + totalPrice + " Status: " + status;
    }
}

// Main system
public class FoodDeliverySystem {
    public static void main(String[] args){
        // Create customers
        Customer alice = new Customer(1, "Alice", "alice@gmail.com", 100);
        Customer bob = new Customer(2, "Bob", "bob@gmail.com", 50);

        // Create delivery persons
        DeliveryPerson dp1 = new DeliveryPerson(1, "Charlie", "charlie@delivery.com");

        // Create restaurants
        Restaurant r1 = new Restaurant("Pizza Palace");
        r1.addDish(new Dish(1, "Pepperoni Pizza", 20));
        r1.addDish(new Dish(2, "Margherita Pizza", 15));

        Restaurant r2 = new Restaurant("Burger Hub");
        r2.addDish(new Dish(3, "Cheeseburger", 10));
        r2.addDish(new Dish(4, "Veggie Burger", 8));

        // Customers view menu
        r1.showMenu();
        r2.showMenu();

        // Place orders
        List<Dish> aliceOrderDishes = new ArrayList<>();
        aliceOrderDishes.add(r1.menu.get(0));
        Order order1 = new Order(alice, r1, aliceOrderDishes);
        alice.placeOrder(order1);
        r1.receiveOrder(order1);

        // Delivery
        dp1.deliverOrder(order1);

        // Show order status
        System.out.println(order1);
    }
}
