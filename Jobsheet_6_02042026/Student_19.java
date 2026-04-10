package Jobsheet_6_02042026;

import java.util.Scanner;

public class Student_19 {
    String nim;
    String name;
    String studentClass;
    double gpa;

    Scanner sc = new Scanner(System.in);

    public Student_19 () {}

    public Student_19 (String niM, String namE, String studentClasS, double gpA) {
        this.nim = niM;
        this.name = namE;
        this.studentClass = studentClasS;
        this.gpa = gpA;
    }

    public void print () {
        
        System.out.println("NIM : " +nim+ ", Name : " +name+ " ,\tClass : " +studentClass+ ", GPA : " + gpa);
    }
}
