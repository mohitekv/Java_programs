import java.util.Scanner;
import java.io.*;
import java.util.*;

class PermutationsRecursion {
    public static void permutation(char[] string, int postion) {
        if (string.length - 1 == postion) {
            String string1 = new String(string);
            System.out.println(string1);
        }
        for (int i = postion; i < string.length; i++) {
            swap(string, postion, i);
            permutation(string, postion + 1);
            swap(string, postion, i);
        }
    }

    //function for swaping the words
    public static void swap(char[] word, int start, int last) {
        char temp = word[start];
        word[start] = word[last];
        word[last] = temp;
    }

    public static void main(String arg[]) {
        System.out.println("Enetr a String to find its permutation using recursion");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Permutations are:");
        permutation(string.toCharArray(), 0);
    }
}