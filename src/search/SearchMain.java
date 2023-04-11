package search;

import static utils.Utils.intArray;

public class SearchMain {
    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();

        System.out.println(search.search(intArray, -15));
    }
}
