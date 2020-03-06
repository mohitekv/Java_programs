
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Search1<A> {
    public A[] a;

    public Search1(A[] v) {
        a = v;

    }

    public <A extends Comparable<A>> int searchArry(A[] a, A v)
    {
        int low = 0;
        int flg = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            //A midVal = a[mid];

            if (v.compareTo(a[mid]) < 0) {
                low = mid + 1;
            }

            else if (v.compareTo(a[mid]) > 0) {
                high = mid - 1;
            } else {
                return mid;

            }
        }
        return 0;

    }

    public A show(int i)
    {
       return a[i];
    }
}
 public class Generic
{
   
    public static void main(String sdd[])
    {
        Integer a[] = { 3, 5, 2, 78, 4, 0, 10 };
        Search1<Integer> obj = new Search1<Integer>(a);
        System.out.println("");
        System.out.println("Enter search key:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 7;i++)
        {
            System.out.print(obj.show(i)+"   ");
        }
        System.out.println();
        int flg = obj.searchArry(a,n);
        if(flg==0)
        {
            System.out.println("Given input is not present");
        }
        else
            System.out.println("Given input is present");
      //  obj.show();
    }
}