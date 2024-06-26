package ru.zvrg.ProductofArrayExceptSelf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int[] prefixProducts = new int[n];
        prefixProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            prefixProducts[i] = prefixProducts[i - 1] * nums[i - 1];
        }

        int[] suffixProducts = new int[n];
        suffixProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffixProducts[i] = suffixProducts[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = prefixProducts[i] * suffixProducts[i];
        }

        return result;
    }

}
