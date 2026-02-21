package Jobsheet_2_19022026.Practicum_Exercise;

public class lecturers_19 {
    public lecturers_19 () {
    }

    public lecturers_19 (String fullName, String lecturersId, boolean workStatus, int yearOfEntry, String expertiseCompetency ) {
    
    this.name           = fullName;
    this.id             = lecturersId;
    this.status         = workStatus;
    this.yearEntry      = yearOfEntry;
    this.expertise      = expertiseCompetency;
    
    }

    String name;
    String id;
    boolean status;
    int yearEntry;
    String expertise;
    String statusWord;

    void displayInformation () {
        System.out.println("====================================================");
        System.out.println("Lecturer's Information");
        System.out.println("Name            : "+name);
        System.out.println("ID              : "+id);
        setStatus(status);
        System.out.println("Year of Entry   : "+yearEntry);
        System.out.println("Expertise       : "+expertise);
        System.out.println("====================================================");
    }

    void setStatus (boolean setStatus) {
        status = setStatus;
        statusWord = status ? "Active" : "Innactive";
        System.out.println("Status          : "+statusWord);
    }

    void updateStatus (boolean updateStatus) {
        status = updateStatus;
        statusWord = status ? "Active" : "Innactive";
        System.out.println("The status data has been successfully updated");
        System.out.println("Status          : "+statusWord);
    }

    void calculateTimeWork (int yearNow) {
        int timeWork = yearNow - yearEntry ;
        System.out.println("\nThe length of time working  : "+timeWork);
    }

    String changeSkill (String newExpertise) {
        expertise = newExpertise;
        System.out.println("\nThe Expertise data has been successfully updated");
        System.out.println("Expertise       : "+newExpertise);
        return "The data has been successfully updated";
    }

}
