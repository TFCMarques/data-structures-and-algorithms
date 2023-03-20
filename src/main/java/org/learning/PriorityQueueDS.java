package org.learning;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDS {
    // First In First Out (FIFO) data structure
    // Serves elements with the highest priorities first before other elements

    public static void call() {
        Queue<Double> queue = new PriorityQueue<>();

        // Unordered insertions
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        // Print queues elements until it is empty
        // It will print them in ascending order, since a smaller value is prioritized
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // To print them in descending order, from most to the least valued element
        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
    }
}
