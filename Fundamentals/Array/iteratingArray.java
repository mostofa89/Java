package Fundamentals.Array;

public class iteratingArray {
    public static void main(String[] args) {
        int [] nums = {1, 4, 5, 6, 2, 4, 7};
        System.out.print("Odd Num : ");
        for (int num : nums){
            if (num %2 != 0){
                System.out.print(num + " ");
            }
        }

        System.out.print("\nEven Position Num : ");

        for (int i = 0; i < nums.length; i ++){
            if (i %2 == 0){
                System.out.print(nums[i] + " ");
            }
        }

    }
}
