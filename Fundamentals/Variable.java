package Fundamentals;

// Variable in Java
public class Variable {
    public static void main(String[] args) {
        int num = 100;
        float cgpa = 3.65f;
        boolean flag = true;
        System.out.println("Before Update");
        System.out.println(num);
        System.out.println(cgpa);
        System.out.println(flag);
        num = 300;
        cgpa = 3.69f;
        flag = false;
        System.out.println("After Update");
        System.out.println(num);
        System.out.println(cgpa);
        System.out.println(flag);
    }
}
