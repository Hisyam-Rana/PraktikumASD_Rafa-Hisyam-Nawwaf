package Jobsheet_2_19022026;

public practicum_1_Mahasiswa_19 () {
    }

    public practicum_1_Mahasiswa_19 (String nm, String NIM, double GPA, String cls) {
        name = nm;
        this.nim = NIM;
        this.gpa = GPA;
        clasS = cls;
    }

public class practicum_2_StudentMain_19 {
    
    public static void main(String[] args) {
    
        practicum_1_Mahasiswa_19 mhs1 = new practicum_1_Mahasiswa_19();
        mhs1.name = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.clasS = "SI 2J";
        mhs1.gpa = 3.55;

        mhs1.displayInformation();
        mhs1.changeclass("SI 2K");
        mhs1.updateGPA(3.60);
        mhs1.displayInformation();

        practicum_1_Mahasiswa_19 mhs2 = new practicum_1_Mahasiswa_19("Annisa NABILA", "2141720160", 3.25, "TI 2L");
        mhs2.updateGPA(3.30);
        mhs2.displayInformation();

    }

}
