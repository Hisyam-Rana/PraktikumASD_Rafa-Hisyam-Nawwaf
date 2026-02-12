package Jobsheet_1_12022026;

import java.util.Scanner;

public class election_Practicum {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        int assignment = 0, quiz = 0, midTerm = 0, finalExam = 0;

        System.out.println("Final grade calculation program");
        System.out.println("===============================");


        while (true) {
            
        System.out.print("Input Assignment Score    : ");
        assignment = isc.nextInt();

        System.out.print("Input quiz Score          : ");
        quiz = isc.nextInt();

        System.out.print("Input Midterm Score       : ");
        midTerm = isc.nextInt();

        System.out.print("Input FinalExam Score     : ");
        finalExam = isc.nextInt();
    
        System.out.println("===============================");

        
        if (assignment < 0 || assignment > 100) {
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("Invalid Score, Please Re-enter a valid Score!");
            System.out.println("===============================");
            System.out.println("===============================");
            break;
        } else if (quiz < 0 || quiz > 100) {
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("Invalid Score, Please Re-enter a valid Score!");
            System.out.println("===============================");
            System.out.println("===============================");
            break;
        } else if (midTerm < 0 || midTerm > 100) {
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("Invalid Score, Please Re-enter a valid Score!");
            System.out.println("===============================");
            System.out.println("===============================");
            break;
        } else if (finalExam < 0 || finalExam > 100) {
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println("Invalid Score, Please Re-enter a valid Score!");
            System.out.println("===============================");
            System.out.println("===============================");
            break;
            }
        
        double finalScore;
        String letterScore, status;
        finalScore = (assignment * 0.2) + (quiz * 0.2) + (midTerm * 0.3) + (finalExam * 0.3);

        if ( finalScore > 80 && finalScore <= 100)  {
            letterScore = "A";
        } else if ( finalScore > 73 && finalScore <= 80)  {
            letterScore = "B+";
        } else if ( finalScore > 65 && finalScore <= 73)  {
            letterScore = "B";
        } else if ( finalScore > 60 && finalScore <= 65)  {
            letterScore = "C+";
        } else if ( finalScore > 50 && finalScore <= 60)  {
            letterScore = "C";
        } else if ( finalScore > 39 && finalScore <= 50)  {
            letterScore = "D";
        } else if ( finalScore <= 39)  {
            letterScore = "E";
        } else {
            letterScore = "E";
        }

        if (finalScore >= 60) {
            status = "Congratulations, You Passed";
        } else {
            status = "Unfortunately, You did not pass.";
        }



        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("Final Score     : " + finalScore);
        System.out.println("Letter Grade    : " + letterScore);
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println(status);
        break;
        }
    isc.close();
    }
    
}