package demo;

public class DeLinkList {
    public class linklist {
        char data;
        linklist next;
    }

    linklist top;
    linklist rear;

    public DeLinkList() {
        this.top = null;
    }

    public void insertAtLast(char data1) {
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

    public void insertAtStart(char data1) {
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

    public boolean palindrome() {
        linklist temp = rear;
        String str = "";
        while (temp != null) {
            str = str + temp.data;
            temp = temp.next;

        }
        int flg = 0;
        int j = str.length() - 1;
        for (int i = 0; i < str.length() / 2; i++) {
            
            if (str.charAt(i) != str.charAt(j)) {

                flg = 0;
                break;
            } else {
                flg = 1;
            }
            j--;
        }
        if (flg == 0)
            return false;
        else
            return true;
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