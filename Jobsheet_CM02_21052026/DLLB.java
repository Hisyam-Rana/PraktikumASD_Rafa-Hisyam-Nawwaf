package Jobsheet_CM02_21052026;

public class DLLB {
    NodeBuyer front;
    NodeBuyer rear;

    DLLB() {
        front = null;
        rear = null;
    }

    boolean isEmpty(){
        return front==null;
    }

    void enqueue(Buyer dataB) {
        NodeBuyer newNode = new NodeBuyer(dataB);
        if(isEmpty()){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
    }

    public Buyer dequeueB(){
        if(isEmpty()){
            System.out.println("There is currently no queue");
            return null;
        }
        
        Buyer served = front.dataB;
        if(front == rear) {
            front = rear = null;
        }else{
            front = front.next;
            front.prev = null;
        }
        return served;
    }

    void printB(){
        System.out.println("===============================");
        System.out.println("       QUEUE OF CUSTOMERS      ");
        System.out.println("===============================");
        if(!isEmpty()){
            NodeBuyer temp = front;
            while(temp!=null){
                temp.dataB.printB();
                temp = temp.next;
            }
            System.out.println("");
        }else{
            System.out.println("There is currently no queue");
        }
    }
}
