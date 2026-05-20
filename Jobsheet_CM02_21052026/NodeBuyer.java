package Jobsheet_CM02_21052026;

public class NodeBuyer {
    Buyer dataB;
    NodeBuyer prev;
    NodeBuyer next;

    NodeBuyer() {
    }

    NodeBuyer(Buyer dtB) {
        this.dataB = dtB;
        prev = null;
        next = null;
    }

    NodeBuyer(NodeBuyer prev, Buyer dtB, NodeBuyer next) {
        this.dataB = dtB;
        this.prev = prev;
        this.next = next;
    }

}
