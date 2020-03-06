import java.util.Scanner;

public class Calender {
    public static int day(int month, int day, int year) {
        int y = year - ((14 - month) / 12);
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + (12 * (14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        return d;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
            return true;
        else
            return false;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of month and year");
        int month = sc.nextInt();
        int year = sc.nextInt();
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // Checking for leap Year
        if (month == 2 && isLeapYear(year))
            days[month] = 29;
        else
            days[month] = 28;
        // month should be from 1 to 12
        // Year should be more than 4 digit
        if (month > 12 || year < 1000)
            System.out.println("Wrong input");
        else {
            System.out.println(" Su   M   Tu   W   Th   F  S");
            int d = day(month, 1, year);
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