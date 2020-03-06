import java.util.Scanner;

import demo.*;

class Deque {
    public static void main(String arg[]) {
        DeLinkList deque = new DeLinkList();
        System.out.println("Enter a String to check if it is palindrome or not");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            deque.insertAtLast(string.charAt(i));
        }

        deque.displayFromStart();
        System.out.println("Check if its palindrome");
        if (deque.palindrome()) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Is not palindrome");
        }

    }
}