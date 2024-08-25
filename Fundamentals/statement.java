package Fundamentals;

import java.util.Scanner;

public class statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("1st Number is Greater.");
        }else if (num2 > num1){
            System.out.println("2nd Number is Greater.");
        }else{
            System.out.println("Both are equal.");
        }
    }
}
