package Jobsheet_4_17032026;

import java.util.Scanner;

class Factorial {
    
    int  factorialBF (int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }
        return facto;
    }
    
    int  factorialDC (int n) {
        if ( n == 1 ) {
            return 1;
        } else {
            int facto = n * factorialDC(n-1);
            return facto;
        }
    }
}

public class Factorials {
    
    
    
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);
        
        System.out.print("Input a number : ");
        int num = isc.nextInt();
        
        Factorial fk = new Factorial();
        System.out.println("The factorial of "+num+" using BF   : "+fk.factorialBF(num));
        System.out.println("The factorial of "+num+" using DC   : "+fk.factorialDC(num));
        
        isc.close();
    }
}
