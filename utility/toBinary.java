import java.util.Scanner;

import utility.util;

class toBinary {
    public static void main(String arg[]) {
        util u = new util();
        System.out.println("Enter a decimal value:");
        Scanner s = new Scanner(System.in);
        int dec = s.nextInt();
        u.binary(dec);
    }
}