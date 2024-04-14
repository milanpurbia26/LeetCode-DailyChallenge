
import java.util.LinkedList;
import java.util.Queue;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) { this.val = val; }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return 0;
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null && node.left.left == null && node.left.right == null) {
                sum += node.left.val;
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }

        }
        return sum;
    }

    public static void main(String[] args) {
         TreeNode root = new TreeNode(3);
         root.left = new TreeNode(9);
         root.right = new TreeNode(20);
         root.right.left = new TreeNode(15);
         root.right.right = new TreeNode(7);
        SumOfLeftLeaves binaryTreeOps = new SumOfLeftLeaves();
         int leftLeavesSum = binaryTreeOps.sumOfLeftLeaves(root);
         System.out.println("Sum of left leaves: " + leftLeavesSum);
    }
}

