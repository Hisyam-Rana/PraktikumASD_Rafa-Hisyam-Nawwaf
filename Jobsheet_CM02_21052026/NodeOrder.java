package Jobsheet_CM02_21052026;

public class NodeOrder {
    Order dataO;
    NodeOrder prev;
    NodeOrder next;

    NodeOrder() {
    }

    NodeOrder(Order dtO) {
        this.dataO = dtO;
        prev = null;
        next = null;
    }

    NodeOrder(NodeOrder prev, Order dtO, NodeOrder next) {
        this.dataO = dtO;
        this.prev = prev;
        this.next = next;
    }
}
