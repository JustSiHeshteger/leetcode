package ru.zvrg.MaximumAverageSubarrayI;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxSum;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}
