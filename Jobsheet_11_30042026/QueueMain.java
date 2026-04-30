package Jobsheet_11_30042026;
import java.util.Scanner;
public class QueueMain {
    
    static void menu () {
        System.out.println("Available Menu  : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("=========================");
    }
    
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        System.out.print("Input maximum number of data  : ");
        int n = isc.nextInt();
        Queue Q = new Queue(n);

        int choice = -1;
        do {
            menu();
            choice = isc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input new data    : ");
                    int newData = isc.nextInt();
                    Q.enqueue(newData);
                    System.out.println();
                    break;
                
                case 2:
                    int outData = Q.dequeue();
                    if (outData != 0) {
                        System.out.println("Removed data    : "+outData);
                    }
                    System.out.println();
                    break;
                
                case 3:
                    Q.print();
                    System.out.println();
                    break;
                
                case 4:
                    Q.peek();
                    System.out.println();
                    break;
                
                //case 5:
                    //Q.clear();
                    //break;
                
                default:
                    System.out.println("Invalid Choices");
                    break;
            }
        } while (choice==1 || choice==2 || choice==3 || choice==4 || choice==5 );
        isc.close();
    }
}
