import java.io.*;
import unordered_list.*;
import demo.*;

public class unorderedList {
    public static void main(String arg[]) throws Exception {
        LinkLinkList list = new LinkLinkList();

        String str1 = "";
        File file = new File("/home/admin1/Desktop/ShellScripting/java/logical/DataStructure/unordered_list/test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String str;
        while ((str = br.readLine()) != null)
            str1 = str1 + str;
        String words[] = str1.split(" ");
        for (int i = 0; i < words.length; i++)
            list.insertAtLast(words[i]);
        list.displayFromStart();

    }
}