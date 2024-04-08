package ru.zvrg.GreatestCommonDivisorofStrings;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!Objects.equals(str1 + str2, str2 + str1)) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private static int gcd(int a, int b) {
        return b==0 ? a : gcd(b, a%b);
    }
}
