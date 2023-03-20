package org.learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    // Traverse a graph level by level
    // Utilizes a queue
    // Better if destination is on average close to the start
    // Siblings are visited before children

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

        // graph.breadthFirstSearch(0); // (A) --> (B) --> (C) --> (E) --> (D)
        // graph.breadthFirstSearch(1); // (B) --> (C) --> (E) --> (D) --> (A)
        // graph.breadthFirstSearch(2); // (C) --> (D) --> (E) --> (A) --> (B)
        // graph.breadthFirstSearch(3); // (D)
        graph.breadthFirstSearch(4); // (E) --> (A) --> (C) --> (B) --> (D)
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

        public void breadthFirstSearch(int src) {
            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[matrix.length];

            queue.offer(src);
            visited[src] = true;

            while (queue.size() != 0) {
                src = queue.poll();
                System.out.println(nodes.get(src).data + " -> visited");

                for (int i = 0; i < matrix[src].length; i++) {
                    if (matrix[src][i] == 1 && !visited[i]) {
                        queue.offer(i);
                        visited[i] = true;
                    }
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
