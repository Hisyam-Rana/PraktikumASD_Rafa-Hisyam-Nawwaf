package Jobsheet_11_30042026;

public class NewAssignment01 {
    static int max = 5;
    static int[] queue = new int[max];
    static int front = -1;
    static int rear = -1;

    static void enqueue(int data) {
        if (rear == max -1) {
            System.out.println("Queue is Full!!");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = data;
        }
    }

    static void print() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty!!");
        } else {
            System.out.print("Fill the Queue : ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        enqueue(15);
        enqueue(30);
        print();
    }
}
