import java.util.Scanner;

class coupon
{
    public static boolean checking_distinct_coupons(int number,int array[],int count)
    {
        int flag=0;
        //if count is equal or greater than 1 then check for distinct numbers
        if(count>=1)
        {
            //checking whether new number is present in array or not
            //checking from 0th position till position-1
            for(int i=0;i< count;i++)
            {
                if(array[i]==number)
                {
                    flag=1;
                    break;
                }
                else
                    flag=0;
            }
            if(flag==1)
                return true;
            else
                return false;
        }
        else
            return false;
        
        //System.out.println("  "+count);
        
    }
    
    public static void main(String arg[])
    {
      System.out.print("Enter the number of random number you want:  ");
      Scanner scanner=new Scanner(System.in);
      int count=scanner.nextInt(); 
      int trail_count=0;
      int array[]=new int[count];
      for(int i=0;i<count;i++)
      {
          trail_count++;
          int number =(int)(Math.random()*100);
          //int number=scanner.nextInt();
           array[i]=number;
           //System.out.println("hello");
            if(checking_distinct_coupons(number,array,i))
            {
                    i--;
            }
           
                  
      }
    System.out.println("Random numbers are");
     for(int i=0;i<count;i++)
    {
          System.out.print("  "+array[i]);
    }
      System.out.println();
      System.out.println("Total iteration to generate distinct random number are:"+trail_count);
    }
}