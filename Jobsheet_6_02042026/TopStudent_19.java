package Jobsheet_6_02042026;
import java.util.Scanner;

public class TopStudent_19 {
    Student_19[] listStudent_19s;
    int idx;
    Scanner isc = new Scanner(System.in);

    public TopStudent_19(int size) {
    listStudent_19s = new Student_19[size];
    idx = 0;
    }

    public void dynamicAdd() { 
    if (idx < listStudent_19s.length) {
        System.out.println("--------------------------------------------");
        System.out.println("Input Student Data (" + (idx + 1) + ")");
        
        Student_19 student_19 = new Student_19(); 

        System.out.print("NIM   : ");
        student_19.nim = isc.nextLine();
        
        System.out.print("Name  : ");
        student_19.name = isc.nextLine();
        
        System.out.print("Class : ");
        student_19.studentClass = isc.nextLine();
        
        System.out.print("GPA   : ");
        String dummy = isc.nextLine();
        student_19.gpa = Double.parseDouble(dummy);
        
        listStudent_19s[idx] = student_19;
        idx++;
        
        System.out.println("Data successfully added!");
        System.out.println("--------------------------------------------");
    } else {
        System.out.println("List is full! Cannot add more students.");
    }
}

    public void add(Student_19 student_19) {
        if (idx < listStudent_19s.length) {
            listStudent_19s[idx] = student_19;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudent_19s[i].print();
        }
    }

    public void bubbleSort () {
        for (int i = 0; i < idx -1; i++) {
            for (int j = 0; j < idx -i -1; j++) {
                if (listStudent_19s[j].gpa < listStudent_19s[j+1].gpa) {
                    Student_19 temp = listStudent_19s[j];
                    listStudent_19s[j] = listStudent_19s[j+1];
                    listStudent_19s[j+1] = temp;
                }
            }
        }
    }

    public void selectionSort () {
        for (int i = 0; i < idx -1; i++) {
            int minIndex = i;
            for (int j = i +1; j < idx; j++) {
                if (listStudent_19s[j].gpa < listStudent_19s[minIndex].gpa) {
                    minIndex = j;
                }
            }
            Student_19 temp = listStudent_19s[minIndex];
            listStudent_19s[minIndex] = listStudent_19s[i];
            listStudent_19s[i] = temp;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Student_19 temp = listStudent_19s[i];
            int j = i;

            while (j > 0 && listStudent_19s[j-1].gpa > temp.gpa) {
                listStudent_19s[j] = listStudent_19s[j-1];
                j--;
            }
            listStudent_19s[j] = temp;
        }
    }
}
