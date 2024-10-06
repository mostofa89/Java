package Fundamentals.Array;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] nums = {20, 11, 10, 9, 6, 8, 5};
        System.out.println("Unsorted Array : " + Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++){
            int maxIdx = i;
            for (int j = i + 1; j < nums.length; j ++){
                if (nums[maxIdx] < nums[j]){
                    maxIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[maxIdx];
            nums[maxIdx] = temp;
        }
        System.out.println("Sorted Array : " + Arrays.toString(nums));
    }
}
