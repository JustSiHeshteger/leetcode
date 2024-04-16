package ru.zvrg.ContainerWithMostWater;

public class Main {
    public static void main(String[] args) {
        var height = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;

        while (left < right) {
            int curArea = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, curArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
