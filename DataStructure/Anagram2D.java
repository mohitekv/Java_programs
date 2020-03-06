import java.util.Arrays;
import java.util.Scanner;

class Anagram2D {
    static boolean prime(int number) {
        int cnt = 0;
        for (int j = 1; j <= number; j++) {
            if (number % j == 0)
                cnt++;
        }
        if (cnt == 2) {
            return true;
        } else
            return false;
    }

    static boolean anagram(int n1, int n2) {
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
            return true;
        } else
            return false;
    }

    public static void main(String arg[]) {
        int prime[] = new int[1000];
        int anagram[] = new int[1000];
        int not_anagram[] = new int[1000];
        int array[][] = new int[2][500];
        int k = 0, m = 0, n = 0;
        int flag = 1;
        for (int i = 0; i < 1000; i++) {
            if (prime(i)) {
                prime[k] = i;
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (anagram(prime[i], prime[j])) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 0) {
                array[0][m] = prime[i];
                m++;

            } else {

                array[1][n] = prime[i];
                n++;
            }

        }
        System.out.println(n);
        System.out.println(m);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < m || j < n; j++) {
                if (j == m) {
                    break;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}