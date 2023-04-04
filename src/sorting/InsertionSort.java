package sorting;

import java.util.Arrays;

import static utils.Utils.intArray;

public class InsertionSort {
    public static void main(String[] args) {
        int[] sortedArray = sort();
        System.out.println(Arrays.toString(sortedArray));
    }

    //O(n^2)
    private static int[] sort() {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }
        return intArray;
    }
}
