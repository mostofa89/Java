package OOP.Encapsulation_and_HasRelation;

public class CircleDriverCode {
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        System.out.println("First circle radius:" +  c1.getRadius());
        System.out.println("First circle area:" + c1.getArea());
        System.out.println("===============================");
        Circle c2 = new Circle(5);
        System.out.println("Second circle radius:" +  c2.getRadius());
        System.out.println("Second circle area:" + c2.getArea());

    }
}
