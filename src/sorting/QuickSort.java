package sorting;

import java.util.Arrays;

import static utils.Utils.intArray;

public class QuickSort {
    public static void main(String[] args) {
        quickSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));
    }

    private static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {
        // This is using the first element in the array as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {

            //NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            //NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;

        return j;
    }
}
