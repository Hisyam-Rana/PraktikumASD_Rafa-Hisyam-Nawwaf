package Jobsheet_11_30042026;
import java.util.Scanner;
public class NewAssignment03 {
    static int max;
    static int[] queue;
    static int front = -1;
    static int rear = -1;

    public static boolean isFull() {
        return rear == max - 1;
    }

    public static void enqueue(int data) {
        if (isFull()) {
            System.out.println("The Queue is full!!");
        } else {
            if (front == -1) front = 0;
            rear++;
            queue[rear] = data;
        }
    }

    public static int peek() {
        if (front != -1) {
            return queue[front];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Input Maximum Capacity : ");
        max = isc.nextInt();
        queue = new int[max];

        System.out.println("Is the Queue full ? " + isFull());
        enqueue(101);

        System.out.println("Front of the Queue : " + peek());
        
        isc.close();
    }
}
