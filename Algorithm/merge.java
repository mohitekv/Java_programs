
import java.util.Scanner;

public class merge
{
    void Merg(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int i=0,j=0,k=l;
        int l1[] = new int[n1];
        int r1[] = new int[n2];
        for (int y=0; y<n1; ++y) 
            l1[y] = arr[l + y]; 
        for (int z=0; z<n2; ++z) 
            r1[z] = arr[m + 1 + z];
        while((i<n1)&&(j<n2))
        {
            if (l1[i] <= r1[j]) {
                arr[k] = l1[i];
                i++;
            } else {
                arr[k] = r1[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            arr[k] = l1[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = r1[j];
            j++;
            k++;

        }
    }
    void sort(int arr[], int l, int r)
    {
        if(l<r)
        {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            Merg(arr, l, m, r);
        }
        
    }

    static void printarry(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }
    public static void main(String asd[]) {
        merge m = new merge();
        Scanner s=new Scanner(System.in);
        int n=0;
        System.out.println("range of array:");
        n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enetr array:");
        for(int i=0;i<n;i++)
            arr[i] = s.nextInt();
        printarry(arr, n);
        m.sort(arr, 0, n - 1);
        System.out.println("arry:");
        System.out.println();
        printarry(arr, n);
    }

   
    
}