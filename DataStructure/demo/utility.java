package demo;

import java.util.Arrays;
import java.util.Scanner;

public class utility {
    // Function created to check anagrams in the prime number array
    public static int anagramfun(int n1, int n2) {
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        int flg = 0;
        if (s1.length() == s2.length()) {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            for (int l = 0; l < c1.length; l++) {
                if (c1[l] == c2[l]) {
                    flg = 1;
                } else {
                    flg = 0;
                    break;
                }
            }
        }
        if (flg == 1) {
            return 1;
        } else
            return 0;
    }

    public static int[] prime(int n) {
        int k = 0;
        // Checking for prime numbers
        int a[] = new int[25];
        for (int i = 2; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    cnt++;
            }
            if (cnt == 2) {
                a[k] = i;
                k++;
            }
        }
        return a;
    }
}