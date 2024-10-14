package OOP.Variable_MethodOverloading;

public class StudentDriverCode {
    public static void main(String[] args) {
        Student harry = new Student("Harry Potter", 123);
        harry.dailyEffort(3);
        harry.printDetails();
        System.out.println("========================");
        Student john = new Student("John Wick", 456, "BBA");
        john.dailyEffort(2);
        john.printDetails();
        System.out.println("========================");
        Student naruto = new Student("Naruto Uzumaki", 777, "Ninja");
        naruto.dailyEffort(6);
        naruto.printDetails();
    }
}
