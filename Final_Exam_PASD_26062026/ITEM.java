package Final_Exam_PASD_26062026;

public class ITEM {
    String itemCode, itemName;
    int itemPrice, itemStock;
    
    ITEM() {}
    
    ITEM(String code, String name, int price,int stock) {
        this.itemCode = code;
        this.itemName = name;
        this.itemPrice = price;
        this.itemStock = stock;
    }
    
    void ITEMprint() {
        System.out.println(itemCode + " |\t " + itemName + "   \t|\t " + itemPrice + " |\t " + itemStock);
    }
    
}
