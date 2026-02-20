package Jobsheet_2_19022026.Practicum_Exercise;

public class courseMain_19 {
    
    public static void main(String[] args) {
        
        course_19 course1 = new course_19();
        course1.name = "Algorithm and Data Structure";
        course1.code = "SIB252004";
        course1.credit = 2;
        course1.numberOfHours = 4;

        course1.showInformation();
        course1.updateCourseCredit(3);
        course1.addHours(2);
        course1.checkAndReduceNumberOfHours(2);
        course1.showInformation();


        course_19 course2 = new course_19("Database", "SIB25206", 2, 4);
        course2.showInformation();
        
    }
}
