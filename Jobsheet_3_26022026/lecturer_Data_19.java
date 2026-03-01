package Jobsheet_3_26022026;

public class lecturer_Data_19 {
    static void allDataOfLecturer (lecturer_19[] arrayOfLecturer) {
        System.out.println("==================================================================================================");
        System.out.printf("| %-3s | %-45s | %-20s | %-10s | %-3s |\n", "No", "Name", "Code", "Gender", "Age");
        System.out.println("==================================================================================================");

        int i = 1;
        for (lecturer_19 lecturer : arrayOfLecturer) {
        String genderStr = (lecturer.gender) ? "Male" : "Female";
    
        System.out.printf("| %-3d | %-45s | %-20s | %-10s | %-3d |\n", 
                    i++, lecturer.name, lecturer.code, genderStr, lecturer.age);
}

    }
    
    static void numberOfLecturerPerGender (lecturer_19[] arrayOfLecturer) {
        int male=0, female=0;
        for (int i = 0; i < arrayOfLecturer.length; i++) {
            
            if (arrayOfLecturer[i].gender == true) {
                male++;
            } else {
                female++;
            }    
        }
        System.out.println("\nTotal number of male Lecturers   : "+male);
        System.out.println("Total number of female Lecturers : "+female);
        
    }
    
    static void averageAgeOfLecturerPerGender (lecturer_19[] arrayOfLecturer) {
        int male=0, female=0, ageMale=0, ageFemale=0;
        double averageMale=0, averageFemale=0;
        for (int i = 0; i < arrayOfLecturer.length; i++) {
            
            if (arrayOfLecturer[i].gender == true) {
                male++; 
                ageMale += arrayOfLecturer[i].age;
            } else {
                female++; 
                ageFemale += arrayOfLecturer[i].age;
            }    
        }
        averageMale = ageMale / male;
        averageFemale = ageFemale / female;
        System.out.println("\nAverage age of male Lecturers   : "+averageMale);
        System.out.println("Average age of female Lecturers : "+averageFemale);  
    }
    
    static void oldestLecturer (lecturer_19[] arrayOfLecturer) {
        int oldest = 0;
        for (int i = 0; i < arrayOfLecturer.length; i++) {
            if (arrayOfLecturer[i].age > oldest) {
                oldest = arrayOfLecturer[i].age;
            }
        }
        
        System.out.println("\nData of the Oldest lecturer");
        for (int i = 0; i < arrayOfLecturer.length; i++) {
            if (arrayOfLecturer[i].age == oldest) {
                System.out.println("Name   : "+ arrayOfLecturer[i].name);
                System.out.println("Code   : "+ arrayOfLecturer[i].code);
                System.out.println("Gender : "+ (arrayOfLecturer[i].gender ? "Male" : "Female"));
                System.out.println("Age    : "+ arrayOfLecturer[i].age);
            } 
        }
    }
    
    static void youngestLecturer (lecturer_19[] arrayOfLecturer) {
        int youngest = 100;
        for (int i = 0; i < arrayOfLecturer.length; i++) {
            if (arrayOfLecturer[i].age < youngest) {
                youngest = arrayOfLecturer[i].age;
            }
        }
        
        System.out.println("\nData of the Youngest lecturer");
        for (int i = 0; i < arrayOfLecturer.length; i++) {
            if (arrayOfLecturer[i].age == youngest) {
                System.out.println("Name   : "+ arrayOfLecturer[i].name);
                System.out.println("Code   : "+ arrayOfLecturer[i].code);
                System.out.println("Gender : "+ (arrayOfLecturer[i].gender ? "Male" : "Female"));
                System.out.println("Age    : "+ arrayOfLecturer[i].age);
            } 
        }
    }
}
