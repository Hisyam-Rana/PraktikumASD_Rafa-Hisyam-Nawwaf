package Jobsheet_10_23042026;
import java.util.Scanner;
public class StudentA19Demo {
    public static void main(String[] args) {
        StudentAssignmentStack stack = new StudentAssignmentStack(5);
        Scanner isc = new Scanner(System.in);
        int choose;

        do {
            System.out.println("\nMenu  : ");
            System.out.println("1. Collecting Assignment");
            System.out.println("2. Marking Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View List of Assignment");
            System.out.print("Choose    : ");
            choose = isc.nextInt();
            isc.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("Name  : ");
                    String name = isc.nextLine();
                    System.out.print("NIM   : ");
                    String nim = isc.nextLine();
                    System.out.print("Class : ");
                    String clasS = isc.nextLine();
                    StudentA19 std = new StudentA19(nim, name, clasS);
                    stack.push (std);
                    System.out.printf("%s's assignment has succesfully collected\n", std.name);
                    break;
            
                case 2:
                    StudentA19 assesed = stack.pop();
                    if (assesed != null) {
                        System.out.println("Marking assignment from "+assesed.name);
                        System.out.print("Input Score (0-100) : ");
                        int score = isc.nextInt();
                        assesed.Grading(score);
                        System.out.printf("%s's assignment score is %d\n", assesed.name, score);
                        String binary = stack.convertToBinary(score);
                        System.out.printf("Assignment grade of in binary is %s\n", binary);
                    }
                    break;

                case 3:
                    StudentA19 look = stack.peek();
                    if (look != null) {
                        System.out.println("The last assignment was submitted by "+look.name);
                    }
                    break;

                case 4:
                    System.out.println("List all of assignment");
                    System.out.println("Name\tNIM\tClass");
                    stack.print();
                    break;

                default:
                    System.out.println("Invalid Choices");
                    break;
            }
        } while (choose >= 1 && choose <= 4);
    isc.close();
    }
}
