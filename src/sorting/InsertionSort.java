package sorting;

import java.util.Arrays;

import static utils.Utils.intArray;

public class InsertionSort {
    public static void main(String[] args) {
        //int[] sortedArray = sort();
        //System.out.println(Arrays.toString(sortedArray));
        recursiveSort(intArray, intArray.length);
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

    private static void recursiveSort(int[] input, int numItems) {
        if (numItems < 2) {
            return;
        }

        recursiveSort(input, numItems - 1);

        int newElement = input[numItems - 1];
        int i;
        for(i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;

        System.out.println("Result when numItems = " + numItems);
        System.out.println(Arrays.toString(input));
        System.out.println("-------------------");
    }
}
