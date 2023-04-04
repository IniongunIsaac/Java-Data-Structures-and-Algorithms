package sorting;

import java.util.Arrays;

import static utils.Utils.intArray;

public class ShellSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort()));
    }

    // O(n^2) but performs better than SelectionSort
    // Same optimization technique can be used for BubbleSort
    private static  int[] sort() {
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }
        return intArray;
    }
}
