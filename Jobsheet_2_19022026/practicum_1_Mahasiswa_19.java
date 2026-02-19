package Jobsheet_2_19022026;

public class practicum_1_Mahasiswa_19 {

    String name;
    String nim;
    String clasS;
    double gpa;

    void displayInformation () {
        System.out.println("Name    : "+name);
        System.out.println("NIM     : "+nim);
        System.out.println("GPA     : "+gpa);
        System.out.println("Class   : "+clasS+"\n");
    }

    void changeclass (String newClass) {
        clasS = newClass;
    }

    void updateGPA (double newGPA) {
        gpa = newGPA;
    }

    String performanceValue () {
        if (gpa <= 0.0 && gpa >= 4.0) {
            if (gpa >= 3.5) {
                return "Excellent performance";
            } else if (gpa >= 3.0) {
                return "Good performance";
            } else if (gpa >= 2.0) {
                return "Adequate performance";
            } else {
                return "Poor perfonmance";
            }
        } else {
            return "GPA is invalid. Must be between 0.0 and 4.0";
        }
    }
            
} 


