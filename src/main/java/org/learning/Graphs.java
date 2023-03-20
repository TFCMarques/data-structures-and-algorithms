package org.learning;

public class Graphs {
    // Graph:
    // Non-linear aggregation of nodes and edges
    // Node (vertex) may contain some data
    // Edge is the connection between two nodes

    // Undirected Graph:
    // An example of an undirected graph is a social network
    // Each node can represent a user
    // If a user established a friendship with another user, that is our connection
    // This can be defined as adjacency
    // (Node A) <--> (Node B) <--> (Node C)

    // Directed Graph:
    // Contains edges that will link one node to another but...
    // These are now one-way connections
    // (Node A) --> (Node B) <-- (Node C)

    // However...
    // It is valid to have Node A pointing to Node B
    // And have Node B point back to Node A

    // An example of a directed graph can be a street map
    // You have streets, and you need to respect the direction they go

    // There are two popular ways to represent a graph:
    // - Adjacency matrix
    // - Adjacency list

    // With an adjacency matrix, we could create 2D array
    // One column and one row for each of the nodes:
    // For example:
    // (A) --> (B) --> (C)
    //    A  B  C
    // A  0  1  0
    // B  0  0  1
    // C  0  0  0
    // Time complexity: O(1)
    // Space complexity: O(N^2) -> N = number of nodes
    // This approach takes a lot of space, so it tends to suit graphs with a lot of edges

    // With an adjacency list, we have an array of separate linked lists
    // Each head of a linked list contains the address of a node
    // For example:
    // (A) --> (B) --> (C)
    // A --> B --> C -->
    // B --> C -->
    // C -->
    // Time complexity: O(N) -> N = number of nodes
    // Space complexity: O(N + E) -> E = number of edges
    // So, a benefit of a list over a matrix is the fact they use less space
    // But it also makes it less time efficient to search


}
