
import java.util.Scanner;

public class linklist{
    Node head;

    public static class Node {
        public String data;
        public Node next = null;

        Node(String d) {
            data = d;
            next = null;
        }
    }

    public static linklist create_node(linklist list, String d) {
        Node temp = new Node(d);
        temp.next = null;
        if (list.head == null) {
            list.head = temp;
        } else {
            Node tail = list.head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = temp;

        }
        return list;
    }

    public static void print(linklist list) {
        Node temp = list.head;
        while (list != null) {
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
    }

    public static void main(final String arg[]) {
        linklist node = new linklist();
        node = create_node(node, "Hello");
        node = create_node(node, "Hi");
        node = create_node(node, "How");
        node = create_node(node, "Happy");

        print(node);
    }
}