package ru.zvrg.KidsWiththeGreatestNumberofCandies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        final int maxCandies = Arrays.stream(candies).max().orElse(0);
        return Arrays.stream(candies)
                .mapToObj(candy -> candy + extraCandies >= maxCandies)
                .collect(Collectors.toList());
    }
}
