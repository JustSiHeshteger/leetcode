package ru.zvrg.IsSubsequence;

public class Main {
    public static void main(String[] args) {
        final String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int iterS = 0, iterT = 0;
        while (iterS < s.length() && iterT < t.length()) {
            if (s.charAt(iterS) == t.charAt(iterT)) {
                iterS++;
            }
            iterT++;
        }

        return iterS == s.length();
    }
}
