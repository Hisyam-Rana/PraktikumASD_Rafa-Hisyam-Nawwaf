package Jobsheet_13_14052026;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        
        dll.print();
        dll.addFirst(new student("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new student("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new student("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new student("114", "Rizki", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new student("115", "Hanzel", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new student("116", "Eiyu", "TI-1I", 3.4));
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();
    }
}
