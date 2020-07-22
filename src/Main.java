import java.util.Arrays;

import static algs.sorts.MergeSort.sortByMerge;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {30, 21, 23, 19, 28, 11, 23};
        System.out.println(Arrays.toString(array1));

        sortByMerge(array1, 0, array1.length);// { 11, 19, 21, 23, 23, 28, 30 }
        System.out.println(Arrays.toString(array1));
    }
}
