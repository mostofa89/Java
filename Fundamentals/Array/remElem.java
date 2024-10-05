package Fundamentals.Array;

import java.util.Arrays;
import java.util.Scanner;

public class remElem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] nums = {4, 5, 5, 2, 2, 3, 4, 5};
        System.out.println("Array : " + Arrays.toString(nums));
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int k = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == num){
                nums[i] = 0;
                k += 1;
            }else{
                nums[i - k] = nums[i];
            }
        }
        for (int i = nums.length - k; i < nums.length; i++){
            nums[i] = 0;
        }
        System.out.println("Array Affter Removing " + num + " : " + Arrays.toString(nums) + ".");
    }
}
