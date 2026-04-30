package Jobsheet_10_23042026;
import java.util.Scanner;
public class ExcuseLetterMain {
    public static void main(String[] args) {
        ExcuseLetterStack ES = new ExcuseLetterStack(5);
        Scanner isc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Excuse Letter Menu ===");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("0. Exit Program");
            System.out.print("Choice    : ");
            choice = isc.nextInt();
            isc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Name           : ");
                    String name = isc.nextLine();
                    System.out.print("ID             : ");
                    String id = isc.nextLine();
                    System.out.print("Class          : ");
                    String clasS = isc.nextLine();
                    System.out.print("Type of Excuse     : ");
                    char type = isc.nextLine().charAt(0);
                    System.out.print("Duration (in days) : ");
                    int duration = isc.nextInt();
                    isc.nextLine();
                    ExcuseLetter19 EL = new ExcuseLetter19(id, name, clasS, type, duration);
                    ES.push(EL);
                    System.out.printf("%s's assignment has succesfully collected\n", EL.name);
                    break;
            
                case 2:
                    ExcuseLetter19 process = ES.pop();
                    if (process != null) {
                        System.out.println("\n=== Processing Letter === "+process.name);
                        process.print();
                        System.out.print("Status (A for Approved, R for Rejected) : ");
                        char status = isc.nextLine().charAt(0);
                        if (status == 'A' || status == 'a') {
                            System.out.printf("%s's excuse letter has been approved\n", process.name);
                        } else if (status == 'R' || status == 'r') {
                            System.out.printf("%s's excuse letter has been rejected\n", process.name);
                        } else {
                            System.out.println("Invalid status input!!");
                        }
                    }
                    break;

                case 3:
                    ExcuseLetter19 L = ES.peek();
                    if (L != null) {
                        System.out.println("The last excuse letter was submitted by "+L.name);
                    }
                    break;

                case 4:
                    System.out.print("Input name to search : ");
                    String search = isc.nextLine();
                    ES.searchByName(search);

                    break;

                case 0:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choices");
                    break;
            }
        } while (choice != 0);
    isc.close();
    }
}
