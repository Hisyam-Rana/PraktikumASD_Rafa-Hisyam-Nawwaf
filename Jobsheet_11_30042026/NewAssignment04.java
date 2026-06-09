package Jobsheet_11_30042026;

public class NewAssignment04 {
    static int max = 5;
    static int[] clinic = new int[max];
    static int front = -1;
    static int rear = -1;

    public static void enqueue(int idPatient) {
        if (front == -1) front = 0;
        rear++;
        clinic[rear] = idPatient;
    }

    public static void dequeue() {
        if (front == -1) {
            System.out.println("The Queue is Empty!!");
        } else {
            System.out.println("Patient " + clinic[front] + " called by doctor.");
            if (front == rear) {
                front = -1;
                rear = -1;
                System.out.println("The Pointer is reset because the queue is empty.");
            } else {
                front++;
            }
        }
    }

    public static void main(String[] args) {
        enqueue(101);
        enqueue(102);
        enqueue(103);

        dequeue();
        dequeue();
        dequeue();

        System.out.println("\nFront Value   : " + front);
        System.out.println("Rear Value    : " + rear);
    }
}
