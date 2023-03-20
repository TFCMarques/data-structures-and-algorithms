package org.learning;

public class TreeTraversal {
    // Process of visiting all the nodes of a tree
    // We don't have random access, so we follow a certain procedure

    // There are three types of traversal we can talk about:
    // - In-order
    // - Post-order
    // - Pre-order

    // In this example, we will use a binary tree
    // Because we don't want the values to be in a binary search tree order

    // So, each node has at most two children, left and right
    public class Node {
        char data;
        Node left;
        Node right;

        public Node(char data) {
            this.data = data;
        }
    }

    // Imagine we have a tree like this:
    //           (A)
    //         /     \
    //      (B)        (C)
    //     /   \      /   \
    //   (D)   (E)  (F)   (G)

    // For in-order traversal
    // The result would be: D B E A F C G
    // left -> root -> right

    // Example of implementation
    private void inOrderTraverseTree(Node root) {
        inOrderTraverseTree(root.left);
        System.out.println(root.data);
        inOrderTraverseTree(root.right);
    }

    // For post-order traversal
    // The result would be: D E B F G C A
    // left -> right -> root

    // This is used to delete a tree from leaf to root

    // Example of implementation
    private void postOrderTraverseTree(Node root) {
        postOrderTraverseTree(root.left);
        postOrderTraverseTree(root.right);
        System.out.println(root.data);
    }

    // For pre-order traversal
    // The result would be: A B D E C F G
    // root -> left -> right

    // This is used to create a copy of a tree

    // Example of implementation
    private void preOrderTraverseTree(Node root) {
        System.out.println(root.data);
        preOrderTraverseTree(root.left);
        preOrderTraverseTree(root.right);
    }
}
