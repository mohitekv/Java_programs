import java.util.Scanner;
import utility.util;

class Swap_Nibbles {
    public static void main(String arg[]) {
        util u = new util();
        System.out.println("Enter the deciaml so as to swap the binary nipples and convert into decimal");
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        u.swap_nibbles(num);
        System.out.println("decimal value after Swap is:"+u.swap_nibbles(num));
    }
}