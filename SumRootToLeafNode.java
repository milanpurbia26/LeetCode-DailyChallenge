

import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class SumRootToLeafNode {
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(9);
        root.right = new Node(0);
        root.left.left = new Node(5);
        root.left.right = new Node(1);

        int sum = sumNumbers(root);
        System.out.println("Sum of root-to-leaf numbers: " + sum);
    }

    public static int sumNumbers(Node root) {
        List<Integer> paths = new ArrayList<>();
        backtrack(root, new StringBuilder(), paths);

        int totalSum = 0;
        for (int path : paths) {
            totalSum += path;
        }
        return totalSum;
    }

    private static void backtrack(Node node, StringBuilder currentPath, List<Integer> paths) {
        if (node == null) {
            return;
        }

        currentPath.append(node.val);

        if (node.left == null && node.right == null) {
            paths.add(Integer.parseInt(currentPath.toString()));
        } else {
            backtrack(node.left, currentPath, paths);
            backtrack(node.right, currentPath, paths);
        }

        currentPath.setLength(currentPath.length() - 1);
    }
}

