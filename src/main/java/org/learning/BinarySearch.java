package org.learning;

import java.util.Arrays;

public class BinarySearch {
    // Search algorithm that finds the position of a target value within a sorted array
    // Half of the array is eliminated during each "step"
    // Runtime complexity: O(log n)

    public static void call() {
        int[] array = new int[1000000];
        int target = 765432;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Built-in binary search
        // int index = Arrays.binarySearch(array, target);

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int head = 0;
        int tail = array.length - 1;

        while (head <= tail) {
            int middle = head + (tail - head) / 2;
            int value = array[middle];

            System.out.println("Middle: " + middle);

            if (value < target) {
                head = middle + 1;
            } else if (value > target) {
                tail = middle - 1;
            } else {
                return middle; // value == target
            }
        }

        return -1;
    }
}
