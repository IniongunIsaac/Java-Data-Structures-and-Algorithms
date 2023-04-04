package sorting;

import java.util.Arrays;

import static utils.Utils.intArray;
import static utils.Utils.swap;

public class QuickSortGPT {

    public static void main(String[] args) {
        //int[] arr = { 5, 2, 8, 3, 9, 1 };
        quickSort(intArray, 0, intArray.length - 1);
        System.out.println(Arrays.toString(intArray));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

}

