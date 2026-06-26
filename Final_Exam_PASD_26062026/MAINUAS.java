package Final_Exam_PASD_26062026;
import java.util.Scanner;
public class MAINUAS {
    
    public static void main(String[] args) {
    IMETHODE dafBar = new IMETHODE();
    TMETHODE dafTrans = new TMETHODE();
    int itungan = 1;
    Scanner isc = new Scanner(System.in);
        
        dafBar.nambahI_anyar(new ITEM("Z07", "Hammer", 18000, 67));
        dafBar.nambahI_anyar(new ITEM("Z08", "Nail", 100, 899));
        dafBar.nambahI_anyar(new ITEM("Z09", "Triplek", 20000, 666));
        dafBar.nambahI_anyar(new ITEM("Z10", "Saw", 19000, 69));
        int milio;
        
        do {
            System.out.println("\n===LOEMINTJOE SHOP===");
            System.out.println("1. Input New Transaction");
            System.out.println("2. Display History & Total Revenue");
            System.out.println("3. Sort Transaction History (A-Z)");
            System.out.println("0. EXIT");
            System.out.print("Choose menu (1-3): ");
            milio = isc.nextInt();
            
            switch (milio) {
                case 1:
                    System.out.println("\n---INPUT NEW TRANSACTION---");
                    System.out.print("Input Item Code           : ");
                    String lebokkeKode = isc.next(); 
                    System.out.print("Input Purchase Quantity   : ");
                    int lebokkejumlah = isc.nextInt();
                    isc.nextLine();
                    ITEM ketemon = dafBar.golekbarang(lebokkeKode);
                    if (ketemon == null) {
                        System.out.println("Item Code '" + lebokkeKode + "' not registered!");
                        break;
                    }
                    if (ketemon.itemStock == 0) {
                        System.out.println("Out of Stock");
                        break;
                    }
                    if (ketemon.itemStock < lebokkejumlah) {
                        System.out.println("Insufficient Stock! Remaining Stock : " + ketemon.itemStock);
                        break;
                    }
                    int iPrice = ketemon.itemPrice * lebokkejumlah;
                    double regokonco = 0;
                    
                    if (iPrice > 500000) {
                        regokonco += 0.05;
                    }
                    
                    System.out.print("Customer have Member ? (Y/N): ");
                    String memberpora = isc.next();
                    if (memberpora.equalsIgnoreCase("Y")) {
                        regokonco += 0.02;
                    }
                    
                    double totalTrakir = iPrice - (iPrice * regokonco);
                    
                    ketemon.itemStock -= lebokkejumlah;
                    
                    TRANSACTION Txanyar = new TRANSACTION(itungan, ketemon, lebokkejumlah, (int) totalTrakir);
                    dafTrans.nambahT_anyar(Txanyar);
                    
                    System.out.println("\n------------------------------------");
                    System.out.println("    TRANSACTION SUCCESSFULL!   ");
                    System.out.println("------------------------------------");
                    System.out.println("ID Note             : " + itungan);
                    System.out.println("Item Name           : " + ketemon.itemName);
                    System.out.println("Purchase Quantity   : " + lebokkejumlah + " pcs");
                    System.out.println("Unit Price          : " + iPrice);
                    System.out.println("Total Diskon        : " + (regokonco * 100) + "%");
                    System.out.println("TOTAL               : Rp " + totalTrakir);
                    System.out.println("------------------------------------");
                    itungan++;
                    break;
                case 2:
                    dafTrans.ndeloknoKabehmbeBati();;
                    break;
                case 3:
                    dafTrans.ngurutkeT_tekanjenengASC();;
                    break;
                case 4:
                    System.out.println("\nThank You!!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (milio != 0);
        isc.close();
    }
}

