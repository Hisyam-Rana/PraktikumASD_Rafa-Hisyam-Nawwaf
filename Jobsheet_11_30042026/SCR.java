package Jobsheet_11_30042026;

public class SCR {
    SCRstudent[] data; 
    int front, rear, size, max;
    int totalProcessed = 0;
    final int DPACapacity = 30;

    public SCR (int n) {
        max = n;
        data = new SCRstudent[max];
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

    void clear() {
    if (!isEmpty()) {
        front = rear = -1;
        size = 0;
            System.out.println("All data has been successfully removed!");
        } else {
            System.out.println("Queue is already empty!!!");
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.print("First student in line   : ");
            data[front].print();
            System.out.print("Second student in line  : ");
            data[(front +1) % max].print();
            System.out.print("Last student in line    : ");
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
        System.out.println("Number of Student   : "+size);
    }

    void enqueue (SCRstudent dt) {
        if (isFull()) {
            System.out.println("Queue is full!!");
            return;
        }
        rear = (rear +1) % max;
        data[rear] = dt;
        size++;
        System.out.printf("%s is succesfully added at index %d\n", dt.name, rear);
    }

    void dequeue () {
        if (isEmpty()) {
            System.out.println("Queue is empty!!");
            return;
        }

        System.out.println("--- Processing Approval Session ---");

        for (int i = 0; i < 2; i++) {
        if (isEmpty()) { 
            break; 
        }
        SCRstudent rm = data[front];
        System.out.print("Approved    : ");
            rm.print();

        front = (front +1) % max;
            size--;
            totalProcessed++;
        }
    }

    void displayStats() {
        System.out.println("Total completed             : " + totalProcessed);
        System.out.println("Remaining DPA Quota         : " + (DPACapacity - totalProcessed));
        System.out.println("Students currently waiting  : " + size);
    }

}
