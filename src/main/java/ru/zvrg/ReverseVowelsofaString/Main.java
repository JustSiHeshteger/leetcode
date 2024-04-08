package ru.zvrg.ReverseVowelsofaString;

public class Main {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (isVowel(chars[i]) && isVowel(chars[j])) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } else if (!isVowel(chars[i])) {
                i++;
            } else if (!isVowel(chars[j])) {
                j--;
            }
        }

        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
