package org.learning;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    // First In First Out (FIFO) data structure
    // Collection designed for holding elements prior to processing
    // Linear data structure
    // Example: a line of people at the supermarket

    // offer() to add element (enqueue)
    // poll() to remove element (dequeue)

    public static void call() {
        // Queue is an interface in Java, so we will use a LinkedList instead
        Queue<String> queue = new LinkedList<>();

        // System.out.println(queue.isEmpty()); = true

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        // System.out.println(queue.isEmpty()); = false

        System.out.println(queue); // [Karen, Chad, Steve, Harold]
        System.out.println(queue.size()); // = 4
        System.out.println(queue.contains("Harold")); // = true

        queue.poll(); // Removes Karen
        queue.poll(); // Removes Chad

        System.out.println(queue); // [Steve, Harold]

        queue.poll(); // Removes Steve
        queue.poll(); // Removes Harold

        System.out.println(queue); // []

        // queue.poll(); = []
        // Doesn't remove anyone since it is empty but doesn't throw an error
        // queue.remove(); - it would throw an error

        // Uses for Queues (examples):
        // 1. Keyboard buffer (letter should appear on screen in the order they are pressed)
        // 2. Printer queue (print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search
    }
}
