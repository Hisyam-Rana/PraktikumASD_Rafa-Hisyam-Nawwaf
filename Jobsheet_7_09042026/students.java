package Jobsheet_7_09042026;

public class students {
    int nim, age;
    String name;
    double gpa;

    public students(int niM, int agE, String namE, double gpA) {
        this.nim = niM;
        this.age = agE;
        this.name = namE;
        this.gpa = gpA;
    }

    public void display() {
        System.out.println("NIM     : "+ nim);
        System.out.println("Name    : "+ name);
        System.out.println("Age   : "+ age);
        System.out.println("GPA     : "+ gpa);
    }
}