import java.util.Scanner;


public class link_list {
    Node head;

    static class Node {
        public String data;
        public Node next;

        Node(String d) {
            data = d;
            next = null;
        }
    }
        public static link_list create_node(link_list list, String d) {
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

        public static void print(link_list list) {
            Node temp = list.head;
            while (list != null) {
                System.out.println(temp.data + "  ");
                temp = temp.next;
            }
        }

    

    public static void main(String arg[]) {
        link_list node = new link_list();
        
        node = create_node(node, "Hello");
        node = create_node(node, "Hi");
        node = create_node(node, "How");
        node = create_node(node, "Happy");
         
        print(node);
    }
}