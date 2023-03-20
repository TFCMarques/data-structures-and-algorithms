package org.learning;

import java.util.ArrayList;

public class DeepSearchFirst {
    // Selects a route and keeps going
    // If you reach a dead end or an already visited node
    // Backtrack to previous node with unvisited adjacent neighbors

    // Traverse a graph branch by branch
    // Utilizes a stack
    // Better if destination is on average far from the start
    // Children are visited before siblings
    // More popular for games/puzzles

    public static void call() {
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

        // graph.deepFirstSearch(0); // (A) --> (B) --> (C) --> (D) --> (E)
        // graph.deepFirstSearch(1); // (B) --> (C) --> (D) --> (E) --> (A)
        // graph.deepFirstSearch(2); // (C) --> (D) --> (E) --> (A) --> (B)
        // graph.deepFirstSearch(3); // (D)
        graph.deepFirstSearch(4); // (E) --> (A) --> (B) --> (C) --> (D)
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

        public void deepFirstSearch(int src) {
            boolean[] visited = new boolean[matrix.length];

            deepFirstSearchHelper(src, visited);
        }

        private void deepFirstSearchHelper(int src, boolean[] visited) {
            if (visited[src]) {
                return;
            } else {
                visited[src] = true;
                System.out.println(nodes.get(src).data + " -> visited");
            }

            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1) {
                    deepFirstSearchHelper(i, visited);
                }
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
