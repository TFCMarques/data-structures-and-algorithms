package org.learning;

import java.util.Arrays;

public class InsertionSort {
    // Compares a given element to the left node
    // Shifts elements to the right to make room to insert the value
    // Runtime complexity: O(n^2)
    // Small dataset - Okay
    // Large dataset - Bad, terrible, don't do it

    // Fewer steps than Bubble Sort
    // Best case is O(n) compared to Selection Sort O(n^2)

    public static void call() {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        
        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }
}
