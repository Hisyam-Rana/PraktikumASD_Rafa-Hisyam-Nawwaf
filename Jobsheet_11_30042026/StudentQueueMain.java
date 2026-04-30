package Jobsheet_11_30042026;
import java.util.Scanner;

public class StudentQueueMain {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        StudentQueue queue = new StudentQueue(5);
        int choice;

        do {
            System.out.println("\n=== Academic Service Menu ===");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Dequeue Student");
            System.out.println("3. Display Front");
            System.out.println("4. Display All Data");
            System.out.println("5. Queue Size");
            System.out.println("0. Exit");
            System.out.print("Choose a menu : ");
            choice = isc.nextInt();
            isc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("NIM           : ");
                    String nim = isc.nextLine();
                    System.out.print("Name          : ");
                    String name = isc.nextLine();
                    System.out.print("Study Program : ");
                    String studyProgram = isc.nextLine();
                    System.out.print("Class         : ");
                    String clasS = isc.nextLine();
                    StudentB std = new StudentB(nim, name, studyProgram, clasS);

                    queue.enqueue(std);
                    break;
            
                case 2:
                    StudentB studentBeingServed = queue.dequeue();
                    if (studentBeingServed != null) {
                        System.out.println("Student being served    : ");
                        studentBeingServed.print();
                    }
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.print();
                    break;
                
                case 5:
                    System.out.println("Queue size  : "+ queue.size);
                    break;
                
                case 0:
                    System.out.println("Thanks!!");
                    break;
                
                default:
                    System.out.println("Invalid Menu");
                    break;
            }
        } while (choice != 0);
    isc.close();
    }
}
