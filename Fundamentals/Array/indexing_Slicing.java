package Fundamentals.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class indexing_Slicing {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        System.out.println("Original Array : " + Arrays.toString(nums));
        System.out.println("Value of Index 0 : "+ nums[0]);
        System.out.println("SubArraay of 0 to lenth - 3 : " + Arrays.toString(Arrays.copyOfRange(nums, 0, nums.length - 3)));
    }
    
}
