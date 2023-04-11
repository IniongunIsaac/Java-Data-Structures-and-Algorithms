package search;

//O(logn)
public class BinarySearch {
    public int iterative(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;

            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }

        return -1;
    }

    public int recursive(int[] input, int value) {
        return recursive(input, 0, input.length, value);
    }

    private int recursive(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;

        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] < value) {
            return recursive(input, midpoint + 1, end, value);
        } else {
            return recursive(input, start, midpoint, value);
        }
    }
}
