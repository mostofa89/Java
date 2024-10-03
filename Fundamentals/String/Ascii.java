package Fundamentals.String;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i) + " : " + str.codePointAt(i));
        }
    }
}
