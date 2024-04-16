import java.util.LinkedList;
import java.util.Queue;

public class AddOneRowToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int currentDepth = 1;

        while (currentDepth < depth - 1 && !queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            currentDepth++;
        }

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            TreeNode newNodeLeft = new TreeNode(val);
            newNodeLeft.left = node.left;
            node.left = newNodeLeft;

            TreeNode newNodeRight = new TreeNode(val);
            newNodeRight.right = node.right;
            node.right = newNodeRight;
        }

        return root;
    }
}