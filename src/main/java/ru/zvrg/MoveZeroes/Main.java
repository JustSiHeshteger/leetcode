package ru.zvrg.MoveZeroes;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int nonZeroPointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonZeroPointer];
                nums[nonZeroPointer] = nums[i];
                nums[i] = temp;
                nonZeroPointer++;
            }
        }
    }
}
