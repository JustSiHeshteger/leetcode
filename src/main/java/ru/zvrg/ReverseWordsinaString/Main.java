package ru.zvrg.ReverseWordsinaString;

public class Main {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        var strings = s.replaceAll("\\s+", " ").trim().split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = strings.length - 1; i >= 0; i--) {
            builder.append(strings[i]).append(" ");
        }

        return builder.toString().trim();
    }
}
