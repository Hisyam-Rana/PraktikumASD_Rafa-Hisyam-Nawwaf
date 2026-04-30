package Jobsheet_10_23042026;

public class ExcuseLetter19 {
    String id;
    String name;
    String className;
    char typeOfExcuse;
    int duration;

    ExcuseLetter19() {}
    
    ExcuseLetter19(String iD, String namE, String classNamE, char typeOfExcusE, int duratioN) {
        this.id = iD;
        this.name = namE;
        this.className = classNamE;
        this.typeOfExcuse = typeOfExcusE;
        this.duration = duratioN;
    }

    void print() {
        System.out.printf("ID: %s \t|Name: %s \t| Class: %s \t| Type: %c \t| Duration: %d day(s)\n",
                id, name, className, typeOfExcuse, duration);
    }
}
