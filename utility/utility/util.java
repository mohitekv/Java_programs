package utility;

public class util {

    //calculating day by using formulas
    public int day_of_week(int month, int day, int year) {
        int y = year - ((14 - month) / 12);
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + (12 * (14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        return d;
    }

    //method to convert cel temp to fah temp
    public double cel_to_fah(Double temp) {
        return ((temp * 9 / 5) + 32);
    }

    //method to convert fah temp inti cel temp
    public double fah_to_cel(double temp) {
        return ((temp - 32) * 5 / 9);
    }

    //method to convert decimal to binary
    public void binary(int num) {
        int b[] = new int[10];
        int j = 0;
        do {
            int i = num % 2;
            // System.out.print(i);
            b[j] = i;
            j++;
            num = num / 2;
        } while (num > 0);
        for (int i = j - 1; i >= 0; i--)
            System.out.print(b[i] + "  ");
    }

    //convert deminal to binary
    //diving binary array into nibbles and swap them
    //from generated swap nibbles convert the binary to decimal
    public int swap_nibbles(int num) {

        int b[] = new int[10];
        int j = 0;
        do {
            int i = num % 2;
            // System.out.print(i);
            b[j] = i;
            j++;
            num = num / 2;
        } while (num > 0);
        int len = b.length;
        int half1[] = new int[4];
        int half2[] = new int[4];
        int k = 0;
        // breaking the array into half1 and half 2
        for (int i = 0; i < j / 2; i++) {
            half1[i] = b[i];
        }

        for (int i = j / 2; i < j; i++) {
            half2[k] = b[i];
            k++;
        }
        // creating a new array to store swappes binary array.
        int newlength = half1.length + half2.length;
        int swap_nibble[] = new int[newlength];
        // concatenated array
        System.arraycopy(half2, 0, swap_nibble, 0, 4);
        System.arraycopy(half1, 0, swap_nibble, 4, 4);
        int result = 0;
        int pow = 0;
        // converting swaped binary array into decimal
        for (int i = newlength - 1; i >= 0; i--) {
            result += swap_nibble[i] * Math.pow(2, pow);
            pow++;
        }
        return result;

    }
}