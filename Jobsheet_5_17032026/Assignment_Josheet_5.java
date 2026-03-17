package Jobsheet_5_17032026;

public class Assignment_Josheet_5 {
    public static void main(String[] args) {
        student data = new student();
        data.studentTable(); 
        
        Student_Method analyzer = new Student_Method();
        
        student max = analyzer.findMaxDC(student.MidFinalScore[0], 0, 7);
        student min = analyzer.findMinDC(student.MidFinalScore[0], 0, 7);
        
        System.out.println("=== HIGHEST MIDTERM SCORE ===");
        System.out.println("Name              : " + max.name);
        System.out.println("NIM               : " + max.nim);
        System.out.println("Year Of Admission : " + max.YOA);
        System.out.println("Score             : " + max.midTermS);
        
        System.out.println("\n=== LOWEST MIDTERM SCORE ===");
        System.out.println("Name              : " + min.name);
        System.out.println("NIM               : " + min.nim);
        System.out.println("Year Of Admission : " + min.YOA);
        System.out.println("Score             : " + min.midTermS);
        
        double avg = analyzer.calculateAvgBF(student.MidFinalScore[1]);
        
        System.out.println("\n=== AVERAGE FINAL SCORE OF ALL STUDENT ===");
        System.out.printf("Average Final  : %.2f\n", avg);
    }
}

class student {
    String name;
    String nim;
    String YOA;
    int midTermS;
    int finalExamS;
    
    public static student[] arrayofStudent = new student[8];
    public static student[][] MidFinalScore = new student[2][8];
    
    void studentTable () {
            
        arrayofStudent[0] = new student();
        arrayofStudent[0].name = "Ahmad";
        arrayofStudent[0].nim = "220101001";
        arrayofStudent[0].YOA = "2022";
        
        arrayofStudent[1] = new student();
        arrayofStudent[1].name = "Budi";
        arrayofStudent[1].nim = "220101002";
        arrayofStudent[1].YOA = "2022";
        
        arrayofStudent[2] = new student();
        arrayofStudent[2].name = "Cindy";
        arrayofStudent[2].nim = "220101003";
        arrayofStudent[2].YOA = "2021";
        
        arrayofStudent[3] = new student();
        arrayofStudent[3].name = "Dian";
        arrayofStudent[3].nim = "220101004";
        arrayofStudent[3].YOA = "2021";
        
        arrayofStudent[4] = new student();
        arrayofStudent[4].name = "Eko";
        arrayofStudent[4].nim = "220101005";
        arrayofStudent[4].YOA = "2023";
        
        arrayofStudent[5] = new student();
        arrayofStudent[5].name = "Fajar";
        arrayofStudent[5].nim = "220101006";
        arrayofStudent[5].YOA = "2020";
        
        arrayofStudent[6] = new student();
        arrayofStudent[6].name = "Gina";
        arrayofStudent[6].nim = "220101007";
        arrayofStudent[6].YOA = "2023";
        
        arrayofStudent[7] = new student();
        arrayofStudent[7].name = "Hadi";
        arrayofStudent[7].nim = "220101008";
        arrayofStudent[7].YOA = "2020";
        
        
        
        MidFinalScore[0][0] = arrayofStudent[0];
        MidFinalScore[1][0] = arrayofStudent[0];
        MidFinalScore[0][0].midTermS = 78;
        MidFinalScore[1][0].finalExamS = 82;
        
        MidFinalScore[0][1] = arrayofStudent[1];
        MidFinalScore[1][1] = arrayofStudent[1];
        MidFinalScore[0][1].midTermS = 85;
        MidFinalScore[1][1].finalExamS = 88;
        
        MidFinalScore[0][2] = arrayofStudent[2];
        MidFinalScore[1][2] = arrayofStudent[2];
        MidFinalScore[0][2].midTermS = 90;
        MidFinalScore[1][2].finalExamS = 87;
        
        MidFinalScore[0][3] = arrayofStudent[3];
        MidFinalScore[1][3] = arrayofStudent[3];
        MidFinalScore[0][3].midTermS = 76;
        MidFinalScore[1][3].finalExamS = 79;
        
        MidFinalScore[0][4] = arrayofStudent[4];
        MidFinalScore[1][4] = arrayofStudent[4];
        MidFinalScore[0][4].midTermS = 92;
        MidFinalScore[1][4].finalExamS = 95;
        
        MidFinalScore[0][5] = arrayofStudent[5];
        MidFinalScore[1][5] = arrayofStudent[5];
        MidFinalScore[0][5].midTermS = 88;
        MidFinalScore[1][5].finalExamS = 85;
        
        MidFinalScore[0][6] = arrayofStudent[6];
        MidFinalScore[1][6] = arrayofStudent[6];
        MidFinalScore[0][6].midTermS = 80;
        MidFinalScore[1][6].finalExamS = 83;
        
        MidFinalScore[0][7] = arrayofStudent[7];
        MidFinalScore[1][7] = arrayofStudent[7];
        MidFinalScore[0][7].midTermS = 82;
        MidFinalScore[1][7].finalExamS = 84;
    }    
}

class Student_Method {
    
    student findMaxDC(student[] list, int l, int r) {
        if (l == r) {
            return list[l];
        }
        
        int mid = (l + r) / 2;
        student leftMax = findMaxDC(list, l, mid);
        student rightMax = findMaxDC(list, mid + 1, r);
        
        if (leftMax.midTermS > rightMax.midTermS) {
            return leftMax;
        } else {
            return rightMax;
        }
    }
    
    student findMinDC(student[] list, int l, int r) {
        if (l == r) {
            return list[l];
        }
        
        int mid = (l + r) / 2;
        student leftMin = findMinDC(list, l, mid);
        student rightMin = findMinDC(list, mid + 1, r);
        
        if (leftMin.midTermS < rightMin.midTermS) {
            return leftMin;
        } else {
            return rightMin;
        }
    }
    
    double calculateAvgBF(student[] scores) {
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i].finalExamS;
        }
        return total / scores.length;
    }
    
}