import utility.util;

import java.util.Scanner;

class Day_of_week {
    public static void main(String arg[]) {
        util u = new util();
        System.out.println("Enter date,month,year");
        Scanner s = new Scanner(System.in);
        int date = s.nextInt();
        int month = s.nextInt();
        int year = s.nextInt();
        int day = 0;
        if (date < 31 && month < 12 && year > 999) {
            day = u.day_of_week(month, date, year);
            //System.out.println(day);
        }
        switch(date)
        {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
        }
    }
}