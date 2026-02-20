package Jobsheet_2_19022026.Practicum_Exercise;

public class course_19 {
    
    public course_19 () {
    }

    public course_19 (String course_Name, String course_Code, int course_Credit, int course_NumberOfHours ) {
    
    this.name           = course_Name;
    this.code           = course_Code;
    this.credit         = course_Credit;
    this.numberOfHours  = course_NumberOfHours;
    
    }

    String code;
    String name;
    int credit;
    int numberOfHours;

    void showInformation () {
        System.out.println("Course Name     : "+name);
        System.out.println("Course Code     : "+code);
        System.out.println("Course Credit   : "+credit);
        System.out.println("Number of Hours : "+numberOfHours+"\n");
    }

    void updateCourseCredit (int newCredit) {
        credit = newCredit;
    }

    void addHours (int addHours) {
        numberOfHours += addHours;
    }

    void reduceHours (int reduceHours) {
        numberOfHours = numberOfHours - reduceHours;
    }
    
    String checkAndReduceNumberOfHours (int reduceHours) {
        if (numberOfHours < reduceHours) {
            System.out.println("The number of hours cannot be reduced.\n");
            return "The number of initial hours is less than the reduction hours";
        } else {
            reduceHours(reduceHours);
            System.out.println("Reduction in the number of hours successful.");
            System.out.println("Number of Hours : "+numberOfHours+"\n");
            return "The initial number of hours is sufficient.";
        }
    }

}
