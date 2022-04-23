package com.Exam;

import java.util.Arrays;
import java.util.Scanner;

public class MagicalPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the String");
        String s = in.next();

        System.out.println("Og string "+s);
        System.out.println(longestPalindrome(s));

    }
    static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}
