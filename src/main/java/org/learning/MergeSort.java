package org.learning;

import java.util.Arrays;

public class MergeSort {
    // Recursively divide array in 2, sort and then recombine
    // Runtime complexity: O(n log n)
    // Space complexity: O(n)

    public static void call() {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1, 9};

        mergeSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        int length = array.length;

        if (length <= 1) return; // Base case

        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        int i = 0; // Left array
        int j = 0; // Right array

        // Fill left and right arrays
        for (; i < length; i++) {
            if (i < middle) {
                left[i] = array[i];
            } else {
                right[j] = array[i];
                j++;
            }
        }

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

        int i = 0, l = 0, r = 0; // Indices

        while (l < leftSize && r < rightSize) {
            if (left[l] < right[r]) {
                array[i] = left[l];
                i++;
                l++;
            } else {
                array[i] = right[r];
                i++;
                r++;
            }
        }

        while(l < leftSize) {
            array[i] = left[l];
            i++;
            l++;
        }

        while(r < rightSize) {
            array[i] = right[r];
            i++;
            r++;
        }
    }
}
