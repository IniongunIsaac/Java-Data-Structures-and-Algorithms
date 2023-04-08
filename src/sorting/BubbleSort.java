package sorting;

import java.util.Arrays;
import static utils.Utils.intArray;
import static utils.Utils.swap;

/**
 * Bubble sort is a simple sorting algorithm that repeatedly steps through a list of items to be sorted, compares each pair of adjacent items and swaps them if they are in the wrong order. This process is repeated until no more swaps are needed, indicating that the list is now sorted.
 *
 * Here's how the algorithm works:
 *
 * Start with an unsorted list of items to be sorted.
 * Set a flag to indicate whether any swaps have been made during the current iteration.
 * Repeat the following steps until no more swaps are needed:
 * a. For each pair of adjacent items in the list:
 * i. If the items are in the wrong order, swap them.
 * ii. Set the flag to indicate that a swap has been made.
 * Stop when no more swaps are needed. The list is now sorted.
 * Here's an example of bubble sort in action:
 *
 * Suppose we have an unsorted list of numbers: 7, 3, 5, 1, 9.
 *
 * Start with the first pair of adjacent items, (7, 3). Since 7 is greater than 3, we swap them. The list is now: 3, 7, 5, 1, 9.
 * Set the flag to indicate that a swap has been made.
 * Repeat step 1 with the next pair of adjacent items, (7, 5). Since 7 is greater than 5, we swap them. The list is now: 3, 5, 7, 1, 9.
 * Set the flag to indicate that a swap has been made.
 * Repeat step 1 with the next pair of adjacent items, (7, 1). Since 7 is greater than 1, we swap them. The list is now: 3, 5, 1, 7, 9.
 * Set the flag to indicate that a swap has been made.
 * Repeat step 1 with the next pair of adjacent items, (7, 9). Since 7 is not greater than 9, we don't swap them. The list remains: 3, 5, 1, 7, 9.
 * Set the flag to indicate that no swaps have been made during this iteration.
 * Since the flag is set to indicate that swaps have been made during the current iteration, we repeat the entire process again, starting with the first pair of adjacent items.
 * We repeat this process until no more swaps are needed. In this case, the list is sorted after the third iteration: 1, 3, 5, 7, 9.
*/
public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = sort();

        System.out.println(Arrays.toString(intArray));
    }

    //O(n^2)
    private static int[] sort() {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        return intArray;
    }

}
