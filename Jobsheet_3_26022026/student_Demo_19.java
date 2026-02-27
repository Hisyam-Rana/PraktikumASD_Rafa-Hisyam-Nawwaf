package Jobsheet_3_26022026;

import java.util.Scanner;

public class student_Demo_19 {
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);
        
        student_19[] arrayofStudent = new student_19[3];
        String dummy;
        
        System.out.println("----------------------------------");
        for (int i = 0; i < arrayofStudent.length; i++) {
            arrayofStudent[i] = new student_19();
            System.out.println("Input data for Student number-"+(i+1));
            System.out.print("NIM   : ");
            arrayofStudent[i].nim = isc.nextLine();
            System.out.print("Name  : ");
            arrayofStudent[i].name = isc.nextLine();
            System.out.print("Class : ");
            arrayofStudent[i].clasS = isc.nextLine();
            System.out.print("GPA   : ");
            dummy = isc.nextLine();
            arrayofStudent[i].gpa = Float.parseFloat(dummy);
            System.out.println("----------------------------------");
        }

        System.out.println("----------------------------------");
        for (int i = 0; i < arrayofStudent.length; i++) {
            System.out.println("Data for Student number-"+(i+1));
            arrayofStudent[i].printInfo();
            System.out.println("----------------------------------");
        }
        isc.close();

        //arrayofStudent[0] = new student_19();
        //arrayofStudent[0].nim = "244107060033";
        //arrayofStudent[0].name = "AGNES TITANIA KINANTI";
        //arrayofStudent[0].clasS = "SIB-1E";
        //arrayofStudent[0].gpa = (float) 3.75;
        
        //arrayofStudent[1] = new student_19();
        //arrayofStudent[1].nim = "2341720172";
        //arrayofStudent[1].name = "ACHMAD MAULANA HAMZAH";
        //arrayofStudent[1].clasS = "TI-2A";
        //arrayofStudent[1].gpa = (float) 3.36;
        
        //arrayofStudent[2] = new student_19();
        //arrayofStudent[2].nim = "244107023006";
        //arrayofStudent[2].name = "DIRHAMAWAN PUTRANTO";
        //arrayofStudent[2].clasS = "TI-2E";
        //arrayofStudent[2].gpa = (float) 3.80;
        
        //System.out.println("----------------------------------");
        //System.out.println("NIM     : "+ arrayofStudent[0].nim);
        //System.out.println("Name    : "+ arrayofStudent[0].name);
        //System.out.println("Class   : "+ arrayofStudent[0].clasS);
        //System.out.println("GPA     : "+ arrayofStudent[0].gpa);
        //System.out.println("----------------------------------");
        //System.out.println("NIM     : "+ arrayofStudent[1].nim);
        //System.out.println("Name    : "+ arrayofStudent[1].name);
        //System.out.println("Class   : "+ arrayofStudent[1].clasS);
        //System.out.println("GPA     : "+ arrayofStudent[1].gpa);
        //System.out.println("----------------------------------");
        //System.out.println("NIM     : "+ arrayofStudent[2].nim);
        //System.out.println("Name    : "+ arrayofStudent[2].name);
        //System.out.println("Class   : "+ arrayofStudent[2].clasS);
        //System.out.println("GPA     : "+ arrayofStudent[2].gpa);
        //System.out.println("----------------------------------");
    }
}