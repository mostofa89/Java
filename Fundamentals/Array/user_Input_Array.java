package Fundamentals.Array;

import java.util.Arrays;
import java.util.Scanner;

public class user_Input_Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Original Array : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter a Number : ");
            int num = input.nextInt();
            arr[i] = num;
        }
        System.out.println("After User Input : " + Arrays.toString(arr));
    }
}
