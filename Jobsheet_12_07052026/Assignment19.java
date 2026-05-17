package Jobsheet_12_07052026;

public class Assignment19 {
    String id, name, className;
    
    public Assignment19() {
    }

    public Assignment19(String iD, String namE, String cls) {
        id = iD;
        name = namE;
        className = cls;
    }

    void print() {
        System.out.println(id+" |\t "+name+" |\t "+className);
    }
}
