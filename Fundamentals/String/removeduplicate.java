package Fundamentals.String;

import java.util.Scanner;

public class removeduplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.next();
        String str1 = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (str1.contains(String.valueOf(ch)) != true){
                str1 += str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
