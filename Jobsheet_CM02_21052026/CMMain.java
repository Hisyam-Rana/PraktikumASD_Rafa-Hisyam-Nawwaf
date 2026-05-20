package Jobsheet_CM02_21052026;
import java.util.Scanner;
public class CMMain {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        DLLB buy = new DLLB();
        DLLO order = new DLLO();
        int choice;
        
        buy.enqueue(new Buyer(1, "Ainra", "08224500000"));
        buy.enqueue(new Buyer(2, "Danra", "08224511111"));
        buy.enqueue(new Buyer(3, "Sanri", "08224522222"));
        int currentqn = 4;
        
        
        do {
            System.out.println("===============================");
            System.out.println("   ROYAL DELISH QUEUE SYSTEM");
            System.out.println("===============================");
            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Remove Queue and Messages");
            System.out.println("4. Order Report");
            System.out.println("0. Exit");
            System.out.println("===============================");
            System.out.print("Select menu : ");
            String c = isc.nextLine();
            choice = Integer.parseInt(c);
            
            switch (choice) {
                case 1:
                    System.out.print("Buyer Name    : ");
                    String name = isc.nextLine();
                    System.out.print("Phone Number  : ");
                    String mobileNumber = isc.nextLine();
                    Buyer nb = new Buyer(currentqn, name, mobileNumber);
                    buy.enqueue(nb);
                    System.out.println("The queue has been succesfully added with the number : "+currentqn);
                    currentqn++;
                    break;
                
                case 2:
                    buy.printB();
                    break;
                
                case 3:
                    if (buy.isEmpty()) {
                        System.out.println("There is currently no queue to serve!");
                        break;
                    }
                    System.out.print("Order Code    : ");
                    String oc = isc.nextLine();
                    int orderCode = Integer.parseInt(oc);
                    System.out.print("Order Name    : ");
                    String orderName = isc.nextLine();
                    System.out.print("Price         : ");
                    String prc = isc.nextLine();
                    int price = Integer.parseInt(prc);
                    Order Od = new Order(orderCode, orderName, price);
                    order.enqueue(Od);
                    
                    Buyer served = buy.dequeueB();
                    System.out.println(served.name+" has ordered "+ orderName);
                    break;
                
                case 4:
                    order.printOrder();
                    break;
                
                case 0:
                    System.out.println("Thank You");
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    isc.close();
    }
}
