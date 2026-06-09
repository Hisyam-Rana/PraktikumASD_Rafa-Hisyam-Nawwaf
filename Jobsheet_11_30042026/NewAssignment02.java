package Jobsheet_11_30042026;

public class NewAssignment02 {
    static int max = 5;
    static int[] wareHouse = new int[max];
    static int front = -1;
    static int rear = -1;

    public static void enqueue(int idItem) {
        if (front == -1) front = 0;
        rear++;
        wareHouse[rear] = idItem;
    }

    public static void print() {
        System.out.print("Printed Output : ");
        for (int i = front; i <= rear; i++) {
            System.out.print(wareHouse[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        enqueue(100);
        enqueue(200);
        enqueue(300);
        print(); 
    }
}
