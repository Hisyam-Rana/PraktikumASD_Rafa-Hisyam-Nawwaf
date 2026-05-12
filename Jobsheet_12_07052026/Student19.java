package Jobsheet_12_07052026;

public class Student19 {
    String nim, name, className;
    double gpa;

    public Student19() {
    }

    public Student19(String niM, String namE, String cls, double gpA) {
        nim = niM;
        name = namE;
        className = cls;
        gpa = gpA;
    }

    void print() {
        System.out.println(nim+" - "+name+" - "+className+" - "+gpa);
    }
}
