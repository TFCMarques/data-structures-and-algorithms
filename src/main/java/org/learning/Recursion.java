package org.learning;

public class Recursion {
    // Apply the result of a procedure, to the same procedure
    // A recursive method calls itself
    // Can be a substitute for iteration
    // Divide a problem into sub-problems of the same type as the original
    // Commonly used with advanced sorting algorithms and navigating trees

    // Advantages:
    // 1. Easier to read and write
    // 2. Easier to debug

    // Disadvantages:
    // 1. Sometimes slower than "normal" approaches
    // 2. Uses more memory due to adding more frames to the call stack

    public static void call() {
        // walk(1000000); // Causes StackOverflowError

        walk(5);

        System.out.println(factorial(7));

        System.out.println(power(2, 8));
    }

    // Simple function -> normal approach recommended
    private static void walk(int steps) {
        // "Normal" implementation
        // for (int i = 0; i < steps; i++) {
        //    System.out.println("You took a step!");
        // }

        // Recursive implementation
        if (steps < 1) return;

        System.out.println("You took a step");
        walk(steps - 1);
    }

    // More complex with normal approach -> recursion is simpler
    private static int factorial(int num) {
        if (num < 1) return 1; // base case

        return num * factorial(num - 1); // recursive case
    }

    // Another usage
    private static int power(int base, int exponent) {
        if (exponent < 1) return 1; // base case

        return base * power(base, exponent - 1); // recursive case
    }
}
