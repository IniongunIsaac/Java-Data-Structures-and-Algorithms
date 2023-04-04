package sorting;

import java.util.Arrays;
import static utils.Utils.swap;
import static utils.Utils.intArray;

public class SelectionSort {
    public static void main(String[] args) {
        int[] sortedArray = sort();
        System.out.println(Arrays.toString(sortedArray));
    }

    //O(n^2)
    private static int[] sort() {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(intArray, largestIndex, lastUnsortedIndex);
        }
        return intArray;
    }
}
