import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class insertion {
    public static void insertion_sort(String arr[]) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && key.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    public static void main(String arg[]) throws Exception {
        String str1 = "";
        File file = new File("/home/admin1/Desktop/ShellScripting/java/logical/DataStructure/unordered_list/test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while ((str = br.readLine()) != null)
            str1 = str1 + str;
        System.out.println(str1);
        String words[] = str1.split(" ");
        insertion_sort(words);
    }
} 