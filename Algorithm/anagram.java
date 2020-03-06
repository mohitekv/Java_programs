import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String asd[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range:");
        int n = s.nextInt();
        int k = 0;
        // Checking for prime numbers
        int a[] = new int[100];
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
        // Print Prime number
        System.out.println("Prime numbers are:");
        for (int i = 0; i < k; i++) {
            System.out.println(a[i]);
        }
        // Prints anagram number
        System.out.println("Anagrams are:");
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                int flg = anagramfun(a[i], a[j]);
                if (flg == 1) {
                    System.out.println(a[i] + " " + a[j]);
                }

            }
        }

    }

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
}