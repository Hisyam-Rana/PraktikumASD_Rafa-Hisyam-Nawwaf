package Jobsheet_6_02042026;

public class TopStudent_19 {
    Student_19[] listStudent_19s;
    int idx;

    public TopStudent_19(int size) {
    listStudent_19s = new Student_19[size];
    idx = 0;
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
}
