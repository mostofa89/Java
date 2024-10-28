package OOP.Encapsulation_and_HasRelation;

public class TriangleDriverCode {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10, 5);
        System.out.println("First Triangle Base: " + t1.getBase());
        System.out.println("First Triangle Height: " + t1.getHeight());
        System.out.println("First Triangle Area: " + t1.getArea());
        System.out.println("========================================");
        Triangle t2 = new Triangle(5, 3);
        System.out.println("Second Triangle Base: " + t2.getBase());
        System.out.println("Second Triangle Height: " + t2.getHeight());
        System.out.println("Second Triangle Area: " + t2.getArea());

    }
}
