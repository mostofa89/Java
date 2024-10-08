package Fundamentals.Methods;

public class binarySearch {
    public static int binsearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int mid = left + ((right - left) / 2);
            if (nums[mid] == target){
                return mid;

            }else if (nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid -  1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {11, 13, 16, 20, 26, 30, 34, 35};
        int target1 = 11;
        System.out.println(target1 + " is in index " + binsearch(nums, target1));
    }
}
