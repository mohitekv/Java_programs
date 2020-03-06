import demo.*;
import java.util.Arrays;

import demo.stackLinkList;

public class StackAnagram {
    public static void main(String arg[]) {
        LinkList stack = new LinkList();
        utility anagram = new utility();
        int arr[] = new int[25];
        arr = anagram.prime(100);
        int k = arr.length;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                int flg = anagram.anagramfun(arr[i], arr[j]);
                if (flg == 1) {
                    stack.insertAtLast(arr[i]);
                }

            }
        }
        stack.displayFromStart();
        System.out.println();
       

    }
}