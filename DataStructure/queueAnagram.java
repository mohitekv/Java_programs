import demo.*;
import java.util.Arrays;
public class queueAnagram {
    public static void main(String arg[]) {
        LinkList queue = new LinkList();
        utility anagram = new utility();
        System.out.println("Collecting Anagram in a Queue using the Linked List");
        int arr[] = new int[25];
        arr = anagram.prime(100);
        int k = arr.length;
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                int flg = anagram.anagramfun(arr[i], arr[j]);
                if (flg == 1) {
                    queue.insertAtLast(arr[i]);
                }

            }
        }
        System.out.println();
        queue.displayFromStart();
    }
}