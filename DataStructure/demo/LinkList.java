package demo;

public class LinkList {
    public class linklist {
        int data;
        linklist next;
    }

    linklist top;
    linklist rear;

    public LinkList() {
        this.top = null;
    }

    public void insertAtLast(int data1) {
        linklist temp = new linklist();
        if (top == null) {
            temp.data = data1;
            temp.next = null;
            top = temp;
            rear = temp;

        } else {
            temp.data = data1;
            top.next = temp;
            temp.next = null;
            top = temp;
        }
    }

    public void insertAtStart(int data1) {
        linklist temp = new linklist();
        if (top == null) {
            temp.data = data1;
            temp.next = null;
            top = temp;
            rear = temp;

        } else {
            temp.data = data1;
            temp.next = rear;
            rear = temp;
        }
    }

    public void deletFromStart() {
        linklist temp = new linklist();
        if (top == null) {
            System.out.println("linklist is empty:");
        } else {
            rear = rear.next;

        }
    }

    public void deletFromlast() {
        linklist temp = new linklist();
        if (top == null) {
            System.out.println("linklist is empty:");
        } else {
            temp = rear;
            while (temp.next != top) {
                temp = temp.next;
            }
            temp.next = null;
            top = temp;
        }
    }

    public void displayFromStart() {
        linklist temp = rear;
        while (temp != null) {
            System.out.println(temp.data + "  ");
            temp = temp.next;
        }
    }

    public void displayFromEnd() {
        linklist temp = top;
        while (temp == rear) {
            System.out.println(temp.data);
            temp.next = temp;
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
}