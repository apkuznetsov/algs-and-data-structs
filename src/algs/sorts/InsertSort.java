package algs.sorts;

public class InsertSort {

    public static int[] sortByInsertion(int[] arr) {
        /* iterating over elements in the unsorted part */
        for (int currIndex = 1, rememberedElem, prevIndex; currIndex < arr.length; currIndex++) {
            rememberedElem = arr[currIndex]; // take the next element
            prevIndex = currIndex - 1;

            /* find a suitable position to insert and shift elements to the right */
            while (prevIndex >= 0 && arr[prevIndex] > rememberedElem) {
                arr[prevIndex + 1] = arr[prevIndex]; // shifting
                prevIndex--;
            }
            arr[prevIndex + 1] = rememberedElem; // insert the element in the found position in the sorted part
        }

        return arr;
    }
}
