import java.util.Scanner;
public class StopWatch {  
    public static void main(String[] args) {
        System.out.println("press 's' to start the stop-watch and 'n' to stop");
        Scanner scanner=new Scanner(System.in);
        char input=scanner.next().charAt(0);
        if(input=='s'||input=='S')
        {
            
           long startTime = System.currentTimeMillis();
           while(true)
           {
               input=scanner.next().charAt(0);
               if(input=='n'||input=='N')
               {
                   break;
               }
           }
           long endTime = System.currentTimeMillis();
           System.out.println("Start Time is:"+startTime/1000.0);
           System.out.println("End time is:"+endTime/1000.0);
            
        }
        else
        {
            System.out.println("Enter a proper input:");
        }        
    }
} 