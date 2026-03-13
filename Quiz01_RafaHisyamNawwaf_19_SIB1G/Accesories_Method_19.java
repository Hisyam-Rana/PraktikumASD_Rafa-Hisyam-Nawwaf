package Quiz01_RafaHisyamNawwaf_19_SIB1G;



public class Accesories_Method_19{
    static void displayInformation (Accesories_19[] arrayOfAccesories) {
        System.out.println("==================================================================================================");
        System.out.printf("| %-3s | %-15s | %-15s | %-15s | %-5s | %-5s |\n", "No", "Name", "Category", "Price", "Stock", "Sold");
        System.out.println("==================================================================================================");

        int i = 1;
        for (Accesories_19 accesories : arrayOfAccesories) {
    
        System.out.printf("| %-3d | %-15s | %-15s | %-15s | %-5s | %-5s |\n", 
                    i++, accesories.name, accesories.category, accesories.price, accesories.stock,accesories.sold);
}

    }
    
    static void calculateTotalSales (Accesories_19[] arrayOfAccesories) {
        int total=0;
        System.out.println("\n===Total Price for each Accesories===");
        for (int i = 0; i < arrayOfAccesories.length; i++) {
            total = arrayOfAccesories[i].sold * arrayOfAccesories[i].price;
            } 
        
        for (int i = 0; i < arrayOfAccesories.length; i++) {
                System.out.println("Name        : "+ arrayOfAccesories[i].name);
                System.out.println("Category    : "+ arrayOfAccesories[i].category);
                System.out.println("Price       : "+ arrayOfAccesories[i].price);
                System.out.println("Stock       : "+ arrayOfAccesories[i].stock);
                System.out.println("Quantity    : "+ arrayOfAccesories[i].sold);
                System.out.println("========================================");
                System.out.println("Total Price : \n"+ total);
                }
    }
    
    static void searchCheapestAccesories (Accesories_19[] arrayOfAccesories) {
        int cheapest = 1000000000;
        for (int i = 0; i < arrayOfAccesories.length; i++) {
            if (arrayOfAccesories[i].price < cheapest) {
                cheapest = arrayOfAccesories[i].price;
            }
        }
        
        System.out.println("\nData of the Cheapest Accesories");
        for (int i = 0; i < arrayOfAccesories.length; i++) {
            if (arrayOfAccesories[i].price == cheapest) {
                System.out.println("Name        : "+ arrayOfAccesories[i].name);
                System.out.println("Category    : "+ arrayOfAccesories[i].category);
                System.out.println("Price       : "+ arrayOfAccesories[i].price);
                System.out.println("Stock       : "+ arrayOfAccesories[i].stock);
                System.out.println("Quantity    : "+ arrayOfAccesories[i].sold);
            } 
        }    
    }
    
    static void checkStock (Accesories_19[] arrayOfAccesories) {
        String status=null;
        System.out.println("\nStock information for each Accesories");
        for (int i = 0; i < arrayOfAccesories.length; i++) {
            if (arrayOfAccesories[i].stock > 5) {
                status = "Many Stock";
            } else {
                status = "Limited Stock";
            }
        }
        
        for (int i = 0; i < arrayOfAccesories.length; i++) {
                System.out.println("Name        : "+ arrayOfAccesories[i].name);
                System.out.println("Category    : "+ arrayOfAccesories[i].category);
                System.out.println("Price       : "+ arrayOfAccesories[i].price);
                System.out.println("Stock       : "+ arrayOfAccesories[i].stock + "("+status+")");
                System.out.println("Quantity    : "+ arrayOfAccesories[i].sold+"\n");
                }
    }
}
