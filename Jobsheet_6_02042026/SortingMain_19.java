package Jobsheet_6_02042026;

public class SortingMain_19 {
    public static void main(String[] args) {
        //int[] a = {34, 7, 23, 32, 5, 62};
        //int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};
        //Sorting_19 sorting = new Sorting_19(a);
        //Sorting_19 sorting2 = new Sorting_19(b);
        Sorting_19 sorting3 = new Sorting_19(c);
        System.out.println("Original Array : ");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array (Selection sort) : ");
        sorting3.print();
    }
}
