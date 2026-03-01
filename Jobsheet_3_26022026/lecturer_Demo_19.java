package Jobsheet_3_26022026;

import java.util.Scanner;

public class lecturer_Demo_19 {
    
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);
        int number, age;
        Boolean gender; 
        String name, code, dummy;
        
        System.out.print("Input the number of Lecturer  : ");
        dummy = isc.nextLine();
        number = Integer.parseInt(dummy);
        lecturer_19[] arrayOfLecturer = new lecturer_19[number];

        System.out.println("--------------------------------------------");
        for (int i = 0; i < arrayOfLecturer.length; i++) {
            System.out.println("Input Data for the lecturer number-"+(i+1));
            System.out.print("Name   : ");
            name = isc.nextLine();
            System.out.print("Code   : ");
            code = isc.nextLine();
            System.out.print("Gender : ");
            dummy = isc.nextLine();
            gender = dummy.equalsIgnoreCase("male");
            System.out.print("Age    : ");
            dummy = isc.nextLine();
            age = Integer.parseInt(dummy);
            System.out.println("--------------------------------------------");
            
            arrayOfLecturer[i] = new lecturer_19(code, name, gender, age);
        }    
        
        System.out.println("--------------------------------------------");
        for (lecturer_19 lecturer : arrayOfLecturer) {
            System.out.println("Name    : "+lecturer.name);
            System.out.println("Code    : "+lecturer.code);
            System.out.println("Gender  : "+ (lecturer.gender ? "Male" : "Female"));
            System.out.println("Age     : "+ lecturer.age);
            System.out.println("--------------------------------------------");
        }
        
        lecturer_Data_19.allDataOfLecturer(arrayOfLecturer);
        lecturer_Data_19.numberOfLecturerPerGender(arrayOfLecturer);
        
        if (number > 1) {
        lecturer_Data_19.averageAgeOfLecturerPerGender(arrayOfLecturer);    
        }
        
        lecturer_Data_19.oldestLecturer(arrayOfLecturer);
        lecturer_Data_19.youngestLecturer(arrayOfLecturer);
        
        isc.close();
    }
}
