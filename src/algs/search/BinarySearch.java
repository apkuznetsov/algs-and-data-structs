package algs.search;

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
}
