package org.learning;

public class LinearSearch {
    // Iterate through a collection one element at a time
    // Runtime complexity: O(n)

    public static void call() {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 6);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    // Advantages:
    // 1. Fast for searches in small to medium datasets
    // 2. Does not need to be sorted
    // 3. Useful for data structures that do not have random access (e.g. linked lists)

    // Disadvantages:
    // 1. Slow for large sets of data
}
