package Fundamentals.Methods;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] nums = {32, 53, 28, 26, 25, 10, 30};
        System.out.println("Array Before Sorting : " + Arrays.toString(nums));
        sorting(nums);
        System.out.println("Array After Sorting : " + Arrays.toString(nums));

    }


    public static void sorting(int[] nums){
        for (int i = 1; i < nums.length; i++){
            int j = i - 1;
            int current = nums[i];
            while(j >=0 && current < nums[j]){
                nums[j + 1] = nums[j];
                j -= 1;
            }

            nums[j + 1] = current;

        }
    }
}
