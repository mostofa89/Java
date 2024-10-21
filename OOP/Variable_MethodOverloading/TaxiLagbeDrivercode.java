package OOP.Variable_MethodOverloading;

public class TaxiLagbeDrivercode {
    public static void main(String[] args) {
        TaxiLagbe taxi1 = new TaxiLagbe("1010-01", "Dhaka");
        System.out.println("-------------------------------");
        taxi1.addPassenger("Walker_100","Wood_200","Matt_100");
        taxi1.addPassenger("Wilson_105");
        System.out.println("-------------------------------");
        taxi1.printDetails();
        System.out.println("-------------------------------");
        TaxiLagbe taxi2 = new TaxiLagbe("1010-02", "Khulna");
        System.out.println("-------------------------------");
        taxi2.addPassenger("Ronald_115","Parker_215","Matt_100");
        System.out.println("-------------------------------");
        taxi1.addPassenger("Karen_200");
        taxi1.printDetails();
        System.out.println("-------------------------------");
    }
}
