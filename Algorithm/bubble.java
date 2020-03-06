import java.util.Scanner;

public class bubble {
    public static void main(String asd[]) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        System.out.println("enter length of string:");
        n = s.nextInt();
        int no[] = new int[n];
        for(int i=0;i<n;i++)
            no[i] = s.nextInt();
        System.out.println("array before sort:");
        for(int i=0;i<n;i++)
            System.out.print(no[i]);
        for(int i=0;i<n-1;i++)
        {
            for (int j = 0; j < n - i-1; j++) {
                if (no[j] > no[j + 1]) {
                   int temp = no[j];
                    no[j] = no[j + 1];
                    no[j + 1] = temp;
                }
            }
        }
        System.out.println("array before sort:");
        for(int i=0;i<n;i++)
            System.out.print(no[i]);
         
    }
}