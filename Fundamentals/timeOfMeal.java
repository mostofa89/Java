package Fundamentals;

import java.util.Scanner;

public class timeOfMeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the time (1 - 24) : ");
        int enteredTime = scanner.nextInt();

        if (enteredTime > 3 && enteredTime < 7) {
            System.out.println("Breakfast");
        } else if (enteredTime > 11 && enteredTime < 14) {
            System.out.println("Lunch");
        } else if (enteredTime > 15 && enteredTime < 17) {
            System.out.println("Snacks");
        } else if (enteredTime > 18 && enteredTime < 21) {
            System.out.println("Dinner");
        } else if (enteredTime >= 0 && enteredTime <= 24) {
            System.out.println("Patience is a virtue");
        } else {
            System.out.println("Wrong Time");
        }
    }
}
