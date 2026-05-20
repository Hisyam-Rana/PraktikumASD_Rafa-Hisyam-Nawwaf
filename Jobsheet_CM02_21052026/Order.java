package Jobsheet_CM02_21052026;

public class Order {
    int orderCode, price;
    String orderName;
    
    public Order() {
    }
    
    public Order(int a, String b, int d) {
        this.orderCode = a;
        this.orderName = b;
        this.price = d;
    }

    void printO() {
        System.out.println(orderCode + " \t| " + orderName + " \t| " + price);
    }
}
