package Jobsheet_2_19022026;

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

        practicum_1_Mahasiswa_19 mhs2 = new practicum_1_Mahasiswa_19("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateGPA(3.30);
        mhs2.displayInformation();

        practicum_1_Mahasiswa_19 mhs3 = new practicum_1_Mahasiswa_19("Rafa  Hisyam Nawwaf", "254107060079", 3.79, "SIB 1G");
        mhs3.displayInformation();

    }

}
