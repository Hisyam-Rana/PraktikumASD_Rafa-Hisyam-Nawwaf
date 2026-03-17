package Jobsheet_4_17032026;

import java.util.Scanner;

class Power {
    int baseNumber, exponent;
    
    Power (int n, int e) {
        baseNumber  = n;
        exponent    = e;
    }
    
    int powerBF (int n, int e) {
        
        int result = 1;
        for (int i = 0; i < e; i++) {
            result = result * n;
        }
        return result;
    }
    
    int powerDC (int n, int e) {
        
        if ( e == 1 ) {
            return n;
        } else {
            if ( e % 2 == 1 ) {
                return (powerDC(n, e/2) * powerDC(n, e/2) * n);
            } else {
                return (powerDC(n, e/2) * powerDC(n, e/2));
            }
        }
    }
}

public class Exponentials {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        
        System.out.print("Input element number  : ");
        int element = isc.nextInt();
        
        Power[] png = new Power[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Input base number for "+(i+1)+" th element    : ");
            int base = isc.nextInt();
            System.out.print("Input exponent for "+(i+1)+" th element       : ");
            int exp = isc.nextInt();
            
            png[i] = new Power(base, exp);
        }
        
        System.out.println("===POWER RESULT USING BRUTEFORCE===");
        for (Power p : png) {
            System.out.println(p.baseNumber+"^"+p.exponent+": "+p.powerBF(p.baseNumber, p.exponent));
        }
        System.out.println("\n===POWER RESULT USING DIVIDE & CONQUER===");
        for (Power p : png) {
            System.out.println(p.baseNumber+"^"+p.exponent+": "+p.powerDC(p.baseNumber, p.exponent));
        }
        isc.close();
    }
}
