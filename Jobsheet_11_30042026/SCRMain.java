package Jobsheet_11_30042026;
import java.util.Scanner;
public class SCRMain {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        SCR queue = new SCR(10);
        int choice;

        do {
            System.out.println("\n=== DPA SCR Approval System ===");
            System.out.println("--- Menu ---");
            System.out.println("1. Register Student");
            System.out.println("2. Process Approval");
            System.out.println("3. Show All in Queue");
            System.out.println("4. Show First, Second, & Last");
            System.out.println("5. View Statistic");
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
                    SCRstudent std = new SCRstudent(nim, name, studyProgram, clasS);
                    queue.enqueue(std);
                    break;
            
                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.print();
                    break;

                case 4:
                    queue.peek();
                    break;
                
                case 5:
                    queue.displayStats();
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
