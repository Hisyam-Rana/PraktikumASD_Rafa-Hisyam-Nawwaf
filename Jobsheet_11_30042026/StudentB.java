package Jobsheet_11_30042026;

public class StudentB {
    String nim;
    String name;
    String studyProgram;
    String className;

    public StudentB(String niM, String namE, String studyPrograM, String classNamE) {
        nim = niM;
        name = namE;
        studyProgram = studyPrograM;
        className = classNamE;
    }

    void print() {
        System.out.println(nim+" - "+name+" - "+studyProgram+" - "+className);
    }
}
