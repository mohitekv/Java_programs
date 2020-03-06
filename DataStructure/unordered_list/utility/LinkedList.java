package utility;

import utility.Node;
import java.io.*;

public class LinkedList {
    // Node head;

    public Node insert(Node node1, String data) {
        // Create a new node with given data
        Node node2 = node1;
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (node1 == null) {
            return newNode;
        } else {
            while (node1.next != null) {
                node1 = node1.next;
            }
            node1.next = newNode;
        }
        return node2;
    }

    // Method to print the LinkedList.
    public void printList(LinkedList list) {
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

}
