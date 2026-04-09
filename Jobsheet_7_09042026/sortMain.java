package Jobsheet_7_09042026;

public class sortMain {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        
        mergeSort ms = new mergeSort();
        
        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data");
        ms.printArray(data);
        ms.mergeSort(data);
        System.out.println("Sorted Data");
        ms.printArray(data);
    }
}
