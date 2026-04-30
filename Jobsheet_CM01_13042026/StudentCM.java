package Jobsheet_CM01_13042026;

import java.util.Scanner;

public class StudentCM {
    String nim;
    String name;
    String studyProgram;
    String phoneNumber;

    Scanner sc = new Scanner(System.in);

    public StudentCM () {}

    public StudentCM (String niM, String namE, String studyPROGRAM, String phoneNUMBER) {
        this.nim = niM;
        this.name = namE;
        this.studyProgram = studyPROGRAM;
        this.phoneNumber = phoneNUMBER;
    }

    public void printStudent () {
        
        System.out.println ("NIM : " +nim+ 
                            " | Name : " +name+ 
                            "\t| Study Program : " +studyProgram+
                            "\t| Phone Number : " +phoneNumber);
    }
}
