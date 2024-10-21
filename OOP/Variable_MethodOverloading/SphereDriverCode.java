package OOP.Variable_MethodOverloading;

public class SphereDriverCode {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere("Sphere 1");
        System.out.println("1***************");
        sphere1.printDetails();
        System.out.println("2***************");
        Sphere sphere2 = new Sphere("Sphere 2", 3);
        System.out.println("3***************");
        sphere2.printDetails();
        System.out.println("4***************");
        Sphere sphere3 = new Sphere("Sphere 3", 2);
        System.out.println("5***************");
        sphere3.printDetails();
        System.out.println("6***************");
        sphere3.merge_sphere(sphere1, sphere2);
        System.out.println("7***************");
        sphere3.printDetails();
        Sphere sphere4 = new Sphere("Sphere 4",  "Purple", 5);
        System.out.println("5***************");
        sphere4.printDetails();
        System.out.println("6***************");
        sphere4.merge_sphere(sphere3);
        System.out.println("7***************");
        sphere4.printDetails();
    }
}
