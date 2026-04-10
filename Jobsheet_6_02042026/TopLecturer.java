package Jobsheet_6_02042026;
import java.util.Scanner;

public class TopLecturer {
    Lecturer[] lecturerData = new Lecturer[10];
    int idx = 0;
    Scanner isc = new Scanner(System.in);

    public void add(Lecturer dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIndex].age) {
                    maxIndex = j;
                }
            }
            Lecturer temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }

    public void dynamicAdd() {
        if (idx < lecturerData.length) {
            System.out.println("--------------------------------------------");
            System.out.print("ID       : ");
            String id = isc.nextLine();
            System.out.print("Name     : ");
            String name = isc.nextLine();
            System.out.print("Gender (M/F): ");
            boolean gender = isc.nextLine().equalsIgnoreCase("M");
            System.out.print("Age      : ");
            int age = Integer.parseInt(isc.nextLine());

            add(new Lecturer(id, name, gender, age));
            System.out.println("Data successfully added!");
        } else {
            System.out.println("List is full!");
        }
    }
}
