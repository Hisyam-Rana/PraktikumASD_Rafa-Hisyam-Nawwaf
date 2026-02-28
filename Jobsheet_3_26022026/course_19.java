package Jobsheet_3_26022026;

import java.util.Scanner;

public class course_19 {
    
    public String code;
    public String name;
    public int credit;
    public int totalHours;
    public Scanner isc = new Scanner(System.in);
    
    public course_19 (String tempCode, String tempName, int tempCredit, int tempTotalHours) {
        this.code       = tempCode;
        this.name       = tempName;
        this.credit     = tempCredit;
        this.totalHours = tempTotalHours;
    }
    
    static void addData (course_19[] arrayOfCourse, Scanner isc) {
        String dummy;
        System.out.println("--------------------------------------------");
        for (int i = 0; i < arrayOfCourse.length; i++) {
            System.out.println("Input Data for course number-"+(i+1));
            System.out.print("Code          : ");
            String code = isc.nextLine();
            System.out.print("Name          : ");
            String name = isc.nextLine();
            System.out.print("Credit        : ");
            dummy = isc.nextLine();
            int credit = Integer.parseInt(dummy);
            System.out.print("Total Hours   : ");
            dummy = isc.nextLine();
            int totalHours = Integer.parseInt(dummy);
            System.out.println("--------------------------------------------");
            
            arrayOfCourse[i] = new course_19(code, name, credit, totalHours);
        }
    } 
    
    static void printInfo (course_19[] arrayOfCourse) {
        System.out.println("--------------------------------------------");
        for (int i = 0; i < arrayOfCourse.length; i++) {
            System.out.println("Data for Course number-"+(i+1));
            System.out.println("Code        : "+ arrayOfCourse[i].code);
            System.out.println("Name        : "+ arrayOfCourse[i].name);
            System.out.println("Credit      : "+ arrayOfCourse[i].credit);
            System.out.println("Total Hours : "+ arrayOfCourse[i].totalHours);
            System.out.println("--------------------------------------------");
        } 
    }
}
