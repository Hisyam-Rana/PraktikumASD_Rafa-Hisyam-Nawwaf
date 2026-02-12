package Jobsheet_1_12022026;

import java.util.Scanner;

public class repetition_Practicum {
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);

        System.out.print("NIM input: ");
        String nim = isc.nextLine();

        System.out.print("Input The last two digit of Your NIM  : ");
        int n = isc.nextInt();

        if (n < 10) {
            n += 10;
        }

        System.out.println(nim);
        for (int i = 1; i <= n; i++) {
            
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("#");
            } 
            
            else if (i % 2 == 0) {
                System.out.print(i);
            } 

            else {
                System.out.print("*");
            }
        }        
        System.out.println();

        isc.close();
    }
}
