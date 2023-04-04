package sorting;

import java.util.Arrays;

import static utils.Utils.intArray;
import static utils.Utils.swap;

/**
 * Quick Sort is a sorting algorithm that uses the divide-and-conquer strategy to sort an array or a list. It is one of the most popular sorting
 * algorithms because of its efficiency and simplicity. The basic idea behind Quick Sort is to partition the array or list into smaller sub-arrays,
 * and then recursively sort these sub-arrays.
 * The algorithm works as follows:
 * 1. Choose a pivot element from the array or list. Typically, the pivot is chosen to be the last element in the array, but it can be any element.
 * 2. Reorder the array or list so that all elements less than the pivot come before the pivot, and all elements greater than the pivot come after it.
 *    This is called partitioning.
 * 3. Recursively apply the above steps to the sub-array or sub-list to the left of the pivot and the sub-array or sub-list to the right of the pivot,
 *     until the entire array or list is sorted.
 * The efficiency of Quick Sort depends on the choice of pivot element.
 * If the pivot is chosen to be the median element, the algorithm has an average time complexity of O(n log n) for an array of size n.
 * However, in the worst case scenario, when the pivot is the smallest or largest element in the array, the algorithm has a time complexity of O(n^2).
 * Despite its worst-case time complexity, Quick Sort is often faster in practice than other sorting algorithms like Merge Sort and Heap Sort,
 * due to its cache-efficient and in-place nature. Additionally, there are several optimizations that can be applied to Quick Sort to reduce the
 * likelihood of hitting worst-case time complexity, such as choosing a random pivot, or using a median-of-three pivot selection method.
 * The median-of-three pivot selection method is a technique used in Quick Sort to choose a better pivot element, with the goal of reducing
 * the likelihood of hitting the worst-case time complexity.
 * Instead of always selecting the right-most element in the sub-array as the pivot, the median-of-three method selects the median of three elements:
 * the left-most element, the right-most element, and the middle element.
 * Here's how the median-of-three pivot selection method works:
 * 1. Choose the left-most element, the right-most element, and the middle element of the sub-array.
 * 2. Compute the median of these three elements.
 * 3. Use the median as the pivot element.
 * By choosing the median of three elements as the pivot, we are less likely to select a pivot that is already sorted, which can lead to
 * worst-case time complexity. Additionally, this method is easy to implement and adds little overhead to the algorithm.
 *
 * In this implementation, we have the quickSort method which takes in the array to be sorted, as well as the indices of the left and right elements to sort.
 * It first checks whether there are at least two elements to sort, and if so, calls the partition method.
 * The partition method selects the right-most element as the pivot, and then loops through the sub-array to the left of the pivot, swapping elements
 * if they are less than or equal to the pivot. It then places the pivot in the correct position and returns the index of the pivot.
 * The swap method is a helper method used to swap two elements in the array.
*/
public class QuickSortGPT {

    public static void main(String[] args) {
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

