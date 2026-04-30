package Jobsheet_11_30042026;

public class SCRstudent {
    String nim;
    String name;
    String studyProgram;
    String className;

    public SCRstudent(String niM, String namE, String studyPrograM, String classNamE) {
        nim = niM;
        name = namE;
        studyProgram = studyPrograM;
        className = classNamE;
    }

    void print() {
        System.out.println(nim+" \t- "+name+"   \t- "+studyProgram+" \t- "+className);
    }
}
