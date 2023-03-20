package org.learning;

public class BinarySearchTreeDS {
    // Binary tree is a tree where each node has no more than 2 children
    // This type of tree can be arranged into a binary search tree

    // A binary search tree is arranged as such:
    // - The root node should be greater than the left child but less than the right child
    // - This is repeated across all subtrees
    // - If this is done correctly, the leftmost child should be the least value of the tree
    // - On the other hand, the rightmost child should be the greater value of the tree

    // Runtime complexity:
    // - O(log n) -> best case
    // - O(n) -> worst case

    // Space complexity: O(n)

    // Benefit: easy to locate a node when they are in this order

    public static void call() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.display();

        System.out.println(tree.search(0)); // false
        System.out.println(tree.search(1)); // true
        System.out.println(tree.search(9)); // true
        System.out.println(tree.search(10)); // false

        // tree.remove(0); // 0 could not be found!
        tree.remove(1);
        tree.remove(5);

        tree.display();
    }

    private static class BinarySearchTree {
        Node root;

        public void insert(Node node) {
            root = insertHelper(root, node);
        }

        private Node insertHelper(Node root, Node node) {
            int data = node.data;

            if (root == null) {
                root = node;
                return root;
            } else if (data < root.data){
                root.left = insertHelper(root.left, node);
            } else {
                root.right = insertHelper(root.right, node);
            }

            return root;
        }

        public void display() {
            displayHelper(root);
        }

        private void displayHelper(Node root) {
            if (root != null) {
                displayHelper(root.left);
                System.out.println(root.data);
                displayHelper(root.right);
            }
        }

        public boolean search(int data) {
            return searchHelper(root, data);
        }

        private boolean searchHelper(Node root, int data) {
            if (root == null) {
                return false;
            } else if (root.data == data) {
                return true;
            } else if (root.data > data) {
                return searchHelper(root.left, data);
            } else {
                return searchHelper(root.right, data);
            }
        }

        public void remove(int data) {
            if (search(data)) {
                removeHelper(root, data);
            } else {
                System.out.println(data + " could not be found!");
            }
        }

        private Node removeHelper(Node root, int data) {
            if (root == null) {
                return root;
            } else if (data < root.data) {
                root.left = removeHelper(root.left, data);
            } else if (data > root.data) {
                root.right = removeHelper(root.right, data);
            } else {
                if (root.left == null && root.right == null) { // Is leaf?
                    root = null;
                } else if (root.right != null) { // Has right child?
                    root.data = successor(root);
                    root.right = removeHelper(root.right, root.data);
                } else { // Has left child
                    root.data = predecessor(root);
                    root.left = removeHelper(root.left, root.data);
                }
            }

            return root;
        }

        // Find the least value below the right child of this root node
        private int successor(Node root) {
            root = root.right;

            while (root.left != null) {
                root = root.left;
            }

            return root.data;
        }

        // Find the greatest value below the left child of this root node
        private int predecessor(Node root) {
            root = root.left;

            while (root.right != null) {
                root = root.right;
            }

            return root.data;
        }
    }

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
