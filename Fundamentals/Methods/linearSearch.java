package Fundamentals.Methods;

public class linearSearch {
    public static int search(int[] nums, int target){
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {10, 20, 14, 12, 9, 7, 8};
        int target = 9;
        System.out.println(target + " is in index " + search(nums, target) + ".");
    }
}

