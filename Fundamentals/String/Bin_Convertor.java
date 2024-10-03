package Fundamentals;

import java.util.Scanner;

public class Bin_Convertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        String binNum = "";
        while(num > 0){
            binNum = Integer.toString(num % 2) + binNum;
            num /= 2;
        }
        System.out.println("Enter Binary Number : " + binNum);

    }
}
