package Jobsheet_13_14052026;

public class Node {
    student data;
    Node prev;
    Node next;

    Node() {
    }

    Node(student data) {
        this.data = data;
        prev = null;
        next = null;
    }

    Node(Node prev, student data, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
