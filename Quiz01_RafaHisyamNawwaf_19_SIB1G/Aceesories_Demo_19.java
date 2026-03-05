package Quiz01_RafaHisyamNawwaf_19_SIB1G;

import java.util.Scanner;

public class Aceesories_Demo_19 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int price, sold, stock, number; 
        String name, category, dummy;
        
        System.out.print("Input the number of accesories    : ");
        dummy = isc.nextLine();
        number = Integer.parseInt(dummy);
        Accesories_19[] arrayOfAccesories = new Accesories_19[number];

        System.out.println("--------------------------------------------");
        for (int i = 0; i < arrayOfAccesories.length; i++) {
            System.out.println("Input Data for the Accesories number-"+(i+1));
            System.out.print("Name      : ");
            name = isc.nextLine();
            System.out.print("Category  : ");
            category = isc.nextLine();
            System.out.print("Price     : ");
            dummy = isc.nextLine();
            price = Integer.parseInt(dummy);
            System.out.print("Stock     : ");
            dummy = isc.nextLine();
            stock = Integer.parseInt(dummy);
            System.out.print("sold      : ");
            dummy = isc.nextLine();
            sold = Integer.parseInt(dummy);
            System.out.println("--------------------------------------------");
            
            arrayOfAccesories[i] = new Accesories_19(name, category, price, sold, stock);
        }

        Accesories_Method_19.displayInformation(arrayOfAccesories);
        Accesories_Method_19.calculateTotalSales(arrayOfAccesories);
        Accesories_Method_19.searchCheapestAccesories(arrayOfAccesories);
        Accesories_Method_19.checkStock(arrayOfAccesories);
        isc.close();
    }
}
