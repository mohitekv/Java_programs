import java.lang.*;
class hello {

    public static void main(String arg[]) {
        int x = (int) (Math.random() * (4 - 0));
        System.out.println(x);
        char c = '-';
        char ch = 'x';
        char b[][]=new char[1][1];
        b[0][0]='-';
        if (c.equals(b[0][0])) {
            System.out.println("hello");
        } else
            System.out.println("bye");
    }
}