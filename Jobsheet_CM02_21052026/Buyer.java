package Jobsheet_CM02_21052026;

public class Buyer {
    String name, mobileNumber;
    int queNumber;
    
    public Buyer() {
    }
    
    public Buyer (int qn, String b, String c) {
        this.queNumber = qn;
        this.name = b;
        this.mobileNumber = c;
    }
    
    void printB() {
        System.out.println(queNumber +"\t| "+ name + "  \t| " + mobileNumber + " ");
    }

}
