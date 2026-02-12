package Jobsheet_1_12022026;

import java.util.Scanner;

public class functional_Practicum {
    
    static Scanner isc = new Scanner(System.in);
    static String[] flowerType = {"Aglonema", "Yam", "Alocasia", "Rose"};
        
    static int[][] flowerStock = {
        {10, 6, 2, 5}, 
        {5, 11, 10, 7}, 
        {15, 9, 10, 12}, 
        {7, 12, 5, 9}
        };


    public static void main(String[] args) {
    
        int choice = 0;

        do {

            System.out.println("\n===========================================");
            System.out.println("     ROYAL GARDEN STORE MANAGEMENT SYSTEM       ");
            System.out.println("===========================================");
            System.out.println("1. Flower Stock Data at each Branch");
            System.out.println("2. Income Calculation from Each Branch");
            System.out.println("0. Exit");
            System.out.print("Your Choice : ");
            choice = isc.nextInt();

            switch (choice) {
                case 1:
                    dataOfFlowerFromEachRoyalGardenBranch();
                    break;
            
                case 2:
                    incomeCalculationFromEachBranch();
                    break;

                case 0:
                    System.out.println("Exit The Program");
                    break;

                default:
                    break;
            }

        } while (choice != 0);

    }

    public static void dataOfFlowerFromEachRoyalGardenBranch() {

         System.out.printf("\n%-20s %-15s %-10s %-15s %-10s", 
         "Store Branch", flowerType[0], flowerType[1], flowerType[2], flowerType[3]);
        System.out.println("\n===========================================================================");

        for (int i = 0; i < flowerStock.length; i++) {
          System.out.printf("%-22s %-14s %-12s %-13s %-5s\n",
           "Royal Garden-"+ i, flowerStock[0][i], flowerStock[1][i],
            flowerStock[2][i], flowerStock[3][i]);
        }
        System.out.println("===========================================================================");

    }



    public static void incomeCalculationFromEachBranch() {
    
        int choice = 0;
        int totalB1=0, totalB2=0;
        int totalB3=0, totalB4=0;
        int aglonemaPrice = 75000, yamPrice = 50000;
        int alocasiaPrice = 60000, rosePrice = 10000;
        String status;

        do {
            System.out.println("=====ROYAL GARDEN STORE BRANCH=====");
            System.out.println("1. Royal Garden-1");
            System.out.println("2. Royal Garden-2");
            System.out.println("3. Royal Garden-3");
            System.out.println("4. Royal Garden-4");
            System.out.println("0. Exit");
            System.out.print("Your Choice : ");
            choice = isc.nextInt();

            switch (choice) {
                case 1: 

                     totalB1 = (flowerStock[0][0] * aglonemaPrice) + (flowerStock[1][0] * yamPrice )
                    + (flowerStock[2][0] * alocasiaPrice ) + (flowerStock[3][0] * rosePrice);
                    
                    if (totalB1 <= 1500000) {
                        status = "Need Evaluation";
                    } else {
                        status = "Very Good";
                    }

                    System.out.println("============================================ ");
                    System.out.println("Total income from Royal Garden-1    : "+ totalB1);
                    System.out.println(status);
                    System.out.println("============================================ ");

                    break;
            
                

                case 2 :

                     totalB2 = (flowerStock[0][1] * aglonemaPrice) + (flowerStock[1][1] * yamPrice )
                    + (flowerStock[2][1] * alocasiaPrice ) + (flowerStock[3][1] * rosePrice);
                    
                    if (totalB2 <= 1500000) {
                        status = "Need Evaluation";
                    } else {
                        status = "Very Good";
                    }

                    System.out.println("============================================ ");
                    System.out.println("Total income from Royal Garden-2    : "+ totalB2);
                    System.out.println(status);
                    System.out.println("============================================ ");

                    break;



                case 3 :

                     totalB3 = (flowerStock[0][2] * aglonemaPrice) + (flowerStock[1][2] * yamPrice )
                    + (flowerStock[2][2] * alocasiaPrice ) + (flowerStock[3][2] * rosePrice);
                    
                    if (totalB3 <= 1500000) {
                        status = "Need Evaluation";
                    } else {
                        status = "Very Good";
                    }

                    System.out.println("============================================ ");
                    System.out.println("Total income from Royal Garden-3    : "+ totalB3);
                    System.out.println(status);
                    System.out.println("============================================ ");

                    break;



                case 4 :

                     totalB4 = (flowerStock[0][3] * aglonemaPrice) + (flowerStock[1][3] * yamPrice )
                    + (flowerStock[2][3] * alocasiaPrice ) + (flowerStock[3][3] * rosePrice);
                    
                    if (totalB4 <= 1500000) {
                        status = "Need Evaluation";
                    } else {
                        status = "Very Good";
                    }

                    System.out.println("============================================ ");
                    System.out.println("Total income from Royal Garden-1    : "+ totalB4);
                    System.out.println(status);
                    System.out.println("============================================ ");

                    break;

                case 0:
                    System.out.println("Exit The Program");
                    break;

                default:

                    break;
            }    
        } while (choice != 0);
    }
}
