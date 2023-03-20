package org.learning;

import java.util.Arrays;

public class BubbleSort {
    // Pairs of adjacent elements are compared
    // The elements are swapped if they are not in order
    // Runtime complexity: O(n^2)
    // Small dataset - Okay(ish)
    // Big dataset - Bad, terrible, don't do it

    public static void call() {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
