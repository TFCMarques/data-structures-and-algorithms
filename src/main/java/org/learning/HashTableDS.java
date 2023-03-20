package org.learning;

import java.util.Hashtable;

public class HashTableDS {
    // Data structure that stores unique keys to values, e.g. <Integer, String>
    // Each key-value pair is known as an entry
    // Fast insertion, look up and deletion of key-value pairs

    // Hashing: taking a key and computing it into an integer
    // The formula varies according to the key and data type
    // We use the hast % capacity to calculate an index number
    // key.hashCode() % capacity = index
    // If it has collision, the bucket at the index becomes a linked list

    // Bucket: an indexed storage location for one or more entries
    // Can store multiple entries in case of a collision

    // Collision: hash function generates the same index for more than one key
    // Less collisions = more efficiency

    // Runtime complexity:
    // - Best case: O(1)
    // - Worst case: O(n)

    public static void call() {
        // Default capacity at 11
        // Default load factor of 75%
        int tableCapacity = 10;
        Hashtable<String, String> table = new Hashtable<>(tableCapacity);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        // table.remove(777); // Gary gets removed

        // Display all key-value pairs
        for (String key : table.keySet()) {
            // Different data types have different hash code formulas
            // Integers: hash code is equal to the key value
            // Strings: hash code is equal to the same of the ASCII value of the characters
            System.out.println(key.hashCode() % 10 + " -> " + key + " -> " + table.get(key));
        }
    }
}
