public class dequeue {
    int front, rear, size;
    int array[];
    int capacity;
    int count;

    public dequeue(int c) {
        front = -1;
        rear = 0;
        size = 0;
        capacity = c;
        array = new int[c];
    }

    public void addfront(int data) {
        if (full()) {
            System.out.println("queue is full");
            System.exit(1);
        }
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            front--;
        }
        array[front] = data; 

    }

    public void addrear(int data) {
        if (full()) {
            System.out.println("queue is full");
            System.exit(1);
        } else {
            rear++;
            array[rear] = data;
            size++;
        }
    }

    public void remove() {
        if (isempty()) {
            System.out.println("Queue is empty");
            System.exit(1);
        } else {
            front++;
            size--;
        }
    }

    public void display() {
        int i = front;
        while (i <= rear) {
            System.out.println(array[i]);
            i++;
        }

    }

    public boolean isempty() {
        return (size() == 0);
    }

    public boolean full() {
        return (size() == capacity);
    }

    public int size() {
        return size;
    }

    public static void main(String arg[]) {

        dequeue que = new dequeue(100);
        que.addrear(10);
        que.addrear(20);
        que.addrear(30);
        que.addfront(90);
        que.display();
    }
}