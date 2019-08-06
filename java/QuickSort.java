import java.util.*;


public class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length -1);    

    }
    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            partition(arr, start, end);
            quicksort(arr, start, 
        }
    }
    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        for (int i = start; i < end; i++) {
            
        }

    }
    public static void main(String[] args) {
        int[] arr = {5,10,2,7,3,46,29,2,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
