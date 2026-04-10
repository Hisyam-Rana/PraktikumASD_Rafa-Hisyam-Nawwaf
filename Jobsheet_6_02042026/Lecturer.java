package Jobsheet_6_02042026;

public class Lecturer {
    String id;
    String name;
    boolean gender;
    int age;

    public Lecturer(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void print() {
        String genderStr = gender ? "Male" : "Female";
        System.out.println("ID: " + id + ",\tName: " + name + 
                            " ,\tGender: " + genderStr + ",\tAge: " + age);
    }
}