package Fundamentals;

import java.util.Scanner;

public class digitcounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        int counter = 0;
        while (num > 0){
            num /= 10;
            counter += 1;
        }
        System.out.println("The Number Have " + counter + " digits.");
    }
}
