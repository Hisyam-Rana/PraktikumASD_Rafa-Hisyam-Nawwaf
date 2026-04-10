package Jobsheet_6_02042026;
// import java.util.Scanner;

public class LecturerDemo {
    public static void main(String[] args) {
        // Scanner isc = new Scanner(System.in);

        // System.out.print("Enter number of lecturers to input: ");
        // int size = Integer.parseInt(isc.nextLine());

        TopLecturer ld = new TopLecturer(); 
        
        ld.add(new Lecturer("1972", "Dr. Alice", true, 45));
        ld.add(new Lecturer("1992", "Prof. Bob", true, 58));
        ld.add(new Lecturer("1983", "Dr. Charlie", true, 32));
        ld.add(new Lecturer("1991", "Sarah, M.T.", false, 29));
        ld.add(new Lecturer("1981", "David, Ph.D", true, 40));
        ld.add(new Lecturer("1973", "Dr. Alice", true, 45));
        ld.add(new Lecturer("1987", "Prof. Bob", true, 58));
        ld.add(new Lecturer("1002", "Dr. Charlie", true, 32));
        ld.add(new Lecturer("1010", "Sarah, M.T.", false, 29));
        ld.add(new Lecturer("1003", "David, Ph.D", true, 40));

        // for (int i = 0; i < size; i++) {
        //     ld.dynamicAdd();
        // }

        System.out.println("\n--- Original Lecturer List ---");
        ld.print(); 

        System.out.println("\nSorting by Age (ASC - Bubble Sort):");
        ld.sortingASC();
        ld.print();

        System.out.println("\nSorting by Age (DSC - Selection Sort):");
        ld.sortingDSC();
        ld.print();

    //     isc.close();
    }
}
