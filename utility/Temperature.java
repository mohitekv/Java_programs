import java.util.Scanner;

import utility.util;

class Temperature {
    public static void main(String arg[]) {
        util u = new util();
        System.out.println("Enter the conversion \n1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius");
        Scanner s = new Scanner(System.in);
        int ch = s.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter temperature in celsius:");
                double tem = s.nextDouble();
                double f = u.cel_to_fah(tem);
                System.out.println(f);
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit:");
                double temp = s.nextDouble();
                f = u.fah_to_cel(temp);
                System.out.println(f);
                break;
            default:
                System.out.println("wrong input");
        }

    }
}