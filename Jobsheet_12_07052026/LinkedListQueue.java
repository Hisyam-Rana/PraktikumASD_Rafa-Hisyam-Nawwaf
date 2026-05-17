package Jobsheet_12_07052026;
import java.util.Scanner;
public class LinkedListQueue {
    NodeQue front;
    NodeQue rear;
    int size;
    Scanner isc = new Scanner(System.in);

    boolean isEmpty() {
        return (front==null);
    }

    boolean isFull() {
        return false;
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data  : "+front.data.id+" |\t "+front.data.name+" |\t "+front.data.className);
        } else {
            System.out.println("Queue is empty!!");
        }
    }

    void printFullData() {
        if (!isEmpty()) {
            NodeQue tmp = front;
            while (tmp != null) {
                System.out.println(tmp.data.id+" |\t "+tmp.data.name+" |\t "+tmp.data.className);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Queue is empty!!");
        }
    }

    void enqueue (Assignment19 nq) {
        NodeQue newNode = new NodeQue(nq, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
        System.out.println("Queue is empty!!");
        return;
        }
        
        System.out.println("Calling student: " + front.data.name);
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
        size--;
    }

    void clear() {
    if (!isEmpty()) {
        front = rear = null;
        size = 0;
            System.out.println("All data has been successfully removed!");
        } else {
            System.out.println("Queue is already empty!!!");
        }
    }

    void register() {
        System.out.print("ID    : "); 
        String nim = isc.nextLine();
        System.out.print("Name  : "); 
        String name = isc.nextLine();
        System.out.print("Class : "); 
        String cls = isc.nextLine();
        Assignment19 newQueue = new Assignment19(nim, name, cls);
        enqueue(newQueue); 
        System.out.println("Student successfully registered to queue!");
    }

    void peekFrontAndRear() {
        if (!isEmpty()) {
            System.out.println("Front data  : "+front.data.id+" | "+front.data.name+" | "+front.data.className);
            System.out.println("Rear data   : "+rear.data.id+" | "+rear.data.name+" | "+rear.data.className);
        } else {
            System.out.println("Queue is empty!!");
        }
    }

    void printStudentinQueue() {
        if (!isEmpty()) {
            NodeQue tmp = front;
            int i = 1;
            while (tmp != null) {
                System.out.println(i+". "+tmp.data.name);
                tmp = tmp.next;
                i++;
            }
        } else {
            System.out.println("Queue is empty!!");
        }
    }

    void status() {
        int choice;
        do {
            System.out.print("Choice : ");
            choice = Integer.parseInt(isc.nextLine());
            switch (choice) {
                case 1:
                    if (isEmpty()) {
                        System.out.println("Queue is empty!!");
                    } else {
                        System.out.println("There is a line of students");
                    }
                    break;
                
                case 2:
                    if (isFull()) {
                        System.out.println("Queue is full!!");
                    } else {
                        System.out.println("There is still room in the queue");
                    }
                    break;
                
                case 3:
                    System.out.println("The number of students in the queue : "+size);
                    break;
                
                case 0:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 0);
    }

    void print() {
        int choice;
        do {
            System.out.print("Choice : ");
            choice = Integer.parseInt(isc.nextLine());
            switch (choice) {
                case 1:
                    printStudentinQueue();
                    break;
                
                case 2:
                    printFullData();
                    break;
                
                case 3:
                    peekFrontAndRear();
                    break;
                
                case 0:
                    break;
                
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 0);
    }

    void printMenu() {
        System.out.println("1. Print all student in queue");
        System.out.println("2. Print all student data in queue");
        System.out.println("3. Print first and last student in Queue");
        System.out.println("0. Exit");
    }

    void statusMenu() {
        System.out.println("1. Queue Empty ?");
        System.out.println("2. Queue Full ?");
        System.out.println("3. Student in Queue");
        System.out.println("0. Exit");
    }
    
    void menu () {
        System.out.println("Available Menu  : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Queue Status");
        System.out.println("5. Clear");
        System.out.println("0. Exit");
        System.out.println("=========================");
    }


}
