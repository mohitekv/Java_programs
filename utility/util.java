package utility;

public class util {
    public int day_of_week(int month, int day, int year) {
        int y = year - ((14 - month) / 12);
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + (12 * (14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        System.out.println(d);
        return d;
    }

    public float cel_to_fah(float temp) {
        return ((temp * 9 / 5) + 32);
    }

    public float fah_to_cel(float temp) {
        return ((temp - 32) * 5 / 9);
    }

    public int[] binary(int num) {
        int b[] = new int[10];
        int j = 0;
        do {
            int i = num;
            // System.out.print(i);
            b[j] = i;
            j++;
            num = num / 2;
        } while (num > 0);
        for (int i = j - 1; i >= 0; i--)
            System.out.print(b[i]);
        return b;
    }

    public int swap_nibbles(int num) {

        int b[] = new int[10];
        int j = 0;
        do {
            int i = num;
            // System.out.print(i);
            b[j] = i;
            j++;
            num = num / 2;
        } while (num > 0);
        int len = b.length;
        int half1[] = new int[10];
        int half2[] = new int[10];
        int k = 0;
        for (int i = 0; i < (len - 1) / 2; i++) {
            half1[i] = b[i];
        }

        for (int i = (len - 1) / 2; i < len - 1; i++) {
            half1[k] = b[i];
            k++;
        }
        return 0;
    }
}