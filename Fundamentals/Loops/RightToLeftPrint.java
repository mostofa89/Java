package Fundamentals.Loops;
import java.util.Scanner;

public class RightToLeftPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        while (num > 0){
            int num1 = num % 10;
            num /= 10;
            if (num == 0){
                System.out.println(num1);
            }else{
                System.out.print(num1 + ", ");
            }
        }
    }
}
