package org.learning;

import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyList {
    // Array/Arraylist of linked lists
    // Each linked list has a unique node at the head
    // All adjacent neighbors to that node are added to that node's linked list
    // Runtime complexity to check an edge: O(N) -> N = number of nodes
    // Space complexity: O(N + E) -> E = number of edges

    public static void call() {
        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        // This example uses a directed graph
        graph.addEdge(0, 1); // (A) --> (B)
        graph.addEdge(1, 2); // (B) --> (C)
        graph.addEdge(1, 4); // (B) --> (E)
        graph.addEdge(2, 3); // (C) --> (D)
        graph.addEdge(2, 4); // (C) --> (E)
        graph.addEdge(4, 0); // (E) --> (A)
        graph.addEdge(4, 2); // (E) --> (C)

        graph.print();
    }

    private static class Graph {
        ArrayList<LinkedList<Node>> adjacencyList;

        Graph() {
            adjacencyList = new ArrayList<>();
        }

        public void addNode(Node node) {
            LinkedList<Node> currentList = new LinkedList<>();

            currentList.add(node);
            adjacencyList.add(currentList);
        }

        public void addEdge(int src, int dest) {
            LinkedList<Node> currentList = adjacencyList.get(src);
            Node destNode = adjacencyList.get(dest).get(0); // get head at dest to get the destination node

            currentList.add(destNode);
        }

        public boolean checkEdge(int src, int dest) {
            LinkedList<Node> currentList = adjacencyList.get(src);
            Node destNode = adjacencyList.get(dest).get(0);

            for (Node node : currentList) {
                if (node == destNode) {
                    return true;
                }
            }

            return false;
        }

        public void print() {
            for (LinkedList<Node> currentList : adjacencyList) {
                for (Node node : currentList) {
                    System.out.print("(" + node.data + ")" + " --> ");
                }
                System.out.println();
            }
        }
    }

    private static class Node {
        char data;

        Node(char data) {
            this.data = data;
        }
    }
}
