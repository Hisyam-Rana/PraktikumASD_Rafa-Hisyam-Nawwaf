package Jobsheet_CM01_13042026;

public class CMMethod {
    StudentCM[] liststd;
    int idx;

    public static StudentCM[] listStudent() {
        return new StudentCM[] {
            new StudentCM ("22001", "Andi", "Informatics Engineering"),
            new StudentCM ("22002", "Budi", "Informatics Engineering"),
            new StudentCM ("22003", "Citra", "Business Information Systems")
        };
    }

    static BookCM[] listBook() {
        return new BookCM[] {
            new BookCM("B001", "Algorithm", 2020),
            new BookCM("B002", "Database", 2019),
            new BookCM("B003", "Programming", 2021),
            new BookCM("B004", "Physics", 2024)
        };
    }

    static LendingCM[] listLoan(StudentCM[] students, BookCM[] books) {
        return new LendingCM[] {
            new LendingCM(students[0], books[0], 7),
            new LendingCM(students[1], books[1], 3),
            new LendingCM(students[2], books[2], 10),
            new LendingCM(students[2], books[3], 6),
            new LendingCM(students[0], books[1], 4)
        };
    }

    public CMMethod(int size) {
    liststd = new StudentCM[size];
    idx = 0;
    }

    public void add(StudentCM studentcm) {
        if (idx < liststd.length) {
            liststd[idx] = studentcm;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public static void sortbyFine(LendingCM[] listloan) {
        for (int i = 1; i < listloan.length; i++) {
            LendingCM temp = listloan[i];
            int j = i;

            while (j > 0 && listloan[j-1].fine < temp.fine) {
                listloan[j] = listloan[j-1];
                j--;
            }
            listloan[j] = temp;
        }
    }

    public static int findByStudentID (String search, int left, int right) {
        StudentCM[] students = listStudent();
        left = 0;
        right = listStudent().length -1;
        int foundIndex = -1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) /2;
            int compare = students[mid].nim.compareTo(search);
        
            if (compare == 0) {
                foundIndex = mid;
                break;
            } else if (compare < 0) {
                left = mid +1;
            } else {
                right = mid -1;
            }
        }

        if (foundIndex != -1) {
            int start = foundIndex;
            while (start > 0 && students[start - 1].nim.compareTo(search) == 0) {
                start--;
            }
            int end = foundIndex;
            while (end < students.length -1 && students[end + 1].nim.compareTo(search) == 0) {
                end++;
            }
            return start;
        } else {
            return -1;
        }

        
    }

}
