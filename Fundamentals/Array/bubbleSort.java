package Fundamentals.Array;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] nums = {20, 11, 10, 9, 6, 8, 5};
        System.out.println("Unsorted Array : " + Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j ++){
                if (nums[j] < nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}
