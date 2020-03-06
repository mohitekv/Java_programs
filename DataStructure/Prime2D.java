import java.util.EventListener;

public class Prime2D {
    public static void main(String arg[]) {

        int arr[][] = new int[10][100];
        int k = 0;
        int l = 0, m = 0;
        int count = 0;
        for (l = 0; l < 10; l++) {
            for (m = 0; m < 100; m++) {
                int cnt = 0;
                count++;
                for (int j = 1; j <= count; j++) {
                    if (count % j == 0)
                        cnt++;
                }
                if (cnt == 2) {
                    arr[l][m] = count;
                    System.out.print(arr[l][m] + " ");
                }

            }
            System.out.println();
        }

    }
}