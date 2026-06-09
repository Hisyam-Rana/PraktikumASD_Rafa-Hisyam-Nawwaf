package Jobsheet_11_30042026;
import java.util.Scanner;
public class NewAssignment05 {
    static int maxQueue = 5;
    static int[] bookQueue = new int[maxQueue];
    static int front = -1, rear = -1;

    static int maxStack = 5;
    static int[] stackArchive = new int[maxStack];
    static int top = -1;

    public static boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public static void enqueue(int idBook) {
        if (front == -1) front = 0;
        rear++;
        bookQueue[rear] = idBook;
    }

    public static int dequeue() {
        int data = bookQueue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return data;
    }

    public static void push(int data) {
        top++;
        stackArchive[top] = data;
    }

    public static int peek() {
        if (top != -1) return stackArchive[top];
        return -1;
    }

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        
        System.out.println("Input 3 Book ID :");
        for (int i = 0; i < 3; i++) {
            System.out.print("The " + (i+1) + "-th book : ");
            int id = isc.nextInt();
            enqueue(id);
        }

        while (!isEmpty()) {
            int dataDipindah = dequeue();
            push(dataDipindah);
        }

        System.out.println("\nBook ID at the very top in the Stack: " + peek());
        
        isc.close();
    }
}
