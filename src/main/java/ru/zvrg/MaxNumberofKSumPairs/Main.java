package ru.zvrg.MaxNumberofKSumPairs;

public class Main {
    public static void main(String[] args) {
        var nums = new int[]{1,2,3,4};
        int k = 5;
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {
        int n = nums.length, count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < k) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] + nums[j] == k) {
                        count++;
                        nums[j] = k + 2;
                        nums[i] = k + 2;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
