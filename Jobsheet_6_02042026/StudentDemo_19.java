package Jobsheet_6_02042026;

public class StudentDemo_19 {
    public static void main(String[] args) {
        TopStudent_19 ts = new TopStudent_19(5);
        ts.add(new Student_19("2201", "Alice", "A", 3.9));;
        ts.add(new Student_19("2202", "Bob", "B", 3.7));;
        ts.add(new Student_19("2203", "Charlie", "C", 3.8));;
        ts.add(new Student_19("2204", "David", "D", 3.6));;
        ts.add(new Student_19("2205", "Eve", "E", 4.0));;
    
        System.out.println("Original student list : ");
        ts.print();

        ts.bubbleSort();
        System.out.println("Sorted student list (by GPA, descendiing");
        ts.print();
    }
}
