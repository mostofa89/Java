package Fundamentals.String;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String with mixed Letter : ");
        String str1 = input.nextLine();
        String str2 = "";
        for(int i = 0; i < str1.length(); i++){
            str2 = str1.charAt(i) + str2;
        }
        System.out.println("Reverse String : " + str2);
    }
}