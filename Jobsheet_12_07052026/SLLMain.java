package Jobsheet_12_07052026;
import java.util.Scanner;
public class SLLMain {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();

        System.out.print("NIM   : "); 
        String nim = isc.nextLine();
        System.out.print("Nama  : "); 
        String name = isc.nextLine();
        System.out.print("Class : "); 
        String cls = isc.nextLine();
        System.out.print("GPA   : "); 
        double gpa = isc.nextDouble();

        Student19 stdNew = new Student19(nim, name, cls, gpa);
        sll.addLast(stdNew);

        Student19 std1 = new Student19("001", "Student 01", "TI-1I", 3.89);
        Student19 std2 = new Student19("002", "Student 02", "TI-1I", 3.45);
        Student19 std3 = new Student19("003", "Student 03", "TI-1I", 3.20);
        Student19 std4 = new Student19("004", "Student 04", "TI-1I", 3.00);
    
        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 04");
        sll.insertArt(2, std2);
        sll.print();
        isc.close();
    }
}
