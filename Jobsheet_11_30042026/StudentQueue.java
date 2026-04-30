package Jobsheet_11_30042026;

public class StudentQueue {
    StudentB[] data; 
    int front, rear, size, max;

    public StudentQueue (int n) {
        max = n;
        data = new StudentB[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data  : ");
            data[front].print();
        } else {
            System.out.println("Queue is empty!!");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Rear data  : ");
            data[rear].print();
        } else {
            System.out.println("Queue is empty!!");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return;
        }
        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i +1) % max;
        }
        data[i].print();
        System.out.println("Number of element   : "+size);
    }

    void enqueue (StudentB dt) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return;
        }
        rear = (rear +1) % max;
        data[rear] = dt;
        size++;
        System.out.printf("%s is succesfully added at index %d\n", dt.name, rear);
    }

    StudentB dequeue () {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return null;
        }
        StudentB dt = data[front];
        front = (front +1) % max;
        size--;
        return dt;
    }
}
