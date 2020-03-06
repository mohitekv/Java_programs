package unordered_list;

import java.io.*;

public class LinkLinkList {
    // creating linllist class having data and a next node
    public class linklist {
        String data;
        linklist next;
    }

    linklist head;
    linklist tail;

    // creating constructor
    public LinkLinkList() {
        this.tail = null;
    }

    // method for inserstion at last position
    public void insertAtLast(String data1) {
        linklist temp = new linklist();
        // if linklist is empty create a new one
        if (head == null) {
            temp.data = data1;
            temp.next = null;
            head = temp;
            tail = temp;
        } else {
            temp.data = data1;
            tail.next = temp;
            temp.next = null;
            tail = temp;
        }
    }

    public void insertAtStart(String data1) {
        linklist temp = new linklist();
        // if linklist is empty create a new one
        if (head == null) {
            temp.data = data1;
            temp.next = null;
            head = temp;
            tail = temp;
        } else {
            temp.data = data1;
            temp.next = head;
            head = temp;
        }

    }

    // deleting node from start of the linklist
    public void deletFromStart() {
        linklist temp = new linklist();
        if (head == null) {
            System.out.println("linklist is empty:");
        } else {
            head = head.next;

        }
    }

    // deleting node from last of the linklist
    public void deletFromlast() {
        linklist temp = new linklist();
        if (head == null) {
            System.out.println("linklist is empty:");
        } else {
            temp = tail;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = null;
            head = temp;
        }
    }

    // print the linklist
    public void displayFromStart() {
        linklist temp = head;
        while (temp != null) {
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
    }

    // deleting given data from linklist
    public void delete_given_value(String data1) {
        linklist temp = head;
        linklist temp2 = head;
        int flag = 0;
        while (temp.next != null) {
            if (temp.next.data.compareTo(data1) != 0) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
            temp = temp.next;
        }
        // temp = temp.next;
        if (flag == 0) {
            temp2 = temp.next;
            System.out.println("Data found so deleting the data:");
            temp.next = temp2.next;
        } else {
            System.out.println("Data not found so inserting the data");
            insert_given_value(data1);
        }

    }

    // inserting given data in linklist
    public void insert_given_value(String data1) {
        linklist temp = head;
        linklist temp2 = new linklist();
        int flag = 0;
        while (temp.next != null) {
            int data_conv = Integer.parseInt(temp.next.data);
            int data1_conv = Integer.parseInt(data1);
            if (data1_conv > data_conv) {
                flag = 0;
                // break;
            } else {
                flag = 1;
                break;
            }
            temp = temp.next;
        }
        if (flag == 1) {
            temp2.data = data1;
            temp2.next = temp.next;
            temp.next = temp2;

        }
    }

    // converting given linklist into string
    public String toString() {
        linklist temp = head;
        String string = "";
        while (temp.next != null) {
            string += temp.data;
            string += " ";
            temp = temp.next;
        }
        return string;
    }
}

/*
 * public static void main(String arg[]) { stackLinkList s = new
 * stackLinkList(); s.insertAtLast(10); s.insertAtLast(20); s.insertAtLast(40);
 * s.insertAtLast(50); s.insertAtLast(60); s.display();
 * System.out.println("After deleting"); s.deletFromStart(); s.deletFromStart();
 * 
 * s.display(); s.insertAtLast(70); s.insertAtLast(80); System.out.println();
 * s.display(); System.out.println("After deleting"); s.deletFromStart();
 * s.deletFromStart();
 * 
 * s.display(); }
 */
