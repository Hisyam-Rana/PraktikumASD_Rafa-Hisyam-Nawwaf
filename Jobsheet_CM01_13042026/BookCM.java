package Jobsheet_CM01_13042026;
import java.util.Scanner;
public class BookCM {
    String code;
    String title;
    String status;
    int year;
    String publisher;

    Scanner sc = new Scanner(System.in);

    public BookCM () {}

    public BookCM (String codE, String titlE, int yeaR, String publisheR) {
        this.code = codE;
        this.title = titlE;
        this.year = yeaR;
        this.publisher = publisheR;
    }

    public void printBook () {
        
        System.out.println ("Code : " +code+ 
                            " | Title : " +title+ 
                            "   \t| Year : " +year +
                            " | Publisher : " +publisher);
    }
}
