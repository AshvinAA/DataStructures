package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            insertLevelOrder(root, value);
        }
    }

    private void insertLevelOrder(Node node, int val) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.left == null) {
                current.left = new Node(val);
                return;
            } else {
                queue.add(current.left);
            }

            if (current.right == null) {
                current.right = new Node(val);
                return;
            } else {
                queue.add(current.right);
            }
        }
    }
}
