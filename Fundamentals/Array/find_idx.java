package Fundamentals.Array;
import java.util.Arrays;
import java.util.Scanner;

public class find_idx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Array is : " + Arrays.toString(nums));
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        int idx = -1;
        for (int i = 0; i < nums.length; i += 1){
            if (nums[i] == num){
                idx = i;
                break;
            }
        }
        System.out.println("Index of " + num + " is : " + idx + ".");
    }
}
