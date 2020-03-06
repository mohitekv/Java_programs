import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

class Binary {
    public static int binary_search(String arr[], String word) {
        int low = 0;
        int flg = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // A midVal = a[mid];

            if (word.compareTo(arr[mid]) > 0) {
                low = mid + 1;
            }

            else if (word.compareTo(arr[mid]) < 0) {
                high = mid - 1;
            } else {
                return mid;

            }
        }
        return 0;
    }

    public static void main(String[] arg) throws Exception {
        String str1 = null;
        File file = new File("/home/admin1/Desktop/ShellScripting/java/logical/Algorithm/unordered_list/test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while ((str = br.readLine()) != null)
            str1 = str1 + str;
        System.out.println(str1);
        String words[] = str1.split(" ");
        System.out.println("Enter word you want to find:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int index = binary_search(words, word);
        System.out.println(index);

    }
}