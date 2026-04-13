package Jobsheet_CM01_13042026;
import java.util.Scanner;
public class BookCM {
    String code;
    String title;
    String status;
    int year;

    Scanner sc = new Scanner(System.in);

    public BookCM () {}

    public BookCM (String codE, String titlE, int yeaR) {
        this.code = codE;
        this.title = titlE;
        this.year = yeaR;
    }

    public void printBook () {
        
        System.out.println ("Code : " +code+ 
                            " | Title : " +title+ 
                            "   \t| Year : " +year);
    }
}
