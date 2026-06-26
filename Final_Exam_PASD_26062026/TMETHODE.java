package Final_Exam_PASD_26062026;

public class TMETHODE {
    TPASD ndas = null;
    TPASD buntut = null;
    
    void nambahT_anyar(TRANSACTION T_anyar) {
        TPASD newTPASD = new TPASD(T_anyar);
        if (ndas == null) {
            ndas = newTPASD;
            buntut = newTPASD;
        } else {
            buntut.kiwo = newTPASD;
            newTPASD.tengen = buntut;
            buntut = newTPASD;
        }
    }
    
    void ndeloknoKabehmbeBati() {
        if (ndas == null) {
            System.out.println("There are currently no transaction.");
            return;
        }
        TPASD sementaun = ndas;
        int totalOlehe = 0;
        
        System.out.println("===CASHIER TRANSACTION HISTORY===");
        while (sementaun != null) {
            System.out.println("Transaction ID  : "+sementaun.data.transactCode);
            System.out.println("Item Name       : "+sementaun.data.itemPurchased.itemName);
            System.out.println("Unit Price      : "+sementaun.data.itemPurchased.itemPrice);
            System.out.println("Quantity        : "+sementaun.data.transactQuantity);
            System.out.println("Total           : "+sementaun.data.transactTotal);
            System.out.println("-------------------------------------------------");
            
            totalOlehe = totalOlehe + sementaun.data.transactTotal;
            sementaun = sementaun.kiwo;
        }
        System.out.println("Total Shop Revenue  : "+totalOlehe);
    }
    
    void ngurutkeT_tekanjenengASC() {
        if (ndas == null || ndas.kiwo == null) {
            return;
        }
        
        Boolean onotukeran = true;
        while (onotukeran == true) {
            onotukeran = false;
            TPASD sementaun = ndas;
            
            while (sementaun.kiwo != null) {
                TPASD semenaben = sementaun.kiwo;
                String jeneng1 = sementaun.data.itemPurchased.itemName;
                String jeneng2 = semenaben.data.itemPurchased.itemName;
                
                if (jeneng1.compareToIgnoreCase(jeneng2) > 0) {
                    TRANSACTION saiki = sementaun.data;
                    sementaun.data = semenaben.data;
                    semenaben.data = saiki;
                    onotukeran = true;
                }
                sementaun = sementaun.kiwo;
            }
        }
    }
    
}
