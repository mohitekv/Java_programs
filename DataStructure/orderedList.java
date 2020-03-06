import java.io.*;
import java.util.Scanner;

import unordered_list.*;
import demo.*;

public class orderedList {
    public static void main(String arg[]) throws Exception {
        LinkLinkList list = new LinkLinkList();

        File file = new File("/home/admin1/Desktop/ShellScripting/java/logical/DataStructure/text2.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;
        String str1 = "";

        // reading data from file and converting it into String
        while ((str = br.readLine()) != null)
            str1 = str1 + str;

        // spliting the string into string array
        String words[] = str1.split(" ");

        // inserting data into linklist
        for (int i = 0; i < words.length; i++)
            list.insertAtLast(words[i]);

        // displaying linklist
        System.out.println("LinkList data");
        list.displayFromStart();
        System.out.println();

        // data want to search
        System.out.println("Enter the data want to search:");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();

        // if the given data is present then delet or insert it in its proper position
        list.delete_given_value(search);
        System.out.println();

        // displaying modifies linklist
        System.out.println("link-list after modification:");
        list.displayFromStart();

        String insertString = list.toString();
        System.out.println(insertString);
        BufferedWriter bwr = new BufferedWriter(new FileWriter(file));

        bwr.write(insertString);
    }
}