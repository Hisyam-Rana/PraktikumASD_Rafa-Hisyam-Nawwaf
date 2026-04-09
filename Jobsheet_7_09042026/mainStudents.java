package Jobsheet_7_09042026;
import java.util.Scanner;
public class mainStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        
        System.out.print("Input number of students : ");
        int amountStudents = sc.nextInt();
        searchStudents data = new searchStudents(amountStudents);

        System.out.println("--------------------------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudents; i++) {
            System.out.println("-------------------------");
            System.out.print("NIM\t: ");
            int nim =sc.nextInt();
            System.out.print("Name\t: ");
            String name =sn.nextLine();
            System.out.print("Age\t: ");
            int age =sc.nextInt();
            System.out.print("GPA\t: ");
            double gpa =sc.nextDouble();

            students std = new students(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("-------------------------");
        System.out.println("Entire Student Data");
        System.out.println("-------------------------");
        data.display();

        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.print("Search student by NIM : ");
        int search = sc.nextInt();
        //System.out.println("Using Sequential Search");
        //int position = data.findSeqSearch(search);
        System.out.println("Using Binary search");
        int position1 = data.findBinarySearch(search, 0, amountStudents -1);
        //data.showPosition(search, position);
        //data.showData(search, position);
        data.showPosition(search, position1);
        data.showData(search, position1);
    sc.close();
    sn.close();
    }
}
