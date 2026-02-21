package Jobsheet_2_19022026.Practicum_Exercise;

public class lecturersMain_19 {
    
    public static void main(String[] args) {
        
        lecturers_19 ltr1 = new lecturers_19();
        ltr1.name       = "Vivin Ayu Lestari";
        ltr1.id         = "199106212019032020";
        ltr1.status     = false;
        ltr1.yearEntry  = 2020;
        ltr1.expertise  = "Bachelor's degree in Computer";

        ltr1.displayInformation();
        ltr1.updateStatus(true);
        ltr1.changeSkill("Bachelor's degree in Education");
        ltr1.calculateTimeWork(2026);
        ltr1.displayInformation();

        lecturers_19 ltr2 = new lecturers_19("Wilda Imama Sabilla", "199208292019032023", false, 2023, "Bachelor's degree in Data Science");
        ltr2.displayInformation();
        ltr2.updateStatus(true);
        ltr2.calculateTimeWork(2026);
        ltr2.changeSkill("Bachelor's degree in Computer");
        ltr2.displayInformation();

    }
    


}
