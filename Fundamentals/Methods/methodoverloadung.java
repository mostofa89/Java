package Fundamentals.Methods;

public class methodoverloadung {
    public static void calSum(int num1, int num2){
        System.out.println("Sum of the 2 numbers  : " + (num1 + num2));
    }


    public static void calSum(int num1, int num2, int num3){
        System.out.println("Sum of the 3 numbers : " + (num1 + num2 + num3));
    }


    public static void calSum(int num1, int num2, int num3, int num4){
        System.out.println("Sum of the 4 numbers  : " + (num1 + num2 + num3 + num4));
    }


    public static void main(String[] args) {
        calSum(10, 20);
        calSum(10, 20, 30);
        calSum(10, 20, 30, 40);
    }
}
