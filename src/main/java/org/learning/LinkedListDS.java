package org.learning;

import java.util.LinkedList;

public class LinkedListDS {
    // Stores nodes in 2 parts (data + address)
    // Nodes are in non-consecutive memory locations
    // Elements are linked using pointers

    // Singly Linked List
    //       Node A                 Node B                 Node C
    // [ data | address ] --> [ data | address ] --> [ data | address ]

    // Doubly Linked List
    //            Node A                            Node B
    // [ address | data | address ] <--> [ address | data | address ]

    public static void call() {
        // Doubly linked list implementation
        LinkedList<String> linkedList = new LinkedList<>();

        // Linked List as a stack
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");

        // linkedList.pop(); // Removes F

        // System.out.println(linkedList); // = [D, C, B, A]

        // Linked List as queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        // linkedList.poll(); // Removes A

        // System.out.println(linkedList); // = [B, C, D, F]

        // Add element to the list on the index 4 with value E
        linkedList.add(4, "E");

        // Remove element E
        linkedList.remove("E");

        // System.out.println(linkedList); // = [B, C, D, F] again

        System.out.println(linkedList.indexOf("F")); // index = 3

        System.out.println(linkedList.peekFirst()); // print head of list
        System.out.println(linkedList.peekLast()); // print tail of list

        linkedList.addFirst("Z"); // puts Z on the head of the list
        linkedList.addLast("G"); // puts G on the tail of the list

        linkedList.removeFirst(); // Removes head of the list
        linkedList.removeLast(); // Remove tail of the list

        System.out.println(linkedList);

        // Advantages:
        // 1. Dynamic data structure (allocates needed memory while running)
        // 2. Insertion and deletion of nodes is easy - O(1)
        // 3. No/Low memory waste

        // Disadvantages:
        // 1. Greater memory usage (additional pointers)
        // 2. No random access of elements (no index[i])
        // 3. Accessing or searching elements is more time-consuming - O(N)

        // Uses (examples):
        // 1. Implementing stacks or queues
        // 2. GPS navigation
        // 3. Music playlist
    }
}
