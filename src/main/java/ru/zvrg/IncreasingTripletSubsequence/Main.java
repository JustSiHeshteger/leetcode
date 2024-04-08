package ru.zvrg.IncreasingTripletSubsequence;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else if (num <= secondMin) {
                secondMin = num;
            } else {
                return true;
            }
        }

        return false;
    }
}
