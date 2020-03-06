import java.io.*;

public class LinkedList {

    Node head;

    static class Node {

        String data;
        Node next;

        // Constructor
        Node(String d) {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, String data) {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.println("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

        File file = new File("/home/admin1/Desktop/ShellScripting/java/logical/Algorithm/unordered_list/test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;
        while ((str = br.readLine()) != null)
            list = insert(list, str);

        // Print the LinkedList
        printList(list);
    }
}
