import java.util.EventListener;
import java.util.Queue;
import java.util.Scanner;

import demo.queue;

class Banking {
    public static int total_money = 10000;
    public static queue que = new queue(100);

    public static void choice() {

        System.out.println("\n\nPlease select");
        System.out.println(
                "1.Display Amount\n2.Add amount\n3.Withdraw amount\n4.Add a person to queue\n5.delete a person from queue\n6.display Queue\n7.Exit");
        Scanner s = new Scanner(System.in);
        int person;
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Total amount is:" + total_money);
                choice();
                break;
            case 2:
                if (que.isempty()) {
                    System.out.println("First add a person in a queue");
                } else {
                    System.out.println("Enter amount to be deposit:");
                    int amount = s.nextInt();
                    total_money += amount;

                }
                choice();
                break;
            case 3:
                if (que.isempty()) {
                    System.out.println("First add a person in a queue");
                } else {
                    System.out.println("Enter amount to be withdraw:");
                    int amount = s.nextInt();
                    total_money -= amount;
                    choice();
                    break;
                }

            case 4:
                System.out.println("Enter persons Id:");
                person = s.nextInt();
                que.enqueue(person);
                choice();
                break;
            case 5:
                que.dequeue();
                choice();
                break;
            case 6:
                System.out.println("Persons with are in queue");
                que.display();
                choice();
                break;
            case 7:
                System.exit(1);
        }
    }

    public static void main(String arg[]) {
        choice();

    }

}
