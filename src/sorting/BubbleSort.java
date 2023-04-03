package sorting;

import utils.Utils;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = sort();

        System.out.println(Arrays.toString(intArray));
    }

    private static int[] sort() {
        for (int lastUnsortedIndex = Utils.intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (Utils.intArray[i] > Utils.intArray[i + 1]) {
                    Utils.swap(Utils.intArray, i, i + 1);
                }
            }
        }
        return Utils.intArray;
    }

}
