package org.learning;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedVsArrayList {
    public static void call() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // Linked List Execution
        startTime = System.nanoTime();

        // linkedList.get(0); // 8800ns
        // linkedList.get(500000); // 3260500ns // worst possible scenario
        // linkedList.get(999999); // 9900ns -> less time because it is a doubly linked list

        // linkedList.remove(0); // 10500ns
        // linkedList.remove(500000); // 3415400ns
         linkedList.remove(999999); // 10300ns

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("Linked List: " + elapsedTime + "ns");

        // Array List Execution
        startTime = System.nanoTime();

        // arrayList.get(0); // 2100ns
        // arrayList.get(500000); // 2500ns
        // arrayList.get(999999); // 2300ns

        // arrayList.remove(0); // 537100ns
        // arrayList.remove(500000); // 204000ns
        arrayList.remove(999999); // 3100ns

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("Array List: " + elapsedTime + "ns");

        // Search results:
        // - Accessing any element from an ArrayList is faster than in a LinkedList
        // - This happens because ArrayList has random access of elements
        // - A LinkedList has to begin either in the head or tail and go through N nodes

        // Remove results:
        // - LinkedList works better on the head since it doesn't need to shift elements
        // - ArrayList becomes faster for elements in the middle of the array
        // - This happens because there are fewer elements to shift
        // - As can be since in the tail of both lists, no shifting makes ArrayList faster

        // LinkedLists:
        // - Better at inserting and deleting overall, specially for large data
        // - Great usage for queues, for example

        // ArrayList:
        // - More flexible for most applications, due smaller read times
        // - Fast removal of last element makes it a good stack

    }
}
