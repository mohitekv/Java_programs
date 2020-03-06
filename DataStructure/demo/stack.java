package demo;

public class stack {
    int top = -1;
    char data[] = new char[100];

    public void push(char ch) {
        if (top == 99) {
            System.out.println("Stsck is full:");
        } else {
            top++;
            data[top] = ch;
        }

    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty:");
            // return 0;
        } else {
            char element = data[top];
            top--;
            // return element;
        }
    }

    public void display() {
        int i = top;
        while (i >= 0) {
            System.out.println(data[i]);
            i--;
        }
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public int size() {
        return top;
    }

}