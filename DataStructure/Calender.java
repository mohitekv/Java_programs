import java.util.Scanner;
import demo.*;

public class Calender {

    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
            return true;
        else
            return false;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        calender calender = new calender();
        System.out.println("Enter value of month and year");
        int month = sc.nextInt();
        int year = sc.nextInt();
        String[] months = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // Checking for leap Year
        if (month == 2 && isLeapYear(year))
            days[month] = 29;
        // month should be from 1 to 12
        // Year should be more than 4 digit
        if (month > 12 || year < 1000)
            System.out.println("Wrong input");
        else {
            System.out.println(" Su   M   Tu   W   Th   F  S");
            int d = calender.day(month, 1, year);
            for (int i = 0; i < d; i++)
                System.out.print("    ");
            // printing calender
            for (int i = 1; i <= days[month]; i++) {
                if (i <= 9)
                    System.out.print("   " + i);
                else
                    System.out.print("  " + i);
                if (((i + d) % 7 == 0) || (i == days[month]))
                    System.out.println();
            }
        }
    }
}