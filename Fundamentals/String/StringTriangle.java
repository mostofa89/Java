package Fundamentals.String;

import java.util.Scanner;

public class StringTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str1 = input.next();
        for(int i = 0; i < str1.length(); i ++){
            System.out.println(str1.substring(0, i + 1));
        }
    }
}
