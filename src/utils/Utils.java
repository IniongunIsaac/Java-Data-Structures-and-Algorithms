package utils;

public class Utils {
    public static final int[] intArray = {20, 35, -15, 7, 55, 1, -22};
    public static void swap(int[] array, int aIndex, int bIndex) {
        if(array[aIndex] == array[bIndex]) {
            return;
        }
        int temp = array[aIndex];
        array[aIndex] = array[bIndex];
        array[bIndex] = temp;
    }
}
