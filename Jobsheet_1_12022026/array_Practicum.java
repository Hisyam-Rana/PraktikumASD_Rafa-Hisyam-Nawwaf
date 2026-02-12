package Jobsheet_1_12022026;

import java.util.Scanner;

public class array_Practicum {
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);


        System.out.println("================================");
        System.out.println("Semester GPA Calculation Program");
        System.out.println("================================");

        

        String[] course = {
            "Pancasila", 
            "Information Technology Concept", 
            "Critical Thinking and Problem Solving",
            "Basic Mathematic",
            "English Language",
            "Basic Programming",
            "Basic Programming Practicum",
            "Occupational Safety and Health"};
        int[] creditHours = new int[course.length];
        double[] numericScore = new double[course.length];
        String[] letterGrade = new String[course.length];
        double[] gradeWeight = new double[course.length];

        double totalWeight = 0;
        int totalCreditHours = 0;

        for (int i = 0; i < course.length; i++) {
            System.out.println("\n" +course[i]+ " course");
            System.out.print("Input SKS     : ");
            creditHours[i] = isc.nextInt();

            System.out.print("Input Score   : " );
            numericScore[i] = isc.nextDouble();

            if ( numericScore[i] > 80 && numericScore[i] <= 100)  {
            letterGrade[i] = "A";
            gradeWeight[i] = 4;
            } else if ( numericScore[i] > 73 && numericScore[i] <= 80)  {
            letterGrade[i] = "B+";
            gradeWeight[i] = 3.5;
            } else if ( numericScore[i] > 65 && numericScore[i] <= 73)  {
            letterGrade[i] = "B";
            gradeWeight[i] = 3;
            } else if ( numericScore[i] > 60 && numericScore[i] <= 65)  {
            letterGrade[i] = "C+";
            gradeWeight[i] = 2.5;
            } else if ( numericScore[i] > 50 && numericScore[i] <= 60)  {
            letterGrade[i] = "C";
            gradeWeight[i] = 2;
            } else if ( numericScore[i] > 39 && numericScore[i] <= 50)  {
            letterGrade[i] = "D";
            gradeWeight[i] = 1;
            } else if ( numericScore[i] <= 39)  {
            letterGrade[i] = "E";
            gradeWeight[i] = 0;
            } else {
            letterGrade[i] = "E";
            gradeWeight[i] = 0;
            }

            totalWeight += gradeWeight[i] * creditHours[i];
            totalCreditHours += creditHours[i];
        }

        double GPA = totalWeight / totalCreditHours;

        System.out.println("\n================================");
        System.out.println("Conversion Result");
        System.out.println("================================");
        System.out.printf("\n%-40s %-13s %-13s %-10s", "Course", "Score", "Grade", "Grade Weight");
        System.out.println("\n==================================================================================");
        
        for (int i = 0; i < course.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-10.2f\n", course[i], numericScore[i], letterGrade[i], gradeWeight[i]);
        }
        
        System.out.println("==================================================================================");
        System.out.printf("GPA : %.2f\n", GPA);

        isc.close();
    }
}
