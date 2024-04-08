package ru.zvrg.StringCompression;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }

    public static int compress(char[] chars) {
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            int count = 1;

            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            chars[index++] = chars[i];
            if (count > 1) {
                char[] countChars = String.valueOf(count).toCharArray();
                for (char c : countChars) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
