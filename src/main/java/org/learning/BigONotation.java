package org.learning;

public class BigONotation {
    // Big O Notation:
    // 1. Can be described as "how code slows when data grows"
    // 2. Describes the performance of an algorithm as the amount of data increases
    // 3. Machine independent (number of steps to complete algorithm)
    // 4. Ignores smaller operations - O(n + 1) -> O(n)

    // Notation examples:      n = amount of data
    // - O(1) -> constant
    // - O(n) -> linear
    // - O(log n) -> logarithmic
    // - O(n^2) -> quadratic
    // ...

    // Example scenario:
    public int linearAddUp(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    // If n = 3 -> sum = 0 + 1 + 2 + 3 = 6
    // Here, the number of steps was 4, because we have one operation

    // If n = 1000000 (or larger number)
    // Then the number of steps will be more than 1000000

    // So, this function has a runtime complexity of O(n), i.e, linear time
    // Because as the data size increases, the number of steps increase linearly

    // An alternative way to write the function
    public int constantAddUp(int n) {
        return n * (n + 1) / 2;
    }

    // Here, if n = 1000000 or another large number
    // The number of steps will always be 3
    // Because we have 3 operations that happen only 1 time

    // This function has a runtime complexity of O(1), i.e, constant time
    // Because the amount of data is irrelevant to the completion of the algorithm
    // constantAddUp() is better than linearAddUp()

    // O(1) -> constant time:
    // - Algorithm is indifferent to the amount of data
    // - Examples:
    //   - Random access of an element in an array
    //   - Insertion at the begging of a linked list

    // O(log n) -> logarithmic time:
    // - Algorithm will take increasingly less time to complete
    // - This means that, as data grows, it will be more efficient
    // - Examples:
    //   - Binary search

    // O(n) -> linear time:
    // - Time to completion increases linearly with data size
    // - Examples:
    //   - Looping through elements of an array
    //   - Searching through a linked list

    // O(n log n) -> quasi-linear time:
    // - Very similar to linear time, except when working with large amounts of data
    // - This means that, as data grows, the algorithm will slow down
    // - Examples:
    //   - Quick Sort
    //   - Merge Sort
    //   - Heap Sort

    // O(n^2) -> quadratic time:
    // - As the data grows, the algorithm is going to take increasingly more time to complete
    // - Examples:
    //   - Insertion Sort
    //   - Selection Sort
    //   - Bubble Sort

    // O(n!) -> factorial time:
    // - Takes more time to complete with large amounts of data than any other algorithm
    // - It is efficient for small datasets
    // - Examples:
    //   - Travelling Salesman Problem

    // Grading for larger datasets:
    // 1. O(1) - excellent
    // 2. O(log n) - pretty good
    // 3. O(n) - okay
    // 4. O(n log n) - barely passing
    // 5. O(n^2) - bad
    // 6. O(n!) - failing
}