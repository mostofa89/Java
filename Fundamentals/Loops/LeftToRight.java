package Fundamentals.Loops;
import java.util.Scanner;

public class LeftToRight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int n = num;
        int count = 0;

        // Count the number of digits
        while (n > 0) {
            n /= 10;
            count += 1;
        }

        System.out.println("Digits from left to right:");
        for (int i = count - 1; i >= 0; i--) {
            // Calculate the divisor as a power of 10
            int divisor = (int) Math.pow(10, i);
            int num1 = num / divisor; // Get the leading digit
            num %= divisor;           // Remove the leading digit

            if (i == 0) {
                System.out.println(num1); // Print the last digit without comma
            } else {
                System.out.print(num1 + ", "); // Print the rest with comma
            }
        }
        
        input.close(); // Close the scanner
    }
}
