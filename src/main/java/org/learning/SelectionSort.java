package org.learning;

import java.util.Arrays;

public class SelectionSort {
    // Search through an array and keep track of the minimum value for each iteration
    // At the end of each iteration, swap variables.
    // Runtime complexity: O(n^2)
    // Small dataset - Okay
    // Large dataset - Bad, terrible, don't do it


    public static void call() {
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
