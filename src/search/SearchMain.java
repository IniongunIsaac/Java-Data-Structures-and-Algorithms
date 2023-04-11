package search;

import sorting.QuickSortGPT;

import static utils.Utils.intArray;

public class SearchMain {
    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        BinarySearch bsearch = new BinarySearch();
        QuickSortGPT.quickSort(intArray, 0, intArray.length - 1);

        System.out.println(search.search(intArray, -15));
        System.out.println(bsearch.iterative(intArray, -15));
        System.out.println(bsearch.recursive(intArray, -15));
    }
}
