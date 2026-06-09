package Jobsheet_14_05062026;

public class Student19 {
    String nim, name, className;
    double gpa;
    
    Student19() {}
    
    Student19(String nm, String namE, String cls, double gp) {
        this.nim = nm;
        this.name = namE;
        this.className = cls;
        this.gpa = gp;
    }
    
    void print() {
        System.out.println(nim + " |\t " + name + "   \t|\t " + className + " |\t " + gpa);
    }
}
