import java.util.Scanner;

class Gambler {
    public static void main(String arg[]) {
        System.out.println("Enter the value of stack,goal and number of attempt");
        Scanner scanner = new Scanner(System.in);
        //declaring Variables
        int stake = scanner.nextInt();
        int goal = scanner.nextInt();
        int attempts = scanner.nextInt();
        int count_of_attempt=0;
        int win_count=0;
        int loose_count=0;
        
        /* */
        for(int i=0;i<attempts;i++)
        {
           int luck =(int)Math.round(Math.random());
           if(luck==0)
           {
               if(stake>=0)
               {
                   stake--;
                   loose_count++;
                   System.out.println("Stake now is: "+stake);
               }
               else
               {
                   break;
               }
           }
           else if(luck==1)
           {
               if(stake<=goal)
               {
                   stake++;
                   win_count++;
                   System.out.println("Stake now is: "+stake);
               }
               else
               {
                   break;
               }
           }
           count_of_attempt++;
        }
        System.out.println(win_count);
        System.out.println(loose_count);
        System.out.println(count_of_attempt);
        if(win_count>loose_count)
        {
            int per_win=((win_count*100)/count_of_attempt);
            System.out.println("win percentage is: "+per_win+"%");
        }
        else 
        {
            int per_loose=((loose_count*100)/count_of_attempt);
            System.out.println("Lose percentage is:"+per_loose+"%");
        }
    }
}