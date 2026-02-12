package Jobsheet_1_12022026;

import java.util.Scanner;

public class duties_Schedule {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        System.out.print("Enter the number of Class Schedules   : ");
        int n = isc.nextInt();
        isc.nextLine();

        String[][] schedule = new String[n][4];

        
        inputScheduleData(schedule, isc);
        
        displayAllSchedules(schedule);

        System.out.print("\nInput Day to search the Schedule    : ");
        String searchDay = isc.nextLine();
        displayByDay(schedule, searchDay);

        System.out.print("\nInput Course name to search the Schedule    : ");
        String searchCourse = isc.nextLine();
        displayByCourse(schedule, searchCourse);

        isc.close();
    }

    public static void inputScheduleData(String[][] schedule, Scanner isc) {
        System.out.println("\n===Input Lecture Schedule===");
        for (int i = 0; i < schedule.length; i++) {
            System.out.println("Schedule-" + (i + 1));
            System.out.print("Course Name   : ");
            schedule[i][0] = isc.nextLine();
            System.out.print("Room          : ");
            schedule[i][1] = isc.nextLine();
            System.out.print("Day           : ");
            schedule[i][2] = isc.nextLine();
            System.out.print("Time          : ");
            schedule[i][3] = isc.nextLine();
            System.out.println();
        }
    }

    public static void displayAllSchedules(String[][] schedule) {
        System.out.println("\n===Course Schedule===");
        System.out.println("===============================================================================");
        System.out.printf("| %-30s | %-15s | %-12s | %-15s |\n", "Course", "Room", "Day", "Time");
        System.out.println("===============================================================================");
        for (int i = 0; i < schedule.length; i++) {
            printTableRow(schedule[i]);
        }
    }

    public static void displayByDay(String[][] schedule, String day) {
        System.out.println("\n===Schedule on the day    : " + day + "===");
        System.out.println("===============================================================================");
        System.out.printf("| %-30s | %-15s | %-12s | %-15s |\n", "Course", "Room", "Day", "Time");
        System.out.println("===============================================================================");
        boolean found = false;
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][2].equalsIgnoreCase(day)) {
                printTableRow(schedule[i]);
                found = true;
            }
        }
        if (!found) System.out.println("| No data was found for that day.                     |");
    }

    public static void displayByCourse(String[][] schedule, String courseName) {
        System.out.println("\n===Course Search    : " + courseName + "===");
        System.out.println("===============================================================================");
        System.out.printf("| %-30s | %-15s | %-12s | %-15s |\n", "Course", "Room", "Day", "Time");
        System.out.println("===============================================================================");
        boolean found = false;
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][0].equalsIgnoreCase(courseName)) {
                printTableRow(schedule[i]);
                found = true;
            }
        }
        if (!found) System.out.println("| No data was found for this course..             |");
    }

    private static void printTableRow(String[] row) {
        System.out.printf("| %-30s | %-15s | %-12s | %-15s |\n", row[0], row[1], row[2], row[3]);
    }
}
    
    
