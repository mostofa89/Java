package OOP.Class_Object;

public class GreenPhoneDriverCode {
    public static void main(String[] args) {
        System.out.println("1=======================");
        GreenPhone p1 = new GreenPhone("A1", 12, 3);
        GreenPhone p2 = new GreenPhone("M11", 12, 4);
        GreenPhone p3 = new GreenPhone("U20", 12, 5);
        p1.showSpecification();
        System.out.println("2=======================");
        p2.showSpecification();
        System.out.println("3=======================");
        p1.updatePhone();
        System.out.println("4=======================");
        p1.updatePhone();
        p2.updatePhone();
        p3.updatePhone();
        System.out.println("5=======================");
        p1.updatePhone();
        p2.updatePhone();
        p3.updatePhone();
        System.out.println("6=======================");
        p2.updatePhone();
        p3.updatePhone();
        System.out.println("7=======================");
        p1.showSpecification();
        p3.showSpecification();
    }
}
