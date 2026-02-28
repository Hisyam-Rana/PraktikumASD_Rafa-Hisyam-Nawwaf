package Jobsheet_3_26022026;

import java.util.Scanner;

public class course_Demo_19 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        String dummy;
        int length;
        
        System.out.print("Input the number of course    : ");
        dummy = isc.nextLine();
        length = Integer.parseInt(dummy);
        
        course_19[] arrayOfCourse = new course_19[length];
        course_19.addData(arrayOfCourse, isc);
        course_19.printInfo(arrayOfCourse);
        
        isc.close();
    }
}
