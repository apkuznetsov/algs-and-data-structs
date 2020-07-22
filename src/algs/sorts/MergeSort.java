package algs.sorts;

public class MergeSort {

    public static void sortByMerge(int[] array, int leftIncl, int rightExcl) {
        // the base case: if subarray contains <= 1 items, stop dividing because it's sorted
        final boolean stopDividing = rightExcl <= leftIncl + 1;
        if (stopDividing) {
            return;
        }

        // divide: calculate the index of the middle element
        final int middle = leftIncl + (rightExcl - leftIncl) / 2;

        sortByMerge(array, leftIncl, middle);  // conquer: sort the left subarray
        sortByMerge(array, middle, rightExcl); // conquer: sort the right subarray

        // combine: merge both sorted subarrays into sorted one
        merge(array, leftIncl, middle, rightExcl);
    }
}
