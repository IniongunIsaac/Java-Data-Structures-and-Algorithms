package sorting;

import java.util.Arrays;
import static utils.Utils.intArray;
import static utils.Utils.swap;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = sort();

        System.out.println(Arrays.toString(intArray));
    }

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
