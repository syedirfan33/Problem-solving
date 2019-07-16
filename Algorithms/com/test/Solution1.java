package com.test;

public class Solution1 {

    public static void main(String[] args) {
        String str = "abab";

    }

    public static int shortestPalindrome(String s) {
        // Write your code here
        System.out.println(findMinInsertions(s.toCharArray(), 0, s.length() - 1));
        return 0;
    }

    static int findMinInsertions(char str[], int l, int h) {
        // Base Cases
        if (l > h)
            return Integer.MAX_VALUE;
        if (l == h)
            return 0;
        if (l == h - 1)
            return (str[l] == str[h]) ? 0 : 1;

        return (str[l] == str[h]) ? findMinInsertions(str, l + 1, h - 1)
                : (Integer.min(findMinInsertions(str, l, h - 1), findMinInsertions(str, l + 1, h)) + 1);
    }

}