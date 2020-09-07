package algs.search;

import static java.util.Arrays.binarySearch;

public class BinarySearch {

    public static int binarySearchIterative(int[] array, int elem, int left, int right) {

        while (left <= right) {
            int mid = left + (right - left) / 2;    // the index of the middle element

            if (elem == array[mid]) {
                return mid;                         // the element is found, return its index
            } else if (elem < array[mid]) {
                right = mid - 1;                    // go to the left subarray
            } else {
                left = mid + 1;                     // go the the right subarray
            }
        }

        return -1;                                  // the element is not found
    }

    public static int binarySearchRecursive(int[] array, int elem, int left, int right) {

        if (left > right) {
            return -1;                          // search interval is empty, the element is not found
        }

        int mid = left + (right - left) / 2;    // the index of the middle element

        if (elem == array[mid]) {
            return mid;                                                 // the element is found, return its index
        } else if (elem < array[mid]) {
            return binarySearch(array, elem, left, mid - 1);        // go to the left subarray
        } else {
            return binarySearch(array, elem, mid + 1, right);   // go the the right subarray
        }
    }
}
