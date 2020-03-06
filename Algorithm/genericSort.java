import java.util.Scanner;
class Sort1<S>
{
    public S arr[];
    public Sort1(S[] arr1)
    {
        arr = arr1;

    }

    public <S extends Comparable<S>> void sortArry(S[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            S key = arr[i];
            int j = i - 1;
            while(j>=0 && key.compareTo(arr[j]) < 0)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public S show(int i)
    {
       return arr[i];
    }
}
class genericSort {
    public static void main(String arg[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("1.Integer \t 2.String \t 3.float");
        int opt=s.nextInt();
        System.out.println("Enter the lenth of array");
        int n = s.nextInt();
        Sort1 obj;
        
       
        switch(opt)
        {
            case 1:
                System.out.println("Enter the values:");
                Integer num[] = new Integer[n];
                for(int i=0;i<n;i++)
                  num[i] = s.nextInt();
                obj = new Sort1<Integer>(num);
                System.out.println("Original array is:");
                for (int i = 0; i < n;i++)
                {
                  System.out.print(obj.show(i)+"   ");
                }
                System.out.println();
                obj.sortArry(num);
                System.out.println("Array after Insertion sorting is:");
                for (int i = 0; i < n;i++)
                {
                    System.out.print(obj.show(i)+"   ");
                }
                break;
            case 2:
                System.out.println("Enter the values:");
                String str[] = new String[n];
                for(int i=0;i<n;i++)
                  str[i] = s.nextLine();
                obj = new Sort1<String>(str);
                System.out.println("Original array is:");
                for (int i = 0; i < n;i++)
                {
                  System.out.print(obj.show(i)+"   ");
                }
                System.out.println();
                obj.sortArry(str);
                System.out.println("Array after sorting is:");
                for (int i = 0; i < n;i++)
                {
                  System.out.print(obj.show(i)+"   ");
                }
                break;
            case 3:
                System.out.println("Enter the values:");
                Float fl[] = new Float[n];
                for(int i=0;i<n;i++)
                 fl[i] = s.nextFloat();
                obj = new Sort1<Float>(fl);
                System.out.println("Original array is:");
                for (int i = 0; i < n;i++)
                {
                  System.out.print(obj.show(i)+"   ");
                }
                System.out.println();
                obj.sortArry(fl);;
                System.out.println("Array after sorting is:");
                for (int i = 0; i < n;i++)
                {
                    System.out.print(obj.show(i)+"   ");
                }
                break;
        }        
        

        
        
        System.out.println("");
       
        
    }
}