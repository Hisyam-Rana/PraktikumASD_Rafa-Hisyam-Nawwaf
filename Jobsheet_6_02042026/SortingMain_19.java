package Jobsheet_6_02042026;

public class SortingMain_19 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        Sorting_19 sorting = new Sorting_19(a);
        System.out.println("Original Array : ");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble sort) : ");
        sorting.print();
    }
}
