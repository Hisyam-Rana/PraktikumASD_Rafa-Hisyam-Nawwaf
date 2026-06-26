package Final_Exam_PASD_26062026;

public class TRANSACTION {
    int transactCode, transactQuantity, transactTotal;
    ITEM itemPurchased;
    
    TRANSACTION() {}
    
    TRANSACTION (int tCode, ITEM ketemon, int tQuantity, int tTotal) {
        this.transactCode = tCode;
        this.itemPurchased = ketemon;
        this.transactQuantity = tQuantity;
        this.transactTotal = tTotal;
    }
}
