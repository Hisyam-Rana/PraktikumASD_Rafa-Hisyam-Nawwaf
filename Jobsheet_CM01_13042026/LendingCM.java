package Jobsheet_CM01_13042026;

import java.util.Scanner;

public class LendingCM {
    StudentCM sdt;
    BookCM book;
    int loanPeriod;
    int loanLimit = 5;
    int overdue;
    int fine;

    Scanner sc = new Scanner(System.in);

    public LendingCM () {}

    public LendingCM (StudentCM sdT, BookCM booK, int loanPERIOD) {
        this.sdt = sdT;
        this.book = booK;
        this.loanPeriod = loanPERIOD;
        calculateFine();
    }

    public void printLending () {
        
        System.out.println ("Student Name : " +sdt.name+ 
                            " \t| Book : " +book.title+ 
                            " \t| Loan Period (days) : " +loanPeriod+ 
                            " \t| Late return of books : " +overdue+ 
                            " \t| Fine : " +fine);
    }

    public void calculateFine() {
        if (loanPeriod > loanLimit) {
            overdue = loanPeriod - loanLimit;
            fine = overdue * 2000;
        } else {
            overdue = 0;
            fine = 0;
        }
    }
}
