package org.learning;

import java.util.ArrayList;

public class AdjacencyMatrix {
    // 2D array to store binary/boolean representation of edges
    // Number of rows = number of unique nodes
    // Number of columns = number of unique nodes
    // Runtime complexity to check for an edge: O(1)
    // Space complexity: O(N^2) -> N = number of nodes

    public void call() {
        Graph graph = new Graph(5);

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

        System.out.println(graph.checkEdge(0, 1)); // = true
        System.out.println(graph.checkEdge(3, 2)); // = false
    }

    private static class Graph {
        ArrayList<Node> nodes;
        int[][] matrix;

        Graph(int size) {
            nodes = new ArrayList<>();
            matrix = new int[size][size];
        }

        public void addNode(Node node) {
            nodes.add(node);
        }

        public void addEdge(int src, int dest) {
            matrix[src][dest] = 1;
        }

        public boolean checkEdge(int src, int dest) {
            return matrix[src][dest] == 1;
        }

        public void print() {
            System.out.print("  ");
            for (Node node : nodes) {
                System.out.print(node.data + " ");
            }
            System.out.println();

            for (int i = 0; i < matrix.length; i++) {
                System.out.print(nodes.get(i).data + " ");
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
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
