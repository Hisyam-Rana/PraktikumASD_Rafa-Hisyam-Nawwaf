package Jobsheet_12_07052026;
import java.util.Scanner;

public class LLQMain {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        LinkedListQueue LLQ = new LinkedListQueue();
        int choice;
        
        do {
            LLQ.menu();
            System.out.print("Choice : ");
            choice = Integer.parseInt(isc.nextLine());
            switch (choice) {
                case 1:
                    LLQ.register();
                    break;
                
                case 2:
                    LLQ.dequeue();
                    break;
                
                case 3:
                    LLQ.printMenu();
                    LLQ.print();
                    break;
                
                case 4:
                    LLQ.statusMenu();
                    LLQ.status();
                    break;
                
                case 5:
                    LLQ.clear();
                    break;
                
                case 0:
                    System.out.println("Thank You");                    
                    break;
                
                    default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 0);
        
        isc.close();
    }
}
