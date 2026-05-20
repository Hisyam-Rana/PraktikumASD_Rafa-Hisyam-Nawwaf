package Jobsheet_CM02_21052026;

public class DLLO {
    NodeOrder front;
    NodeOrder rear;

    DLLO() {
        front = null;
        rear = null;
    }

    boolean isEmpty(){
        return front==null;
    }

    void enqueue(Order dataO) {
        NodeOrder newNode = new NodeOrder(dataO);
        if(isEmpty()){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    void addOrder() {
        if (isEmpty()) {
            System.out.println("There is currently no order");
            return;
        }
    }

    void sortOrder() {
        if (isEmpty() || front.next == null) {
            return;
        }

    boolean swapped;
        do {
            swapped = false;
            NodeOrder current = front;
            while (current.next != null) {
                if (current.dataO.orderName.compareToIgnoreCase(current.next.dataO.orderName) > 0) {
                    Order temp = current.dataO;
                    current.dataO = current.next.dataO;
                    current.next.dataO = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    void printOrder(){
        if(isEmpty()){
            System.out.println("There is currently no order");
            return;
        }

        System.out.println("===================================");
        System.out.println("ORDER REPORT (SORTED BY ORDER NAME)");
        System.out.println("===================================");
        
        
        sortOrder();

        NodeOrder temp = front;
        while(temp!=null){
            temp.dataO.printO();
            temp = temp.next;
        }
        System.out.println("");
    }
}
