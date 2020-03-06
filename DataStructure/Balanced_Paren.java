import java.io.*;
import java.util.Scanner;
import demo.stack;
public class Balanced_Paren {

    public static boolean isBalanced(String exp) {
        stack st = new stack();
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '[') {
                st.push(exp.charAt(i));
            }
            if (exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']') {
                st.pop();
            }
        }
        if (st.isEmpty())
            return false;
        else
            return true;
    }

    public static void main(String arg[]) {

        System.out.println("Enter an expression");
        Scanner s = new Scanner(System.in);
        String exp = s.nextLine();
        if (isBalanced(exp)) {
            System.out.println("Not balanced");
        } else
            System.out.println("balanced");
    }
}