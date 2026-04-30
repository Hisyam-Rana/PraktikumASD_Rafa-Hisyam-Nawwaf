package Jobsheet_10_23042026;

public class StudentA19 {
    String nim;
    String name;
    String className;
    int grade;
    
    StudentA19 (String niM, String namE, String classNamE) {
        this.nim = niM;
        this.name = namE;
        this.className = classNamE;
        this.grade = -1;
    }

    void Grading (int grade) {
        this.grade = grade;
    }
}
