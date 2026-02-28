package Jobsheet_3_26022026;

import java.util.Scanner;

public class course_Demo_19 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        course_19[] arrayOfCourse = new course_19[3];
        String code, name, dummy;
        int credit, totalHours;

        System.out.println("--------------------------------------------");
        for (int i = 0; i < arrayOfCourse.length; i++) {
            System.out.println("Input Data for course number-"+(i+1));
            System.out.print("Code          : ");
            code = isc.nextLine();
            System.out.print("Name          : ");
            name = isc.nextLine();
            System.out.print("Credit        : ");
            dummy = isc.nextLine();
            credit = Integer.parseInt(dummy);
            System.out.print("Total Hours   : ");
            dummy = isc.nextLine();
            totalHours = Integer.parseInt(dummy);
            System.out.println("--------------------------------------------");
            
            arrayOfCourse[i] = new course_19(code, name, credit, totalHours);
        }
        
        System.out.println("--------------------------------------------");
        for (int i = 0; i < arrayOfCourse.length; i++) {
            System.out.println("Data for Course number-"+(i+1));
            System.out.println("Code        : "+ arrayOfCourse[i].code);
            System.out.println("Name        : "+ arrayOfCourse[i].name);
            System.out.println("Credit      : "+ arrayOfCourse[i].credit);
            System.out.println("Total Hours : "+ arrayOfCourse[i].totalHours);
            System.out.println("--------------------------------------------");
        }
        isc.close();
    }
}
