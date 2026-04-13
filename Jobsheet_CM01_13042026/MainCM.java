package Jobsheet_CM01_13042026;

import java.util.Scanner;

public class MainCM {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        StudentCM[] students = CMMethod.listStudent();
        BookCM[] books = CMMethod.listBook();
        LendingCM[] loan = CMMethod.listLoan(students, books);
        
        int menu;
        String dummy;
        do {
            System.out.println("\n=== JTI LIBRARY BORROWING SYSTEM ===");
            System.out.println("1. Display Students");
            System.out.println("2. Display Books");
            System.out.println("3. Display Borrowings");
            System.out.println("4. Sort by Fines (Insertion Sort)");
            System.out.println("5. Search by Student ID (Binary Search)");
            System.out.println("0. Exit");
            System.out.print("Select: ");
            dummy = isc.nextLine();
            menu = Integer.parseInt(dummy);

            switch (menu) {
                case 1:
                    System.out.println("\nStudent List : ");
                    for (StudentCM student : students) {
                        student.printStudent();
                    }
                    break;
                
                case 2:
                    System.out.println("\nBook List : ");
                    for (BookCM book : books) {
                        book.printBook();
                    }
                    break;
                
                case 3:
                    System.out.println("\nLoan Data : ");
                    for (LendingCM lending : loan) {
                        lending.printLending();
                    }
                    break;
                
                case 4:
                    System.out.println("\nAfter sorting (Largest fine):");
                    CMMethod.sortbyFine(loan);
                    for (LendingCM lending : loan) {
                        lending.printLending();
                    }
                    break;
                
                case 5:
                    System.out.println("\nSearch by Student ID:");
                    System.out.print("Enter Student ID (NIM): ");
                    String searchID = isc.nextLine();
                    int pos = CMMethod.findByStudentID(searchID, 0, students.length -1);
                    if (pos != -1) {
                        System.out.println("Student found:");
                        for (int i = 0; i < loan.length; i++) {
                            if (loan[i].sdt.nim.equals(searchID)) {
                                loan[i].printLending();
                            }
                        }
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                
                case 0:
                    System.out.println("Exitting the program. Thank you");
                    break
                    ;
                
                default:
                    break;
            }

        } while (menu != 0);

        isc.close();
    }
}
